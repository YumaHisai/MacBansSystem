package com.md_4.macbans.utils;


import com.md_4.macbans.MacBans_1_14_3_R1;
import org.bukkit.configuration.file.FileConfiguration;

@SuppressWarnings("all")
public class GetConfig_1_14_3_R1 {

    public static FileConfiguration main(){
        return MacBans_1_14_3_R1.getInstance().getConfig();
    }

}
