import org.example.StringReplace;
import org.junit.Assert;
import org.junit.Test;

public class Test_StringReplace {
    @Test
    public void test1(){
        String string = "Hello, World!";
        String oldString = "World!";
        String newString = "Java?!";
        String result = StringReplace.replace(string, oldString, newString);
        String awaiting = "Hello, Java?!";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String string = "Hello, World!";
        String oldString = "";
        String newString = "Java?!";
        String result = StringReplace.replace(string, oldString, newString);
        String awaiting = "Hello, World!";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test3(){
        String string = "Hello, World!";
        String oldString = ", World!";
        String newString = "";
        String result = StringReplace.replace(string, oldString, newString);
        String awaiting = "Hello";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }
}
