package org.example.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOps {

    // Round to 2 decimals and return as double
    public static double roundTo2Decimals(BigDecimal number) {
        double result = number.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return result;
    }

    // Invert sign, round to 1 decimal, return as BigDecimal
    public static BigDecimal invertSignAndRoundTo1Decimals(BigDecimal number) {
        BigDecimal inverted = number.negate().setScale(1, RoundingMode.HALF_UP);
        return inverted;
    }
}
