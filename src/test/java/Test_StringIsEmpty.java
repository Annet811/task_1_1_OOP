import org.example.StringEqualsIgnoreCase;
import org.example.StringIsEmpty;
import org.junit.Assert;
import org.junit.Test;

public class Test_StringIsEmpty {
    @Test
    public void test1(){
        String string = "Hello, World!";
        boolean result = StringIsEmpty.isEmpty(string);
        boolean awaiting = false;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String string = "";
        boolean result = StringIsEmpty.isEmpty(string);
        boolean awaiting = true;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test3(){
        String string = "   ";
        boolean result = StringIsEmpty.isEmpty(string);
        boolean awaiting = false;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test4(){
        String string = null;
        boolean result = StringIsEmpty.isEmpty(string);
        boolean awaiting = true;

        Assert.assertEquals(result, awaiting);
    }
}
