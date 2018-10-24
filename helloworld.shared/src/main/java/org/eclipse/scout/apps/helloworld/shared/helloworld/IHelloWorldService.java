package org.eclipse.scout.apps.helloworld.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import org.eclipse.scout.apps.helloworld.shared.helloworld.HelloWorldFormData;

/**
 * @author austin
 */
@TunnelToServer
public interface IHelloWorldService extends IService {
	HelloWorldFormData load(HelloWorldFormData input);
}
