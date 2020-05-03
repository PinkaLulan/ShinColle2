package com.lulan.shincolle2.block;

import net.minecraft.block.material.Material;

/**
 * 名稱：
 *   BlockEnum
 *   
 * 說明：
 *   方塊enum, 包含註冊名稱等基本設定
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public enum BlockEnum
{
    /** 怨念魔方 */
    GRUDGE_CUBE("blockgrudgecube", Material.ROCK, true);
    
    private String name;
    private Material material;
    private boolean hasItemBlock;
    
    private BlockEnum(String name, Material material, boolean hasItemBlock)
    {
        this.name = name;
        this.material = material;
        this.hasItemBlock = hasItemBlock;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public Material getMaterial()
    {
        return this.material;
    }
    
    public boolean hasItemBlock()
    {
        return this.hasItemBlock;
    }
    
}
