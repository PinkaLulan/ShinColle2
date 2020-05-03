package com.lulan.shincolle2.block.init;

import java.util.EnumMap;
import java.util.Map;

import com.lulan.shincolle2.block.BlockBasic;
import com.lulan.shincolle2.block.BlockEnum;
import com.lulan.shincolle2.block.BlockGrudgeCube;
import com.lulan.shincolle2.constant.BaseInfo;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 名稱：
 *   ModBlocks
 *   
 * 說明：
 *   方塊註冊class，包含已註冊物件map以方便取得物件instance。
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
@EventBusSubscriber(modid = BaseInfo.MOD_ID)
public class ModBlocks
{
    
    /** block map, 所有已建立之instance皆保存在此map */
    private static Map<BlockEnum, BlockBasic> blockMap;
    /** itemblock map, 所有已建立之instance皆保存在此map */
    private static Map<BlockEnum, Item> itemBlockMap;
    
    static
    {
        blockMap = new EnumMap<>(BlockEnum.class);
        itemBlockMap = new EnumMap<>(BlockEnum.class);
    }
    
    private ModBlocks() {}
    
    /** block init method for forge pre-init event */
    public static void init()
    {
        initBlock(BlockEnum.GRUDGE_CUBE, new BlockGrudgeCube());
    }
    
    /** block init */
    private static void initBlock(BlockEnum blockEnum, BlockBasic block)
    {
        blockMap.put(blockEnum, block);
        
        // 若此方塊有物品形式, 須再增加ItemBlock
        if (blockEnum.hasItemBlock())
        {
            itemBlockMap.put(blockEnum, 
                new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
    
    /** block map, 所有已建立之instance皆保存在此map */
    public static Map<BlockEnum, BlockBasic> getBlockMap()
    {
        return blockMap;
    }
    
    /** 以BlockEnum取得Block */
    public static BlockBasic getBlock(BlockEnum blockEnum)
    {
        return blockMap.get(blockEnum);
    }
    
    /** block register event */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(blockMap.values().toArray(new BlockBasic[0]));
    }
    
    /** itemblock register event */
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(itemBlockMap.values().toArray(new Item[0]));
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        for (BlockBasic b : blockMap.values())
        {
            b.registerModel();
        }
    }
    
}
