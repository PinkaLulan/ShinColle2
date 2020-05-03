package com.lulan.shincolle2.block;

import com.lulan.shincolle2.creativetab.CreativeTabSC2;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 名稱：
 *   BlockBasic
 *   block基礎class
 *   
 * 說明：
 *   block基礎class, 呼叫item最基本的方法如加入creative tab等。
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public abstract class BlockBasic extends Block
{
    
    private BlockEnum blockEnum;
    
    public BlockBasic(BlockEnum blockEnum)
    {
        super(blockEnum.getMaterial());
        
        this.blockEnum = blockEnum;
        
        // 加入到creative tab中
        setCreativeTab(CreativeTabSC2.SC2_TAB);
        // 註冊item.{name}用於語言檔
        setUnlocalizedName(blockEnum.getName());
        // 註冊物品唯一名稱
        setRegistryName(blockEnum.getName());
    }
    
    public BlockEnum getBlockEnum()
    {
        return this.blockEnum;
    }
    
    /**
     * 註冊block模型
     */
    @SideOnly(Side.CLIENT)
    public void registerModel()
    {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
}
