package MainCharacters;

import java.util.Objects;

public abstract class HumanAbstract {
    private static String name;
    private static int age;
    public HumanAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanAbstract that = (HumanAbstract) o;
        return Objects.equals(name + this.hashCode(), that.name + that.hashCode());
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

