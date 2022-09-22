package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamplesTextBlockTest {

    @Test
    public void json() {
        String json = "{\n" +
                "  \"firstName\": \"Nikhil\",\n" +
                "  \"lastName\": \"N\",\n" +
                "  \"city\": \"Seattle\",\n" +
                "  \"phone\": 123\n" +
                "}";

        String textBlockJson = """
                {
                  "firstName": "Nikhil",
                  "lastName": "N",
                  "city": "Seattle",
                  "phone": 123
                }""";

        Assertions.assertEquals(json, textBlockJson);
    }

    @Test
    public void formattedJson() {
        String json = "{\n" +
                "  \"firstName\": \"Nikhil\",\n" +
                "  \"lastName\": \"N\",\n" +
                "  \"city\": \"Seattle\",\n" +
                "  \"phone\": 123\n" +
                "}";

        String textBlockJson = """
                {
                  "firstName": "%s",
                  "lastName": "%s",
                  "city": "%s",
                  "phone": %d
                }""";

        String formattedTextBlockJson = textBlockJson.formatted(
                "Nikhil",
                "N",
                "Seattle",
                123);

        Assertions.assertEquals(json, formattedTextBlockJson);
    }
}
