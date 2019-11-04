package Bache;

import java.util.ArrayList;

public class SistemaReparacion {
    ArrayList<bache> a=new ArrayList<bache>();
    ArrayList<ciudadano> c=new ArrayList<ciudadano>();
    direccion direccion1=new direccion("Jr Aucayacu", 130, "Rupa Rupa");

    public SistemaReparacion() {
        genBache();
        genCiudadano();
        buscaAfectados();
    }
    
    private void genBache(){
        a.add(new bache(1,5, direccion1));
        a.get(0).genTrabajo(new ordenTrabajo(15, "Cenemto", "En proceso", 10000, 3, 10));
    }
    
    private void genCiudadano(){
        c.add(new ciudadano("Juan", direccion1, 979442290));
    }
    
    
    private void buscaAfectados(){
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < c.size(); j++) {
                if(a.get(i).getDistrito().equalsIgnoreCase(c.get(j).getDireccion().getDistrito())){
                    c.get(j).setTipoDaño("Bache");
                    c.get(j).setCostoDaño(a.get(i).getOrden().getCosto());
                    
                }
            }
        }
    }
    
    public void impciudadanos(){
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).toString());
        }
    }
    
    public void impbaches(){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).toString());
            System.out.println("Orden trabajo:");
            System.out.println(a.get(i).getOrden().toString());
        }
    }
    
    public static void main(String[] args) {
        SistemaReparacion s=new SistemaReparacion();
        s.impbaches();
        s.impciudadanos();
    }
}
