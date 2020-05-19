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
		
		for(int i=0; i<args.length; i++){
		    
		    fahrenheit = Integer.parseInt(args[i]);
		    celsius = fahrenheitEnCelsius(Integer.parseInt(args[i]));
		    
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");														// format															// imposés																
	}
}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
	    
                float cel = 5/9f * (f-32);
                float res = (int)(cel*10)/10.0f;
                
		return res;
	}


}
