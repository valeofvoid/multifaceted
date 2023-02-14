package vale.multifaceted;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Multifaceted implements ModInitializer {
	public static final String MOD_ID = "multifaceted";
	public static final Logger LOGGER = LoggerFactory.getLogger("multifaceted");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}