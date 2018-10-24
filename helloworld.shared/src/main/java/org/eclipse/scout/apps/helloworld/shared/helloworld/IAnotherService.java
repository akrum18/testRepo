package org.eclipse.scout.apps.helloworld.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface IAnotherService extends IService {

	AnotherFormData prepareCreate(AnotherFormData formData);

	AnotherFormData create(AnotherFormData formData);

	AnotherFormData load(AnotherFormData formData);

	AnotherFormData store(AnotherFormData formData);
}
