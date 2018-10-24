package org.eclipse.scout.apps.helloworld.client.helloworld;

import org.eclipse.scout.apps.helloworld.client.helloworld.HelloWorldForm.MainBox.TopBox;
import org.eclipse.scout.apps.helloworld.client.helloworld.HelloWorldForm.MainBox.TopBox.HelloButton;
import org.eclipse.scout.apps.helloworld.client.helloworld.HelloWorldForm.MainBox.TopBox.MessageField;
import org.eclipse.scout.apps.helloworld.shared.helloworld.HelloWorldFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.IHelloWorldService;
import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.client.ui.form.fields.stringfield.AbstractStringField;
import org.eclipse.scout.rt.client.ui.messagebox.MessageBoxes;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.AbstractIcons;

/**
 * @author austin
 */
@FormData(value = HelloWorldFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class HelloWorldForm extends AbstractForm {

	public HelloWorldForm() {
		setHandler(new ViewHandler());
	}

	@Override
	protected boolean getConfiguredAskIfNeedSave() {
		return false;
	}

	@Override
	protected int getConfiguredModalityHint() {
		return MODALITY_HINT_MODELESS;
	}

	@Override
	protected String getConfiguredIconId() {
		return AbstractIcons.World;
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public HelloButton getHelloButton() {
		return getFieldByClass(HelloButton.class);
	}

	public TopBox getTopBox() {
		return getFieldByClass(TopBox.class);
	}

	public MessageField getMessageField() {
		return getFieldByClass(MessageField.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(1000)
		public class TopBox extends AbstractGroupBox {

			@Override
			protected String getConfiguredLabel() {
				return TEXTS.get("MessageFromServer");
			}

			@Order(1000)
			public class MessageField extends AbstractStringField {
				@Override
				protected int getConfiguredGridW() {
					return 2;
				}

				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("Message");
				}

				@Override
				protected boolean getConfiguredEnabled() {
					return false;
				}
			}

			@Order(2000)
			public class HelloButton extends AbstractButton {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("HelloWorld");
				}

				@Override
				protected void execClickAction() {
					MessageBoxes.createOk().withBody("Default button has been clicked.").show();
				}

				@Order(1000)
				public class Item1Menu extends AbstractMenu {
					@Override
					protected String getConfiguredText() {
						return TEXTS.get("Item1");
					}

					@Override
					protected void execAction() {
						int result = MessageBoxes.createYesNo().withBody("?").show();
						if(result == 1) {
							MessageBoxes.createOk().withBody("Go to a Dr.").show();
						}
						
					}
				}	
			}
		}
	}

	public class ViewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			IHelloWorldService service = BEANS.get(IHelloWorldService.class);
			HelloWorldFormData formData = new HelloWorldFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);
		}
	}
}
