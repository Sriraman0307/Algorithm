import java.util.ArrayList;


public class DFS {
	public ArrayList<Character> start(ArrayList<Node> list){
		ArrayList<Character> finallist = new ArrayList<Character>();
		ArrayList<Character> temp = new ArrayList<Character>();
		finallist.add(list.get(0).getIndex());
		list.get(0).visited = true;
		temp.addAll(list.get(0).getAdj());
		while(temp.isEmpty()==false)
		{
			finallist.add(temp.get(0));
			int x = Character.getNumericValue(temp.get(0));
			list.get(x-1).visited = true;
			temp.remove(0);
			ArrayList<Character> tempnew = new ArrayList<Character>();
			for(int k=0;k< list.get(x-1).getAdj().size();k++)
			{
				if(!finallist.contains(list.get(x-1).getAdj().get(k))){
					tempnew.add(list.get(x-1).getAdj().get(k));
				}
			}
			for(int k=0;k< temp.size();k++)
			{
				if(!tempnew.contains(temp.get(k))){
					tempnew.add(temp.get(k));
				}
			}
			temp=tempnew;
		}
		return finallist;
}
}