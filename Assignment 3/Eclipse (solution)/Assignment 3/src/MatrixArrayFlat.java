//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Matrix Array represented as flat array
//Determinate method adapted from http://en.wikipedia.org/wiki/Minor_(linear_algebra)#Cofactor_expansion_of_the_determinant
public class MatrixArrayFlat {
	int dimension;
	Long[] Matrix;

	public MatrixArrayFlat(Long[] inArray) {

		dimension = (int) Math.sqrt(inArray.length);
		// check to make sure the input array was nxn
		if (dimension * dimension != inArray.length)
			throw new ArrayNotNxN();
		Matrix = inArray;
	}

	public Long determinate() {

		// base case
		if (dimension == 1) {
			return Matrix[0];
		}
		Long returns = 0L;
		for (int i = 0; i < dimension; i++) {
			// noticed that even if its zero it will still try to continue
			// and multiply stuff by zero.
			if (Matrix[i * dimension] != 0) {
				int c = 0;
				Long[] tmpArray = new Long[(int) Math.pow(dimension - 1, 2)];
				for (int k = 1; k < Matrix.length; k++) {
					if ((k % dimension != 0)
							&& !(i * dimension <= k && (i + 1) * dimension > k)) {
						tmpArray[c++] = Matrix[k];
					}
				}
				returns += Matrix[i * dimension] * ((i % 2 == 0) ? 1L : -1L)
						* (new MatrixArrayFlat(tmpArray)).determinate();
			}
		}
		return returns;
	}
}
