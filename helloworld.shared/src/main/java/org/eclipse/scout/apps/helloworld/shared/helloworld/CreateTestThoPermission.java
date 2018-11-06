package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class CreateTestThoPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateTestThoPermission() {
		super(CreateTestThoPermission.class.getSimpleName());
	}
}
