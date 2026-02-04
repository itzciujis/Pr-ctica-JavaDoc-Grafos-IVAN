import java.util.Scanner;

public class main {

    private static String[] usuarios = {"juan", "maria", "pedro"};
    private static String[] contrasenas = {"1234", "abcd", "pass"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean autenticado = false;

        while (!autenticado) {
            System.out.print("Introduce tu usuario: ");
            String user = sc.nextLine();

            System.out.print("Introduce tu contraseña: ");
            String pass = sc.nextLine();

            if (validarUsuario(user, pass)) {
                System.out.println("¡Acceso concedido!");
                autenticado = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo.\n");
            }
        }
        sc.close();
    }
    /**
     * El while hace que el programa siga pidiendo el usuario y la contraseña hasta que los datos sean correctos.
     * O sea, no deja avanzar hasta que te hayas logueado bien.
     */

    public static boolean validarUsuario(String usuario, String contrasena) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuario) && contrasenas[i].equals(contrasena)) {
                return true;
            }
        }
        return false;
    }
}
