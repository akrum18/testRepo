package org.eclipse.scout.apps.helloworld.client.helloworld;

import org.eclipse.scout.apps.helloworld.client.helloworld.TestForm.MainBox.CancelButton;
import org.eclipse.scout.apps.helloworld.client.helloworld.TestForm.MainBox.OkButton;
import org.eclipse.scout.apps.helloworld.shared.helloworld.CreateTestPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ITestService;
import org.eclipse.scout.apps.helloworld.shared.helloworld.TestFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.UpdateTestPermission;
import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

@FormData(value = TestFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class TestForm extends AbstractForm {

	@Override
	protected String getConfiguredTitle() {
		// TODO [austin] verify translation
		return TEXTS.get("Test");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(100000)
		public class OkButton extends AbstractOkButton {
		}

		@Order(101000)
		public class CancelButton extends AbstractCancelButton {
		}
	}

	public class ModifyHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			ITestService service = BEANS.get(ITestService.class);
			TestFormData formData = new TestFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);

			setEnabledPermission(new UpdateTestPermission());
		}

		@Override
		protected void execStore() {
			ITestService service = BEANS.get(ITestService.class);
			TestFormData formData = new TestFormData();
			exportFormData(formData);
			service.store(formData);
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			ITestService service = BEANS.get(ITestService.class);
			TestFormData formData = new TestFormData();
			exportFormData(formData);
			formData = service.prepareCreate(formData);
			importFormData(formData);

			setEnabledPermission(new CreateTestPermission());
		}

		@Override
		protected void execStore() {
			ITestService service = BEANS.get(ITestService.class);
			TestFormData formData = new TestFormData();
			exportFormData(formData);
			service.create(formData);
		}
	}
}
