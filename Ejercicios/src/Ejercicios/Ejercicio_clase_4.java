package Ejercicios;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio_clase_4 {
      /* !) public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1, num2, num3;
            char order;

            // Si se proporcionan los parámetros como argumentos de línea de comandos
            if (args.length == 4) {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);
                num3 = Integer.parseInt(args[2]);
                order = args[3].charAt(0);
            }
            // Si no se proporcionan los parámetros, se solicitan por consola
            else {
                System.out.println("Ingrese el primer número: ");
                num1 = scanner.nextInt();

                System.out.println("Ingrese el segundo número: ");
                num2 = scanner.nextInt();

                System.out.println("Ingrese el tercer número: ");
                num3 = scanner.nextInt();

                System.out.println("Ingrese el orden (a para ascendente, d para descendente): ");
                order = scanner.next().charAt(0);
            }

            // Se llama a la función de ordenamiento para ordenar los números según el criterio especificado
            int[] sortedNumbers = orderNumbers(num1, num2, num3, order);

            // Se muestran los números ordenados
            System.out.println("Los números ordenados son:");
            for (int i = 0; i < sortedNumbers.length; i++) {
                System.out.print(sortedNumbers[i] + " ");
            }
        }

        // Función que ordena los números según el criterio especificado
        public static int[] orderNumbers(int num1, int num2, int num3, char order) {
            int[] numbers = {num1, num2, num3};

            // Orden ascendente
            if (order == 'a') {
                for (int i = 0; i < numbers.length - 1; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        if (numbers[i] > numbers[j]) {
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
            }
            // Orden descendente
            else if (order == 'd') {
                for (int i = 0; i < numbers.length - 1; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        if (numbers[i] < numbers[j]) {
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
            }

            return numbers;
        }*/

    //2)
    public static void main(String[] args) {
    String archivo = "C:\\Users\\Caro\\Desktop\\numeros.txt";
    int suma = 0;
     try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            suma += Integer.parseInt(linea.trim());
        }
    } catch (IOException e) {
        System.err.println("Error al leer el archivo: " + e.getMessage());
        return;
    } catch (NumberFormatException e) {
        System.err.println("El archivo contiene un valor no numérico: " + e.getMessage());
        return;
    }
        System.out.println("La suma de los números en el archivo es: " + suma);
    }


}




