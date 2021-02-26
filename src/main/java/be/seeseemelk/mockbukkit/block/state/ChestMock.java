package be.seeseemelk.mockbukkit.block.state;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;
import org.bukkit.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import be.seeseemelk.mockbukkit.inventory.ChestInventoryMock;
import be.seeseemelk.mockbukkit.inventory.InventoryMock;

/**
 * This {@link ContainerMock} represents a {@link Chest} or Trapped {@link Chest}.
 *
 * @author TheBusyBiscuit
 *
 */
public class ChestMock extends LootableContainerMock implements Chest
{

	public ChestMock(@NotNull Material material)
	{
		super(material);
	}

	protected ChestMock(@NotNull Block block)
	{
		super(block);
	}

	protected ChestMock(@NotNull ChestMock state)
	{
		super(state);
	}


	@Override
	public void setSeed(long seed)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public long getSeed()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void open()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void close()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public @NotNull Inventory getBlockInventory()
	{
		return getInventory();
	}

	@Override
	protected InventoryMock createInventory()
	{
		return new ChestInventoryMock(this, 27);
	}

	@Override
	public @NotNull BlockState getSnapshot()
	{
		return new ChestMock(this);
	}

}
