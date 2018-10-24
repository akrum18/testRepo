package org.eclipse.scout.apps.helloworld.client.suh;

import org.eclipse.scout.apps.helloworld.client.suh.SuhForm.MainBox.CancelButton;
import org.eclipse.scout.apps.helloworld.client.suh.SuhForm.MainBox.OkButton;
import org.eclipse.scout.apps.helloworld.shared.CreateSuhPermission;
import org.eclipse.scout.apps.helloworld.shared.ISuhService;
import org.eclipse.scout.apps.helloworld.shared.SuhFormData;
import org.eclipse.scout.apps.helloworld.shared.UpdateSuhPermission;
import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

@FormData(value = SuhFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class SuhForm extends AbstractForm {

	@Override
	protected String getConfiguredTitle() {
		// TODO [austin] verify translation
		return TEXTS.get("Suh");
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
			ISuhService service = BEANS.get(ISuhService.class);
			SuhFormData formData = new SuhFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);

			setEnabledPermission(new UpdateSuhPermission());
		}

		@Override
		protected void execStore() {
			ISuhService service = BEANS.get(ISuhService.class);
			SuhFormData formData = new SuhFormData();
			exportFormData(formData);
			service.store(formData);
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			ISuhService service = BEANS.get(ISuhService.class);
			SuhFormData formData = new SuhFormData();
			exportFormData(formData);
			formData = service.prepareCreate(formData);
			importFormData(formData);

			setEnabledPermission(new CreateSuhPermission());
		}

		@Override
		protected void execStore() {
			ISuhService service = BEANS.get(ISuhService.class);
			SuhFormData formData = new SuhFormData();
			exportFormData(formData);
			service.create(formData);
		}
	}
}
