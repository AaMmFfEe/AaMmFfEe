public class PruebaCaja {

    public static void main(String[] args) {
        CajaPOO miCaja = new CajaPOO();
        miCaja.alto = 5.0;
        miCaja.ancho = 3.0;
        miCaja.largo = 2.0;
        System.out.println( " El volumen de la caja es: " + miCaja.calcularVolumen());
    }
}
