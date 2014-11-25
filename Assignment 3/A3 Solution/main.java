package cs2s03;

class main{
	
	public static void main(String[] args){
		try{
			Matrix3x3flat my = new Matrix3x3flat(new long[]{1L});
		}
		catch(WrongLength e){
			System.out.println("Threw expected Exception");
		}
	}
}