
package model;


public class Cliente {
    private int nroId;
    private String tipoId;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private Long noCelular;
    private String correo;

    public Cliente() {
    }

    public Cliente(int nroId, String tipoId, String nombre, String apellido, String usuario, String contrasena, Long noCelular, String correo) {
        this.nroId = nroId;
        this.tipoId = tipoId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.noCelular = noCelular;
        this.correo = correo;
    }
    
    

    public int getNroId() {
        return nroId;
    }

    public void setNroId(int nroId) {
        this.nroId = nroId;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getNoCelular() {
        return noCelular;
    }

    public void setNoCelular(Long noCelular) {
        this.noCelular = noCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
