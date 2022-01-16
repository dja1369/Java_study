package scheduler;

import java.io.IOException;

public class SchedularTest {

	public static void main(String[] args) throws IOException {
		System.out.println("상담 할당 방식 을 선택 하세요 ...");
		
		//Upcasting 이 될수 있도록 모든 정책을 저장할수 있는 참조 변수로 초기화
		Schedular schedular = null; //객체가 없는것을 null
		int input = System.in.read(); // 키보드로 부터 1개의 문자를 입력받아 정수 타입으로 저장
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
			System.out.println("지원되지 않는 방식입니다.");
			return; //종료
		}
		//다형성 구현 : 생성된 인스턴스 의 메소드가 호출됨.
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
