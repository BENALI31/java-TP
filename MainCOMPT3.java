public class Main {
  public static void main (String[]a){
  	Compteur3chiffres cpt ;

  	  cpt = new Compteur3chiffres();
  	  cpt.afficher();
  	   for(int i=0;i<750;i++){
             cpt.incrementer();
  	   }

  	   cpt.afficher();



  }


}