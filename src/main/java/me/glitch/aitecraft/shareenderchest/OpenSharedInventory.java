package me.glitch.aitecraft.shareenderchest;

import net.minecraft.util.Identifier;

public record OpenSharedInventory() {
    public static final Identifier PACKET_ID = Identifier.of("shareenderchest", "open_shared_inventory");
}
