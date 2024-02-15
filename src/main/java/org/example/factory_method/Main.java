package org.example.factory_method;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = new CDeveloperFactory();
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }
}
