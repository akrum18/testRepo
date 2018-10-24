package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class UpdateAnotherPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public UpdateAnotherPermission() {
		super(UpdateAnotherPermission.class.getSimpleName());
	}
}
