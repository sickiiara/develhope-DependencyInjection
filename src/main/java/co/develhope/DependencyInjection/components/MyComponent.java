package co.develhope.DependencyInjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called.");
        this.myComponentName = "Chiara";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called.");
        return myComponentName;
    }
}
