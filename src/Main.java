import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String ags[]){
		ArrayList<Node> list = new ArrayList<Node>();
		ArrayList<Node> listtop = new ArrayList<Node>();
		int a=0; int flag=0;
		BFS bfs = new BFS();
		DFS dfs = new DFS();
		Topsort top = new Topsort();
		ArrayList<Character> finalbfs = new ArrayList<Character>();
		ArrayList<Character> finaldfs = new ArrayList<Character>();
		ArrayList<Character> finaltop = new ArrayList<Character>();
		generateLol listoflists = new generateLol(); 
		//List of lists
		File file = new File("C:/Users/user/Algorithm/src/input.txt");
		listoflists.genetare(list,file);
		//bfs
		finalbfs = bfs.start(list);
		System.out.println(finalbfs);
		//dfs
		finaldfs = dfs.start(list);
		System.out.println(finaldfs);
		//Topsort
		File topsort = new File("C:/Users/user/Algorithm/src/topsort.txt");
		listoflists.genetare(listtop,topsort);
		for(int i=0;i<listtop.size();i++){
			List<Character> temp = new ArrayList<Character>();
			temp = listtop.get(i).getAdj();
			int x=  Character.getNumericValue(temp.get(0));
			if(x==0)
			{
				flag = 1; a = i+1;
				break;
			}
		}
		if(flag==1){
		finaltop= top.start(listtop,a);
		}
		System.out.println(finaltop);
	}
}