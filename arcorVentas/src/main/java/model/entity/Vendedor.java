package model.entity;

public class Vendedor extends Usuario {
    private String idRuta;
    private String nombreVendedor;
    private String correoVendedor;
    private String fechaIngreso;

    public Vendedor(String nombre, String apellido, int run, String tipo, String idRuta, String nombreVendedor, String correoVendedor, String fechaIngreso) {
        super(nombre, apellido, run, tipo);
        this.idRuta = idRuta;
        this.nombreVendedor = nombreVendedor;
        this.correoVendedor = correoVendedor;
        this.fechaIngreso = fechaIngreso;
    }

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

    public void mostrarInformacionVendedor() {
        super.mostrarInformacion(); // Llamando al método de la clase padre
        System.out.println("ID de Ruta: " + idRuta);
        System.out.println("Nombre de Vendedor: " + nombreVendedor);
        System.out.println("Correo de Vendedor: " + correoVendedor);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
    }

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Ana", "García", 23456789, "Vendedor", "A01", "Ana Vendedor", "ana@example.com", "2023-01-15");
        vendedor1.mostrarInformacionVendedor();
    }
}