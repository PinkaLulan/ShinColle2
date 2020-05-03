package com.lulan.shincolle2.constant;

/**
 * 名稱：
 *   ModInfo
 *   mod公用資訊
 *   
 * 說明：
 *   mod公用資訊，主要為版本號等基本設定
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 * 
 */
public class BaseInfo
{
    
    private BaseInfo() {/**/}
    
    // mod info
    public static final String MOD_ID = "shincolle2";
    public static final String MOD_NAME = "ShinColle2 1.12.2";
    public static final String MOD_VERSION = "1.0";
    public static final String CLIENT_PROXY = "com.lulan.shincolle2.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.lulan.shincolle2.proxy.ServerProxy";
    public static final String GUI_FACTORY = "com.lulan.shincolle2.client.gui.GuiFactory";
    public static final String GUI_FACTORY_CFG = "com.lulan.shincolle2.config.ConfigGuiFactory";
    public static final String TEXTURES_BLOCKS = MOD_ID + ":textures/blocks/";
    public static final String TEXTURES_ENTITY = MOD_ID + ":textures/entity/";
    public static final String TEXTURES_GUI = MOD_ID + ":textures/gui/";
    public static final String TEXTURES_ITEMS = MOD_ID + ":textures/items/";
    public static final String TEXTURES_PARTICLE = MOD_ID + ":textures/particles/";
    public static final String SOUNDS = MOD_ID + ":sounds/";
    public static final String DEPENDENCIES = "required:forge@[14.23.5.2847,)";
    public static final String ACCEPT_MC_VERSION = "[1.12.2]";
    
    // mod compat
    public static final String MOD_ID_Baubles = "baubles";
    public static final String MOD_ID_IC2 = "ic2";
    public static final String MOD_ID_BC_Energy = "buildcraftenergy";
    public static final String MOD_ID_Forestry = "forestry";
    public static final String MOD_ID_Optifine = "optifine";
    public static final String MOD_ID_Metamorph = "metamorph";
    
}