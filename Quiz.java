import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        Scanner scanner = new Scanner(System.in);

        byte playerPoints = 0;

        System.out.print("\r\nIngresa tu nombre. >");

        String name = scanner.nextLine();

        System.out.println("\r\nHola, " + name + ", bienvenido al quiz! Listo? Empezamos!\r\n");
        System.out.println("Primera Pregunta: ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("    a. Ada Lovelace\r\n" + //
                        "    b. Jude Milhon\r\n" + //
                        "    c. Martha Ackelsberg\r\n" + //
                        "    d. Jane Jacobs");
        System.out.print("\r\nRespuesta: >");

        String rightAnswerOne = "b";
        String answerOne = scanner.nextLine();
        
        if (rightAnswerOne.equalsIgnoreCase(answerOne)) {
            playerPoints += 5;
            System.out.println("\r\nRespuesta correcta! +5 puntos");
            
        } else {
            System.out.println("\r\nIncorrecto! La respuesta correcta es la b!\r\n");
        };

        System.out.println("\r\n¿Quién es Fuencisla Clemares?");
        System.out.println("    a. La directora general de IBM Europa, Oriente Medio y África\r\n" + //
                        "    b. La vicepresidenta de Microsoft Western Europe\r\n" + //
                        "    c. La directora general de Google en España y Portugal\r\n" + //
                        "    d. Fundadora y CEO de Marsi Bionics\r\n");
            System.out.print("\r\nRespuesta: >");

        String rightAnswerTwo = "c";
        String answerTwo = scanner.nextLine();

        if (rightAnswerTwo.equalsIgnoreCase(answerTwo)) {
            playerPoints += 5;
            System.out.println("\r\nRespuesta correcta! +5 puntos");
        } else {
            System.out.println("\r\nIncorrecto! La respuesta correcta es la c!");
        };

        System.out.println("\r\n¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("    a. Primera programadora de software\r\n" + //
            "    b. Una actriz de cine\r\n" + //
            "    c. Inventora del procesador de datos\r\n" + //
            "    d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS\r\n");
        System.out.println("\r\nUna pista: hay dos respuestas correctas!");
        System.out.print("\r\nRespuesta: >");

        String rightAnswerThree = "b y d";
        String answerThree = scanner.nextLine();

        if (rightAnswerThree.equalsIgnoreCase(answerThree)) {
            playerPoints += 5;
            System.out.println("\r\nRespuesta correcta! +5 puntos");
        } else {
            System.out.println("\r\nIncorrecto! La respuesta correcta es b y d!");
        };
        
        System.out.println("\r\n¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("    a. Katherine Johnson, Dorothy Vaughan y Mary Jackson\r\n" + //
            "    b. Jessica Miller, Emily Johnson, Sarah Davis\r\n" + //
            "    c. bell hooks, Toni Morrison y Alice Walker\r\n" + //
            "    d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
            System.out.print("\r\nRespuesta: >");

        String rightAnswerFour = "a";
        String answerFour = scanner.nextLine();

        if (rightAnswerFour.equalsIgnoreCase(answerFour)) {
            playerPoints += 5;
            System.out.println("\r\nRespuesta correcta! +5 puntos");
        } else {
            System.out.println("\r\nIncorrecto! La respuesta correcta es la a!");
        };
        

        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

        System.out.println("Has ganado un total de " + playerPoints + " puntos!");

        if (playerPoints >= 15) {
            System.out.println("\r\nTú si que sabes mucho");
        } else if (playerPoints >= 5){
            System.out.println("\r\nNo lo has hecho mal");
        } else {
            System.out.println("\r\nBuena suerte la próxima vez");
        };

        scanner.close();

    }
}


