import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\r\n Hola, ingresa la temperatura de tu ciudad en Celsius. >");

        String tempCelcius = scanner.next();
        
        Integer tempCelsiusParse = Integer.parseInt(tempCelcius);

        if (tempCelsiusParse >= 36) {
                System.out.println("\r\nAhí no hay quien viva");
        } else if (tempCelsiusParse >= 26){
                System.out.println("\r\nQue calooorrrrr");
        } else if (tempCelsiusParse >= 18) {
                System.out.println("\r\nParece que ha llegado el verano");
        } else if (tempCelsiusParse >= 11) {
                System.out.println("\r\nCon un abrigo estás bien");
        } else if (tempCelsiusParse >= 0) {
                System.out.println("\r\nHace mucho frío ");
        } else {
            System.out.println("\r\nTe estás congelando");
        }
        
        //Escribe un programa que pida al usuario que ingrese la 
        //temperatura en celcius de su ciudad (La pregunta y la respuesta 
        //deberá estar en una sola línea) y según ello devuelva lo siguiente:
        
        //Si es bajo 0: Te estás congelando
        //Si es entre 0 y 10: Hace mucho frío 
        //Si es entre 11 y 17: Con un abrigo estás bien
        //Si es entre 18 y 25: Parece que ha llegado el verano
        //Si es entre 26 y 35: Que calooorrrrr
        //Si es mayor a 36: Ahí no hay quien viva

        //Imprime el resultado

        scanner.close();

    }
}