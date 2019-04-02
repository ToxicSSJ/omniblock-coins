package net.omniblock.coins.hook;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.clip.placeholderapi.external.EZPlaceholderHook;
import net.omniblock.coins.base.OmniCoinsBase;

@SuppressWarnings("deprecation")
public class PAPIHook extends EZPlaceholderHook {

	public PAPIHook(Plugin plugin) {
		super(plugin, "omnibase");
	}

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
    	
        // Placeholder: %omnibase_coins%
        if(identifier.equals("coins"))
            return String.valueOf(OmniCoinsBase.getMoney(player));
        
        return null;
        
    }
	
}
