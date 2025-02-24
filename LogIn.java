import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, 
        //si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales 
        //imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, 
        //es decir, que no haga un salto de línea.
        
        Scanner scanner = new Scanner(System.in);

        String name1 = "Paola";
        String password1 = "Larissa";

        System.out.print("Ingresa tu nombre. >");

        String name = scanner.next();

        System.out.print("Ahora ingresa tu contraseña. >");

        String password = scanner.next();

        if ((name.equals(name1)) && (password.equals(password1))) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }

        scanner.close();

    }
}
