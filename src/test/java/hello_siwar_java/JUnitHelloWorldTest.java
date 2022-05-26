package hello_siwar_java;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorldTest {
 
 	@Before
    public void setUp() { 
        setBaseUrl("http://192.168.1.108:80//hello-siwar-1.0");
    }
	 
        @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }
        @Test
    public void testLoginPage() {
        beginAt("index.jsp"); 
        assertTitleEquals("myProject!");
        assertLinkPresent("home");
        clickLink("home");
        assertTitleEquals("Home");
    }
    	@Test
    public void testHomePage() {
        beginAt("home.jsp"); 
        assertTitleEquals("Home");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("myProject!");
    }
 
    @After
    public void after() {
        System.out.println("test successfull");
    }

}
