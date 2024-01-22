public class Main {
    public static void main(String[] args) {
        Circulo circulo= new Circulo(2);
        Cilindro cilindro= new Cilindro(3,5);

        System.out.println("Area del circulo: " + circulo.getArea());

        System.out.println("Radio del circulo: " + circulo.getRadio());

        System.out.println("Altura del cilindro: " + cilindro.getAltura());

        System.out.println("Radio del cilindro: " + cilindro.getRadio());

        System.out.println("Área de la base del cilindro: " + cilindro.getArea());

        System.out.println("Volumen del cilindro: " + cilindro.getVolumen());
    }
}
