package JavaCollections.Class;

public class Person {

    public class Address {


        public String city;
        public String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;

        }

        void displayAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }

    }

    public static void main(String[] args) {

        Person person = new Person();
        Person.Address address = person.new Address("Jaipur", "Rajasthan");
        address.displayAddress();

    }


}
