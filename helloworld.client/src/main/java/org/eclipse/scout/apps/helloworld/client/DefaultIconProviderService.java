package org.eclipse.scout.apps.helloworld.client;

import java.net.URL;

import org.eclipse.scout.rt.client.services.common.icon.AbstractIconProviderService;

/**
 * @author austin
 */
public class DefaultIconProviderService extends AbstractIconProviderService {
	@Override
	protected URL findResource(String relativePath) {
		return ResourceBase.class.getResource("icons/" + relativePath);
	}
}
