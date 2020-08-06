
package Modelo;

public class Libro {
    private int idlibro;
    private String categoria;
    private String f_publicacion;
    private String autor;
    private String n_ventas;
    private String calificacion;
    public Libro() {
    }

    public Libro(int idlibro, String categoria, String f_publicacion, String autor, String n_ventas, String calificacion) {
        this.idlibro = idlibro;
        this.categoria = categoria;
        this.f_publicacion = f_publicacion;
        this.autor = autor;
        this.n_ventas = n_ventas;
        this.calificacion = calificacion;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getF_publicacion() {
        return f_publicacion;
    }

    public void setF_publicacion(String f_publicacion) {
        this.f_publicacion = f_publicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getN_ventas() {
        return n_ventas;
    }

    public void setN_ventas(String n_ventas) {
        this.n_ventas = n_ventas;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    }
