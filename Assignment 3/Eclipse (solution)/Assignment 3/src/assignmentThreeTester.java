//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Class to handle the testing and test cases. Matrix was made at random. correct determinates were calc by hand.
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//I did the bonus at the same time as it was allowed in the discussion board.
//I used reflection which may not be the prettiest thing in the world
//but it does work
public class assignmentThreeTester {

	private static Class[] classy = new Class[] { MatrixArrayFlat.class,
			MatrixArrayRC.class, MatrixArrayCR.class, Matrix3x3flat.class,
			Matrix3x3cr.class, Matrix3x3rc.class };
	private static Long[][] myMatricies = new Long[][] {
			new Long[] { 8L, 9L, 8L, 3L, 10L, 9L, 7L, 10L, 4L },
			new Long[] { 8L, 1L, 6L, 6L, 1L, 5L, 8L, 3L, 9L },
			new Long[] { 1L, 5L, 8L, 10L, 7L, 9L, 6L, 5L, 4L },
			new Long[] { 4L, 6L, 10L, 6L, 1L, 9L, 1L, 7L, 4L },
			new Long[] { 7L, 4L, 8L, 6L, 6L, 10L, 4L, 6L, 10L },
			new Long[] { 9L, 3L, 5L, 5L, 5L, 10L, 2L, 7L, 5L },
			new Long[] { 5L, 7L, 9L, 3L, 8L, 10L, 2L, 8L, 2L },
			new Long[] { 1L, 2L, 6L, 7L, 3L, 1L, 1L, 6L, 7L },
			new Long[] { 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L },
			new Long[] { 1L, 0L, 0L, 0L, 3L, 0L, 0L, 0L, 6L } };
	private static Long[] determinates = new Long[] { -261L, -2L, 117L, 84L,
			16L, -295L, -150L, 153L, 0L, 18L };


	@SuppressWarnings("unused")
	@Test
	public void test() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{

		for (Class myClass : classy) {
			for (int i = 0; i < 10; i++) {
				Long myLong = getLong(myClass, myMatricies[i]);
				assertEquals("must equal", determinates[i], myLong);
				for (Class myClassTwo :classy)
					assertEquals("must equal", myLong, getLong(myClassTwo, myMatricies[i]));
			}
		}
	}

	private Long getLong(Class myClass, Long[] matrixArray) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Object middleClass = myClass.getConstructor(Long[].class)
				.newInstance(new Object[] { matrixArray });
		Method myMethod = middleClass.getClass().getMethod(
				"determinate");
		return (Long) myMethod.invoke(middleClass);
	}

}
