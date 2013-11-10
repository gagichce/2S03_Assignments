import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class Matrix3x3flat {

	long Row1Col1;
	long Row1Col2;
	long Row1Col3;
	long Row2Col1;
	long Row2Col2;
	long Row2Col3;
	long Row3Col1;
	long Row3Col2;
	long Row3Col3;

	public Matrix3x3flat(long[] inArray) {

		// make sure the input array has 9 and only 9 elements
		if (inArray.length != 9) {
			throw new ArrayDoesNotContainNineElements(inArray.length);
		}

		// next is to get all the fields in the class and declare them.
		// doing it this way allows for no code duplication.
		Field[] theseFields = this.getClass().getDeclaredFields();
		for (int i = 0; i < inArray.length; i++) {
			// must be put in try catch or else eclipse gets sad :(
			try {
				// set that field
				theseFields[i].setLong(this, inArray[i]);
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
