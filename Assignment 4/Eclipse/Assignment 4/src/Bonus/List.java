package Bonus;

public class List<T> {
	private List next;
	private T value;
	
	public List(T value){
		this.value = value;
	}
	
	public List(T value, List next){
		this.value = value;
		this.next = next;
	}
	
	public T getValue(){
		return this.value;
	}
	
	public List getNext(){
		return this.next;
	}
	
	public void setNext(List l){
		this.next = l;
	}
	
	public void setValue(T value){
		this.value = value;
	}
}
