package be.seeseemelk.mockbukkit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.UnsafeValues;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.PluginDescriptionFile;

@SuppressWarnings("deprecation")
public class MockUnsafeValues implements UnsafeValues
{

	private final Set<String> compatibleApiVersions = new HashSet<>(Arrays.asList("1.13", "1.14", "1.15", "1.16"));

	@Override
	public void reportTimings()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Material toLegacy(Material material)
	{
		if (material.isLegacy())
		{
			return material;
		}
		throw new UnimplementedOperationException();
	}

	@Override
	public Material fromLegacy(Material material)
	{
		return material;
	}

	@Override
	public Material fromLegacy(MaterialData material)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Material fromLegacy(MaterialData material, boolean itemPriority)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public BlockData fromLegacy(Material material, byte data)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getDataVersion()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ItemStack modifyItemStack(ItemStack stack, String arguments)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void checkSupported(PluginDescriptionFile pdf) throws InvalidPluginException
	{
		if (pdf.getAPIVersion() == null)
			throw new InvalidPluginException("Plugin does not specify 'api-version' in plugin.yml");

		if (!compatibleApiVersions.contains(pdf.getAPIVersion()))
			throw new InvalidPluginException(String.format("Plugin api version %s is incompatible with the current MockBukkit version", pdf.getAPIVersion()));
	}

	@Override
	public byte[] processClass(PluginDescriptionFile pdf, String path, byte[] clazz)
	{
		return clazz;
	}

	@Override
	public Advancement loadAdvancement(NamespacedKey key, String advancement)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean removeAdvancement(NamespacedKey key)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public String getTimingsServerName() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();	}

	@Override
	public boolean isSupportedApiVersion(String apiVersion) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();	}

	@Override
	public byte[] serializeItem(ItemStack item) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();	}

	@Override
	public ItemStack deserializeItem(byte[] data) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public String getTranslationKey(Material mat) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public String getTranslationKey(Block block) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public String getTranslationKey(EntityType type) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int nextEntityId() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Material getMaterial(String material, int version)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

}
