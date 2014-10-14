package gavin.pinoccio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class RunCommand extends CommandBase
{
		
	  public PinoccioAPI pinoccioAPI = new PinoccioAPI();
	
	  public int troopId;
	  public int scoutId;
	  public String apiKey;
	
	  private List aliases;
	  public RunCommand(String key, int troop, int scout)
	  {
	    this.aliases = new ArrayList();
	    this.aliases.add("run");
	    this.apiKey = key;
	    this.troopId = troop;
	    this.scoutId = scout;
	    
	  }

	  @Override
	  public String getCommandName()
	  {
	    return "run";
	  }

	  @Override
	  public String getCommandUsage(ICommandSender icommandsender)
	  {
	    return "run <command>";
	  }

	  @Override
	  public List getCommandAliases()
	  {
	    return this.aliases;
	  }

	  @Override
	  public void processCommand(ICommandSender icommandsender, String[] astring)
	  {
	    if(astring.length == 0)
	    {
	    	Minecraft.getMinecraft().thePlayer.sendChatMessage("Not enough commands entered, please use one");
	    	throw new WrongUsageException("commands.run.usage", new Object[0]);
	    }
	    if(astring.length > 1) {
	    	Minecraft.getMinecraft().thePlayer.sendChatMessage("Too many commands, please only use one");
	    	throw new CommandException("commands.run.usage", new Object[0]);
	    }
	    try {
		    this.pinoccioAPI.runBitlashCommand(this.troopId, this.scoutId, astring[0], this.apiKey);
	    } catch (IOException e) {
	    	Minecraft.getMinecraft().thePlayer.sendChatMessage("Command could not be sent, please check your Pinoccio Scout");
	    	throw new CommandException("commands.read.failed", new Object[0]);
	    } catch (Exception e) {
	    	Minecraft.getMinecraft().thePlayer.sendChatMessage("Command could not be sent, please check your Pinoccio Scout");
	    	throw new CommandException("commands.read.failed", new Object[0]);
		}
	  }

	  @Override
	  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
	  {
	    return true;
	  }

	  @Override
	  public List addTabCompletionOptions(ICommandSender icommandsender,
	      String[] astring)
	  {
	    return null;
	  }

	  @Override
	  public boolean isUsernameIndex(String[] astring, int i)
	  {
	    return false;
	  }

	  @Override
	  public int compareTo(Object o)
	  {
	    return 0;
	  }
	}