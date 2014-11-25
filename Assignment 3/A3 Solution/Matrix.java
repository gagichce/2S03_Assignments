package cs2s03;

abstract class Matrix{

	//Matrix(long[] data){
		//must throw exception if not 9 elements long
	//}

	abstract Matrix smultiply(int n) throws NegativeExponent;
}