package com.MicrosoftWord12.Ranks;

import org.bukkit.ChatColor;

public enum RankInfo {

    OWNER("[Owner]", ChatColor.GOLD),
    ADMIN("[ADMIN]", ChatColor.BLUE),
    MANAGER("[MANAGER]", ChatColor.DARK_BLUE),
    MODERATOR("[MODERATOR]", ChatColor.AQUA),
    SENIOR_HELPER("[SENIOR HELPER]", ChatColor.DARK_PURPLE),
    HELPER("[HELPER]", ChatColor.LIGHT_PURPLE);

    private String name;
    private ChatColor color;

    private RankInfo(String name, ChatColor color){
        this.name = name;
        this.color = color;
    }

}
