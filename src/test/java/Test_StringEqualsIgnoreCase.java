import org.example.StringEqualsIgnoreCase;
import org.junit.Assert;
import org.junit.Test;

public class Test_StringEqualsIgnoreCase {
    @Test
    public void test1(){
        String string1 = "Hello, World!";
        String string2 = "World!";
        boolean result = StringEqualsIgnoreCase.equalsIgnoreCase(string1, string2);
        boolean awaiting = false;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String string1 = "Hello, World!";
        String string2 = "heLlO, WOrLD!";
        boolean result = StringEqualsIgnoreCase.equalsIgnoreCase(string1, string2);
        boolean awaiting = true;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test3(){
        String string1 = "";
        String string2 = "";
        boolean result = StringEqualsIgnoreCase.equalsIgnoreCase(string1, string2);
        boolean awaiting = true;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test4(){
        String string1 = "HELLO";
        String string2 = "hello";
        boolean result = StringEqualsIgnoreCase.equalsIgnoreCase(string1, string2);
        boolean awaiting = true;

        Assert.assertEquals(result, awaiting);
    }
}
