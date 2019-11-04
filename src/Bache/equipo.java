package Bache;

public class equipo {
    protected int id;
    protected int nroPersonas;

    public equipo(int id, int nroPersonas) {
        this.id = id;
        this.nroPersonas = nroPersonas;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nroPersonas=" + nroPersonas;
    }  
}
