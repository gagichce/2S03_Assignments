package cs2s03;

abstract class Matrix{

	Matrix(long[] elems) throws WrongLength {};
	Matrix(Matrix matrixToCopy) {};
	Matrix() {};

	public abstract Matrix smultiply(int n) throws NegativeExponent;

	public abstract Matrix Clone();

	//can't do this because you have to override from an instance :( 
	//but method should be static so we can get an identity matrix at any time. 
	//public static Matrix GetIdentityMatrix();
}