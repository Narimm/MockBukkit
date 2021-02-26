package be.seeseemelk.mockbukkit;

import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import net.md_5.bungee.chat.BaseComponentSerializer;

/**
 * Created for the Charlton IT Project.
 * Created by Narimm on 26/02/2021.
 */
public class AdventureImpl {
	public static LegacyComponentSerializer LEGACYSERIALIZER = LegacyComponentSerializer.builder().hexColors().useUnusualXRepeatedCharacterHexFormat().build();
	public static PlainComponentSerializer plainText = PlainComponentSerializer.plain();

}
