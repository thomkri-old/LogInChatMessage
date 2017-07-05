package thomkri.loginchatmessage;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import thomkri.loginchatmessage.proxy.CommonProxy;

import java.util.Iterator;
import java.util.List;

@Mod(modid = LoginChatMessage.MODID, version = LoginChatMessage.VERSION, name = LoginChatMessage.NAME, acceptableRemoteVersions = "*")
public class LoginChatMessage
{
    public static final String MODID = "thomkriloginchatmessage";
    public static final String VERSION = "1.0";
    public static final String NAME = "Login Chat Message";

    @SidedProxy(clientSide = "thomkri.loginchatmessage.proxy.ClientProxy", serverSide = "thomkri.loginchatmessage.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LoginChatMessage instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
