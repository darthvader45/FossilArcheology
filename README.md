#[Fossil and Archeology Revival](http://www.minecraftforum.net/topic/1708636-147sspsmp-fossils-and-archeology-revival-147-build-0004-final-updated-march-29-2013/)
***
![Banner](http://i.imgur.com/iwRq4yy.jpg)

[Imgur album of current and past banners](http://imgur.com/a/hBe0h)

As many of you know, [Flammarilva](https://github.com/fls81245) was originally the author of this mod, but due to his circumstances could not continue development so he released the project as open source. Then Armbrust took the initiative to revive the mod, and brought together a small team to accomplish that. So huge thanks to [Flammarilva](https://github.com/fls81245) for the awesome mod, and also to Armbrust for getting the ball rolling again.

### Fossils and Archeology Revival Mod Team
[Microjunk](https://github.com/Microjunk)

[Shadowbeast007](https://github.com/Shadowbeast)

[4f6f3b](https://github.com/4f6f3b)

[tyranno66](https://github.com/tyranno66)

### Additional Credits
###### Past/Hiatus Revival Members
[Chellre](https://github.com/Chellre)
###### Language Contributors
Octo-Docto (Spanish)

Roody (Dutch)
###### Special Thanks
[Flammarilva](https://github.com/fls81245) and the rest of Team July.

## Fossils Public Servers
This server is run by 4f6f3b, and where he usually is to answer questions.

**fossils.noip.us:25865**

4f6f3b has a zero tolerance policy on griefing, and will kick and ban with little warning.

Also, please PM him on Minecraft Forums with anything related to the server rather than post it on the thread.


## Wikis
[User Wiki](http://fossils-archeology.wikia.com/)

[Developer Wiki](https://github.com/4f6f3b/FossilArcheology/wiki)

## Known Bugs
For a comprehensive list of reported bugs, refer to the project issues page:

[https://github.com/4f6f3b/FossilArcheology/issues?milestone=1&sort=comments&state=open](https://github.com/4f6f3b/FossilArcheology/issues?milestone=1&sort=comments&state=open)

It's also a good place to check on the progress of future releases. So if you have to ask "when's the next update", we'll probably link you to GitHub.

## Licence, Copyright, and Modpacks
Flammarilva's original code is open source and can be found here: [https://github.com/fls81245/FossilArcheology](https://github.com/fls81245/FossilArcheology)

The Fossils and Archeology Revival code is also open source and can be found here: [https://github.com/4f6f3b/FossilArcheology](https://github.com/4f6f3b/FossilArcheology)

However there is one minor difference. You are free to look at, modify, and fork the open source code. However you are not free to redistribute compiled Fossils and Archeology Revival code, either in part or in whole, without explicit permission from the Fossils and Archeology Revival team.

I will also put this here, since this has cropped up several times now. Regarding EXDragonith and CurlyWurly's models, no, we cannot give you permission for you to use them. EXDragonith gave us permissions to use his model pack, and as far as that's concerned doesn't extend past this mod. Any inquiries to that should be addressed to the original model authors.

Right now we do not want people adding this mod to public modpacks. We are still working out most of the bugs and we have not tested compatibility with other mods. Our priority is making sure the Fossils mod works 100% before we start worrying about will it work with x mod.

## How to Build
In the Fossil.java:

At the very beginning is a boolean DebugMode.

Set to true for work in eclipse, false for compiles.

The Fossillang and Dinosounds Folder must be in the jars/resources folder for working in eclipse. This is due to using legacy Modloader methods.

Place the whole mods folder in mcp/src/minecraft.

After recompiling/reobfuscating:(Debug Mode false!)

Copy armor, fossillang, textures and Dinosounds from the src folder in the reobf/minecraft/fossil folder.

Copy the mcmod.info from src in the reobf/minecraft folder.

Zip the fossil folder and the mcmod.info file up together and name the archive Fossil-Archeology.zip.

That's it!
