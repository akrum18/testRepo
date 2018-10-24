package org.eclipse.scout.apps.helloworld.server.suh;

import org.eclipse.scout.apps.helloworld.shared.suh.ISuhService;
import org.eclipse.scout.apps.helloworld.shared.suh.SuhTablePageData;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class SuhService implements ISuhService {

	@Override
	public SuhTablePageData getSuhTableData(SearchFilter filter) {
		SuhTablePageData pageData = new SuhTablePageData();
		// TODO [austin] fill pageData.
		return pageData;
	}
}
