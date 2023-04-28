import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Context app = new Context(new CarroStrategy());
        //app.ejecutar();

        while(true){

            System.out.println("""
                    \nTe gustaria cambiar el tipo de vehiculo?\s
                    pulsa 1 para carro.\s
                    pulsa 2 para bicicleta.\s
                    pulsa 3 para transporte público.
                    O bien pulsa  0 para salir.""");
            Scanner scanner = new Scanner(System.in);
            int eleccion = scanner.nextInt();
            if (eleccion == 0){
                break;
            }
            else{
                //TiposDeVehiculos[] Vehiculos = TiposDeVehiculos.values();
                app.cambiarEstrategia(  TiposDeVehiculos.values()[eleccion-1]  );
                app.ejecutar();
            }

        }

    }
}


