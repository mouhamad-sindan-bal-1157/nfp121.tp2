package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (mohamad sindyan) 
 * @version (1.0)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       int fahrenheit = 0;
       float celsius = 0;
       
         try{
             
             for(int i=0; i<args.length; i++){
           
            fahrenheit = Integer.parseInt(args[i]);
            celsius = fahrenheitEnCelsius(Integer.parseInt(args[i]));
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        
       }}
            catch(NumberFormatException e){
                
                System.out.println("error: " + e.getMessage());
       }
    }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius(int f){
         float cel = 5/9f * (f-32);
         float res = (int)(cel * 10)/10.0f;
		return res;
     }

}
     