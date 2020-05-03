package com.lulan.shincolle2.creativetab;

import com.lulan.shincolle2.constant.BaseInfo;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 名稱：
 *   CreativeTabSC2
 *   創造模式物品分頁
 *   
 * 說明：
 *   建立創造模式物品分頁
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public class CreativeTabSC2
{
    
    public static final CreativeTabs SC2_TAB = new CreativeTabs(BaseInfo.MOD_ID)
    {
        /**
         * 設定模式物品分頁圖示
         * 另外該tab名稱可於語系檔中加入itemGroup.{MOD_ID}={tab名稱}來設定
         */
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.IRON_SHOVEL);
        }
    };
    
}
