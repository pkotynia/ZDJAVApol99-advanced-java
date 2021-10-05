package interfaces;

public class PrinterClient {

    public static void main(String[] args) {
        Printer printer2D = new Printer2D();

        printer2D.print();

        Printer printer3D = () -> System.out.println("printing in 3d");

        printer3D.print();
    }
}
