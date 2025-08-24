public class Demo07 {
    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.print("Hello");

        Printer advPrinter = new AdvancedPrinter();
        advPrinter.print("Hello from adv printer");

        Scanner scanner = new AdvancedPrinter();
        scanner.scan("/tmp/adv_out");

        Fax fax = new AdvancedPrinter();
        fax.fax("12345");
    }
}
