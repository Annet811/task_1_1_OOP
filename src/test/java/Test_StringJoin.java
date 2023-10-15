import org.example.StringJoin;
import org.junit.Assert;
import org.junit.Test;

public class Test_StringJoin {
    @Test
    public void test1(){
        String[] strings = {"111", "222", "333"};
        String delimiter = "-";
        String result = StringJoin.join(strings, delimiter);
        String awaiting = "111-222-333";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test2(){
        String[] strings = {"111", "222", "333"};
        String delimiter = "---";
        String result = StringJoin.join(strings, delimiter);
        String awaiting = "111---222---333";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test3(){
        String[] strings = {};
        String delimiter = "---";
        String result = StringJoin.join(strings, delimiter);
        String awaiting = "";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }

    @Test
    public void test4(){
        String[] strings = {"111", "222", "333"};
        String delimiter = "";
        String result = StringJoin.join(strings, delimiter);
        String awaiting = "111222333";

        Assert.assertNotNull(result);
        Assert.assertEquals(result, awaiting);
    }
}
