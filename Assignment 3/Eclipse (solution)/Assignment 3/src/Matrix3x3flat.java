//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Matrix Array represented as flat record
//Determinate method adapted from http://en.wikipedia.org/wiki/Minor_(linear_algebra)#Cofactor_expansion_of_the_determinant
import java.lang.reflect.Field;

public class Matrix3x3flat {
	Long Row1Col1;
	Long Row1Col2;
	Long Row1Col3;
	Long Row2Col1;
	Long Row2Col2;
	Long Row2Col3;
	Long Row3Col1;
	Long Row3Col2;
	Long Row3Col3;

	public Matrix3x3flat(Long[] inArray) {

		// make sure the input array has 9 and only 9 elements
		if (inArray.length != 9) {
			throw new ArrayDoesNotContainNineElements(inArray.length);
		}
		Reflektor.assignRecord(this, inArray);
	}

	public long determinate() {

		return Row1Col1 * (Row2Col2 * Row3Col3 - Row2Col3 * Row3Col2)
				- Row2Col1 * (Row1Col2 * Row3Col3 - Row1Col3 * Row3Col2)
				+ Row3Col1 * (Row1Col2 * Row2Col3 - Row1Col3 * Row2Col2);
	}
}
