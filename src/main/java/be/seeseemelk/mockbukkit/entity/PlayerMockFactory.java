package be.seeseemelk.mockbukkit.entity;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import be.seeseemelk.mockbukkit.ServerMock;

public final class PlayerMockFactory<T extends PlayerMock>
{
	private static final String[] FIRST_NAMES = {"James", "Mary", "John", "Particia", "Robert", "Jennifer", "Michael", "Elizabeth", "William", "Linda"};
	private static final String[] LAST_NAMES = {"Smith", "Johnson", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson"};

	private Class mockClass;
	private final ServerMock server;
	private Random random = new Random();
	private Set<String> usedNames = new HashSet<>();

	public static PlayerMockFactory<PlayerMock> create(ServerMock mock){
		return new PlayerMockFactory<>(mock,PlayerMock.class);
	}

	public PlayerMockFactory(ServerMock server,Class<T> clazz)
	{
		this.server = server;
		mockClass = clazz;
	}
	
	/**
	 * Generates a random name.
	 * @return A randomly generated name.
	 */
	private String getRandomName()
	{
		String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
		String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
		return firstName + " " + lastName;
	}
	
	/**
	 * Gets a unique random name.
	 * Any name that is generated will never be generated again.
	 * @return A unique random name. 
	 */
	private String getUniqueRandomName()
	{
		if (usedNames.size() >= 100)
		{
			throw new RuntimeException("Out of names");
		}
		
		while (true)
		{
			String name = getRandomName();
			if (!usedNames.contains(name))
			{
				usedNames.add(name);
				return name;
			}
		}
	}

	/**
	 * Create a random player mock object with a unique name.
	 * @return A newly created player mock object.
	 */
	public T createRandomPlayer()
	{
		String name = getUniqueRandomName();
		UUID uuid = new UUID(random.nextLong(), random.nextLong());
		try {
			return ((T)mockClass.getConstructor(ServerMock.class, String.class, UUID.class).newInstance(server,name,uuid));
		}catch (NoSuchMethodException|InstantiationError|IllegalAccessException|IllegalArgumentException|InstantiationException| InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Create a random player mock object with a unique name.
	 * It will not however contain a UUID. 
	 * @return A newly created player mock object.
	 */
	public T createRandomOfflinePlayer()
	{
		try {
			return ((T)mockClass.getConstructor(ServerMock.class, String.class).newInstance(server,getUniqueRandomName()));
		}catch (NoSuchMethodException|InstantiationError|IllegalAccessException|IllegalArgumentException|InstantiationException| InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}
}


























