package net.omniblock.coins;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.omniblock.coins.hook.MVdWHook;
import net.omniblock.coins.hook.PAPIHook;

public class CoinsSpigot extends JavaPlugin {

	/**
	 *
	 * Esta es la instancia de la clase
	 * CoinsSpigot, por ende, para acceder
	 * a esta instancia se debe hacer uso
	 * del método estático {@link #getInstance()}
	 *
	 *
	 */
	protected static CoinsSpigot instance;
	
	/**
	 *
	 * Metodo que carga todos los
	 * sistemas.
	 *
	 * Se inician cuando el servidor esta
	 * encendido o cuando se realice un
	 * reload.
	 *
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable(){

		instance = this;

		this.getServer().getConsoleSender().sendMessage("[CoinsSpigot] Inicializando sistema...");
		
		if(Bukkit.getServer().getPluginManager().isPluginEnabled("PlaceholderAPI"))
			new PAPIHook(this).hook();
		
		if(Bukkit.getServer().getPluginManager().isPluginEnabled("MVdWPlaceholderAPI"))
			MVdWHook.hook();
			
	}

	/**
	 * 
	 * @return La instancia del CoinsSpigot
	 */
	public static CoinsSpigot getInstance(){
		return instance;
	}
	
}
