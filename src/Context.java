import java.util.Map;
import java.util.HashMap;

public class Context {
    private Istrategy estrategia;

    public Context(Istrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void ejecutar(){
        this.estrategia.mostrarRuta();
    }
    public void cambiarEstrategia(TiposDeVehiculos estrategia){
       Map <TiposDeVehiculos, Istrategy> estrategias = new HashMap<>();
        estrategias.put(TiposDeVehiculos.BicicletaStrategy, new BicicletaStrategy());
        estrategias.put(TiposDeVehiculos.CarroStrategy, new CarroStrategy());
        estrategias.put(TiposDeVehiculos.TransportePublicoStrategy, new TransportePublicoStrategy());
        this.estrategia = estrategias.get(estrategia);

    }

}
