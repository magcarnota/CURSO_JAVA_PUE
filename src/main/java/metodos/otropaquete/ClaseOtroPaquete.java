package metodos.otropaquete;

import metodos.VisibilidadMetodos;

public class ClaseOtroPaquete {
    public VisibilidadMetodos objetoVisibilidadMetodos;
    public ClaseOtroPaquete() {
        objetoVisibilidadMetodos = new VisibilidadMetodos();
    }

    public void metodoObjetoOtroPaquete() {
        objetoVisibilidadMetodos.metodoPublico();
        // objetoVisibilidadMetodos.metodoProtegido();  // NO ES ACCESIBLE
        // objetoVisibilidadMetodos.metodoPorDefecto(); // NO ES ACCESIBLE
        // objetoVisibilidadMetodos.metodoPrivado();    // NO ES ACCESIBLE
    }
}
