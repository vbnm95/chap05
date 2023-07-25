
public class VT100LoopingExample2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\033[2J");
		boolean[][] rect = new boolean[20][40];
		
		int forCount = 0;
		
		for (;;) {
			int line = (int)(Math.random()*20 + 1);
			int column = (int)(Math.random()*40 + 1);
			int fg = 0;
			int bg = 0;
			
			do {
				fg = (int)(Math.random()*8 + 30);
				bg = (int)(Math.random()*8 + 40);
			}while(fg+10 == bg);
			
			char ch = (char)(Math.random()*26 + 'A');
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			
			rect[line-1][column-1] = true;
			
			System.out.printf("\033[1;41H");
			System.out.printf("\033[0m");
			System.out.printf("forCount = [%5d]", ++forCount);
			//Thread.sleep(10);
			
			boolean isAllPrint = true;
			
			outter: for(int i=0; i<20; i++) {
				for(int j=0; j<40; j++) {
					if(rect[i][j] == false) {
						isAllPrint = false;
						break outter;
					}
				}
			}
			
			if(isAllPrint)
				break;
			
		}
		
		System.out.print("\033[0m");
		System.out.print("\033[21;1H");
		System.out.println("Program End...");
	}

}
