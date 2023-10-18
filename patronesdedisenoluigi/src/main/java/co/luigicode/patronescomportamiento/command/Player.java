package co.luigicode.patronescomportamiento.command;

/**
 * Receptor
 */
public class Player {

    private int posX, posY, posZ;

    public Player(int posX, int posY, int posZ) {
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public void moverAlFrente() {
        posZ++;
        System.out.println("Posición Z: " + posZ);
    }

    public void moverAtras() {
        posZ--;
        System.out.println("Posición Z: " + posZ);
    }

    public void moverAlaDerecha() {
        posX++;
        System.out.println("Posición X: " + posX);
    }

    public void moverAlaIzquierda() {
        posX--;
        System.out.println("Posición X: " + posX);
    }

    public void saltar() {
        posY++;

        System.out.println("Posición Y: " + posY);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Posición Y: " + posY);
    }
}