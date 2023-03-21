package Ejercicios;

public class Codificador {
        private static final String abc = "abcdefghijklmnñopqrstuvwxyz ";

        public static String codificar(String texto, int desplazamiento) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                int indice = abc.indexOf(c);
                if (indice != -1) {
                    int indiceCodificado = (indice + desplazamiento) % abc.length();
                    resultado.append(abc.charAt(indiceCodificado));
                } else {
                    resultado.append(c);
                }
            }
            return resultado.toString();
        }

        public static String decodificar(String texto, int desplazamiento) {
            return codificar(texto, abc.length() - desplazamiento);
        }

    }
