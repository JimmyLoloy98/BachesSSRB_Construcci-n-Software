package Bache;

public class ciudadano {
    private String nombre;
    private direccion direccion;
    private int telefono;
    private String tipoDaño;
    private float costoDaño;

    public ciudadano(String nombre, direccion direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setTipoDaño(String tipoDaño) {
        this.tipoDaño = tipoDaño;
    }

    public void setCostoDaño(float costoDaño) {
        this.costoDaño = costoDaño;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", tipoDaño=" + tipoDaño + ", costoDaño=" + costoDaño;
    }
}
