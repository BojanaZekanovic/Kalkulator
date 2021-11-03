package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		String komanda=" ";
		do {
		 komanda=src.nextLine();
		 		if(komanda.isEmpty()) {
		 			continue;
		 		}
		 		String[] kom=komanda.split(" ");
		 		if(kom.length!=3) {
		 			continue;
		 		}
		 		int x= Integer.parseInt(kom[0]);
		 		int y= Integer.parseInt(kom[2]);
		 		int z=0;
		 		switch (kom[1]) {
				case "+": 
					
					z=x+y;
					break;
				
				default:
					System.out.println("Operand nije podrzan");
					continue;
					
				} 
		 		
		 		System.out.println("rezultat" + z);
		 		
			}while(!komanda.equals("End"));

	}

}
