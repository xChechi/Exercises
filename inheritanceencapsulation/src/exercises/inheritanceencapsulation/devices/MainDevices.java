package exercises.inheritanceencapsulation.devices;

class MainDevices {

    public static <Device> void main(String[] args) {

        Computer computer1 = new Computer(1976, "Apple-1", 600.50, "System monitor");
        Computer computer2 = new Computer(1985, "Turbo PC", 795.99, "MS-DOS");

        Laptop laptop1 = new Laptop(2002, "ThinkPad T30", 195.80, "IBM", "256 MB");
        Laptop laptop2 = new Laptop(2013, "Vostro 3510", 499.99, "DELL", "16384 MB");

        Smartphone phone1 = new Smartphone(2021, "Xiomi 13 Pro", 1200.90, 1);
        Smartphone phone2 = new Smartphone(2019, "Samsung Galaxy S10", 400.50, 2);


        Devices[] allDevices = {computer1, computer2, laptop1, laptop2, phone1, phone2};

        for(Devices device : allDevices) {

            System.out.printf("The device from model \"%s\" is a %s.%n", device.getModel(), device.getClass().getSimpleName());
        }

    }
}
