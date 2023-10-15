import org.example.StringSplit;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_StringSplit {
    @Test
    public void test1(){
        String input = "11111hellohellhello1111";
        String delimiter = "hello";
        List<String> result = StringSplit.split(input, delimiter);
        List<String> awaiting = Arrays.asList("11111", "hell", "1111");

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String input = "";
        String delimiter = "hello";
        List<String> result = StringSplit.split(input, delimiter);

        Assert.assertNotNull(result);
        Assert.assertEquals(result, new ArrayList<>());
    }

    @Test
    public void test3(){
        String input = "Hey!";
        String delimiter = "";
        List<String> result = StringSplit.split(input, delimiter);

        Assert.assertNotNull(result);
        Assert.assertEquals(result, List.of(input));
    }
}
