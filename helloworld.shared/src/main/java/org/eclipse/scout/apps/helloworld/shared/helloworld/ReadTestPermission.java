package org.eclipse.scout.apps.helloworld.shared.helloworld;

import java.security.BasicPermission;

public class ReadTestPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadTestPermission() {
		super(ReadTestPermission.class.getSimpleName());
	}
}
