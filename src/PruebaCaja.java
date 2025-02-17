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


        // Ejemplo de variables public y private

        // No se pueden asignar individualmente por ser private
        CajaPOO3 miCaja7 = new CajaPOO3();
       // miCaja7.largo = 5;
       // miCaja7.ancho = 3;
       // miCaja7.alto = 2;

       // System.out.println( " El largo de la caja 7 es: " + miCaja7.largo
               // + " El ancho de la caja 7 es: " + miCaja7.ancho
               //  + " El largo de la caja 7 es: " + miCaja7.alto );

       // System.out.println( " El volumen de la caja 7 es: " + miCaja7.calcularVolumen());

        miCaja7.setDimensions (5,3,2 );
        miCaja7.getDimensions();
        System.out.println( " El volumen de la caja 7 es: " + miCaja7.calcularVolumen());

    }
}
