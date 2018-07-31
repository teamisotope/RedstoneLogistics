package com.teamisotope.redlog;

import com.teamisotope.redlog.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static com.teamisotope.redlog.util.RLStatic.*;

@Mod(modid = MODID, name = MODNAME, version = MODVER, dependencies = MODDEPS, useMetadata=true)
public class RedLog {

    @SidedProxy(clientSide = PROXYCLIENT, serverSide = PROXYSERVER)
    public CommonProxy proxy;

    @Mod.Instance
    public static RedLog instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}
