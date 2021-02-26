package be.seeseemelk.mockbukkit.block.state;

import be.seeseemelk.mockbukkit.AdventureImpl;
import com.destroystokyo.paper.loottable.LootableInventory;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Container;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import be.seeseemelk.mockbukkit.inventory.InventoryMock;

/**
 * The {@link ContainerMock} is an extension of a {@link TileStateMock} which can also hold an {@link Inventory}.
 *
 * @author TheBusyBiscuit
 *
 */
public abstract class ContainerMock extends TileStateMock implements Container, LootableInventory
{

	private final Inventory inventory;
	private Component customComponentName;
	private String lock = "";

	public ContainerMock(@NotNull Material material)
	{
		super(material);
		this.inventory = createInventory();
	}

	protected ContainerMock(@NotNull Block block)
	{
		super(block);
		this.inventory = createInventory();
	}

	protected ContainerMock(@NotNull ContainerMock state)
	{
		super(state);
		this.lock = state.lock;
		this.customComponentName = state.customComponentName;
		this.inventory = state.getInventory();
	}

	protected abstract InventoryMock createInventory();

	@Override
	public abstract @NotNull BlockState getSnapshot();

	@Override
	public boolean isLocked()
	{
		return !lock.isEmpty();
	}

	@Override
	@NotNull
	public String getLock()
	{
		return lock;
	}

	@Override
	public void setLock(String key)
	{
		if (key == null)
		{
			lock = "";
		}
		else
		{
			lock = key;
		}
	}

	@Override
	public @Nullable Component customName() {
		return customComponentName;
	}

	@Override
	public void customName(@Nullable Component customName) {
		this.customComponentName = customName;
	}

	@Override
	@Nullable
	public String getCustomName()
	{
		return AdventureImpl.LEGACYSERIALIZER.serialize(customComponentName);
	}

	@Override
	public void setCustomName(String name)
	{
		this.customComponentName = AdventureImpl.LEGACYSERIALIZER.deserialize(name);
	}

	@Override
	public @NotNull Inventory getInventory()
	{
		return inventory;
	}

	@Override
	public @NotNull Inventory getSnapshotInventory()
	{
		return ((InventoryMock) inventory).getSnapshot();
	}
}
