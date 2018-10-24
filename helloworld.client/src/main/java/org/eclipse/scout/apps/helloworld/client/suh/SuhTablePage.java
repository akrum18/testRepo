package org.eclipse.scout.apps.helloworld.client.suh;

import org.eclipse.scout.apps.helloworld.shared.suh.ISuhService;
import org.eclipse.scout.apps.helloworld.shared.suh.SuhTablePageData;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.organizer.OrganizeColumnsForm.MainBox.GroupBox.ColumnsGroupBox.ColumnsTableField.Table;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(SuhTablePageData.class)
public class SuhTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [austin] verify translation
		return TEXTS.get("SuhTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(ISuhService.class).getSuhTableData(filter));
	}
	@Override
	protected Class<? extends IForm> getConfiguredDetailForm() {
		// TODO Auto-generated method stub
		return SuhForm.class;
	}
}
