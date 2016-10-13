package nsis.app;

import Point.java;

/* Mon premier programme Java */
public class HelloWorldApp6{
	public static void main (String[] args){
		afficherNomEtPrenom(args);
	}

	public static void afficherNomEtPrenom(String[] tab){
		if(tab.length == 2){
			int i = 0;
			while(i<tab.length){
				System.out.println("Champ1: "+tab[0]);
				System.out.println("Champ2: "+tab[1]);
				System.out.println("valeur index: "+ i);
				System.out.println("i="+ i + "  valeur="+tab[i++]);
			}
		}
		else{
			System.out.println("Il faut 2 arguments en entrée");
			System.exit(-1);
		}

		Point p1 = new Point(2,3);
		System.out.println("p1.x = "+p1.x);
		System.out.println("p1.y = "+p1.y);
	}
}
