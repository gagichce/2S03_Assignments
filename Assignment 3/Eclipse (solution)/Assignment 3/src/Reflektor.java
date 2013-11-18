import java.lang.reflect.Field;

//I swear I don't like the song, I just think it's funny.
//david bowie is judging you right now.
public final class Reflektor {
	public static void assignRecord(Object inRecord, Long[] inArray) {
		// next is to get all the fields in the class and declare them.
		// doing it this way allows for no code duplication.
		Field[] theseFields = inRecord.getClass().getDeclaredFields();
		for (int i = 0; i < inArray.length; i++) {
			// must be put in try catch or else eclipse gets sad :(
			try {
				// set that field
				theseFields[i].set(inRecord, inArray[i]);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
