package club.aurorapvp;

import club.aurorapvp.listeners.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoMoreSquids extends JavaPlugin {
  @Override
  public void onEnable() {
    getServer().getPluginManager().registerEvents(new EventListener(), this);
  }
}