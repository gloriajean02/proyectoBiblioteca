import java.util.Scanner;

/**
 * Clase principal para realizar pruebas con las clases Usuario y GestorUsuario.
 * 
 * @author Gloria y Guadalupe
 */

public class UsuarioMain {
    public static Scanner sc = new Scanner(System.in);
    public static GestorUsuario gestor = new GestorUsuario(); //Crear un objeto tipo GestorUsuario

    public static void main(String[] args) {

        

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
            
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.login(username, password)) {
                    loginExitoso = true;
                    System.out.println("¡Bienvenido, " + usuarioEncontrado.getUser() + "!");
                    if (usuarioEncontrado.getTipoUsuario() == TipoUsuario.ADMINISTRADOR) {
                        menuAdmin();
                    }
                    else {
                        menuUsuario(); 
                    }    
                }  else {
                    System.out.println("Contraseña incorrecta. Intente de nuevo.");
                }
            } else {
                System.out.println("Usuario no encontrado. Intente de nuevo.");
            }
            
        } while (loginExitoso == false);
    }
    

    

        // Menu ADMIN
        public static void menuAdmin(){

            int opcion = 0;

                        do {
                            System.out.println("                     Menú Biblioteca");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("    1. Agregar libros nuevos.");
                            System.out.println("    2. Eliminar libros existentes.");
                            System.out.println("    3. Buscar libros por título, autor o categoría.");
                            System.out.println("    4. Mostrar todos los libros disponibles.");
                            System.out.println("    5. Registrar nuevos usuarios.");
                            System.out.println("    6. Consultar información de usuarios registrados.");
                            System.out.println("    7. Realizar préstamos de libros.");
                            System.out.println("    8. Devolver libros prestados.");
                            System.out.println("    9. Mostrar libros actualmente prestados.");
                            System.out.println("    10. Mostrar número de préstamos totales y activos.");
                            System.out.println("    11. Listar los libros más prestados.");
                            System.out.println("    12. Mostrar qué usuario tiene más préstamos activos.");
                            System.out.println("    0. Salir.");
                            System.out.println("----------------------------------------------------------------");

                            opcion = Integer.parseInt(sc.nextLine());

                            switch (opcion) {
                                case 1:
                                    System.out.println("Opción no desarrollada aún");
                                    break;
                                case 2:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 3:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 4:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 5:
                                    crearUsuario();
                                break;
                                case 6:
                                    System.out.println(gestor.toString()); 
                                break;
                                case 7:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 8:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 9:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 10:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 11:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 12:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 0:
                                    System.out.println("Saliendo...");
                                break;
                                default:
                                    System.out.println("Opción inexistente. Pulse 0 para salir.");
                                break;
                            }
                        } while (opcion != 0);

        }
        
        public static void menuUsuario(){

            int opcion = 0;

                        do {
                            System.out.println("                     Menú Biblioteca");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("    1. Buscar libros por título, autor o categoría.");
                            System.out.println("    2. Mostrar todos los libros disponibles.");
                            System.out.println("    3. Realizar préstamos de libros.");
                            System.out.println("    4. Devolver libros prestados.");
                            System.out.println("    5. Mostrar libros actualmente prestados.");
                            System.out.println("    0. Salir.");
                            System.out.println("----------------------------------------------------------------");

                            opcion = Integer.parseInt(sc.nextLine());

                            switch (opcion) {
                                case 1:
                                    System.out.println("Opción no desarrollada aún");
                                    break;
                                case 2:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 3:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 4:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 5:
                                    System.out.println("Opción no desarrollada aún");
                                break;
                                case 0:
                                    System.out.println("Saliendo...");
                                break;
                                default:
                                    System.out.println("Opción inexistente. Pulse 0 para salir.");
                                break;
                            }
                        } while (opcion != 0);

        }


        public static void crearUsuario(){
            System.out.println("Nombre de usuario:");
            String nuevoUsuario = sc.nextLine();
            System.out.println("Contraseña:");
            String contrasena = sc.nextLine();
            System.out.println("Tipo de usuario (ADMINISTRADOR/USUARIO):");
            String tipoUsuarioStr = sc.nextLine();

            if (tipoUsuarioStr.equals("ADMINISTRADOR") || tipoUsuarioStr.equals("USUARIO") ) {
                TipoUsuario tipoUsuario = TipoUsuario.valueOf(tipoUsuarioStr);

                Usuario usuario = new Usuario(nuevoUsuario, contrasena, tipoUsuario);

                gestor.nuevoUsuario(usuario);

                System.out.println("Usuario creado.");

            } else System.out.println("Error, tipo de usuario inexistente.");

        }
        



    }

    

