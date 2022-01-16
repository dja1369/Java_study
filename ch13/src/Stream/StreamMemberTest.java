package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMemberTest {

	public static void main(String[] args) {
		List<Member> memberList = Arrays.asList(
				new Member("ä��ȭ", 30),
				new Member("������", 27),
				new Member("���ͼ�", 33)				
				);
		
		double avgAge = memberList.stream().mapToInt(m -> m.getAge())
				.average().getAsDouble();
		
		System.out.println("ȸ���� ��� ���� : " + (int)avgAge );
		
		//���� � ���� ��� ���
		int minAge = memberList.stream().mapToInt(m -> m.getAge()).min().getAsInt();
		memberList.stream().filter(m -> m.getAge() == minAge).map(b -> b.getName()).forEach(m -> System.out.println(m));
	}

}
