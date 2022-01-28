package ru.itmo;

import Environment.Nature;
import Environment.Room;
import Environment.TimeType;
import Environment.Twilight;
import MainCharacters.*;
import Things.*;


public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid("Малыш", 12);
        Carlson carlson = new Carlson("Карлсон", 25);
        Twilight twilight = new Twilight() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public TimeType getType() {
                return null;
            }
        };


        Apple apples = new Apple();
        Thoughts thoughts = new Thoughts();
        Room room = new Room();
        Prepositions prepositions = new Prepositions();
        Nature nature = new Nature();
        Action action = new Action();
        Pronouns pronouns = new Pronouns();
        Chimney chimney = new Chimney();
        Fire fire = new Fire();
        Lamp lamp = new Lamp();
        Light light = new Light();
        Log log = new Log();
        Workbench workbench = new Workbench();


        prepositions.and();
        pronouns.them();
        action.eat();
        apples.baked();
        prepositions.comma();
        prepositions.and();
        action.sit();
        prepositions.at();
        fire.fire1();
        prepositions.comma();
        prepositions.but();
        twilight.condition();
        prepositions.dot();
        prepositions.how();
        thoughts.feelings();
        prepositions.comma();
        prepositions.when();
        log.crack();
        prepositions.dash();
        action.think();
        kid.kidName();
        prepositions.dash();
        nature.cold();
        prepositions.and();
        nature.autumn();
        prepositions.dot();
        pronouns.he();
        action.standUp();
        prepositions.and();
        action.toss();
        prepositions.in();
        fire.fire2();
        log.logsCharacterictics();
        prepositions.dot();
        prepositions.when();
        chimney.burnedOut();
        prepositions.comma();
        prepositions.in();
        room.lightOff();
        prepositions.comma();
        carlson.carlsonName();
        action.lit();
        lamp.lamp();
        prepositions.comma();
        prepositions.which();
        action.hanging();
        prepositions.at();
        workbench.stand();
        prepositions.dot();
        pronouns.she();
        action.litUp();
        light.lightCharacteristic();
        prepositions.and();
        workbench.things();






    }
}
