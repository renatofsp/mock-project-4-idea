package com.runnable;
import com.toUse.Cat;
import com.toUse.Dog;
import com.toUse.MyXmlReader;

public class Executor {

    public static void main(String[] args) {
        MyXmlReader reader = new MyXmlReader();
        String fileAsString = reader.readXMLFile();

        Dog dog= new Dog();
        dog.setName("bob");

        Cat cat = new Cat();
        cat.setName("kitty");

        dog.scream();
        cat.scream();
    }
}
