package examination;

import java.util.Scanner;

public class DiamondPattern {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=scanner.nextInt();
	for(int index1=1;index1<number;index1++) {
		for(int index2=1;index2<number;index2++) {
			if((index1+index2>=number+1)) {
				System.out.print("* ");
			}
			else {
				System.out.print(" ");
			}
		}
      System.out.println();
	}
	
	number=number-1;
	for(int index1=1;index1<number;index1++) {
		for(int index2=1;index2<number;index2++) {
			if(index2>=index1) {
				System.out.print(" *");
			}
			else {
				System.out.print(" ");
			}
		}
      System.out.println();
	}
}
}
