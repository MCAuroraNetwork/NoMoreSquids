package club.aurorapvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class EventListener implements Listener {

  @EventHandler
  public void onSquidSpawn(EntitySpawnEvent event) {
    if (event.getEntity() instanceof org.bukkit.entity.Squid ||
        event.getEntity() instanceof org.bukkit.entity.GlowSquid) {
      event.setCancelled(true);
    }
  }
}