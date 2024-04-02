package vehiculo;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int max = 0;
        Fabricante fabricanteMasVendedor;
        for (Fabricante fabricante : Vehiculo.fabricantes) {
            int cantidad = 0;
            for (Fabricante fabricante1 : Vehiculo.fabricantes) {
                if (fabricante.equals(fabricante1)) { // Comprobar repeticiones para cada fabricante
                    cantidad++;
                }
            }
            if (cantidad > max) {
                max = cantidad;
                fabricanteMasVendedor = fabricante;
            }
        }

        return fabricanteMasVendedor;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
