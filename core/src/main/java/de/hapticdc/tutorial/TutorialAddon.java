package de.hapticdc.tutorial;

import de.hapticdc.tutorial.config.tutorialconfig;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class TutorialAddon extends LabyAddon<tutorialconfig> {

    /**
     * Is called when the addon was enabled.
     */
    @Override
    protected void enable() {
        registerSettingCategory();
    }

    /**
     * The main configuration class is needed for easily creating a configuration.
     *
     * @return the class
     */
    @Override
    protected Class<? extends tutorialconfig> configurationClass() {
        return tutorialconfig.class;
    }
}
