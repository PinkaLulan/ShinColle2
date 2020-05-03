package com.lulan.shincolle2.item.init;

import java.util.EnumMap;
import java.util.Map;

import com.lulan.shincolle2.constant.BaseInfo;
import com.lulan.shincolle2.item.ItemBasic;
import com.lulan.shincolle2.item.ItemEnum;
import com.lulan.shincolle2.item.ItemGrudge;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 名稱：
 *   ModItems
 *   
 * 說明：
 *   物品註冊class，包含已註冊物件map以方便取得物件instance。
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
@EventBusSubscriber(modid = BaseInfo.MOD_ID)
public class ModItems
{
    
    /** item map, 所有已建立之instance皆保存在此map */
    private static Map<ItemEnum, ItemBasic> itemMap;
    
    static
    {
        itemMap = new EnumMap<>(ItemEnum.class);
    }
    
    private ModItems() {}
    
    /** item init method for forge pre-init event */
    public static void init()
    {
        initItems(ItemEnum.GRUDGE, new ItemGrudge());
    }
    
    /** item init */
    private static void initItems(ItemEnum itemEnum, ItemBasic item)
    {
        itemMap.put(itemEnum, item);
    }
    
    /** item map, 所有已建立之物品instance皆保存在此map */
    public static Map<ItemEnum, ItemBasic> getItemMap()
    {
        return itemMap;
    }
    
    /** 以ItemEnum取得Item */
    public static ItemBasic getItem(ItemEnum itemEnum)
    {
        return itemMap.get(itemEnum);
    }
    
    /** item register event */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(itemMap.values().toArray(new ItemBasic[0]));
    }
    
    /** item model init */
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        for (ItemBasic ib : itemMap.values())
        {
            ib.registerModel();
        }
    }
    
}
