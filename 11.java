package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fRow,fCol,sRow,sCol;
		fRow = in.nextInt();
		fCol = in.nextInt();
		sRow = in.nextInt();
		sCol = in.nextInt();
		if ((Math.abs(fRow-sRow) == 1 && Math.abs(fCol-sCol) == 2) || (Math.abs(fRow-sRow) == 2 && Math.abs(fCol-sCol) == 1))
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
