import java.util.LinkedList;
import java.util.Queue;

public class ListadoAutos {

    private Queue <Auto> listadoAutos;

    public ListadoAutos() {
        listadoAutos = new LinkedList<Auto>();
    }

    public void encolar (Auto dato){

        listadoAutos.add(dato);
    }
    public Auto desencolar() throws Exception {
        if (listadoAutos.isEmpty())
           throw new Exception("No hay elementos en la fila");
        return listadoAutos.remove();
    }
    public String listarAutos(){
        String resultado="";
        for (Auto auto:listadoAutos) {
            resultado+= auto.toString();
        }
        return listadoAutos.size()>0?resultado:"No hay elementos";
    }

}
