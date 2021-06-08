public class Main {

    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(10000000, 2);
        System.out.println("1000000000000000000000.21956 + 2 = " + result);
        result = proxy.add(2, 15);
        System.out.println("2 + Double.MAX_VALUE = " + result);
        result = proxy.mul(1,Double.MAX_VALUE);
        System.out.println(result);
    }
}