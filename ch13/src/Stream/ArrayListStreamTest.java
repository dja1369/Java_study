package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

class StringCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) *(-1);
	}
	
}

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		strList.add("Julla");
		strList.add("Edward");
		strList.add("Tomas");
		
		//일반적인 for문으로 i번째 요소에 해당 값을 모두 출력
		for(int i=0; i<strList.size(); i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		System.out.println(" ");
		//향상된 for문으로 출력
		for(String str : strList) {
			System.out.println(str);
		}
		System.out.println(" ");
		//Stream 으로 출력
		Stream<String> strStream = strList.stream(); //스트림을 생성
		strStream.forEach(str -> System.out.println(str)); // 요소를 하나씩 꺼내어 출력
		
		System.out.println(" "); //sorted() : 오름차순 중간연산 후 , 최종 연산으로 요소를 모두 출력
		strList.stream().sorted().forEach(str -> System.out.println(str));
		//역순	//내림 차순 정렬을 위한 람다식을 매개변수로 전달
		strList.stream().sorted((s1,s2) -> s1.compareTo(s2) * (-1)).forEach(str -> System.out.println(str));
		
		///////////////////////////////////////////////////////////////////////////////////
		System.out.println(); //오름차순
		strList.stream().sorted(Comparator.naturalOrder()).forEach(str -> System.out.println(str));
		System.out.println(); //내림차순
		strList.stream().sorted(Comparator.reverseOrder()).forEach(str -> System.out.println(str));
		
		System.out.println(" 뉴 뉴 뉴 ");
		Set<String> treeList = new TreeSet<String>(new StringCompare());
		treeList.addAll(strList);
		System.out.println(treeList);
		/*for(String st : treeList) {
			System.out.println(st);
		*/
	}

}
