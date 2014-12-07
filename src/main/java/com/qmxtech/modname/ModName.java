package com.qmxtech.modname;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ModName.java
// <AUTHOR> | Created : <DDMMMYY> | Last Modified : <DDMMMYY> by <USER>
// Version : 1.0.0
// This is a source file for 'Mod Name'; it defines the base mod class.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// <LICENSE>
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Imports
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.qmxtech.modname.proxy.CommonProxy;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// The 'ModName' Class
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@Mod( modid = Config.MOD_ID, name = Config.NAME, version = Config.VERSION ) public class ModName
{
	// Fields

		@Instance( Config.MOD_ID ) public static ModName instance;
		@SidedProxy( clientSide = Config.CLIENT_PROXY, serverSide = Config.SERVER_PROXY ) public static CommonProxy proxy;

	// Methods

		@EventHandler public void preInit( FMLPreInitializationEvent event )
		{
			// Perform necessary pre-initialization.

				proxy.preInit();
		}

		@EventHandler public void init( FMLInitializationEvent event )
		{
			// Perform necessary initialization.

				proxy.init();
		}

		@EventHandler public void postInit( FMLPostInitializationEvent event )
		{
			// Perform necessary post-initialization.

				proxy.postInit();
		}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// End of 'ModName.java'
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
