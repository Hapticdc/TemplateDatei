package de.hapticdc.tutorial.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;


@ConfigName("settings")
public class tutorialconfig extends AddonConfig {

    @SwitchSetting
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);
    @SettingSection("custom")

    private final KeySubConfig keys = new KeySubConfig();

    @TextFieldSetting
    private final ConfigProperty<String> text = new ConfigProperty<>("Hallo Welt!");

    @Override
    public ConfigProperty<Boolean> enabled() {
        return enabled;
    }
    public ConfigProperty<String> text(){
        return text;
    }
    // siehe Hier unten drunter das hier ist ein getter
    public KeySubConfig keys() {
        return keys;
    }
}
