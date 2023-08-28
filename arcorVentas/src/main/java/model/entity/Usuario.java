package model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table(name="usuarios")

public class Usuario  {
	// se crean los atributos de la clase Usuario
	
	 
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	    @Column(name = "run")
	    private int run; 
	    @Column(name = "nombre")
	    private String nombre;

	    @Column(name = "apellido")
	    private String apellido;

	    @Column(name = "tipo")
	    private String tipo;
    
	    // Constructor
    	public Usuario() {
		// TODO Auto-generated constructor stub
    	}
	    public Usuario(int run, String nombre, String apellido,  String tipo) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.run = run;
	        this.tipo = tipo;
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
	    

	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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

	   
		public String getTipo() {
			return tipo;
		}

		public boolean setTipo(String tipo) {
			if (tipo.equals("Usuario") || tipo.equals("Vendedor") || tipo.equals("Supervisor") || tipo.equals("Administrativo")) {
				this.tipo = tipo;
				return true; // El tipo se estableció correctamente
			} else {
				return false; // El tipo es inválido
			}
		}

	
		
	}