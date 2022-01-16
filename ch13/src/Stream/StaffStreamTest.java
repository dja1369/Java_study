package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaffStreamTest {

	public static void main(String[] args) {
		List<Staff> staffList = Arrays.asList(
				new Staff("한송이", "개발자"),
				new Staff("빛나리", "디자이너"),
				new Staff("채송화", "개발자")
				);
		//List에 저장되어 있는 Staff 중에서 직업이 '개발자'인 사람만 별도로 리스트에 수집
		List<Staff> developers = staffList.stream().filter(job -> job.getJob().equals("개발자"))
				.collect(Collectors.toList());
	
		//개발자 의 이름은?
		developers.stream().forEach(d -> System.out.println(d.getName()));
	}

}
