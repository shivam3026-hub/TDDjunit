import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTest {

    Junit j;

    @Before
    public void initiateClass(){
        this.j=new Junit();
    }

    @Test
    public void test1RemoveA(){
        String result=j.removeA("ABCD");
        assertEquals("BCD",result);
    }
    @Test
    public void test2RemoveA(){
        String result=j.removeA("AACD");
        assertEquals("CD",result);
    }
    @Test
    public void test3RemoveA(){
        String result=j.removeA("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void test4RemoveA(){
        String result=j.removeA("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void test5RemoveA(){
        String result=j.removeA("AABAA");
        assertEquals("BAA",result);
    }

}
