
public class ArrayExample {
	public static void main(String[] args) {
	
	int num = 10;
	
	int[] nums = {10, 20, 30, 30000};
	
	String str1 = "java,python,html-css";
	
	String str2[] = str1.split(",");
	
	for(int i =0; i < str1.length(); i++) {
		System.out.println(str1.charAt(i));
	}
	
	}
}
