package spring.road.beans.utils;

public abstract class Assert {
	public static void notNull(Object object, String message) {
		if (object == null) {
			throw new IllegalArgumentException(message);
		}
	}
}
