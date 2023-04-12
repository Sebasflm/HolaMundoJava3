// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio= new Duenio("Carlos", "1715607071");
        Motor motor= new Motor("ax756564", 1.6,"diesel");
        Auto auto= new Auto("PAA-7769", "Corolla", "Toyota", motor, duenio,4);

        Duenio duenio2 = new Duenio("171512345");
        Motor motor1 = new Motor("PDX1234");
        Auto auto1=new Auto(motor1,duenio2);

       String placaauto1= auto1.getPlaca();
       auto1.setPlaca("SWDT1234");
       auto1.setNumRuedas(6);
    }
}