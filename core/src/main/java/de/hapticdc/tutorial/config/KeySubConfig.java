package de.hapticdc.tutorial.config;

import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.ButtonWidget.ButtonSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.MultiKeybindWidget.MultiKeyBindSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.Setting;


public class KeySubConfig extends Config {
    @ParentSwitch
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

    @KeyBindSetting
    private final ConfigProperty<Key> key = new ConfigProperty<>(Key.A);
    private ConfigProperty<Key[]> keys;


    @ButtonSetting
    public void button(Setting setting){
        System.out.println("\n\n Button pressed! \n\n");
    }
    @MultiKeyBindSetting
    private final ConfigProperty<Key[]> Keys = new ConfigProperty<>(new Key[]{Key.L_CONTROL, Key.F});

    public ConfigProperty<Boolean> enabled(){
        return enabled;
    }
    public ConfigProperty<Key> key(){
        return key;
    }
    public ConfigProperty<Key[]> keys(){
        return keys;
    }
}
