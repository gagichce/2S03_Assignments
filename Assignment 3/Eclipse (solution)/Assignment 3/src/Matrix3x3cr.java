//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Matrix Array represented columns of rows
//Determinate method adapted from http://en.wikipedia.org/wiki/Minor_(linear_algebra)#Cofactor_expansion_of_the_determinant
import java.lang.reflect.Field;

public class Matrix3x3cr {
	ColumnX3 Col1;
	ColumnX3 Col2;
	ColumnX3 Col3;

	public Matrix3x3cr(Long[] inArray) {

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
				theseFields[i].set(this, new ColumnX3(new Long[] { inArray[i],
						inArray[3 + i], inArray[2 * 3 + i] }));
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

		// not the prettiest thing because I store everything as an object.
		// oh well
		return ((Long) Col1.Row1)
				* (((Long) Col2.Row2) * ((Long) Col3.Row3) - ((Long) Col3.Row2)
						* ((Long) Col2.Row3))
				- ((Long) Col1.Row2)
				* (((Long) Col2.Row1) * ((Long) Col3.Row3) - ((Long) Col3.Row1)
						* ((Long) Col2.Row3))
				+ ((Long) Col1.Row3)
				* (((Long) Col2.Row1) * ((Long) Col3.Row2) - ((Long) Col3.Row1)
						* ((Long) Col2.Row2));
	}
}
