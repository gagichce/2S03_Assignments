
public class List {
	private List next;
	private char value;
	
	public List(char c){
		value = c;
		next = null;
	}
	
	public List(char c, List myList){
		value = c;
		next = myList;
	}
	
	public List getNext(){
		return this.next;
	}
	
	public void setList(List l){
		this.next = l;
	}
	
	public void setNext(List l){
		this.next = l;
	}

	public void setValue(char c){
		this.value = c;
	}
	public char getValue(){
		return this.value;
	}
}
