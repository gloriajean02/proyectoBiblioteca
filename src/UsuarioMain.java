import java.util.Scanner;

/**
 * Clase principal para realizar pruebas con las clases Usuario y GestorUsuario.
 * 
 * @author Gloria y Guadalupe
 */

public class UsuarioMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestorUsuario gestor = new GestorUsuario(); //Crear un objeto tipo GestorUsuario

        //Crear usuarios
        gestor.nuevoUsuario(new Usuario("Guadalupe01", "gorrito02", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("LunaLovegood", "ilovemagic", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("HarryEl+Prota", "soyunpesao", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("CarrieBradshaw", "redflag1965", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("RachelGreen01", "ilovemyoutfit", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("MonGeller24", "ilovemyroomba", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("PrincesaConsuela", "imhislobster", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("Pablo_Profe%", "arraydegatetes", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("ChandlerBing", "couldibeany", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("RossGeller", "unagipaleont", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("JoeyTribbiani", "howudoin123", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("BruceWayne", "batcave123", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("ClarkKent", "superman78", TipoUsuario.USUARIO));
        gestor.nuevoUsuario(new Usuario("GandalfTheGrey", "youShallPass", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("YodaMaster", "forcebewithyou", TipoUsuario.ADMINISTRADOR));
        gestor.nuevoUsuario(new Usuario("DarthVader", "IamYourFather", TipoUsuario.USUARIO));


        // Login
        boolean loginExitoso = false;
        do {
            System.out.print("Ingrese su usuario: ");
            String username = sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String password = sc.nextLine();

            Usuario usuarioEncontrado = gestor.buscarUsuario(username); // nos devuelve null si no lo encuentra
            
            if (usuarioEncontrado != null && usuarioEncontrado.login(username, password) == true) {
                loginExitoso = true;
                System.out.println("¡Bienvenido, " + usuarioEncontrado.getUser() + "!");
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente de nuevo.");
            }
            
        } while (loginExitoso == false);

        // Menú


    }

    
}
