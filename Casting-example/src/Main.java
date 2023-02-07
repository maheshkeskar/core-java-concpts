public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.powerOn();
        machine.powerOff();

        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.displayDocument();
        laptop.powerOff();


        printer.Printer printer = new printer.Printer();
        printer.powerOn();
        printer.print();
        printer.powerOff();


        //Upcasting
        Machine newPrinterMachine = new printer.Printer();//Up casting
        newPrinterMachine.powerOn();
        newPrinterMachine.powerOff();

        //Down casting
//         Printer printer1 = (Printer) new Machine();
//         printer1.powerOn();
//         printer1.powerOff();
//         printer1.print();
    }
}