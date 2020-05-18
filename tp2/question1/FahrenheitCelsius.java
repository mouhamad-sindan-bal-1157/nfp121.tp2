package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (mohamad sindyan)
 * @version (1.0)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les param�tres de la ligne de commande
		int fahrenheit = 0;
		float celsius = 0;
	        if(args!=null&&args.length>0)
                for(int i=0;i<args.length;i++)
            {
                    fahrenheit=Integer.parseInt(args[i]);
                    celsius=fahrenheitEnCelsius(fahrenheit);
                   
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
																				// format
																				// impos�s
																				
	}}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
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
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
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
    public static float ArrondirParCalcule(float valeurAarrondir,int pr�cision) 
    {
        //Contrainte 2 : resultat avec 1 chiffre
        //derriere la virgule par calcul :
        
        //Valeur par defaut pour des input erronnes
        if(pr�cision<=0||pr�cision%10!=0)
            pr�cision = 10;
        
        //L'arrondire
        float valArrondie=(float)((int)(valeurAarrondir*pr�cision))/pr�cision;
                                                    
        return valArrondie;

	 // � compl�ter en rempla�ant ce return 0.F par la fonction
					// de conversion
	}

}
