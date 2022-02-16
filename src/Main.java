import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Producto> productos = new HashMap<>();
    public static void main(String[] args) {
    }

    private static void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir){

        }
    }

    private static String generaCodigo(){
        int numero;
        String clave = "";
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'
                , 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S'
                , 'T', 'U', 'V', 'B', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < 4; i++) {
            int[] numeros = new int[4];
            numero = (int) Math.floor(Math.random() * 10);
            numeros[i] = numero;
        }
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 4; j++) {
                numero = (int) Math.floor(Math.random() * 10);
                clave += numero;
            }
            clave += String.valueOf(letras[(int)Math.floor(Math.random()* letras.length)]);
        }
        return clave;
    }

    private static void Producto(int numero){
        for (int i = 0; i < numero; i++){
            String codigo = generaCodigo();
            productos.put(codigo, new Producto("Nombre", 40, 30.0));
        }
    }
}
