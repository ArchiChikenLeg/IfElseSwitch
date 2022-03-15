package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k;
		k = in.nextInt();

		if(k%10==1)
			System.out.println(1 + " korova");
		else if((k>=5 && k<=20) || (k%10>=5 && k%10<=9))
			System.out.println(k + " korov");
		else
			System.out.println(k + " korovy");
		in.close();
	}

}
