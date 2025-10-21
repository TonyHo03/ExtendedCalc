package dk.easv.extendedcalc.bll;

public class CalculatorLogic {

    private boolean firstCalc = true;

    public double Addition(double a, double b)
    {
        if (a == 0) {
            return b;
        } else  {
        //    firstCalc = false;
            return a + b;
        }
    }

    public double Subtraction(double a, double b)
    {
        if (a == 0) {
            return b;
        } else  {
        //    firstCalc = false;
            return a - b;
        }
    }

    public double Multiplication(double a, double b)
    {
        if (a == 0) {
            return b;
        } else  {
        //    firstCalc = false;
            return a * b;
        }

    }

    public double Division(double a, double b)
    {
        if (a == 0) {
            return b;
        } else  {
        //    firstCalc = false;
            return a / b;
        }
    }

    public double Percent(double a, double b)
    {
        return b / 100 * a;
    }

    public double PlusMinus(double a)
    {
        return a * -1;
    }

    public double Calc(double a, double b, String operator)
    {
        return switch (operator) {
            case "+" -> Addition(a, b);
            case "-" -> Subtraction(a, b);
            case "*" -> Multiplication(a, b);
            case "/" -> Division(a, b);
            default -> 0;
        };
    }

}
