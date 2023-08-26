package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supervisores")
public class Supervisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSupervisor")
    private int idSupervisor;

    @Column(name = "nombreSupervisor")
    private String nombreSupervisor;

    @Column(name = "correoSupervisor")
    private String correoSupervisor;

    // Puedes agregar más atributos según tus necesidades

    @OneToOne
    @JoinColumn(name = "id_usuario") // Columna que hace referencia a la clave primaria en Usuarios
    private Usuario usuario;

    public Supervisor() {
        // Constructor vacío por defecto
    }

    public Supervisor(String nombreSupervisor, String correoSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
        this.correoSupervisor = correoSupervisor;
    }

    // Getters y setters

    public String getNombreSupervisor() {
        return nombreSupervisor;
    }

    public void setNombreSupervisor(String nombreSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
    }

    public String getCorreoSupervisor() {
        return correoSupervisor;
    }

    public void setCorreoSupervisor(String correoSupervisor) {
        this.correoSupervisor = correoSupervisor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
