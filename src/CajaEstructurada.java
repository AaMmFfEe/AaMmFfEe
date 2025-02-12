public class CajaEstructurada {
    public static double calcularVolumen (double largo, double ancho, double alto){
        return largo*ancho*alto;

    }
    public void main(String[] args) {
        double largo = 5;
        double ancho = 3;
        double alto = 2;

        double volumen = calcularVolumen(largo,ancho,alto);

        System.out.println ( "El volumen de la caja es: " + volumen);

        largo = 10;
        ancho = 4;
        alto = 3;

        volumen = calcularVolumen(largo,ancho,alto);

        System.out.println ( "El volumen de la caja es: " + volumen);

    }
}
