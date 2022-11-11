package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String[] kelimeler={"","Sen","bugün","dün","okula","Ayşe'yi","işe","eve","gittin mi?",
				"gidecek misin?","çağır","okuldan al","başladın mı?","gittin mi?","geldin mi?","baktın mı?"};
		int[] cumle = new int[5];
		boolean exit = false;
		do {
			for(int i=1; i < 5; i++) {
				int altsinir = cumle[i - 1]*2;
				if(i == 1) System.out.print("0:exit    1: ilk kelime secimi : ");
				else System.out.print("Sectiginiz " + i + ". kelime numarasini giriniz (" + altsinir + "-" + (altsinir + 1) + ") : ");
				cumle[i] = readInteger(altsinir, altsinir + 1);
				if(cumle[i] == 0) {
					exit = true;
					break;
				}
			}
			if (!exit) for (int j = 0; j < cumle.length; j++) System.out.print(kelimeler[cumle[j]] + " ");
			System.out.println();
		} while (!exit);
	}
	private static int readInteger(int min,int max) {
		Scanner oku = new Scanner(System.in);
		int number = 0;
		boolean readingOK = false;
		do {
			try {
				number = Integer.parseInt(oku.nextLine());
				readingOK = true;
			}catch (NumberFormatException e) {
				
			}
			if(number < min || number > max || !readingOK) {
				System.out.println("Incorrect. Please Re- enter("+min+"-"+max+") : ");
			}
		} while (!readingOK || number<min || number>max);
		return number;
	}

}
