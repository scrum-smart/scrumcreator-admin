package com.scrumcreator.admin.core.data;

import java.util.ArrayList;
import java.util.List;

public class ScrumScenarioJSON {

    private List<ScrumScenarioName> rows;

    public ScrumScenarioJSON(List<ScrumScenario> scrumScenarios) {
        this.rows = new ArrayList<>();
        scrumScenarios.forEach(scrumScenario -> rows.add(new ScrumScenarioName(scrumScenario.getId(), scrumScenario.getScenarioName())));
    }

    public List<ScrumScenarioName> getRows() {
        return rows;
    }

    public void setRows(List<ScrumScenarioName> scrumScenarioNames) {
        this.rows = scrumScenarioNames;
    }

    private class ScrumScenarioName {

        public String id;
        public String scenarioName;

        public ScrumScenarioName(String id, String scenarioName) {
            this.id = id;
            this.scenarioName = scenarioName;
        }
    }
}
