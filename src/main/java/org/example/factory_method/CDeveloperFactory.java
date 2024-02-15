package org.example.factory_method;

public class CDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CDeveloper();
    }
}
