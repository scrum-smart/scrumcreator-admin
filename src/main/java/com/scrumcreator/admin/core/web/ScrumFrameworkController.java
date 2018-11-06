package com.scrumcreator.admin.core.web;

import com.scrumcreator.admin.core.data.ScrumPractice;
import com.scrumcreator.admin.core.data.ScrumPracticeJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class ScrumFrameworkController {

    @Autowired
    private MongoOperations mongoOperations;

    @RequestMapping(value = "/api/scrumFramework", method = RequestMethod.GET)
    public ScrumPracticeJSON scrumFramework() {
        return new ScrumPracticeJSON(mongoOperations.findAll(ScrumPractice.class));
    }

    @RequestMapping(value = "/api/scrumFramework", method = RequestMethod.POST)
    public String editScrumFramework(@RequestParam("id") String id,
                                     @RequestParam("practiceIndex") String newPracticeIndex,
                                     @RequestParam("scrumElement") String newScrumElement,
                                     @RequestParam("scrumRule") String newScrumRule,
                                     @RequestParam("scrumPractice") String newScrumPractice) {

        ScrumPractice scrumPractice;
        Double processedNewPracticeIndex = Double.valueOf(newPracticeIndex);

        Query searchWebinarQuery = new Query(Criteria.where("id").is(id));
        scrumPractice = mongoOperations.findOne(searchWebinarQuery, ScrumPractice.class);

        if (scrumPractice != null) {
            scrumPractice.update(processedNewPracticeIndex, newScrumElement, newScrumRule, newScrumPractice);
        } else {
            scrumPractice = new ScrumPractice(processedNewPracticeIndex, newScrumElement, newScrumRule, newScrumPractice);
        }

        mongoOperations.save(scrumPractice);
        return "success";
    }

}