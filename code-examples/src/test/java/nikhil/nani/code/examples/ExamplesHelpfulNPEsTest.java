package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamplesHelpfulNPEsTest {

    @Test
    public void helpfulNpesTest1() {

        Person person = new Person("Nikhil", "N", null);

        String lowercaseCity = person.address.city.toLowerCase();

        Assertions.fail("Should not reach here");
    }

    @Test
    public void helpfulNpesTest2() {

        Person person = new Person("Nikhil", "N", new Address("", "", null));

        String lowercaseCity = person.address.city.toLowerCase();

        Assertions.fail("Should not reach here");
    }

    record Person(String firstName, String lastName, Address address) {

    }

    record Address(String line1, String line2, String city) {
    }


}
