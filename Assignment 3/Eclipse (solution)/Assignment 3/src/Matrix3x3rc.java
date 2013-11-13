import java.lang.reflect.Field;

public class Matrix3x3rc {
	RowX3 Row1;
	RowX3 Row2;
	RowX3 Row3;
	
	public Matrix3x3rc(long[] inArray)
	{
		// make sure the input array has 9 and only 9 elements
		if (inArray.length != 9) {
			throw new ArrayDoesNotContainNineElements(inArray.length);
		}
		// next is to get all the fields in the class and declare them.
		// doing it this way allows for no code duplication.
		Field[] theseFields = this.getClass().getDeclaredFields();
		for (int i = 0; i < (int) Math.sqrt(inArray.length); i++) {
			// must be put in try catch or else eclipse gets sad :(
			try {
				// set that field
				theseFields[i].set(this, new RowX3(new long[] {inArray[i*3],inArray[i*3 + 1],inArray[i*3 + 2]}));
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
