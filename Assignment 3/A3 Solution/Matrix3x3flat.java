package cs2s03;

class Matrix3x3flat extends Matrix{

	Matrix3x3flat (long[] data){
	
	}
	
	class Record9{
		long row1col1;
		long row1col2;
		long row1col3;
		long row2col1;
		long row2col2;
		long row2col3;
		long row3col1;
		long row3col2;
		long row3col3;
		
		Record9(long[] data){
			this.row1col1  = data[0];
			this.row1col2  = data[1];
			this.row1col3  = data[2];
			this.row2col1  = data[3];
			this.row2col2  = data[4];
			this.row2col3  = data[5];
			this.row3col1  = data[6];
			this.row3col2  = data[7];
			this.row3col3  = data[8];
		}
	}
}