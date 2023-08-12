package model.entity;

public class Administrativo extends Usuario {
    private String area;
    private String correoAdmin;

    public Administrativo(String nombre, String apellido, int run, String tipo, String area, String correoAdmin) {
        super(nombre, apellido, run, tipo);
        this.area = area;
        this.correoAdmin = correoAdmin;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    public void mostrarInformacionAdministrativo() {
        super.mostrarInformacion(); // Llamando al método de la clase padre
        System.out.println("Área: " + area);
        System.out.println("Correo de Administrativo: " + correoAdmin);
    }

    public static void main(String[] args) {
        Administrativo admin1 = new Administrativo("María", "López", 25678901, "Administrativo", "Recursos Humanos", "maria@example.com");
        admin1.mostrarInformacionAdministrativo();
    }
}