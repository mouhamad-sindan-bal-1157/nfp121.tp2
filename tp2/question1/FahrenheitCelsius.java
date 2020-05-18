package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (mohamad sindyan)
 * @version (1.0)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les paramètres de la ligne de commande
		int fahrenheit = 0;
		float celsius = 0;
	        if(args!=null&&args.length>0)
                for(int i=0;i<args.length;i++)
            {
                    fahrenheit=Integer.parseInt(args[i]);
                    celsius=fahrenheitEnCelsius(fahrenheit);
                   
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
																				// format
																				// imposés
																				
	}}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	private static boolean TryParseInt(String value) {  
 
        try {  
         Integer.parseInt(value);  
         return true;  
      } catch 
         (NumberFormatException e) {  
         return false;  
      }  
    }
    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */

          public static float fahrenheitEnCelsius(int f) 
    {
        //Contraine 1 : Appliquer la formule :
        float valCelcius= (float)(5.0/9.0)*(f-32); 
        
        //Arrondire et retourner la valeur final 
        return ArrondirParCalcule(valCelcius,10);
    }
    /**
     * Une methode qui arrondie un flaot donne avec une precision donne
     * params value : la valeur a arrondir , la precision donnes sous la forme de 10^(le nombre de chiffre apres la virgule)
     * return float : return la valeur arrondie
     */
    public static float ArrondirParCalcule(float valeurAarrondir,int précision) 
    {
        //Contrainte 2 : resultat avec 1 chiffre
        //derriere la virgule par calcul :
        
        //Valeur par defaut pour des input erronnes
        if(précision<=0||précision%10!=0)
            précision = 10;
        
        //L'arrondire
        float valArrondie=(float)((int)(valeurAarrondir*précision))/précision;
                                                    
        return valArrondie;

	 // à compléter en remplaçant ce return 0.F par la fonction
					// de conversion
	}

}
