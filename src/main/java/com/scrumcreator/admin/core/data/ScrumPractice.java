package com.scrumcreator.admin.core.data;

/**
 * Created by VMoskalenko on 05.01.2017.
 */
public class ScrumPractice {

    private String id;
    private Double practiceIndex;
    private String scrumElement;
    private String scrumRule;
    private String scrumPractice;

    public ScrumPractice() {
    }

    public ScrumPractice(Double practiceIndex, String scrumElement, String scrumRule, String scrumPractice) {
        this.practiceIndex = practiceIndex;
        this.scrumElement = scrumElement;
        this.scrumRule = scrumRule;
        this.scrumPractice = scrumPractice;
    }

    public String getId() {
        return id;
    }

    public Double getPracticeIndex() {
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

    public void setPracticeIndex(Double practiceIndex) {
        this.practiceIndex = practiceIndex;
    }

    public void update(Double processedNewPracticeIndex, String newScrumElement, String newScrumRule, String newScrumPractice) {
        practiceIndex = processedNewPracticeIndex;
        scrumElement = newScrumElement;
        scrumRule = newScrumRule;
        scrumPractice = newScrumPractice;
    }
}
