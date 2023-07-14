import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			
			int selecNo = scanner.nextInt();
			
			if(selecNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				System.out.println();
				
			} else if(selecNo == 2) {
				scores = new int[studentNum];
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: ", i);
					int score = scanner.nextInt();
					scores[i] = score;
				}
				
			} else if(selecNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]: %d\n", i, scores[i]);
				}
				
			} else if(selecNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				int c = 0;
				for(int i=0; i<scores.length; i++) {
					if(max <= scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
					c++;
				}
				avg = sum / c;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selecNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	public static void main8(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int c = 0; // 총 갯수 카운트
		for(int i=0; i < array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				c++;
			}
		}
		
		avg = sum/c;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
	public static void main7(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i=0; i<array.length; i++) {
			if(max <= array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}
	public static void main6(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
	}
}
