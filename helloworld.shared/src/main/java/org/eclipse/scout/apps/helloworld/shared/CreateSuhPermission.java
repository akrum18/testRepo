package org.eclipse.scout.apps.helloworld.shared;

import java.security.BasicPermission;

public class CreateSuhPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateSuhPermission() {
		super(CreateSuhPermission.class.getSimpleName());
	}
}
