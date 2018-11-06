package org.eclipse.scout.apps.helloworld.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface ITestThoService extends IService {

	TestThoFormData prepareCreate(TestThoFormData formData);

	TestThoFormData create(TestThoFormData formData);

	TestThoFormData load(TestThoFormData formData);

	TestThoFormData store(TestThoFormData formData);
}
