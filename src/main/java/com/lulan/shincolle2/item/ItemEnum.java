package com.lulan.shincolle2.item;

/**
 * 名稱：
 *   ItemEnum
 *   
 * 說明：
 *   物品enum, 包含註冊名稱等基本設定
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
public enum ItemEnum
{
    /** 怨念 */
    GRUDGE("grudge", 1);
    
    private String name;
    private int subTypeAmount;
    
    private ItemEnum(String name, int subTypeAmount)
    {
        this.name = name;
        this.subTypeAmount = subTypeAmount;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getSubTypeAmount()
    {
        return this.subTypeAmount;
    }
    
}
