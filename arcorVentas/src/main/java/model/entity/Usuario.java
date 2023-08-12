package model.entity;

import javax.persistence.*;


@Entity
@Table(name="usuarios")
public class Usuario  {
	// se crean los atributos de la clase Usuario
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "run")
    private int run;
    @Column(name = "tipo", nullable = false)
    private String tipo;
	    // Constructor
	    public Usuario(String nombre, String apellido, int run, String tipo) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.run = run;
	        this.tipo = tipo;
	    }

	    public Usuario() {
			// TODO Auto-generated constructor stub
		}

		// Métodos para obtener y establecer el nombre
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    // Métodos para obtener y establecer el apellido
	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    // Métodos para obtener y establecer el RUN
	    public int getRun() {
	        return run;
	    }

	    public void setRun(int run) {
	        this.run = run;
	    }

	    // Método para mostrar la información del usuario
	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("RUN: " + run);
	    }

	    public static void main(String[] args) {
	        // Ejemplo de uso de la clase Usuario
	        Usuario usuario1 = new Usuario("Juan", "Pérez", 26555444, "Vendedor");
	        usuario1.mostrarInformacion();
	    }

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	}