import java.util.ArrayList;
import java.util.List;
public class Topsort {
	public ArrayList<Character> start(ArrayList<Node> list,int a){
		ArrayList<Character> finallist = new ArrayList<Character>();
		while(!list.isEmpty()){
			finallist.add(list.get(a-1).getIndex());
			for(int i=0;i<list.size();i++){
				List<Character> temp = new ArrayList<Character>();
				temp=list.get(i).getAdj();
				if(temp.contains(finallist.get(a-1))){
				temp.remove(a-1);
				list.get(i).setAdj(temp);
				}
			}
			list.remove(a-1);
			for(int i=0;i<list.size();i++){
				List<Character> temp = new ArrayList<Character>();
				temp = list.get(i).getAdj();
				int x=  Character.getNumericValue(temp.get(0));
				if(x==0)
				{
					a = i+1;
					break; 
				}
			}
		}
		return finallist;
	}
}