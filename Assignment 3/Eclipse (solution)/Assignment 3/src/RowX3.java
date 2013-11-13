import java.lang.reflect.Field;


public class RowX3 {
	Object Col1;
	Object Col2;
	Object Col3;
	
	public RowX3(long[] inArray) {
		Field[] theseFields = this.getClass().getDeclaredFields();
		for (int i = 0; i < inArray.length; i++) {
			// must be put in try catch or else eclipse gets sad :(
			try {
				// set that field
				theseFields[i].set(this, inArray[i]);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public RowX3(){
		
	}
}
