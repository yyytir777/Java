package string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//인스턴스는 매번 새로 생성되므로 str1 != str2
		System.out.println(str1 == str2);
		//문자열 값은 같으므로 true 반환
		System.out.println(str1.equals(str2));
		
		String str3 = "abc";
		String str4 = "abc";
		
		//문자열 abc는 상수 풀에 저장되어있으므로 가리키는 주소값이 같음
		System.out.println(str3 == str4);
		//문자열값도 같으므로 true 반환
		System.out.println(str3.equals(str4));
	}

}
