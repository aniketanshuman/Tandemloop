public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;
        String operation = "add"; 

        Calculator calculator = new Calculator(num1, num2);

        double result;
        switch (operation) {
            case "add":
                result = calculator.add();
                System.out.println("Addition of these two numbers is: " + result);
                break;
            case "subtract":
                result = calculator.subtract();
                System.out.println("Subtraction of these two numbers is: " + result);
                break;
            case "multiply":
                result = calculator.multiply();
                System.out.println("Multiplication of these two numbers is: " + result);
                break;
            case "divide":
                try {
                    result = calculator.divide();
                    System.out.println("Division of these two numbers is: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }
}
