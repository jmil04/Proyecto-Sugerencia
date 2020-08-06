package Modelo;

public class Mensaje{
    private int idmensaje;
    private String destinatario;
    private String f_emision;
    private String descripcion;
    private String estado;
    private String tipo;
    public Mensaje() {
    }

    public Mensaje(int idmensaje, String destinatario, String f_emision, String descripcion, String estado, String tipo) {
        this.idmensaje = idmensaje;
        this.destinatario = destinatario;
        this.f_emision = f_emision;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(int idmensaje) {
        this.idmensaje = idmensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getF_emision() {
        return f_emision;
    }

    public void setF_emision(String f_emision) {
        this.f_emision = f_emision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
