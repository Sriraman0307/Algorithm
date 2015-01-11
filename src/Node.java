import java.util.ArrayList;
import java.util.List;

public class Node 
{
	public boolean visited=false;
	private char index;
	private List<Character> adj = new ArrayList<Character>();
	//INDEX FOR REFERENCE
	public char getIndex() {
		return index;
	}
	public void setIndex(char index) {
		this.index = index;
	}
	public void setAdj(List<Character> adj) {
		this.adj = adj;
	}
	public List<Character> getAdj() {
		return adj;
	}
	
}