package model.entity;


public class Supervisor extends Usuario {
    private int idSupervisor;
    private String nombreSupervisor;
    private String correoSupervisor;

    public Supervisor(String nombre, String apellido, int run, String tipo, int idSupervisor, String nombreSupervisor, String correoSupervisor) {
        super(nombre, apellido, run, tipo);
        this.idSupervisor = idSupervisor;
        this.nombreSupervisor = nombreSupervisor;
        this.correoSupervisor = correoSupervisor;
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

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

    public void mostrarInformacionSupervisor() {
        super.mostrarInformacion(); // Llamando al método de la clase padre
        System.out.println("ID de Supervisor: " + idSupervisor);
        System.out.println("Nombre de Supervisor: " + nombreSupervisor);
        System.out.println("Correo de Supervisor: " + correoSupervisor);
    }

    public static void main(String[] args) {
        Supervisor supervisor1 = new Supervisor("Carlos", "Martínez", 24567890, "Supervisor", 101, "Carlos Supervisor", "carlos@example.com");
        supervisor1.mostrarInformacionSupervisor();
    }
}