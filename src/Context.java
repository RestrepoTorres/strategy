
public class Context {
    private Istrategy estrategia;

    public Context(Istrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void ejecutar(){
        this.estrategia.mostrarRuta();
    }

}