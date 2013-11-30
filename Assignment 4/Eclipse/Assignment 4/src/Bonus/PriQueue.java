package Bonus;
import java.io.PrintStream;


public interface PriQueue<T> {
	public T next( ) throws Exception; // h i g h e s t p r i o r i t y
	public void insertItem(int priority, T c);
	public void deleteItem();
	public boolean isEmpty();
	public void show(PrintStream p);

}
