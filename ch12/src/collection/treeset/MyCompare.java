package collection.treeset;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return str1.compareTo(str2) * (-1); //내림차순 
	}

}
