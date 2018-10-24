package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class CreateTestPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateTestPermission() {
		super(CreateTestPermission.class.getSimpleName());
	}
}
