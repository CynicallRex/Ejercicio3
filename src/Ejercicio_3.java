import java.util.Scanner;

public class Ejercicio_3 {

    int[] notas;

    Scanner scanner;

    public Ejercicio_3(){
    }

    public void ejecutar(){

        for (int i = 0; i > notas.length; i++){
            System.out.println("notas[" +i+ "]: ");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }

        int suma = 0;
        double promedio;
        int minimo = 10;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" +i+ "]: " +notas[i]);

            suma = suma + notas[i];

            if (notas[i] < minimo){
                minimo = notas[i];
            }
            if (notas[i] > maximo){
                maximo = notas[i];
            }
        }
        promedio = suma / notas.length;

        System.out.println("El promedio es: " +promedio);
        System.out.println("EL valor maximo es: "+maximo);
        System.out.println("El valor minimo es: "+minimo);
    }
}