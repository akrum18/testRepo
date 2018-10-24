package org.eclipse.scout.apps.helloworld.client.work;

import java.util.List;

import org.eclipse.scout.apps.helloworld.client.helloworld.HelloWorldPage;
import org.eclipse.scout.apps.helloworld.client.suh.SuhTablePage;
import org.eclipse.scout.apps.helloworld.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;

/**
 * @author austin
 */
@Order(1000)
public class WorkOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new HelloWorldPage());
		pageList.add(new SuhTablePage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Work");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Pencil;
	}
}
