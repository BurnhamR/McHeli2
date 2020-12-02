package com.skyy.mcheli;

import com.skyy.mcheli.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class MCH_MOD 
{
	
	public static String VER = "";

	@Instance("mcheli")
	public static MCH_MOD instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = REFERENCE.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	
}
