package it.lia.ninecrowns;

import com.google.gson.GsonBuilder;
import java.nio.file.*;

public final class Config {
    // 14 total raw damage with Sharpness V:
    // vanilla Netherite Sword + Sharpness V is 11, so this is +3 damage = +1.5 hearts.
    public double swordDamage = 14;

    public double jabDamage = 10;
    public double poisonChance = .20, slownessChance = .10;
    public int effectTicks = 60, jabCooldownTicks = 20;

    // One special lightning attack every 30 seconds.
    // Three visual lightning bolts are spawned, but damage is applied ONCE
    // for 12 normal damage = 6 hearts before armor/protection.
    public int lightningMaxCharges = 1, lightningRechargeSeconds = 30;
    public int lightningVisualBolts = 3;
    public double lightningRange = 24;
    public float lightningDamage = 12;

    public static Config load(Path path) {
        try {
            var gson = new GsonBuilder().setPrettyPrinting().create();
            Config c = Files.exists(path)
                ? gson.fromJson(Files.readString(path), Config.class)
                : new Config();
            Files.createDirectories(path.getParent());
            Files.writeString(path, gson.toJson(c));
            return c;
        } catch (Exception e) {
            throw new IllegalStateException("Nine Crowns config error", e);
        }
    }
}
