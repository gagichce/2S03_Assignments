//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Matrix Array represented as rows of column
//Determinate method adapted from http://en.wikipedia.org/wiki/Minor_(linear_algebra)#Cofactor_expansion_of_the_determinant
import java.lang.reflect.Field;

public class Matrix3x3rc {
	RowX3 Row1;
	RowX3 Row2;
	RowX3 Row3;

	public Matrix3x3rc(Long[] inArray) {

		// make sure the input array has 9 and only 9 elements
		if (inArray.length != 9) {
			throw new ArrayDoesNotContainNineElements(inArray.length);
		}
		// next is to get all the fields in the class and declare them.
		// doing it this way allows for no code duplication.
		Field[] theseFields = this.getClass().getDeclaredFields();
		for (int i = 0; i < Math.sqrt(inArray.length); i++) {
			// must be put in try catch or else eclipse gets sad :(
			try {
				// set that field
				theseFields[i].set(this, new RowX3(new Long[] { inArray[i * 3],
						inArray[i * 3 + 1], inArray[i * 3 + 2] }));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Long determinate() {

		return ((Long) Row1.Col1)
				* (((Long) Row2.Col2) * ((Long) Row3.Col3) - ((Long) Row2.Col3)
						* ((Long) Row3.Col2))
				- ((Long) Row2.Col1)
				* (((Long) Row1.Col2) * ((Long) Row3.Col3) - ((Long) Row1.Col3)
						* ((Long) Row3.Col2))
				+ ((Long) Row3.Col1)
				* (((Long) Row1.Col2) * ((Long) Row2.Col3) - ((Long) Row1.Col3)
						* ((Long) Row2.Col2));
	}
}
