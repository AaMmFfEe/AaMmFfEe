public class CajaPOO2 {

    public double largo;
    public double ancho;
    public double alto;

    public void setDimensiones(double largo, double ancho, double alto){
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularVolumen() {
        return largo * ancho * alto;
    }
}