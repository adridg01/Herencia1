public class Cilindro extends Circulo{
    public double altura;

    public Cilindro(double radio, double altura){
        super(radio);
        this.altura=altura;
        if (altura<0){
            altura=0;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getVolumen(){
        double volumen= getArea()* altura;
        return volumen;
    }
}
