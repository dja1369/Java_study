package scheduler;

import java.io.IOException;

public class SchedularTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��� �Ҵ� ��� �� ���� �ϼ��� ...");
		
		//Upcasting �� �ɼ� �ֵ��� ��� ��å�� �����Ҽ� �ִ� ���� ������ �ʱ�ȭ
		Schedular schedular = null; //��ü�� ���°��� null
		int input = System.in.read(); // Ű����� ���� 1���� ���ڸ� �Է¹޾� ���� Ÿ������ ����
		System.out.println((char) input);

		if (input == 'R' || input == 'r') {
			schedular = new RoundRobin();
		} else if (input == 'L' || input == 'l') {
			schedular = new LeastJob();
		} else if (input == 'P' || input == 'p') {
			schedular = new PriorityAllocation();
		}else if( input =='a' || input =='a') {
			schedular = new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return; //����
		}
		//������ ���� : ������ �ν��Ͻ� �� �޼ҵ尡 ȣ���.
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
