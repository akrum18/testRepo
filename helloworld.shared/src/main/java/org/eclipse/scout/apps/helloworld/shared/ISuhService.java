package org.eclipse.scout.apps.helloworld.shared;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

@TunnelToServer
public interface ISuhService extends IService {

	SuhFormData prepareCreate(SuhFormData formData);

	SuhFormData create(SuhFormData formData);

	SuhFormData load(SuhFormData formData);

	SuhFormData store(SuhFormData formData);
}
