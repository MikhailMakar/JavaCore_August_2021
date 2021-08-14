package lessons.lesson13082021.enthu.rad;

import lessons.lesson13082021.*;
import lessons.lesson13082021.enthu.*;
import java.io.*;

public class StockQuote {
    Stock stock;

    public StockQuote(Stock s) {
    }

    public void store() throws IOException {
        Util.store(stock);
    }

    public double computePrice() {
        return Helper.getPrice(stock);
    }
}
