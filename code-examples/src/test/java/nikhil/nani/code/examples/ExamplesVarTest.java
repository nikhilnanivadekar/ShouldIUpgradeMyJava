package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ExamplesVarTest {

    @Test
    public void var() {

        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        var withVar = Map.of(1, "One", 2, "Two");

        Assertions.assertEquals(map, withVar);
    }
}
