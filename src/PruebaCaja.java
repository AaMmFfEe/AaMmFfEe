public class PruebaCaja {

    public static void main(String[] args) {
        CajaPOO miCaja = new CajaPOO();
        miCaja.alto = 5.0;
        miCaja.ancho = 3.0;
        miCaja.largo = 2.0;
        System.out.println( " El volumen de la caja es: " + miCaja.calcularVolumen());

        CajaPOO miCaja2 = new CajaPOO();
        miCaja2.alto = 10.0;
        miCaja2.ancho = 4.0;
        miCaja2.largo = 5.0;
        System.out.println( " El volumen de la caja es: " + miCaja2.calcularVolumen());

        System.out.println( " El volumen de la caja 1 es: " + miCaja.calcularVolumen());
        System.out.println( " El volumen de la caja 2 es: " + miCaja2.calcularVolumen());

        CajaPOO2 miCaja3 = new CajaPOO2();
        miCaja3.setDimensiones(5, 3, 2);
        System.out.println( " El volumen de la caja 3 es: " + miCaja3.calcularVolumen());

        CajaPOO2 miCaja4 = new CajaPOO2();
        miCaja4.setDimensiones(10, 4, 5);
        System.out.println( " El volumen de la caja 4 es: " + miCaja4.calcularVolumen());

        CajaPOO3 miCaja5 = new CajaPOO3(5, 3, 2);
        System.out.println( " El volumen de la caja 5 es: " + miCaja5.calcularVolumen());

        CajaPOO3 miCaja6 = new CajaPOO3(10, 4, 5);
        System.out.println( " El volumen de la caja 6 es: " + miCaja6.calcularVolumen());

    }
}
