import java.util.Scanner;

public class NumeroNegativoExcepcion extends Exception{

    public NumeroNegativoExcepcion(){
        super("Numero negativo no permitido");
    }
    public NumeroNegativoExcepcion(String msg){
        super(msg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            int num;
            System.out.println("Introduce el numero:");
            num=sc.nextInt();
            if (num<0){
                throw new NumeroNegativoExcepcion();
            }
            else {
                double res= Math.sqrt(num);
                System.out.println("El resultado de la raiz es: "+res);
            }
        }catch (NumeroNegativoExcepcion e){
            System.out.println("ha ocurrido una excepcion"+e.getMessage());
        }
    }
}
