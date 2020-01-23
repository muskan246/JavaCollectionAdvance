package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class AuthorDetailsTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <String,AuthorDetails> author = new TreeMap <String, AuthorDetails>();
		author.put("Freedom in Exile",  new AuthorDetails(101 ,"Dalai Lama","IN" ));
		author.put("Between the Lines",  new AuthorDetails(102 ,"Kuldip Nayar","IN" ));
		author.put("Broken Wing",  new AuthorDetails(103 ,"Sarojini Naidu","IN" ));
		author.put("Bunch of Old Letters",  new AuthorDetails(101 ,"Dalai Lama","IN" ));
		

		AuthorDetails moreThanOneBook  ;
		Set<String> keys = author.keySet();//keys

		List<String> arrlist = new ArrayList<String>();
		
		
		for(String s: keys)
		{	
			AuthorDetails a = author.get(s);//key-value
			System.out.println("\n" + s +" written By "+ a.getAuthorname()+" Residing at Address " +a.getAddress()+ "\n");
			
			if(arrlist.contains(a.getAuthorname())) {
			System.out.println("This writer has written more than 1 book");
			System.out.println(a);
			}
			arrlist.add(a.getAuthorname());
	}
		}

	private static char[] equals1(AuthorDetails a) {
		// TODO Auto-generated method stub
		return null;
	}

}
