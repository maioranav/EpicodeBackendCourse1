package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase EX1
		System.out.println("This is my first Epicode Java Project!");
		
		// ESERCIZIO 2a/b
		int x = 4;
		int y = 2;
		int moltiplicato = moltiplica(x, y);
		
		String st = "Il risultato della prima operazione è: ";
		System.out.println(st + moltiplicato);
		
		String stringhe1[] = {"a", "b", "c", "d", "e"};
		System.out.println(Arrays.toString(stringhe1));
		System.out.println(Arrays.toString(InserisciInArray(stringhe1, "ciao a tutti")));
		
		
		//INSERISCI RIGHE PER EX3
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la prima stringa:");
		String str1 = in.nextLine();
		System.out.println("Inserisci la seconda stringa:");
		String str2 = in.nextLine();
		System.out.println("Inserisci la terza stringa:");
		String str3 = in.nextLine();

		String stringhe[] = {str1, str2, str3};
		
		System.out.println("*** PRINT in ordine di inserimento ***");
		for(int i = 0; i < stringhe.length; i++) {
			System.out.println(stringhe[i]);	//PRINTA IN ORDINE
		}

		System.out.println("*** PRINT in ordine inverso ***");
		for(int i = stringhe.length - 1; i >= 0; i--) {
			System.out.println(stringhe[i]);	//PRINTA IN REVERSE
		}
	        
		//ESERCIZIO 4a
		System.out.println("inserisci i 2 lati del rettangolo");
		int lato1 = in.nextInt();
		int lato2 = in.nextInt();
		System.out.println("**PERIMETRO RETTANGOLO: " + perimetroRett(lato1, lato2));
		
		//ESERCIZIO 4b
		System.out.println("INSERISCI UN NUMERO E TI DICO SE PARI O DISPARI:");
		int num1 = in.nextInt();
		System.out.println("**PARIODISPARI? " + pariDispari(num1));
		
		
		//ESERCIZIO 4c
		System.out.println("inserisci i 2 lati del rettangolo");
		double base = in.nextDouble();
		double altezza = in.nextDouble();
		System.out.println("**AREA TRIANGOLO: " + areaTriang(base, altezza));
		
		System.out.println("FINE PROGRAMMA");
		
		}


//CALC EX2a
public static int moltiplica(int x, int y) {
	return x*y;
}

//CALC EX2c
public static String[] InserisciInArray(String[] a, String b) {
	String stringhe2[] = {a[0], a[1], b, a[2], a[3], a[4]};
	return stringhe2;
}

//CALC EX4a
public static int perimetroRett(int x, int y) {
	return (x+y)*2;
}

//CALC EX4b
public static String pariDispari(int x) {
	if (x % 2 == 0) {
		return x+" è PARI";
	} else {
	return x+" è DISPARI";	
	}
}

//CALC EX4c
public static double areaTriang(double x, double y) {
	return (x*y)/2;
}

}



