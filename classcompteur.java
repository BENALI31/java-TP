public_class Compteur3chiffres{
	private int km;

	   public Compteur3chiffres(){
	   	this.km=0;
	   }
	       public void afficher(){

	       	System.Out.println("le nombre de kilometres parcourus"+this.km);

	       }

	          public void incrementer (){
	          	this.km=this.km+1;

	          	  if (this.km>999){
	          	  	this.km=0;
	          	  }
	          }
}