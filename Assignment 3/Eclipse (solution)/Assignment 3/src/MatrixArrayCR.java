//Colin Gagich 1224692 gagichce@mcmaster.ca
//November 2013
//2S03
//Matrix Array represented as arrays of columns of rows
//Determinate method adapted from http://en.wikipedia.org/wiki/Minor_(linear_algebra)#Cofactor_expansion_of_the_determinant
public class MatrixArrayCR {
	int dimension;
	Long[][] Matrix;

	public MatrixArrayCR(Long[] inArray) {

		dimension = (int) Math.sqrt(inArray.length);
		// check to make sure the input array was nxn
		if (dimension * dimension != inArray.length || inArray.length == 0)
			throw new ArrayNotNxN();
		Matrix = new Long[dimension][dimension];
		int c = -1;
		
		for (int i = 0; i < inArray.length; i++) {
			if (i % dimension == 0)
				c++;
			Matrix[i % dimension][c] = inArray[i];
		}
	}

	public Long determinate() {

		// base case
		if (dimension == 1) {
			return Matrix[0][0];
		}
		Long returns = 0L;
		for (int i = 0; i < dimension; i++) {
			// noticed that even if its zero it will still try to continue
			// and multiply stuff by zero.
			if (Matrix[i][0] != 0) {
				// keeps track of position in array
				int c = 0;
				Long[] tmpArray = new Long[(int) Math.pow(dimension - 1, 2)];
				for (int k = 0; k < Math.pow(Matrix.length, 2); k++) {
					if ((k % dimension == 0)) {
						if (k == i * dimension) {
							k += dimension - 1;
						}
					} else
						tmpArray[c++] = Matrix[(k - (k % dimension))
								/ dimension][k % dimension];
					if (c == tmpArray.length)
						break;
				}
				returns += Matrix[i][0] * ((i % 2 == 0) ? 1L : -1L)
						* (new MatrixArrayCR(tmpArray)).determinate();
			}
		}
		return returns;
	}
}
