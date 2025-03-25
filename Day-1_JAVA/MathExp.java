import java.util.Stack;

public class MathExp {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        int num1, num2, result;
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals
            ("/")) {
                num2 = stack.pop();
                num1 = stack.pop();
                switch (token) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String expression = "10 + 2 * 6";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
}