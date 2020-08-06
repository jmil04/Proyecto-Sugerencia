package Modelo;

public class Autor {
    private int idautor;
    private String nombre;
    private String f_nacimiento;
    private String nacionalidad;
    private String estadocivil;
    private String estudios;
    public Autor() {
    }

    public Autor(int idautor, String nombre, String f_nacimiento, String nacionalidad, String estadocivil, String estudios) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.nacionalidad = nacionalidad;
        this.estadocivil = estadocivil;
        this.estudios = estudios;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    

    
      
}
