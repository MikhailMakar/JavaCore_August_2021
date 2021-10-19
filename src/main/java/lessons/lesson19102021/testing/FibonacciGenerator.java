package lessons.lesson19102021.testing;

import java.math.BigInteger;

public class FibonacciGenerator {

    private BigInteger[] cache = new BigInteger[1000];

    public BigInteger getFib(int number) {
        if(number < 0){
            throw new IllegalArgumentException("wrong number");
        }
        if(number == 1){
            return BigInteger.ONE;
        }
        if (number == 0) {
            return BigInteger.ZERO;
        }
        BigInteger add = this.getFib(number - 1).add(this.getFib(number - 2));

        if (cache[number] == null) {
            cache[number] = add;
        }
        return add;
    }

    public void clearCache() {
        cache = new BigInteger[1000];
    }

}
