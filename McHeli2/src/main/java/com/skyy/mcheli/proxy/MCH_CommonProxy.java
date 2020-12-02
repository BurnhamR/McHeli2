package com.skyy.mcheli.proxy;

import net.minecraft.entity.Entity;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class MCH_CommonProxy {

	public String lastConfigFileName;
	
	public void registerRenderer() {}
	
	public void registerBlockRenderer() {}
	
	public void registerModels() {}
	
	public void registerModelsHeli(String name, boolean reload) {}
	
	public String getDataDir() 
	{
		return MinecraftServer.func_71276_C().func_71270_I();
	}
	
	public void registerModelsPlane(String name, boolean reload) {}
	
	public void registerModelsVehicle(String name, boolean reload) {}
	
	public void registerModelsTank(String name, boolean reload) {}
	
	public void registerClientTick() {}
	
	public void registerServerTick() 
	{
		FMLCommonHandler.instance().bus().register(new MCH_ServerTickHandler());
	}
	
	public boolean isRemote() { return false; }
	public String side() { return "Server"; } public MCH_SoundUpdater CreateSoundUpdater(MCH_EntityAircraft aircraft) {
		return null;
	}
		
	public void registerSounds() {}
	
	public MCH_Config loadConfig(String fileName) {
		this.lastConfigFileName = fileName;
		MCH_Config config = new MCH_Config("./", fileName);
		config.load();
		config.write();
		return config;
	}
	
	public MCH_Config reconfig() 
	{
		MCH_Lib.DbgLog(false, "MCH_CommonProxy.reconfig()", new Object[0]);
		return loadConfig(this.lastConfigFileName);
	}
	
	public void loadHUD(String path) {}
	
	public void reloadHUD() {}
	
	public Entity getClientPlayer()
	{
		return null;
	}
	
	public void setCreativeDigDelay(int n) {}
	
	public void init() {}
	
	public boolean isFirstPerson() 
	{
		return false;	
	}
	public int getNewRenderType() 
	{
		return -1;
	}
	public boolean isSinglePlayer() {
		return MinecraftServer.func_71276_C().func_71264_H();
	}
	
	public void readClientModList() {}
	
	public void printChatMessage(IChatComponent chat, int showTime, int pos) {}
	
	public void hitBullet() {}
	
	public void clientLocked() {}
	
}
