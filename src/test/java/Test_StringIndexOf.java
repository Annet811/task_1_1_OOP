import org.example.StringIndexOf;
import org.junit.Assert;
import org.junit.Test;

public class Test_StringIndexOf {
    @Test
    public void test1(){
        String string = "Hello, World!";
        String target = "World!";
        int result = StringIndexOf.indexOf(string, target);
        int awaiting = 7;

        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String string = "Hello, world!";
        String target = "World";
        int result = StringIndexOf.indexOf(string, target);
        int awaiting = -1;

        Assert.assertEquals(result, awaiting);
    }
}
