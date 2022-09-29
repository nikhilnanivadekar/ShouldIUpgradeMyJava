package nikhil.nani.code.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamplesSwitchTest {

    @Test
    public void switchStatements() {
        Assertions.assertEquals("Q1", this.getQuarterOldSwitch(1));
        Assertions.assertEquals("Q1", this.getQuarterOldSwitch(2));
        Assertions.assertEquals("Q1", this.getQuarterOldSwitch(3));
        Assertions.assertEquals("Q2", this.getQuarterOldSwitch(4));
        Assertions.assertEquals("Q2", this.getQuarterOldSwitch(5));
        Assertions.assertEquals("Q2", this.getQuarterOldSwitch(6));
        Assertions.assertEquals("Q3", this.getQuarterOldSwitch(7));
        Assertions.assertEquals("Q3", this.getQuarterOldSwitch(8));
        Assertions.assertEquals("Q3", this.getQuarterOldSwitch(9));
        Assertions.assertEquals("Q4", this.getQuarterOldSwitch(10));
        Assertions.assertEquals("Q4", this.getQuarterOldSwitch(11));
        Assertions.assertEquals("Q4", this.getQuarterOldSwitch(12));
        Assertions.assertEquals("Not a month in year", this.getQuarterOldSwitch(13));

        Assertions.assertEquals(this.getQuarterOldSwitch(1), this.getQuarterNewSwitch(1));
        Assertions.assertEquals(this.getQuarterOldSwitch(2), this.getQuarterNewSwitch(2));
        Assertions.assertEquals(this.getQuarterOldSwitch(3), this.getQuarterNewSwitch(3));
        Assertions.assertEquals(this.getQuarterOldSwitch(4), this.getQuarterNewSwitch(4));
        Assertions.assertEquals(this.getQuarterOldSwitch(5), this.getQuarterNewSwitch(5));
        Assertions.assertEquals(this.getQuarterOldSwitch(6), this.getQuarterNewSwitch(6));
        Assertions.assertEquals(this.getQuarterOldSwitch(7), this.getQuarterNewSwitch(7));
        Assertions.assertEquals(this.getQuarterOldSwitch(8), this.getQuarterNewSwitch(8));
        Assertions.assertEquals(this.getQuarterOldSwitch(9), this.getQuarterNewSwitch(9));
        Assertions.assertEquals(this.getQuarterOldSwitch(10), this.getQuarterNewSwitch(10));
        Assertions.assertEquals(this.getQuarterOldSwitch(11), this.getQuarterNewSwitch(11));
        Assertions.assertEquals(this.getQuarterOldSwitch(12), this.getQuarterNewSwitch(12));
        Assertions.assertEquals(this.getQuarterOldSwitch(13), this.getQuarterNewSwitch(13));

        Assertions.assertEquals(this.getQuarterNewSwitch(1), this.getQuarterNewSwitchAsExpression(1));
        Assertions.assertEquals(this.getQuarterNewSwitch(2), this.getQuarterNewSwitchAsExpression(2));
        Assertions.assertEquals(this.getQuarterNewSwitch(3), this.getQuarterNewSwitchAsExpression(3));
        Assertions.assertEquals(this.getQuarterNewSwitch(4), this.getQuarterNewSwitchAsExpression(4));
        Assertions.assertEquals(this.getQuarterNewSwitch(5), this.getQuarterNewSwitchAsExpression(5));
        Assertions.assertEquals(this.getQuarterNewSwitch(6), this.getQuarterNewSwitchAsExpression(6));
        Assertions.assertEquals(this.getQuarterNewSwitch(7), this.getQuarterNewSwitchAsExpression(7));
        Assertions.assertEquals(this.getQuarterNewSwitch(8), this.getQuarterNewSwitchAsExpression(8));
        Assertions.assertEquals(this.getQuarterNewSwitch(9), this.getQuarterNewSwitchAsExpression(9));
        Assertions.assertEquals(this.getQuarterNewSwitch(10), this.getQuarterNewSwitchAsExpression(10));
        Assertions.assertEquals(this.getQuarterNewSwitch(11), this.getQuarterNewSwitchAsExpression(11));
        Assertions.assertEquals(this.getQuarterNewSwitch(12), this.getQuarterNewSwitchAsExpression(12));
        Assertions.assertEquals(this.getQuarterNewSwitch(13), this.getQuarterNewSwitchAsExpression(13));

        Assertions.assertEquals(this.getQuarterNewSwitch(1), this.getQuarterYieldSyntax(1));
        Assertions.assertEquals(this.getQuarterNewSwitch(2), this.getQuarterYieldSyntax(2));
        Assertions.assertEquals(this.getQuarterNewSwitch(3), this.getQuarterYieldSyntax(3));
        Assertions.assertEquals(this.getQuarterNewSwitch(4), this.getQuarterYieldSyntax(4));
        Assertions.assertEquals(this.getQuarterNewSwitch(5), this.getQuarterYieldSyntax(5));
        Assertions.assertEquals(this.getQuarterNewSwitch(6), this.getQuarterYieldSyntax(6));
        Assertions.assertEquals(this.getQuarterNewSwitch(7), this.getQuarterYieldSyntax(7));
        Assertions.assertEquals(this.getQuarterNewSwitch(8), this.getQuarterYieldSyntax(8));
        Assertions.assertEquals(this.getQuarterNewSwitch(9), this.getQuarterYieldSyntax(9));
        Assertions.assertEquals(this.getQuarterNewSwitch(10), this.getQuarterYieldSyntax(10));
        Assertions.assertEquals(this.getQuarterNewSwitch(11), this.getQuarterYieldSyntax(11));
        Assertions.assertEquals(this.getQuarterNewSwitch(12), this.getQuarterYieldSyntax(12));
        Assertions.assertEquals(this.getQuarterNewSwitch(13), this.getQuarterYieldSyntax(13));

        Assertions.assertEquals(this.getQuarterNewSwitch(1), this.getQuarterEnum(Months.JAN));
        Assertions.assertEquals(this.getQuarterNewSwitch(2), this.getQuarterEnum(Months.FEB));
        Assertions.assertEquals(this.getQuarterNewSwitch(3), this.getQuarterEnum(Months.MAR));
        Assertions.assertEquals(this.getQuarterNewSwitch(4), this.getQuarterEnum(Months.APR));
        Assertions.assertEquals(this.getQuarterNewSwitch(5), this.getQuarterEnum(Months.MAY));
        Assertions.assertEquals(this.getQuarterNewSwitch(6), this.getQuarterEnum(Months.JUN));
        Assertions.assertEquals(this.getQuarterNewSwitch(7), this.getQuarterEnum(Months.JUL));
        Assertions.assertEquals(this.getQuarterNewSwitch(8), this.getQuarterEnum(Months.AUG));
        Assertions.assertEquals(this.getQuarterNewSwitch(9), this.getQuarterEnum(Months.SEP));
        Assertions.assertEquals(this.getQuarterNewSwitch(10), this.getQuarterEnum(Months.OCT));
        Assertions.assertEquals(this.getQuarterNewSwitch(11), this.getQuarterEnum(Months.NOV));
        Assertions.assertEquals(this.getQuarterNewSwitch(12), this.getQuarterEnum(Months.DEC));
    }

    private String getQuarterOldSwitch(Integer monthNumber) {

        switch (monthNumber) {
            case 1:
                return "Q1";
            case 2:
                return "Q1";
            case 3:
                return "Q1";
            case 4:
                return "Q2";
            case 5:
                return "Q2";
            case 6:
                return "Q2";
            case 7:
                return "Q3";
            case 8:
                return "Q3";
            case 9:
                return "Q3";
            case 10:
                return "Q4";
            case 11:
                return "Q4";
            case 12:
                return "Q4";
            default:
                return "Not a month in year";
        }
    }

    private String getQuarterNewSwitch(Integer monthNumber) {

        return switch (monthNumber) {
            case 1, 2, 3 -> "Q1";
            case 4, 5, 6 -> "Q2";
            case 7, 8, 9 -> "Q3";
            case 10, 11, 12 -> "Q4";
            default -> "Not a month in year";
        };
    }

    private String getQuarterNewSwitchAsExpression(Integer monthNumber) {
        final String quarter = switch (monthNumber) {
            case 1, 2, 3 -> "Q1";
            case 4, 5, 6 -> "Q2";
            case 7, 8, 9 -> "Q3";
            case 10, 11, 12 -> "Q4";
            default -> "Not a month in year";
        };
        return quarter;
    }

    private String getQuarterYieldSyntax(Integer monthNumber) {

        return switch (monthNumber) {
            case 1, 2, 3 -> "Q1";
            case 4, 5, 6 -> "Q2";
            case 7, 8, 9 -> "Q3";
            case 10, 11, 12 -> {
                System.out.println("Yay Last Quarter");
                yield "Q4";
            }
            default -> "Not a month in year";
        };
    }

    public enum Months {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    private String getQuarterEnum(Months month) {

        return switch (month) {
            case JAN, FEB, MAR -> "Q1";
            case APR, MAY, JUN -> "Q2";
            case JUL, AUG, SEP -> "Q3";
            case OCT, NOV, DEC -> "Q4";
        };
    }
}
