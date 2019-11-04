package Bache;

public class direccion {
    private String calle;
    private int numero;
    private String distrito;

    public direccion(String calle, int numero, String distrito) {
        this.calle = calle;
        this.numero = numero;
        this.distrito = distrito;
    }

    public String getDistrito() {
        return distrito;
    }

    @Override
    public String toString() {
        return "direccion: " + calle + numero + ", " + distrito;
    }
}
