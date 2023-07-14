
public class StringOperationExample {
	public static void main(String[] args) {
		/*
		 * Mutable - 수정 가능한 데이터
		 * 
		 * Immutable - 수정 불가 데이터
		 * 
		 */
		String str1 = "자바 프로그래밍";
		
		String str2 = str1.replace("자바", "JAVA");
		
		String str3 = str2.toLowerCase();
		
		System.out.println(str1 + str2);
		System.out.println(str1 + str2);
		System.out.println(str3.indexOf("프로"));
		
		
	}
}
