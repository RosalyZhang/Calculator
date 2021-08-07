import java.util.List;
import java.util.stream.Collectors;

public class ScientificCalculator implements Calculator{
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

    public double root(double i){
        return Math.sqrt(i);
    }

    public double square(double i){
        return Math.pow(i, 2);
    }

    public double max(List<Double> doubleList){
        return doubleList.stream().sorted().collect(Collectors.toList()).get(doubleList.size()-1);
    }

    public double sum(List<Double> doubleList){
        return doubleList.stream().reduce(0.0, (a,b) -> a + b);
    }

    public double pythagoras(double perpendicular, double base){
        double a = Math.pow(perpendicular, 2) + Math.pow(base, 2);
        double hypothenuse = Math.sqrt(a);
        return hypothenuse;
    }

    public double sin(double a){
        return Math.sin(a);
    }

    public double cos(double a){
        return  Math.cos(a);
    }

    public double tan(double a){
        return Math.tan(a);
    }


}
