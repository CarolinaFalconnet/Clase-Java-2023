package Ejercicios;

import java.util.Arrays;

public class ejercicios_clase_3 {
    public static void main(String[] args) {
        //1) a)
        /*
        String palabra = "programa";
        char letra = 'a';
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println(contador);
*/
        // b)
/*
        int num1 = 6;
        int num2 = 24;
        int num3 = 12;
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+ " ");
        }
*/

/*
        // Ejercicio c
        int num1 = 54;
        int num2 = 23;
        int num3 = 12;
        int[] numeros = {num1, num2, num3};
        int x = 20;
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }
        System.out.println(suma);
    */

/*
    // Prueba de los métodos
    public static void main(String[] args) {
        // Ejercicio a
        String str = "Hola mundo";
        char letra = 'o';
        int cantidad = contarLetra(str, letra);
        System.out.println("La letra '" + letra + "' aparece " + cantidad + " veces en la cadena '" + str + "'");

        // Ejercicio b
        int num1 = 5;
        int num2 = 3;
        int num3 = 7;
        boolean ascendente = false;
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, ascendente);
        System.out.println("Los números ordenados en " + (ascendente ? "ascendente" : "descendente") + " son: "
                + numerosOrdenados[0] + ", " + numerosOrdenados[1] + ", " + numerosOrdenados[2]);

        // Ejercicio c
        int[] numeros = {1, 3, 5, 7, 9};
        int x = 4;
        int suma = sumarNumerosMayoresQueX(numeros, x);
        System.out.println("La suma de los números mayores que " + x + " es " + suma);
    }
}
*/
        //2)

            String mensaje = "hola que tal";
            int desplazamiento = 1;

            String mensajeCodificado = Codificador.codificar(mensaje, desplazamiento);
            System.out.println("Mensaje codificado: " + mensajeCodificado);

            String mensajeDecodificado = Codificador.decodificar(mensajeCodificado, desplazamiento);
            System.out.println("Mensaje decodificado: " + mensajeDecodificado);

            desplazamiento = 2;
            mensajeCodificado = Codificador.codificar(mensaje, desplazamiento);
            System.out.println("Mensaje codificado: " + mensajeCodificado);

            mensajeDecodificado = Codificador.decodificar(mensajeCodificado, desplazamiento);
            System.out.println("Mensaje decodificado: " + mensajeDecodificado);
        }

    }











