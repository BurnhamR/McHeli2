package com.skyy.mcheli.proxy;

/*    */ import cpw.mods.fml.common.FMLCommonHandler;
/*    */ import mcheli.aircraft.MCH_SoundUpdater;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ 
/*    */ public class MCH_CommonProxy {
/*    */   public String lastConfigFileName;
/*    */   
/*    */   public void registerRenderer() {}
/*    */   
/*    */   public void registerBlockRenderer() {}
/*    */   
/*    */   public void registerModels() {}
/*    */   
/*    */   public void registerModelsHeli(String name, boolean reload) {}
/*    */   
/*    */   public String getDataDir() {
/* 20 */     return MinecraftServer.func_71276_C().func_71270_I();
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerModelsPlane(String name, boolean reload) {}
/*    */   
/*    */   public void registerModelsVehicle(String name, boolean reload) {}
/*    */   
/*    */   public void registerModelsTank(String name, boolean reload) {}
/*    */   
/*    */   public void registerClientTick() {}
/*    */   
/*    */   public void registerServerTick() {
/* 33 */     FMLCommonHandler.instance().bus().register(new MCH_ServerTickHandler());
/*    */   }
/* 35 */   public boolean isRemote() { return false; }
/* 36 */   public String side() { return "Server"; } public MCH_SoundUpdater CreateSoundUpdater(MCH_EntityAircraft aircraft) {
/* 37 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerSounds() {}
/*    */   
/*    */   public MCH_Config loadConfig(String fileName) {
/* 44 */     this.lastConfigFileName = fileName;
/*    */     
/* 46 */     MCH_Config config = new MCH_Config("./", fileName);
/*    */     
/* 48 */     config.load();
/* 49 */     config.write();
/*    */     
/* 51 */     return config;
/*    */   }
/*    */   
/*    */   public MCH_Config reconfig() {
/* 55 */     MCH_Lib.DbgLog(false, "MCH_CommonProxy.reconfig()", new Object[0]);
/* 56 */     return loadConfig(this.lastConfigFileName);
/*    */   }
/*    */   
/*    */   public void loadHUD(String path) {}
/*    */   
/*    */   public void reloadHUD() {}
/*    */   
/*    */   public Entity getClientPlayer() {
/* 64 */     return null;
/*    */   }
/*    */   public void setCreativeDigDelay(int n) {}
/*    */   
/*    */   public void init() {}
/*    */   
/*    */   public boolean isFirstPerson() {
/* 71 */     return false;
/*    */   } public int getNewRenderType() {
/* 73 */     return -1;
/*    */   } public boolean isSinglePlayer() {
/* 75 */     return MinecraftServer.func_71276_C().func_71264_H();
/*    */   }
/*    */   
/*    */   public void readClientModList() {}
/*    */   
/*    */   public void printChatMessage(IChatComponent chat, int showTime, int pos) {}
/*    */   
/*    */   public void hitBullet() {}
/*    */   
/*    */   public void clientLocked() {}
/*    */ }