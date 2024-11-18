package JavaCollections.Class;

public class Computer {

    //inner class

    class Processor {

        public void getProcessorDetails() {
            System.out.println("Processor detail1");
            System.out.println("Processor detail2");
        }
    }

    void showProcessorDetails() {
        // Create an instance of the inner class Processor
        Processor processor = new Processor();
        // Call the displayDetails() method
        processor.getProcessorDetails();
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.showProcessorDetails();

    }

}
