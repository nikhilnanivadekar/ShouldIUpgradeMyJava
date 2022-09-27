package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamplesPatternMatchingTest {

    @Test
    public void patternMatching() {
        Assertions.assertEquals(this.withoutPatternMatching("ABC"), this.withPatternMatching("ABC"));
        Assertions.assertEquals(this.withoutPatternMatching(123), this.withPatternMatching(123));
        Assertions.assertEquals(this.withoutPatternMatching(123.456), this.withPatternMatching(123.456));

    }

    private String withoutPatternMatching(Object input) {

        if (input instanceof String) {
            String string = (String) input;
            return "This is a String:" + string;
        }
        if (input instanceof Integer) {
            Integer integer = (Integer) input;
            return "This is an Integer:" + integer;
        }
        if (input instanceof Double) {
            Double dbl = (Double) input;
            return "This is a Double:" + dbl;
        }
        return "";
    }

    private String withPatternMatching(Object input) {

        if (input instanceof String string) {
            return "This is a String:" + string;
        }
        if (input instanceof Integer integer) {
            return "This is an Integer:" + integer;
        }
        if (input instanceof Double dbl) {
            return "This is a Double:" + dbl;
        }

        return "";
    }
}
