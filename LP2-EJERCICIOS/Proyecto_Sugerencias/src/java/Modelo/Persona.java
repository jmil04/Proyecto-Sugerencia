package Modelo;

public class Persona {
    private int idpersona;
    private String edad;
    private String cargo;
    private String estado;
    private String nombre;
    private String apellidos;
    public Persona() {
    }

    public Persona(int idpersona, String edad, String cargo, String estado, String nombre, String apellidos) {
        this.idpersona = idpersona;
        this.edad = edad;
        this.cargo = cargo;
        this.estado = estado;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    

    
      
}