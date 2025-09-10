package Util;

public class CurrencyConverter {
    public static double calc (double dollar_price, double dollarWillbought) {
        return dollarWillbought * dollar_price + (dollarWillbought * 0.06 * (dollar_price));
    }

    }

