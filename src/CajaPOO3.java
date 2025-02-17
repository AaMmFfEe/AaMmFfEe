public class CajaPOO3 {


    private double largo;
    private double ancho;
    private double alto;

    public CajaPOO3 (double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public CajaPOO3 (){
        this.largo = 0;
        this.ancho = 0;
        this.alto = 0;

        }

    public void setDimensions(double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void getDimensions(){
        System.out.println( " \n El largo es: " + largo + " \n El ancho es " + ancho + " \n El alto es " + alto );
    }

    public double calcularVolumen(){
        return largo * ancho * alto;
    }
}

