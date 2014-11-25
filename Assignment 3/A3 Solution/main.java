import cs2s03.*;

class main{
	
	public static void main(String[] args){
		try{
			Matrix3x3flat my = new Matrix3x3flat(new long[]{1L,1L,1L,1L,1L,1L,1L,1L,1L});
			Matrix3x3flat my2 = Matrix3x3flat.GetIdentityMatrix();
			System.out.println("Passed");
		}
		catch(WrongLength e){
			System.out.println("Threw expected Exception");
		}
	}
}