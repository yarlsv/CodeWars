package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RGBToHEX {

    public static String rgb(int r, int g, int b) {
        String result = "";
        if (r > 255) {
            result += "FF";
        } else if (r < 0) {
            result += "00";
        } else {
            result += String.format("%02X", r);
        }
        if (g > 255) {
            result += "FF";
        } else if (g < 0) {
            result += "00";
        } else {
            result += String.format("%02X", g);
        }
        if (b > 255) {
            result += "FF";
        } else if (b < 0) {
            result += "00";
        } else {
            result += String.format("%02X", b);
        }
        return result;
    }

    @Test
    public void sampleTests() {
        assertEquals( "000000", RGBToHEX.rgb(0, 0, 0));
        assertEquals( "010203", RGBToHEX.rgb(1, 2, 3));
        assertEquals("FFFFFF", RGBToHEX.rgb(255, 255, 255));
        assertEquals( "FEFDFC", RGBToHEX.rgb(254, 253, 252));
        assertEquals( "00FF7D", RGBToHEX.rgb(-20, 275, 125));
    }

}
