# DisableLighting
Disables all lighting calculations on Minecraft 1.21 for the Fabric mod loader. This allows for a fullbright that also improves performance.

This mod will only run on the client side. Mobs will still spawn and crops still won't grow in dark areas. As a side effect of disabling light calculations, the light level always appears as 15 in F3 since it never ran the calculation to determine what the light level should be. If you need this capability, this mod is not for you - try a fullbright resource pack or mod instead.

## Why?
While most fullbright mods and resource packs will create the same visual appearance by changing the gamma, Disable Lighting skips all block lighting calculations. If you aren't going to see the lighting anyway, why do the work to know what the light would have been?

## Dependencies
This mod's only dependencies are the dependencies necessary to run a fabric mod: fabric loader and fabric API. There is no config library nor is there a config command. This means you can't toggle the mod in-game, you must remove it from your mods folder (or disable it in some other way, such as renaming the file extension to .jar.disabled).

## Credits
Inspired by [Patcher](https://sk1er.club/mods/patcher) which does the same thing, as well as several other performance improvements, but only for 1.8.9 and 1.12.2.
