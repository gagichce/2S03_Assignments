package Bonus;

public class SnocList<T> {
	private T head;
	private SnocList<T> next;

	public SnocList(T c) {

		this.head = c;
	}

	public SnocList(T c, SnocList<T> l) {
		this.next = l;
		this.head = c;
	}
	
	public T getValue(){
		return this.head;
	}
	
	public SnocList<T> getNext(){
		return this.next;
	}
	
	public void setValue(T c){
		this.head = c;
	}
	
	public void setNext(SnocList<T> l){
		this.next = l;
	}
}
