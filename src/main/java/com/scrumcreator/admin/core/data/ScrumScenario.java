package com.scrumcreator.admin.core.data;

import java.util.List;

public class ScrumScenario {

    private String id;
    private String scenarioName;
    private List<ScrumPracticeImplementation> scrumPracticeImplementations;

    public ScrumScenario(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public void update(String newScenarioName) {
        this.scenarioName = newScenarioName;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
