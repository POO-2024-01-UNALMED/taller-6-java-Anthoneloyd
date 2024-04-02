package vehiculos;

public class Pais {
    private String nombre;

    public Pais(String nombre){
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor(){
        int max = 0;
        Pais paisMasVendedor = null;
        for (Pais pais : Vehiculo.paises) {
            int cantidad = 0;
            for (Pais pais1 : Vehiculo.paises) {
                if (pais.equals(pais1)) { // Comprobar repeticiones para cada pais
                    cantidad++;
                }
            }
            if (cantidad > max) {
                max = cantidad;
                paisMasVendedor = pais;
            }
        }

        return paisMasVendedor;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}