package com.lulan.shincolle2.item;

import com.lulan.shincolle2.creativetab.CreativeTabSC2;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 名稱：
 *   ItemBasic
 *   item基礎class
 *   
 * 說明：
 *   item基礎class, 呼叫item最基本的方法如加入creative tab等。
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public abstract class ItemBasic extends Item
{
    
    private ItemEnum itemEnum;
    
    public ItemBasic(ItemEnum itemEnum)
    {
        super();
        
        this.itemEnum = itemEnum;
        
        // 加入到creative tab中
        setCreativeTab(CreativeTabSC2.SC2_TAB);
        // 註冊item.{name}用於語言檔
        setUnlocalizedName(itemEnum.getName());
        // 註冊物品唯一名稱
        setRegistryName(itemEnum.getName());
        // 設定sub type
        if (itemEnum.getSubTypeAmount() > 1) setHasSubtypes(true);
    }
    
    public ItemEnum getItemEnum()
    {
        return this.itemEnum;
    }
    
    /**
     * 註冊所有icon textures
     * 
     * 無設定sub type的物品只會設置一個texture: 
     *   {itemName}.json
     * 而有設sub type的物品則依照每個meta值都各設定一個texture: 
     *   {itemName}{meta}.json 注意meta從0開始
     * 若有設sub type但各meta並非全都有icon時, override此方法並自行設定對應texture 
     */
    @SideOnly(Side.CLIENT)
    public void registerModel()
    {
        // 若有sub type
        if (getHasSubtypes())
        {
            int subNum = getItemEnum().getSubTypeAmount();
            
            ModelResourceLocation[] models = new ModelResourceLocation[subNum];
            
            // 宣告並設定texture位置
            for (int i = 0; i < subNum; i++)
            {
                models[i] = new ModelResourceLocation(getRegistryName() + 
                    String.valueOf(i), "inventory");
            }

            // 登錄全部texture
            ModelBakery.registerItemVariants(this, models);
            
            // 依照各meta值一對一設定texture
            for (int i = 0; i < subNum; i++)
            {
                 ModelLoader.setCustomModelResourceLocation(this, i, models[i]);
            }
        }
        // 無sub type
        else
        {
            ModelLoader.setCustomModelResourceLocation(
                this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
        }
    }
    
}
