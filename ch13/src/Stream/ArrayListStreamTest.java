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
		
		//�Ϲ����� for������ i��° ��ҿ� �ش� ���� ��� ���
		for(int i=0; i<strList.size(); i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		System.out.println(" ");
		//���� for������ ���
		for(String str : strList) {
			System.out.println(str);
		}
		System.out.println(" ");
		//Stream ���� ���
		Stream<String> strStream = strList.stream(); //��Ʈ���� ����
		strStream.forEach(str -> System.out.println(str)); // ��Ҹ� �ϳ��� ������ ���
		
		System.out.println(" "); //sorted() : �������� �߰����� �� , ���� �������� ��Ҹ� ��� ���
		strList.stream().sorted().forEach(str -> System.out.println(str));
		//����	//���� ���� ������ ���� ���ٽ��� �Ű������� ����
		strList.stream().sorted((s1,s2) -> s1.compareTo(s2) * (-1)).forEach(str -> System.out.println(str));
		
		///////////////////////////////////////////////////////////////////////////////////
		System.out.println(); //��������
		strList.stream().sorted(Comparator.naturalOrder()).forEach(str -> System.out.println(str));
		System.out.println(); //��������
		strList.stream().sorted(Comparator.reverseOrder()).forEach(str -> System.out.println(str));
		
		System.out.println(" �� �� �� ");
		Set<String> treeList = new TreeSet<String>(new StringCompare());
		treeList.addAll(strList);
		System.out.println(treeList);
		/*for(String st : treeList) {
			System.out.println(st);
		*/
	}

}
