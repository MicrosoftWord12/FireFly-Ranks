package com.MicrosoftWord12.FileManager;

import com.MicrosoftWord12.FireFlyRanks;
import com.MicrosoftWord12.Ranks.RankInfo;
import com.MicrosoftWord12.Utils.Message;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileManager {

    private File file;
    private FileConfiguration config;



    public FileManager(FireFlyRanks main){
        file = new File(main.getDataFolder(), "ranks.yml");
        try{
            if (!file.exists()){
                if (file.createNewFile()){
                    Message.serverMessage("&AThe Config File Has Been Created");
                }else{
                    Message.serverMessage("&cThe Config File Failed to be Created");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        config = YamlConfiguration.loadConfiguration(file);
    }

    public void setRank(Player player, RankInfo rank){
        config.set(player.getUniqueId().toString(), rank.name());
        save();
    }

    public void setRank(UUID uuid, RankInfo rank){
        config.set(uuid.toString(), rank.name());
        save();
    }

    public RankInfo getRank(Player player){
        return RankInfo.valueOf(config.getString(player.getUniqueId().toString()));
    }

    public RankInfo getRank(UUID uuid){
        return RankInfo.valueOf(config.getString(uuid.toString()));
    }

    public void save(){
        try{
            config.save(file);
        }catch (IOException ex){
            Message.serverMessage("&cTHE SERVER COULD NOT SAVE PLAYER RANKS");
            ex.printStackTrace();
        }
    }





}
