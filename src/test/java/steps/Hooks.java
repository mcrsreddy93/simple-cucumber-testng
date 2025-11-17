package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeHook(){
        System.out.println("I am beforeHook");
    }

    @After
    public void afterHook(){
        System.out.println("I am afterHook");
    }
}
