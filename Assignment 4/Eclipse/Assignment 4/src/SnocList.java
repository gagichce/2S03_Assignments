
public class SnocList {
	public char value ;
	public SnocList next;
	public SnocList(char c, SnocList l){
		this.value = c;
		this.next = l;
	}
	public SnocList(char c){
		this.value = c;
		this.next = null;
	}
}

