public class CompteurNChiffres
{
	// Attributs
	private int km;	
	private int limite;
	
	// M�thodes
	// Constructeur
	public CompteurNChiffres(int n)
	{		
		this.limite = this.calculeLimite(n);
		this.km = 0;	
	}
	
	public void afficher()
	{
		// Conversion d'un entier en chaine --> ""+this.km
		System.out.println(String.valueOf(this.km));		
	}
	
	public void incrementer()
	{
		this.km ++;
		if (this.km> this.limite)
			this.km= 0;
	}
	
	private int calculeLimite (int n)
	{
		int i = 1;
		// Calcul de la limite : Puissance de 10...
		for (int j = 0; j<n; j++)
		{
			i = i*10;
		}
		return (i-1);
	}			
}



public class Main
{
	// Programme principal permettant de tester le compteur
	public static void main(String a[])
	{
		CompteurNChiffres c = new CompteurNChiffres(2);
		for (int i=0; i<25; i++)
			c.incrementer();
		c.afficher();				// 25
		for (int i=0; i<75; i++)
			c.incrementer();
		c.afficher();				// 0
		for (int i=0; i<34; i++)
			c.incrementer();
		c.afficher();				// 34
	}
}