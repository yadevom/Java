package vehiculo;

public class Automovil extends Vehiculo{

    /**
     * Creates a car with the given number of passengers and speed
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     */
    public Automovil(int pasajeros, double velocidad) {
	super(pasajeros, velocidad);
    }

    /**
     * Paints the vehicle at the given position
     * @param posicion Position used to print the vehicle
     */
    @Override
    public void pintar( int posicion ) {
	espacios(posicion+4);
	System.out.println("_____");
	espacios(posicion+1);
	System.out.println("__/__|__\\___");
	espacios(posicion);
	System.out.println("|_  _____  __|");
	espacios(posicion);
	System.out.println("   O      O");
    }    
}