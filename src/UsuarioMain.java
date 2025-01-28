
/**
 * Clase principal para realizar pruebas con las clases Usuario y GestorUsuario.
 * 
 * @author Gloria y Guadalupe
 */

public class UsuarioMain {
    public static void main(String[] args) {
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
        
    }
}
