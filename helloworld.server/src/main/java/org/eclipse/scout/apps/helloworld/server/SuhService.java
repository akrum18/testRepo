package org.eclipse.scout.apps.helloworld.server;

import org.eclipse.scout.apps.helloworld.shared.CreateSuhPermission;
import org.eclipse.scout.apps.helloworld.shared.ISuhService;
import org.eclipse.scout.apps.helloworld.shared.ReadSuhPermission;
import org.eclipse.scout.apps.helloworld.shared.SuhFormData;
import org.eclipse.scout.apps.helloworld.shared.UpdateSuhPermission;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

public class SuhService implements ISuhService {

	@Override
	public SuhFormData prepareCreate(SuhFormData formData) {
		if (!ACCESS.check(new CreateSuhPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public SuhFormData create(SuhFormData formData) {
		if (!ACCESS.check(new CreateSuhPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public SuhFormData load(SuhFormData formData) {
		if (!ACCESS.check(new ReadSuhPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public SuhFormData store(SuhFormData formData) {
		if (!ACCESS.check(new UpdateSuhPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}
}
