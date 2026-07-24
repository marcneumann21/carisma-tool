package carisma.profile.euaiactcompliance;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import carisma.core.Carisma;
import carisma.core.logging.LogLevel;
import carisma.core.logging.Logger;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		try {
			Carisma.getInstance().getModelManager().addMapping("euaiactcompliance.profile.uml",
					"platform:/plugin/carisma.profile.euaiactcompliance/profile/euaiactcompliance.profile.uml");
		} catch (Exception e) {
			Logger.log(LogLevel.ERROR, "Error while putting profile path to map", e);
		}
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub

	}
}