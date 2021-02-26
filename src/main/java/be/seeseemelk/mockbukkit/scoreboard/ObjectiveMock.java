package be.seeseemelk.mockbukkit.scoreboard;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import be.seeseemelk.mockbukkit.AdventureImpl;
import net.kyori.adventure.text.Component;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.RenderType;

import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ObjectiveMock implements Objective
{
	private final ScoreboardMock scoreboard;
	private final String name;
	private final String criteria;
	private final Map<String, ScoreMock> scores = new HashMap<>();
	private Component displayName;
	private DisplaySlot displaySlot;
	private RenderType renderType = RenderType.INTEGER;

	public ObjectiveMock(ScoreboardMock scoreboard, String name, Component displayName, String criteria, RenderType type) {
		this.scoreboard = scoreboard;
		this.name = name;
		this.displayName = displayName;
		this.criteria = criteria;
		this.renderType = type;
	}

	public ObjectiveMock(ScoreboardMock scoreboard, String name, String criteria)
	{
		this.scoreboard = scoreboard;
		this.name = name;
		this.displayName = AdventureImpl.LEGACYSERIALIZER.deserialize(name);
		this.criteria = criteria;
	}

	@Override
	public String getName() throws IllegalStateException
	{
		return name;
	}

	@Override
	public @NotNull Component displayName() throws IllegalStateException {
		return null;
	}

	@Override
	public void displayName(@Nullable Component displayName) throws IllegalStateException, IllegalArgumentException {
		this.displayName = displayName;
	}

	@Override
	public @NotNull String getDisplayName() throws IllegalStateException
	{
		return AdventureImpl.LEGACYSERIALIZER.serialize(displayName);
	}

	@Override
	public void setDisplayName(String displayName) throws IllegalStateException, IllegalArgumentException
	{
		displayName(AdventureImpl.LEGACYSERIALIZER.deserialize(displayName));
	}

	@Override
	public String getCriteria() throws IllegalStateException
	{
		return criteria;
	}

	@Override
	public boolean isModifiable() throws IllegalStateException
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public ScoreboardMock getScoreboard()
	{
		return scoreboard;
	}

	@Override
	public void unregister() throws IllegalStateException
	{
		scoreboard.unregister(this);
	}

	/**
	 * Checks if the objective is still registered.
	 * @return {@code true} if the objective is still registered, {@code false} if it has been unregistered.
	 */
	public boolean isRegistered()
	{
		return scoreboard.getObjectives().contains(this);
	}

	@Override
	public void setDisplaySlot(DisplaySlot slot) throws IllegalStateException
	{
		displaySlot = slot;
		scoreboard.setDisplaySlot(this, slot);
	}

	@Override
	public DisplaySlot getDisplaySlot() throws IllegalStateException
	{
		return displaySlot;
	}

	@Override
	public ScoreMock getScore(OfflinePlayer player) throws IllegalArgumentException, IllegalStateException
	{
		return getScore(player.getName());
	}

	@Override
	public ScoreMock getScore(String entry) throws IllegalArgumentException, IllegalStateException
	{
		if (scores.containsKey(entry))
			return scores.get(entry);
		else
		{
			ScoreMock score = new ScoreMock(this, entry);
			scores.put(entry, score);
			return score;
		}
	}

	@Override
	public void setRenderType(RenderType renderType) throws IllegalStateException
	{
		this.renderType =  renderType;
	}

	@Override
	public RenderType getRenderType() throws IllegalStateException
	{
		return renderType;
	}

}
