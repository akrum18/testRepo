package org.eclipse.scout.apps.helloworld.server.helloworld;

import org.eclipse.scout.apps.helloworld.shared.helloworld.CreateTestPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ITestService;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ReadTestPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.TestFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.UpdateTestPermission;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

public class TestService implements ITestService {

	@Override
	public TestFormData prepareCreate(TestFormData formData) {
		if (!ACCESS.check(new CreateTestPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestFormData create(TestFormData formData) {
		if (!ACCESS.check(new CreateTestPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestFormData load(TestFormData formData) {
		if (!ACCESS.check(new ReadTestPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestFormData store(TestFormData formData) {
		if (!ACCESS.check(new UpdateTestPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}
}
