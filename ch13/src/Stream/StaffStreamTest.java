package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaffStreamTest {

	public static void main(String[] args) {
		List<Staff> staffList = Arrays.asList(
				new Staff("�Ѽ���", "������"),
				new Staff("������", "�����̳�"),
				new Staff("ä��ȭ", "������")
				);
		//List�� ����Ǿ� �ִ� Staff �߿��� ������ '������'�� ����� ������ ����Ʈ�� ����
		List<Staff> developers = staffList.stream().filter(job -> job.getJob().equals("������"))
				.collect(Collectors.toList());
	
		//������ �� �̸���?
		developers.stream().forEach(d -> System.out.println(d.getName()));
	}

}
