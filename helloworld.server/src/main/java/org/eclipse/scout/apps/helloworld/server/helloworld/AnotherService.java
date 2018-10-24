package org.eclipse.scout.apps.helloworld.server.helloworld;

import org.eclipse.scout.apps.helloworld.shared.helloworld.AnotherFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.CreateAnotherPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.IAnotherService;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ReadAnotherPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.UpdateAnotherPermission;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

public class AnotherService implements IAnotherService {

	@Override
	public AnotherFormData prepareCreate(AnotherFormData formData) {
		if (!ACCESS.check(new CreateAnotherPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public AnotherFormData create(AnotherFormData formData) {
		if (!ACCESS.check(new CreateAnotherPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public AnotherFormData load(AnotherFormData formData) {
		if (!ACCESS.check(new ReadAnotherPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public AnotherFormData store(AnotherFormData formData) {
		if (!ACCESS.check(new UpdateAnotherPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}
}
