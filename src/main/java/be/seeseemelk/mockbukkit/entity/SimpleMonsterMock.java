package be.seeseemelk.mockbukkit.entity;

import java.util.UUID;

import com.destroystokyo.paper.block.TargetBlockInfo;
import com.destroystokyo.paper.entity.Pathfinder;
import com.destroystokyo.paper.entity.TargetEntityInfo;
import net.kyori.adventure.text.Component;
import org.bukkit.Chunk;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.*;

import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SimpleMonsterMock extends MonsterMock implements Monster
{

	public SimpleMonsterMock(ServerMock server, UUID uuid)
	{
		super(server, uuid);
	}

	public SimpleMonsterMock(ServerMock server)
	{
		this(server, UUID.randomUUID());
	}

	@Override
	public EntityType getType()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean fromMobSpawner() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @NotNull Chunk getChunk() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public CreatureSpawnEvent.@NotNull SpawnReason getEntitySpawnReason() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInRain() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInWaterOrRain() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInWaterOrBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInWaterOrRainOrBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInLava() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isTicking() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @NotNull Pathfinder getPathfinder() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isInDaylight() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable Block getTargetBlock(int maxDistance, TargetBlockInfo.@NotNull FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable BlockFace getTargetBlockFace(int maxDistance, TargetBlockInfo.@NotNull FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable TargetBlockInfo getTargetBlockInfo(int maxDistance, TargetBlockInfo.@NotNull FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable Entity getTargetEntity(int maxDistance, boolean ignoreBlocks) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable TargetEntityInfo getTargetEntityInfo(int maxDistance, boolean ignoreBlocks) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void setKiller(@Nullable Player killer) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public int getArrowsStuck() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void setArrowsStuck(int arrows) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public int getShieldBlockingDelay() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void setShieldBlockingDelay(int delay) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable ItemStack getActiveItem() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void clearActiveItem() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public int getItemUseRemainingTime() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public int getHandRaisedTime() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isHandRaised() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public boolean isJumping() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void setJumping(boolean jumping) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void playPickupItemAnimation(@NotNull Item item, int quantity) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public float getHurtDirection() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void setHurtDirection(float hurtDirection) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void registerAttribute(@NotNull Attribute attribute) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public @Nullable Component customName() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}

	@Override
	public void customName(@Nullable Component customName) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();

	}
}
