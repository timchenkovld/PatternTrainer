package org.example.abstract_factory.website;

import org.example.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests web site");
    }
}
