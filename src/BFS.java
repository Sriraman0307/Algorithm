import java.util.ArrayList;


public class BFS {
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
			for(int k=0;k< list.get(x-1).getAdj().size();k++)
			{
				if(!finallist.contains(list.get(x-1).getAdj().get(k))){
					if(!temp.contains(list.get(x-1).getAdj().get(k))){
						temp.add(list.get(x-1).getAdj().get(k));
					}
				}
			}
		}
	return finallist;
	}
}
