package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			int a= 0;//예외 X 시엔 10 대입			
			System.out.println("some codes...1");
			int k = 100000 / a;
			System.out.println("some codes...2");
			System.out.println("some codes...3");
		}catch(ArithmeticException ex) {
			//1. 로그 남기기 (반드시 파일로)
			System.out.println("error : "+ ex);
			
			//2. 사과하기
			System.out.println("죄송합니다. 예기치....");
			
			//3. 정상 종료 (자원 정리)
			return;
			
			//4. 이거라도 안되면 최소한 ...
			//ex.printStackTrace();//stack의 상태를 프린트
			
		} finally {		//finally는 옵션
			System.out.println("자원정리");
		}
	}

}
