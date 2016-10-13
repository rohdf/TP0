package nsis.app;

/* Mon premier programme Java */
public class HelloWorldApp2{
	public static void main (String[] args){
		afficherNomEtPrenom(args);
	}

	public static void afficherNomEtPrenom(String[] tab){
		if(tab.length == 2){
			System.out.println(tab[0]+" "+tab[1]);
		}
		else{
			System.out.println("Il faut 2 arguments en entrée");
			System.exit(-1);
		}
			
	}
}
