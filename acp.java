class Calculator {
    protected double num1, num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Operations extends Calculator {

    public Operations(double num1, double num2) {
        super(num1, num2);
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }
}

public class acp {
    public static void main(String[] args) {
        Operations calc = new Operations(20, 5);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}