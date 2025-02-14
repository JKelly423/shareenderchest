package me.glitch.aitecraft.shareenderchest;

import java.util.UUID;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

public class ShareEnderChestClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
  }

  public static void sendOpenPacket() {
    ClientPlayNetworking.send(OpenSharedInventory.PACKET_ID, PacketByteBufs.empty());
  }
}
