package me.mmmjjkx.betterChests.items;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BCItemStacks {
    public static final ItemStack TIP = new CustomItemStack(Material.PAPER, "§6§l提示",
            "§c§l请不要在一个区块内放置过多的抽屉！",
            "§c放置后，抽屉会生成3个实体。");

    public static final ItemStack GROUP_MAIN_ITEM = new CustomItemStack(Material.CHEST, "§6§l更好的箱子");
    public static final ItemStack GROUP_STORAGE_ITEM = new CustomItemStack(Material.BARREL, "§a§l存储");
    public static final ItemStack GROUP_TOOL_ITEM = new CustomItemStack(Material.BLAZE_ROD, "§b§l工具 & 机器");
    public static final ItemStack GROUP_MATERIAL_ITEM = new CustomItemStack(Material.IRON_INGOT, "§b§l材料");
    public static final ItemStack GROUP_CARGO_ITEM = new CustomItemStack(Material.CHEST, "§e§l货物");

    public static final ItemStack GEAR_WHEEL = new CustomItemStack(Material.REDSTONE, "§a齿轮", "§7用于制作BC的物品");
    public static final ItemStack TIGHTLY_BLISTERING_INGOT = new CustomItemStack(Material.IRON_INGOT, "§e致密炽热锭", "§7一种高硬度金属", LoreBuilder.radioactive(Radioactivity.VERY_HIGH));
    public static final ItemStack TIGHTLY_BLISTERING_PLATE = new CustomItemStack(Material.IRON_BLOCK, "§e致密炽热板", "§7一种高硬度金属板", LoreBuilder.radioactive(Radioactivity.HIGH));

    public static final ItemStack LOCATION_RECORDER = new CustomItemStack(Material.COMPASS, "§a位置记录器", "§bShift + 右键点击记录位置", "§b右键点击打开对应的机器");
    public static final ItemStack CHEST_COLOR_CHANGER = new CustomItemStack(Material.AMETHYST_SHARD, "§a箱子颜色变换器", "§a右键点击改变BC箱子的颜色", "§aShift + 右键点击循环颜色", "", "§d当前颜色：§6无色", "", LoreBuilder.powerCharged(0, 200));

    public static final ItemStack CHEST_DISASSEMBLER = new CustomItemStack(Material.YELLOW_CONCRETE, "§c箱子拆解器", "§e§l拆解BC箱子", LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(16));

    public static final ItemStack DRAWER_1 = new CustomItemStack(Material.BARREL, "§a抽屉 §61级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：1024");
    public static final ItemStack DRAWER_2 = new CustomItemStack(Material.BARREL, "§a抽屉 §62级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：4096");
    public static final ItemStack DRAWER_3 = new CustomItemStack(Material.BARREL, "§a抽屉 §63级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：16384");
    public static final ItemStack DRAWER_4 = new CustomItemStack(Material.BARREL, "§a抽屉 §64级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：262K");
    public static final ItemStack DRAWER_5 = new CustomItemStack(Material.BARREL, "§a抽屉 §65级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：1M");
    public static final ItemStack DRAWER_6 = new CustomItemStack(Material.BARREL, "§a抽屉 §66级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：4M");
    public static final ItemStack DRAWER_7 = new CustomItemStack(Material.BARREL, "§a抽屉 §67级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：16M");
    public static final ItemStack DRAWER_8 = new CustomItemStack(Material.BARREL, "§a抽屉 §68级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：64M");
    public static final ItemStack DRAWER_9 = new CustomItemStack(Material.BARREL, "§a抽屉 §69级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：256M");
    public static final ItemStack DRAWER_10 = new CustomItemStack(Material.BARREL, "§a抽屉 §610级", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：1B");
    public static final ItemStack DRAWER_MAX = new CustomItemStack(Material.BARREL, "§a抽屉 §6MAX", "§b右键点击抓取64个物品（当手中为空时）", "§b右键点击存储手中的物品", "§d容量：2.14B");

    public static final ItemStack IE_STORAGE_UNIT_1 = new CustomItemStack(Material.OAK_LOG, "§eIE存储单元 §61级", "§b类似无尽贪婪的存储单元", "§d容量：32,000");
    public static final ItemStack IE_STORAGE_UNIT_2 = new CustomItemStack(Material.DARK_OAK_LOG, "§eIE存储单元 §62级", "§b类似无尽贪婪的存储单元", "§d容量：128,000");
    public static final ItemStack IE_STORAGE_UNIT_3 = new CustomItemStack(Material.ACACIA_LOG, "§eIE存储单元 §63级", "§b类似无尽贪婪的存储单元", "§d容量：1,000,000");
    public static final ItemStack IE_STORAGE_UNIT_4 = new CustomItemStack(Material.BIRCH_LOG, "§eIE存储单元 §64级", "§b类似无尽贪婪的存储单元", "§d容量：4,000,000");
    public static final ItemStack IE_STORAGE_UNIT_5 = new CustomItemStack(Material.JUNGLE_LOG, "§eIE存储单元 §65级", "§b类似无尽贪婪的存储单元", "§d容量：64,000,000");
    public static final ItemStack IE_STORAGE_UNIT_6 = new CustomItemStack(Material.MANGROVE_LOG, "§eIE存储单元 §66级", "§b类似无尽贪婪的存储单元", "§d容量：256,000,000");
    public static final ItemStack IE_STORAGE_UNIT_7 = new CustomItemStack(Material.CRIMSON_STEM, "§eIE存储单元 §67级", "§b类似无尽贪婪的存储单元", "§d容量：1,000,000,000");
    public static final ItemStack IE_STORAGE_UNIT_8 = new CustomItemStack(Material.WARPED_STEM, "§eIE存储单元 §68级", "§b类似无尽贪婪的存储单元", "§d容量：2,140,000,000");

    public static final ItemStack POINT_TO_POINT_TRANSFER = new CustomItemStack(Material.END_ROD, "§a点对点传输器", "§b§l一个在两个方块之间传输物品的绝佳工具");
}

