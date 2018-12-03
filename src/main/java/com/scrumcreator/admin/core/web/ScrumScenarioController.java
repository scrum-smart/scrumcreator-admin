package com.scrumcreator.admin.core.web;

import com.scrumcreator.admin.core.data.ScrumPractice;
import com.scrumcreator.admin.core.data.ScrumScenario;
import com.scrumcreator.admin.core.data.ScrumScenarioJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ScrumScenarioController {

    @Autowired
    private MongoOperations mongoOperations;

    @RequestMapping(value = "/api/scrumScenario", method = RequestMethod.GET)
    public ScrumScenarioJSON scrumScenario() {
        return new ScrumScenarioJSON(mongoOperations.findAll(ScrumScenario.class));
    }

    @RequestMapping(value = "/api/scrumScenario", method = RequestMethod.POST)
    public String editScrumScenario(@RequestParam("id") String id,
                                    @RequestParam("scenarioName") String newScenarioName) {

        ScrumScenario scrumScenario;

        Query searchWebinarQuery = new Query(Criteria.where("id").is(id));
        scrumScenario = mongoOperations.findOne(searchWebinarQuery, ScrumScenario.class);

        if (scrumScenario != null) {
            scrumScenario.update(newScenarioName);
        } else {
            scrumScenario = new ScrumScenario(newScenarioName);
        }

        mongoOperations.save(scrumScenario);
        return "success";
    }

}
