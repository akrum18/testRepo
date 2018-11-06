package org.eclipse.scout.apps.helloworld.server.helloworld;

import org.eclipse.scout.apps.helloworld.shared.helloworld.CreateTestThoPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ITestThoService;
import org.eclipse.scout.apps.helloworld.shared.helloworld.ReadTestThoPermission;
import org.eclipse.scout.apps.helloworld.shared.helloworld.TestThoFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.UpdateTestThoPermission;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

public class TestThoService implements ITestThoService {

	@Override
	public TestThoFormData prepareCreate(TestThoFormData formData) {
		if (!ACCESS.check(new CreateTestThoPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestThoFormData create(TestThoFormData formData) {
		if (!ACCESS.check(new CreateTestThoPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestThoFormData load(TestThoFormData formData) {
		if (!ACCESS.check(new ReadTestThoPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}

	@Override
	public TestThoFormData store(TestThoFormData formData) {
		if (!ACCESS.check(new UpdateTestThoPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [austin] add business logic here.
		return formData;
	}
}
