package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class ReadTestThoPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadTestThoPermission() {
		super(ReadTestThoPermission.class.getSimpleName());
	}
}
