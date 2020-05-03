package com.lulan.shincolle2;


import com.lulan.shincolle2.block.init.ModBlocks;
import com.lulan.shincolle2.constant.BaseInfo;
import com.lulan.shincolle2.item.init.ModItems;
import com.lulan.shincolle2.utility.LogHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

/**
 * 名稱：
 *   ShinColle2
 *   
 * 說明：
 *   mod main class
 *   
 * 版本：
 * version  date        author        content
 * -----------------------------------------------------------------------------
 * 1.0      2020/04/18  PinkaLulan    註解建立。
 */
@Mod(modid = BaseInfo.MOD_ID,
     name = BaseInfo.MOD_NAME,
     version = BaseInfo.MOD_VERSION,
     acceptedMinecraftVersions = BaseInfo.ACCEPT_MC_VERSION,
     dependencies= BaseInfo.DEPENDENCIES
//     guiFactory = ModInfo.GUI_FACTORY_CFG
    )
public class ShinColle2
{
    
    // mod instance
    @Instance(BaseInfo.MOD_ID)
    public static ShinColle2 instance;
    
//    // proxy for client/server event
//    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
//    public static IProxy proxy; TODO
    
    /**
     * mod pre-init階段
     * 適用目標: config/block/tile/item/entity/render/packet/capability
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) throws Exception
    {
        // logger
        LogHelper.init(event.getModLog());
        LogHelper.info("Pre-init...");
        // 物品
        ModItems.init();
        // 方塊
        ModBlocks.init();
        
//        //config inti
//        ConfigHandler.init(event);    //load config file
//        
//        //render & model register
//        proxy.registerRender();
//        
//        //Packet channel register (simple network)
//        proxy.registerChannel();
//        
//        //capability register
//        proxy.registerCapability();
//        
        LogHelper.info("Pre-init done.");
    }
    
    /**
     * mod init階段
     * 適用目標: recipe/gui/worldgen/event/OreDictionary/mod interact
     */
    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Init...");
//        //GUI register
//        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
//        
//        ModOres.oreDictRegister();
//        
//        ModEvents.init();
//        
////        ModRecipes.init(); //TODO dep
//        
//        //Waila tooltip provider TODO
//        //FMLInterModComms.sendMessage("Waila", "register", "com.lulan.shincolle.waila.WailaDataProvider.callbackRegister");
    
        LogHelper.info("Init done.");
    }
    
    /**
     * mod post-init階段
     * 適用目標: 等待所有mod皆跑完物品或方塊註冊才需要進行的動作, 
     *           例如列出其他mod之物品或其他mod間互動處理
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-init...");
//        //world gen跟entity spawn放在postInit, 以便能讀取到其他mod的biome
//        ModWorldGen.init();
//        
//        //register chunk loader callback
//        ForgeChunkManager.setForcedChunkLoadingCallback(instance, new ChunkLoaderHandler());
//        
//        //check config changed
//        ConfigHandler.checkChange(ConfigHandler.config);
//        
//        //inter-mod
//        CommonProxy.checkModLoaded();
//        
////        //DEBUG
////        Map<String, ModContainer> modlist = Loader.instance().getIndexedModList();
////        modlist.forEach((name, v) ->
////        {
////            LogHelper.info("AAAAAAAA "+name);
////        });
////        LogHelper.info("DEBUG : biome spawn: "+this.worldObj.getBiomeGenForCoords((int)this.posX, (int)this.posZ).getSpawnableList(EnumCreatureType.waterCreature).get(1));
////        for (String oreName : OreDictionary.getOreNames())
////        {    //list all oreDictionary  (DEBUG)
////            LogHelper.info(oreName);
////        }
        
        LogHelper.info("Post-init done.");
    }
    
    /** server about to start
     *  當開啟一個存檔或者MP伺服器開啟時會丟出此事件
     *  在此事件中將MapStorage的讀取紀錄設為false
     *  使每次開不同存檔都會重讀該存檔的MapStorage
     */
    @Mod.EventHandler
    public void onServerAboutToStart(FMLServerAboutToStartEvent event)
    {
//        LogHelper.info("INFO: server about to start: is MP server? "+event.getSide().isServer());
//        //set init flag
//        ServerProxy.initServerFile = true;
//        ServerProxy.saveServerFile = false;
//        CommonProxy.isMultiplayer = event.getSide().isServer();
    }
    
    /** server starting
     *  command必須在此註冊 (每個地圖檔會依照權限設定, 註冊不同command)
     */
    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event)
    {
//        LogHelper.info("INFO: Server starting event: is MP server? "+event.getSide().isServer());
//        
//        //register command
//        CommandHandler.init(event);
    }
    
    /** server stopping
     *  before world unload
     *  標記server即將關閉, server world data需要標記存回disk
     */
    @Mod.EventHandler
    public void onServerStopping(FMLServerStoppingEvent event)
    {
//        LogHelper.info("INFO: Server stopping event");
//        //set init flag
//        ServerProxy.initServerFile = false;
//        ServerProxy.saveServerFile = true;
    }
    

}