package cs2s03;

public class Matrix3x3flat extends Matrix{

	Record9 matrix;

	Matrix3x3flat (long[] elems) throws WrongLength {
		int len = elems.length;
		if(len !=9) {
			throw new WrongLength(len, this.getClass().getCanonicalName());
		}
		this.matrix = new Record9(elems);
	}

	//create identity matrix
	Matrix3x3flat(){
		this.matrix = new Record9();
	}
	
	@Override
	Matrix3x3flat smultiply(int n) throws NegativeExponent {

		if(n < 0){

			throw new NegativeExponent(n, this.getClass().getCanonicalName());
		}
		else if (n == 0){

			return new Matrix3x3flat();
		}

		return new Matrix3x3flat();
	}

	class Record9{
		//some values initialized to 1, for identity matrix.
		long row1col1 = 1;
		long row1col2;
		long row1col3;
		long row2col1;
		long row2col2 = 1;
		long row2col3;
		long row3col1;
		long row3col2;
		long row3col3 = 1;
		
		Record9(long[] elems){
			this.row1col1  = elems[0];
			this.row1col2  = elems[1];
			this.row1col3  = elems[2];
			this.row2col1  = elems[3];
			this.row2col2  = elems[4];
			this.row2col3  = elems[5];
			this.row3col1  = elems[6];
			this.row3col2  = elems[7];
			this.row3col3  = elems[8];
		}

		//default constructor for identity matrix.
		Record9(){

		}
	}
}