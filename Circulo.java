public class Circulo {
   public double radio;


   public Circulo(double radio){
      this.radio= radio;
      if (radio<0){
         radio=0;
      }
   }

   public double getRadio() {
      return radio;
   }

   public void setRadio(double radio) {
      this.radio = radio;
   }
   public double getArea(){
     double Area =radio*radio* Math.PI;
     return Area;
   }
}
