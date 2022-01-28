package Things;


public class Apple {

    private final String name;

    public Apple() {

        name = "яблоки";
    }

    public Apple(String name) {
        this.name = name;
    }

    public void baked() {

        System.out.print("печеные " + name );
    }


}
