package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {

    private Scanner sc = new Scanner(System.in);
    String strInput = input();
    String[] strInputArr = spliter(strInput);
    
    

    @Test
    String input() {
        String actual = sc.nextLine();

        return actual;
    } 

    @Test
    String[] spliter(String strActual) {
        String[] actual = strActual.split(" ");

        return actual;
    }

    @ParameterizedTest
    @ValueSource(strings = {"+","-","*","/"})
//    @CsvSource(value = {"+:false","-:false","*:false","/:false"} , delimiter = ':')
    void parser(String[] actual, String expected){
        expected.equals(actual);


        

        
    }

    @Test
    void calculator(String[] actual) {
        int result = 0;

        for(int i = 0 ; i < actual.length ; i ++){
            switch (actual[i]) {
                case "+":
                    
                    break;
                case "-":
                    
                    break;
                case "*":
                    
                    break;
                case "/":
                    
                    break;            
            
                default:
                    break;
            }
        }

    }

    
    @Test
    @DisplayName("문자열 위치 확인 1 - has Message")
    void charAt() {
        String actual = "abc";
        assertThatThrownBy(() -> {
            
            actual.charAt(10);

        }).isInstanceOf(IndexOutOfBoundsException.class)
          .hasMessageContaining("index out of");
    }

    @Test
    @DisplayName("문자열 위치 확인 2 - Match Message")
    void charAt2() {
        String actual = "abc";
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
        .isThrownBy(() -> {
            actual.charAt(10);
        }).withMessageContaining("index out of");
    }



}
