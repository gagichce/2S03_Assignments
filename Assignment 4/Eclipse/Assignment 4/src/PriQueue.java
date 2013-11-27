import java.io.PrintStream;


public interface PriQueue {
	public char next( ) throws Exception; // h i g h e s t p r i o r i t y
	public void insertItem(int priority, char c);
	public void deleteItem();
	public boolean isEmpty();
	public void show(PrintStream p);

}
