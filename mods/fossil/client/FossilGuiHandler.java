package mods.fossil.client;

import mods.fossil.client.gui.GuiAnalyzer;
import mods.fossil.client.gui.GuiCultivate;
import mods.fossil.client.gui.GuiFeeder;
import mods.fossil.client.gui.GuiNotebook;
import mods.fossil.client.gui.GuiPedia;
import mods.fossil.client.gui.GuiTimeMachine;
import mods.fossil.client.gui.GuiWorktable;
import mods.fossil.entity.mob.EntityDinosaur;
import mods.fossil.guiBlocks.ContainerAnalyzer;
import mods.fossil.guiBlocks.ContainerCultivate;
import mods.fossil.guiBlocks.ContainerFeeder;
import mods.fossil.guiBlocks.ContainerNotebook;
import mods.fossil.guiBlocks.ContainerPedia;
import mods.fossil.guiBlocks.ContainerTimeMachine;
import mods.fossil.guiBlocks.ContainerWorktable;
import mods.fossil.guiBlocks.TileEntityAnalyzer;
import mods.fossil.guiBlocks.TileEntityCultivate;
import mods.fossil.guiBlocks.TileEntityFeeder;
import mods.fossil.guiBlocks.TileEntityTimeMachine;
import mods.fossil.guiBlocks.TileEntityWorktable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class FossilGuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch(id)
		{

		case 0: return new ContainerAnalyzer(player.inventory, (TileEntityAnalyzer) tile_entity);
		case 1: return new ContainerCultivate(player.inventory, (TileEntityCultivate) tile_entity);
		case 2: return new ContainerFeeder(player.inventory, (TileEntityFeeder) tile_entity);
		case 3: return new ContainerWorktable(player.inventory, (TileEntityWorktable) tile_entity);
		case 4: return new ContainerPedia();
		case 5: return new ContainerTimeMachine(player.inventory, (TileEntityTimeMachine) tile_entity);
		case 6: return new ContainerNotebook();
		
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch(id)
		{

		case 0: return new GuiAnalyzer(player.inventory, (TileEntityAnalyzer) tile_entity);
		case 1: return new GuiCultivate(player.inventory, (TileEntityCultivate) tile_entity);
		case 2: return new GuiFeeder(player.inventory, (TileEntityFeeder) tile_entity);
		case 3: return new GuiWorktable(player.inventory, (TileEntityWorktable) tile_entity);
		case 4: return new GuiPedia();
		case 5: return new GuiTimeMachine(player.inventory, (TileEntityTimeMachine) tile_entity);
		case 6: return new GuiNotebook();
		
		}

		return null;

	}
}
