
public class Context {
    private Istrategy estrategia;

    public Context(Istrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void ejecutar(){
        this.estrategia.mostrarRuta();
    }
    public void cambiarEstrategia(TiposDeVehiculos estrategia){
        if(estrategia == TiposDeVehiculos.BicicletaStrategy){
            this.estrategia = new BicicletaStrategy();
        }
        if(estrategia == TiposDeVehiculos.CarroStrategy){
            this.estrategia = new CarroStrategy();
        }
        if(estrategia == TiposDeVehiculos.TransportePublicoStrategy){
            this.estrategia = new TransportePublicoStrategy();
        }

    }

}
