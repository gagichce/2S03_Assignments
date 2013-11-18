public class mainRun {

	// I hate warnings for stupid things. If I want to make it but not use it,
	// let me not use it.
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Matrix3x3rc mySTUPUID = new Matrix3x3rc(new Long[] { 5L, 9L, 9L, 7L,
				9L, 9L, 9L, 9L, 9L });
		Long thissad = (Long) mySTUPUID.Row2.Col1;
		Matrix3x3cr mySTUPUIerwD = new Matrix3x3cr(new Long[] { 1L, 2L, 3L, 7L,
				9L, 9L, 9L, 9L, 9L });
		MatrixArrayFlat flatty = new MatrixArrayFlat(new Long[] {0L,  5L,  1L,  2L,  4L,  0L,  3L,  4L,  4L,  1L,  4L,  1L,  4L,  1L,  3L,  4L,  0L,  3L,  4L,  0L,  3L,  1L,  5L,  5L,  2L,  2L,  5L,  0L,  3L,  5L,  1L,  2L,  0L,  0L,  4L,  4L,  0L,  2L,  2L,  5L,  1L,  1L,  3L,  0L,  3L,  4L,  4L,  3L,  2L,  2L,  4L,  2L,  5L,  3L,  3L,  0L,  3L,  5L,  3L,  3L,  3L,  3L,  2L,  5L,  1L,  3L,  0L,  5L,  4L,  5L,  0L,  3L,  5L,  5L,  3L,  5L,  4L,  0L,  5L,  1L,  2L,  0L,  1L,  2L,  1L,  1L,  3L,  5L,  1L,  4L,  1L,  1L,  1L,  4L,  0L,  2L,  3L,  5L,  2L,  3L,  1L,  0L,  0L,  5L,  3L,  0L,  5L,  4L,  3L,  5L,  3L,  5L,  4L,  1L,  3L,  1L,  4L,  5L,  2L,  2L,  4L,  4L,  2L,  5L,  0L,  3L,  0L,  0L,  3L,  0L,  1L,  1L,  0L,  0L,  5L,  5L,  0L,  1L,  4L,  3L,  0L,  5L,  5L,  4L,  5L,  3L,  3L,  4L,  5L,  0L,  5L,  0L,  2L,  1L,  1L,  4L,  3L,  0L,  4L,  2L,  0L,  5L,  4L,  0L,  2L,  4L,  5L,  3L,  0L,  0L,  2L,  1L,  3L,  0L,  4L,  0L,  3L,  0L,  1L,  4L,  5L,  5L,  3L,  5L,  4L,  5L,  0L,  3L,  4L,  4L,  3L,  3L,  0L,  2L,  2L,  4L,  2L,  2L,  0L,  2L,  0L,  0L,  5L,  1L,  0L,  4L,  3L,  1L,  0L,  1L,  0L,  4L,  3L,  0L,  3L,  0L,  4L,  3L,  4L,  0L,  5L,  4L,  3L,  5L,  5L});
		MatrixArrayCR rwoed = new MatrixArrayCR(new Long[] { 9L, 3L, 5L, 5L, 5L, 10L, 2L, 7L, 5L });
		System.out.println(rwoed.determinate());
		System.out.println("asd");
	}

}
