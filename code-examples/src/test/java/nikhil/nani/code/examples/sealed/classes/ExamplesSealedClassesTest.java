package nikhil.nani.code.examples.sealed.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamplesSealedClassesTest {

    @Test
    public void test() {

        Admin admin = new Admin();
        Assertions.assertEquals("Logged in", admin.login());
        Assertions.assertEquals("Password changed", admin.changePassword());

        SuperAdmin superAdmin = new SuperAdmin();

        Assertions.assertEquals("Logged in", superAdmin.login());
        Assertions.assertEquals("Password changed", superAdmin.changePassword());

        Resident resident = new Resident();
        Assertions.assertEquals("Logged in", resident.login());

        DayGuest dayGuest = new DayGuest();
        Assertions.assertEquals("Logged in", dayGuest.login());

        OvernightGuest overnightGuest = new OvernightGuest();
        Assertions.assertEquals("Logged in", overnightGuest.login());

        Owner owner = new Owner();
        Assertions.assertEquals("Logged in", owner.login());
    }
}













