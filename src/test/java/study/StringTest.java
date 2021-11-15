package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class StringTest {
    @Test
    void replace() {
        
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    } 

    @Test
    void split1() {
        String[] actual = "1,2".split(",");
        //System.out.println(Arrays.toString(actual));
        assertThat(actual).contains("1","2");

    }

    @Test 
    void split2() {
        String[] actual = "1".split(",");
        System.out.println(Arrays.toString(actual));
        assertThat(actual).containsExactly("1");

    }

    @Test
    void substring(){
        String actual = "(1,2)";

        actual = actual.substring(actual.indexOf("(")+1,actual.indexOf(")"));
        assertThat(actual).isEqualTo("1,2");
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
