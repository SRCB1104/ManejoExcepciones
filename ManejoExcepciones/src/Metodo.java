//TrABAJO1
public class Metodo {
    String cadena;
    int entero;

    public char caracterEn(String cadena,int entero){
        this.cadena=cadena;
        this.entero=entero;

        char c='\0';

        try{

            if (entero >= 0 && entero <= cadena.length()){
                c=cadena.charAt(entero);
            }

        }catch (Exception e){
            System.out.println("El numero no esta en el rango");
        }

        return c;
    }
}
