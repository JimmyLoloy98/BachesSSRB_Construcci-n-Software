package Bache;

public class ordenTrabajo extends equipo{
    private float horas;
    private String material;
    private String estado;
    private float costo;

    public ordenTrabajo(float horas, String material, String estado, float costo, int id, int nroPersonas) {
        super(id, nroPersonas);
        this.horas = horas;
        this.material = material;
        this.estado = estado;
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return super.toString() + "horas=" + horas + ", material=" + material + ", estado=" + estado + ", costo=" + costo;
    } 
}
