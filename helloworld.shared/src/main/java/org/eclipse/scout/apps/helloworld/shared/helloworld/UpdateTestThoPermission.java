package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class UpdateTestThoPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public UpdateTestThoPermission() {
		super(UpdateTestThoPermission.class.getSimpleName());
	}
}
