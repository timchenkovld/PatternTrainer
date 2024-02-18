package org.example.abstract_factory.banking;

import org.example.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("banking PM manages banking project");
    }
}
