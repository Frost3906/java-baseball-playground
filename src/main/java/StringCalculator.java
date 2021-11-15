import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {
    

    static String inputScanner(String strInput) {
        Scanner sc = new Scanner(System.in);
        strInput = sc.nextLine();
        sc.close();

        return strInput;
    }
    static String[] spliter(String strInput) {
        String[] inputArr = {};
        inputArr = strInput.split(" ");
        return inputArr;
    }

    static boolean isOperator(String input) {
        
        if("+".equals(input) || "-".equals(input) 
            || "*".equals(input) || "/".equals(input)){
                return true;
            }

        return false;
    }

    static int parser(String strInput) {
        int intInput  = 0;
        intInput = Integer.parseInt(strInput);
        return intInput;
    }

    static String setOperator(String input) throws Exception{
        String operator = "";
        switch (input) {
            case "+":
                operator = input; 
                break;    
            case "-":
                operator = input;
                break;
            case "*":
                operator = input;
                break;
            case "/":
                operator = input;
                break;
            default:
                System.out.println("invalid String input");
                throw new Exception();
        }
        return operator;
    }

    static int calculator(String[] inputArr) throws Exception {
        int result = parser(inputArr[0]);
        String operator = "";
        for(int i = 1 ; i < inputArr.length ; i++){
            if(isOperator(inputArr[i])){
                operator = setOperator(inputArr[i]);
            }else {
                if(!"".equals(operator)){
                    switch (operator) {
                        case "+":
                            result = result + parser(inputArr[i]);                            
                            break;
                        case "-":
                            result = result - parser(inputArr[i]);                        
                            break;
                        case "*":
                            result = result * parser(inputArr[i]);
                            break;
                        case "/":
                            result = result / parser(inputArr[i]);
                            break;
                        default:
                            throw new Exception();
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) throws Exception {

        String strInput = "";
        String[] inputArr = {};
        strInput = inputScanner(strInput); 
        inputArr = spliter(strInput);


        System.out.println(calculator(inputArr));   
    }
}
 