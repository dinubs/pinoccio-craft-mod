Pinoccio Craft
==============

This is Pinoccio Craft, a Minecraft companion for the Pinoccio api.

Currently included in the mod are multiple commands ("led", "run", "read"), along with 2 blocks ("ledblock", and custom scoutscript blocks).

This mod requires Minecraft Forge to run, and you can follow the instructions to install Forge into your Minecraft game on the Forge website. 

After installing Forge, you need to navigate to your Minecraft folder, follow the instructions [here](http://minecraft.gamepedia.com/.minecraft) to learn how to find your Minecraft folder.

Once in your Minecraft folder there will be another folder titled "mods", copy the Pinoccio-1.0.jar file into this folder, and boot up Minecraft. You need to boot up Minecraft and then shut it down, this is to generate your Config file where you will add you Pinoccio API token the scout id and the troop id. These are essential for the mod to work.

The config file is in the config folder at the root of your Minecraft folder and it is laid out so it should be easy to find where to change things, but just in case your api key goes where the text "Change This" is on the line that says:

    S:APIKey=Change This

and your scout id and troop id go on the respective lines:

    # Insert your scoutid here
    I:ScoutId=1

    # Insert your troopid here
    I:TroopId=1

the scout id and troop id are default to 1 and 1, so if you want to play with your lead scout in your first troop then don't change anything at all.

LED Block
===

The LED Block is my personal favorite block added in by this mod, to set a color just place the respective color wool on top of the block, and then supply redstone power to the block, and the LED on your Pinoccio Scout will change.

Custom Scoutscript blocks
===

To add your own custom scoutscript blocks, just add any scoutscript after the "led.off" you must seperate each command by a line break or else you will break the mod:

	S:Commands <
        led.red
        led.off
    >

All scoutscript commands can be found on the [Pinoccio Scoutscript Site](https://docs.pinocc.io/scoutcommands.html).

Commands
===

There are three commands added into the gamex, they are "/led", "/run", "/read".

To use the "/led" command, just add any compatible color (e.g. "/led magenta"), you can also use "/led setrgb(255,0,0)" and "/led off".

You can view all possible LED commands on the [Pinoccio Scoutscript site](https://docs.pinocc.io/scoutcommands.html#led-on).

The "/run" command allows you to run any Pinoccio Scoutscript command, along with custom scoutscripts. Simply use the command "/run led.purple".

All scoutscript commands can be found on the [Pinoccio Scoutscript Site](https://docs.pinocc.io/scoutcommands.html).

The "/read" command allows you to read any digital pin on your Pinoccio Scout, put this command into a command block (e.g. "/read d2") hook it up to a repeater loop and you now have streaming information of whether pin "d2" is HIGH or LOW, if it is HIGH the command block will emit a redstone pulse to a comparator block.