public class CajaPOO3 {


    public double largo;
    public double ancho;
    public double alto;

    public CajaPOO3 (double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setDimensions(double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularVolumen(){
        return largo * ancho * alto;
    }
}

