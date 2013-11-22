
public class List {
	public List next;
	public char value;
	
	public List(char c){
		value = c;
		next = null;
	}
	
	public List(char c, List myList){
		value = c;
		next = myList;
	}

}
