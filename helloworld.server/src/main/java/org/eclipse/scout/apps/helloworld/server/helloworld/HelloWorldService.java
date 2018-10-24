package org.eclipse.scout.apps.helloworld.server.helloworld;

import org.eclipse.scout.apps.helloworld.server.ServerSession;
import org.eclipse.scout.apps.helloworld.shared.helloworld.HelloWorldFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.IHelloWorldService;

/**
 * @author austin
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
