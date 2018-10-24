package org.eclipse.scout.apps.helloworld.shared;

import java.security.BasicPermission;

public class UpdateSuhPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public UpdateSuhPermission() {
		super(UpdateSuhPermission.class.getSimpleName());
	}
}
