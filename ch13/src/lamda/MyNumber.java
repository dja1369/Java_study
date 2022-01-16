package lamda;

@FunctionalInterface 
// 오류방지용 애노테이션 //람다식은 반드시 하나의 메소드를 가져야함 // 두개 존재시 호출메소드 가 모호 해짐
public interface MyNumber {
	int getMaxNum(int num1 , int num2); //추상 메소드 선언
}
