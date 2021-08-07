public class CommonCalculator implements Calculator{
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double substraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0){
            return 0;
        } else {
            return a / b;
        }
    }
}
