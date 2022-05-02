package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
//		//변수 value 선언
//		int value;
//		
//		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
//		//연산의 결과값을 변수 result의 초기값으로 저장
//		//value 변수를 선언만 하고 값을 초기화하지 않았으므로 에러 발생.
//		int result = value + 10;
		
		/* 제대로 된 코드 */
		int value = 15; //변수 value 선언 + 초기화 동시에.
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
