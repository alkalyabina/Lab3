package MainCharacters;

public class Carlson extends HumanAbstract {

    public Carlson(String name, int age) {
        super(name, age);
    }

    public void carlsonName() {
        System.out.print(Carlson.getAge()+"-ти летний "+ Carlson.getName());
    }

}

