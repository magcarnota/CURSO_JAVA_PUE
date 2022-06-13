package clases_anidada.anonimas;

/**
 * Clase para testing de clases anónimas
 * @author magcarnota
 */
public class TestClasesAnonimas {
    public static void main(String[] args) {

        /*
        La clase anónima actúa como una clase que extendiese a la clase base
        en la cual se pueden implementar nuevos métodos o sobreescribir los existentes.
         */
        MiClase miClaseAnonima = new MiClase("Texto"){
            // Nuevo método implementado
            public void cambiaMsg(String msg) {
                this.setMsg(msg);
            }

            // Método sobreescrito
            @Override
            public void saluda() {
                System.out.println("Buenos días!");
            }
        };

        System.out.println(miClaseAnonima.getMsg());
        miClaseAnonima.setMsg("Tetxo CAMBIADO!");
        System.out.println(miClaseAnonima.getMsg());

        miClaseAnonima.saluda();

    }
}

class MiClase {
    private String msg;

    MiClase(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void saluda() {
        System.out.println("Hola!");
    }
}
