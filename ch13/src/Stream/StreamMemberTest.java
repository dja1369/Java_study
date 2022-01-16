package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMemberTest {

	public static void main(String[] args) {
		List<Member> memberList = Arrays.asList(
				new Member("채송화", 30),
				new Member("장윤복", 27),
				new Member("이익순", 33)				
				);
		
		double avgAge = memberList.stream().mapToInt(m -> m.getAge())
				.average().getAsDouble();
		
		System.out.println("회원의 평균 나이 : " + (int)avgAge );
		
		//가장 어린 나이 사람 출력
		int minAge = memberList.stream().mapToInt(m -> m.getAge()).min().getAsInt();
		memberList.stream().filter(m -> m.getAge() == minAge).map(b -> b.getName()).forEach(m -> System.out.println(m));
	}

}
