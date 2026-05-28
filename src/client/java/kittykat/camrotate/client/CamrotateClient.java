package kittykat.camrotate.client;

import kittykat.camrotate.Camrotate;
import net.fabricmc.api.ClientModInitializer;

public class CamrotateClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Camrotate.LOGGER.info("CamRotate initialized ( client )");
	}
}