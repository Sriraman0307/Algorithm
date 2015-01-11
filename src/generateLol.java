import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class generateLol {
	public ArrayList<Node> genetare(ArrayList<Node> list, File file){
		try {
			FileInputStream fstream = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			StringBuffer str = new StringBuffer(); 
			char[] cbuf = new char[(int) file.length()];
			br.read(cbuf); 
			str.append(cbuf);
			br.close();
			int i;
			for(i=0;i<file.length();i++)
			{
				if(cbuf[i]== ' ')
				{
					Node vertex = new Node();
					List<Character> adj1 = new ArrayList<Character>();
					vertex.setIndex(cbuf[i-1]);
					while(cbuf[i]!= '\n' && i<str.length())
					{
						if(Character.isDigit(cbuf[i])){
							adj1.add(cbuf[i]);
						}
						if((i+1)<file.length())
						{
							i++;
						}
						else if((i+1)>=file.length())
						{
							break;
						}
					}
					vertex.setAdj(adj1);
					list.add(vertex);
				}
			}	
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return list;
	}
}