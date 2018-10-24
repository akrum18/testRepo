package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class CreateAnotherPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateAnotherPermission() {
		super(CreateAnotherPermission.class.getSimpleName());
	}
}
