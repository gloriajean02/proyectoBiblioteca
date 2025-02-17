

/**
 * Representa un usuario con su nombre de usuario, contraseña de acceso y tipo de usuario.
 * 
 * @author Gloria y Guadalupe
 */

public class Usuario {
    private String user;
    private String password;
    private TipoUsuario tipoUsuario; //enum para elegir si es administrador o no

    //Constructor por defecto
    public Usuario(){
        this.user = "usuarioxDefecto";
        this.password = "password123";
        this.tipoUsuario = TipoUsuario.USUARIO;
    }
    
    //Constructor parametrizado
    public Usuario(String user, String password, TipoUsuario tipoUsuario){
        this.user = user;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    //Getters y setters
    public String getUser(){
        return this.user;
    }

    public String getPassword(){
        return this.password;
    }

    public TipoUsuario getTipoUsuario(){
        return this.tipoUsuario;
    }

    public void setUser(String newUser){
        
        // if (newUser.length() < 9 && newUser.length() > 5){
            this.user = newUser;
        // } else System.out.println("Error, el user debe tener entre 5 y 8 caracteres.");

    }

    public void setPassword(String newPassword){

        // if (newPassword.length() < 10 && newPassword.length() > 6){
            this.password = newPassword;
        // } else System.out.println("Error, la contraseña debe tener entre 6 y 9 caracteres.");

    }

    
    public void setTipoUsuario(TipoUsuario newTipoUsuario){
            if (newTipoUsuario.equals(TipoUsuario.ADMINISTRADOR) || newTipoUsuario.equals(TipoUsuario.USUARIO)) {
                this.tipoUsuario = newTipoUsuario;
            } else newTipoUsuario = null;
            
    }

    // Métodos de los usuarios
    public boolean login(String user, String password){
        if (this.user.equals(user) && this.password.equals(password)){
            return true;
        } else return false;
    }

    //Consultar la info de un usuario concreto
    @Override
    public String toString() {
        return "{" +
                " usuario ='" + getUser() + "'" +
                ", contraseña ='" + getPassword() + "'" +
                ", tipo de usuario ='" + getTipoUsuario() + "'" +
                "}";
    }

}
