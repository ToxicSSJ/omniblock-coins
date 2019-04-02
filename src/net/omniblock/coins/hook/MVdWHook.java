package net.omniblock.coins.hook;

import be.maximvdw.placeholderapi.PlaceholderAPI;
import be.maximvdw.placeholderapi.PlaceholderReplaceEvent;
import be.maximvdw.placeholderapi.PlaceholderReplacer;
import net.omniblock.coins.CoinsSpigot;
import net.omniblock.coins.base.OmniCoinsBase;

public class MVdWHook {

	public static void hook() {
		
		PlaceholderAPI.registerPlaceholder(CoinsSpigot.getInstance(), "omnibase_coins",
				
					new PlaceholderReplacer() {

						@Override
						public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
							return String.valueOf(OmniCoinsBase.getMoney(e.getPlayer()));
						}
				
					}
				
				);
		
		PlaceholderAPI.registerPlaceholder(CoinsSpigot.getInstance(), "omnibase_level",
				
				new PlaceholderReplacer() {

					@Override
					public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
						return String.valueOf(OmniCoinsBase.getLevel(e.getPlayer()));
					}
			
				}
			
			);
		
		PlaceholderAPI.registerPlaceholder(CoinsSpigot.getInstance(), "omnibase_points",
				
				new PlaceholderReplacer() {

					@Override
					public String onPlaceholderReplace(PlaceholderReplaceEvent e) {
						return String.valueOf(OmniCoinsBase.getPoints(e.getPlayer()));
					}
			
				}
			
			);
		
	}
	
}
