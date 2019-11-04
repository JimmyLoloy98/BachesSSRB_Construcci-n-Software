package Bache;

public class bache {
    private int id;
    private int tamaño;
    private direccion ubicacion;
    private String distrito;
    private String prioridad;
    private ordenTrabajo orden;

    public bache(int id, int tamaño, direccion ubicacion) {
        this.id = id;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
        distrito=ubicacion.getDistrito();
        prioridad=genPrioridad(tamaño);
    }

    public String getDistrito() {
        return distrito;
    }

    public ordenTrabajo getOrden() {
        return orden;
    }
    
    public void genTrabajo(ordenTrabajo o){
        orden=o;
    }
    
    private String genPrioridad(int t){
        String cad="";
        if(t>0&&t<=3){
            cad="Baja";
        }else if(t>=4&&t<=7){
            cad="Media";
        }else if(t>=8&&t<=10){
            cad="Alta";
        }
        return cad;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", tamaño=" + tamaño + ", ubicacion=" + ubicacion
                + ", distrito=" + distrito + ", prioridad=" + prioridad;
    } 
}
