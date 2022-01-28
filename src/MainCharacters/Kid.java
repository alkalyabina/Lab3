package MainCharacters;

public class Kid extends HumanAbstract {

    public Kid(String name, int age) {
        super(name, age);
    }
    public void kidName() {
        System.out.print(Kid.getAge()+"-ти летний "+ Kid.getName());
    }


}