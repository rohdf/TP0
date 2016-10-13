package nsis.app;

/* Mon premier programme Java */
public class HelloWorldApp3{
	public static void main (String[] args){
		afficherNomEtPrenom(args);
	}

	public static void afficherNomEtPrenom(String[] tab){
		if(tab.length == 2){
			for(int i=0; i<tab.length; i++){
				System.out.println("Champ1: "+tab[0]);
				System.out.println("Champ2: "+tab[1]);
				System.out.println("valeur index: "+ i);
			}
		}
		else{
			System.out.println("Il faut 2 arguments en entrée");
			System.exit(-1);
		}
			
	}
}
