import java.util.Scanner;

public class Ejercicio9Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int t1 = 0;
        int t2 = 0;
        int cantidadTemperatura = 0;
        int temperaturas = 0;

        do{
            t1 = getInt("Ingrese la primera temperatura");
            if(t1 != 0){
                t2 = getInt("Ingrese la segunda temperatura");

                if(t1 >= 5 && t1 <= 15){
                    cantidadTemperatura = t1 + cantidadTemperatura;
                    temperaturas ++;
                }
                if(t2 >= 5 && t2 <= 15){
                    cantidadTemperatura = t2 + cantidadTemperatura;
                    temperaturas ++;
                }
            }
        } while(t1 != 0);
        double promedio = (double)cantidadTemperatura / temperaturas;
        System.out.println("El promedio de las temperaturas entre 5 grados y 15 grados es de " + promedio);
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9(-9)]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}