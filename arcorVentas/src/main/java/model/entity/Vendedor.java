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
@Table(name = "vendedores")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idVendedor;

    @Column(name = "idRuta")
    private String idRuta;

    @Column(name = "nombreVendedor")
    private String nombreVendedor;

    @Column(name = "correoVendedor")
    private String correoVendedor;

    @Column(name = "fechaIngreso")
    private String fechaIngreso;
    
    @OneToOne // Relación One-to-One hacia la entidad Usuario
    @JoinColumn(name = "id_usuario") // Columna que hace referencia a la clave primaria en Usuarios
    private Usuario usuario;

    
      
    public Vendedor() {
        // Constructor vacío por defecto
    }

    public Vendedor(String idRuta, String nombreVendedor, String correoVendedor, String fechaIngreso) {
       	this.idRuta = idRuta;
        this.nombreVendedor = nombreVendedor;
        this.correoVendedor = correoVendedor;
        this.fechaIngreso = fechaIngreso;
       
    }
    
    // Getters y setters
    

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCorreoVendedor() {
        return correoVendedor;
    }

    public void setCorreoVendedor(String correoVendedor) {
        this.correoVendedor = correoVendedor;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

	public Usuario getUsuario() {
		return usuario;
	}

}