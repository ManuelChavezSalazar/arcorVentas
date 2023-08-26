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
@Table(name = "administrativos")
public class Administrativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdministrativo")
    private int idAdministrativo;
    
    @Column(name = "area")
    private String area;


    @Column(name = "correoAdmin")
    private String correoAdmin;

    @OneToOne
    @JoinColumn(name = "id_usuario") // Columna que hace referencia a la clave primaria en Usuarios
    private Usuario usuario;

    public Administrativo() {
        // Constructor vacío por defecto
    }

    public Administrativo(String area, String correoAdmin) {
    	this.area = area;
    	this.correoAdmin = correoAdmin;
    }

    // Getters y setters
    

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
