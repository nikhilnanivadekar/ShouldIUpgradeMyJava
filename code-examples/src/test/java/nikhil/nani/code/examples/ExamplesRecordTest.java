package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ExamplesRecordTest {

    @Test
    public void recordTest() {
        PersonNonRecord pnr = new PersonNonRecord("Nikhil", "N");
        PersonRecord pr = new PersonRecord("Nikhil", "N");

        Assertions.assertEquals(pnr.getFirstName(), pr.firstName());
        Assertions.assertEquals(pnr.getLastName(), pr.lastName());
        Assertions.assertEquals(pnr.toString(), pr.toString());
    }

    public record PersonRecord(String firstName, String lastName) {

        public String getFullName() {
            return firstName + ' ' + lastName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    public final class PersonNonRecord {
        private final String firstName;
        private final String lastName;

        public PersonNonRecord(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PersonNonRecord that = (PersonNonRecord) o;
            return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

}
