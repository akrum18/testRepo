package org.eclipse.scout.apps.helloworld.shared;

import java.security.BasicPermission;

public class ReadSuhPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadSuhPermission() {
		super(ReadSuhPermission.class.getSimpleName());
	}
}
