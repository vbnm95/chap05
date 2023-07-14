
public class ArrayExample {
	public static void main(String[] args) {
		int[][][] nums = new int[3][10][20];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				do {
					nums[0][i][j] = (int)(Math.random()*8 + 30);
					nums[1][i][j] = (int)(Math.random()*8 + 40);
				} while (nums[0][i][j] + 10 == nums[1][i][j]);
				
				nums[2][i][j] = (int)(Math.random()*26 + 'A');
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<20; k++) {
					if(i==2) {
						System.out.printf("%c ", nums[i][j][k]);
					} else {
					System.out.printf("%d ", nums[i][j][k]);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.print("\033[2J");
		System.out.print("\033[0m");
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				System.out.printf("\033[%dm", nums[0][i][j]); // fg
				System.out.printf("\033[%dm", nums[1][i][j]); // bg
				System.out.printf("%c", nums[2][i][j]); // bg	
			}
			System.out.println();
		}
		
		System.out.print("\033[0m");
	}
	
	public static void main7(String[] args) {
		int[][][] nums = {
				{
					{1,2,3},
					{4,5,6,7},
					{8,9,10}
				},
				{
					{1,2,3},
					{4,5,6,7},
					{8,9,10}
				},
				{
					{1,2,3},
					{4,5,6,7},
					{8,9,10}
				}
		};
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				for(int k=0; k<nums[i][j].length; k++) {
					//nums[i][j] = (int)(Math.random()*8 + 30);
					System.out.printf("%02d ", nums[i][j][k]);
				}
				System.out.println();
			}
		}
		
	}
	
	public static void main5(String[] args) {
		int[][] nums = new int[3][4];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = (int)(Math.random()*8 + 30);
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main4(String[] args) {
		int[][] nums = {
				{1,2,3,4},
				{5,6,7,8,9},
				{10}
		};
		
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				sum += nums[i][j];
			}
		}
		System.out.println("sum=" + sum);
		
	}
	
	public static void main3(String[] args) {
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100 + 1);
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		double avg = (double) sum/nums.length;
		System.out.println("avg =" + avg);
	}
	
	public static void main2(String[] args) {
	
	int num = 10;
	
	int[] nums = {10, 20, 30, 30000};
	
	String str1 = "java,python,html-css";
	
	String str2[] = str1.split(",");
	
	for(int i =0; i < str2.length; i++) {
		System.out.println(str2[i]);
	}
	
	}
}
