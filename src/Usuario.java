public class Usuario {
    private String user;
    private String password;
    private TipoUsuario tipoUsuario; //enum para elegir si es administrador o no

    //Constructor por defecto
    public Usuario(){
        this.user = "gloriajean02";
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
        this.user = newUser;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public void setTipoUsuario(TipoUsuario newTipoUsuario){
        this.tipoUsuario = newTipoUsuario;
    }
}
