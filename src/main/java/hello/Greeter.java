package hello;

public class Greeter {

    public String sayHello() {
        return sayHello("world");
    }

    public String sayHello(String who) {
        return String.format("Hello %s!", who);
    }

}
