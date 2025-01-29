

/**
 * Clase que gestiona los usuarios de la biblioteca.
 * 
 * @author Gloria y Guadalupe
 */

public class GestorUsuario {
    private Usuario [] usuarios; // array que guarda los objetos Usuario
    private int guardado; // controla cuántos usuarios están actualmente guardados en el array
    private static final int TAM = 100; // tamaño del array, num de objetos usuario que podemos guardar

    // Inializar el constructor
    public GestorUsuario() {
        usuarios = new Usuario[TAM]; 
        guardado = 0; // Ahora mismo hay 0 usuarios guardados
    }

    // Guardar nuevo usuario en el array
    public void nuevoUsuario(Usuario nuevoUsuario) {
        if (guardado<TAM){ // si el num de guardados es menor al tam del array
            usuarios[guardado] = nuevoUsuario; // nuevoUsuario se guarda en el array
            guardado++; // y se incrementa el contador de usuarios guardados
        }
    }

    // Buscar un usuario en el array (necesario para hacer login)
    public Usuario buscarUsuario(String username) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].getUser().equals(username)) {
                return usuarios[i];
            }
        }
        return null;
    }
    
    
    // Buscar el indice del array donde se encuentra el usuario
    private int buscarIndiceUsuario(String username) {
        for (int i = 0; i < guardado; i++) {
            if (usuarios[i].getUser().equals(username)) {
                return i; // Devuelve la posición del array donde está el usuario
            }
        }
        return -1; // Usuario no encontrado
    }

    // Eliminar usuario del array, utilizo el método anterior para no dejar huecos vacíos en el array
    public boolean eliminarUsuario(String username) {
        int indice = buscarIndiceUsuario(username); // El método anterior nos devuelve el indice
        if (indice != -1) { // Si el usuario existe
            for (int i = indice; i < guardado - 1; i++) { // Recorre desde el indice hasta el final del array
                usuarios[i] = usuarios[i + 1]; // Desplazar los elementos a la izquierda
            }
            usuarios[--guardado] = null; // Reducimos el contador y eliminamos la última referencia
            return true;
        } else {
            return false; // Usuario no encontrado
        }
    }
    

    //Consultar la info de todos los usuarios registrados
    @Override
    public String toString() {
        String stringUsuarios = "";
        for (int i = 0; i < guardado; i++) {
            stringUsuarios += usuarios[i].toString() + "\n";
        }
        return stringUsuarios;
    }

}
