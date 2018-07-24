package com.scrumcreator.admin.core.data;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by VMoskalenko on 05.01.2017.
 */
public class ScrumPractice {

    @Id
    private String id;

    private String practiceIndex;
    private String scrumElement;
    private String scrumRule;
    private String scrumPractice;

    public ScrumPractice(String practiceIndex, String scrumElement) {
        this.practiceIndex = practiceIndex;
        this.scrumElement = scrumElement;
    }

    public ScrumPractice() {
    }

    public String getId() {
        return id;
    }

    public String getPracticeIndex() {
        return practiceIndex;
    }

    public String getScrumElement() {
        return scrumElement;
    }

    public String getScrumRule() {
        return scrumRule;
    }

    public void setScrumRule(String scrumRule) {
        this.scrumRule = scrumRule;
    }

    public String getScrumPractice() {
        return scrumPractice;
    }

    public void setScrumPractice(String scrumPractice) {
        this.scrumPractice = scrumPractice;
    }

}
