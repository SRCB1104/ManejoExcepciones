import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca la palabra: ");
            String lecTeclado = sc.next();
            int entero = 7;
            if (lecTeclado.length()<entero) {
                throw new Exception("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
            }
                Metodo metodo = new Metodo();
                char res = metodo.caracterEn(lecTeclado, entero);
                System.out.println("El caracter en la posicion: " + entero + " es el: " + res);

                sc.close();
        }catch (Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}