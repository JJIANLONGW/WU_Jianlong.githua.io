package com.wujianlong.EnvironmentalSystems.domain;

/**
 * @author 26376
 * @version 1.0.0
 * @description TODO
 * @date 2024/1/4 14:03
 */
public class Environment {

    private String  region;
    private String  gender;
    private String  race_Culture;
    private String  faith;
    private String  current_Emotions;
    private String  educational_Level;
    private String  economic_Indicators;
    private String  social_Impact;

    public Environment(String region, String gender, String race_Culture, String faith, String current_Emotions, String educational_Level, String economic_Indicators, String social_Impact) {
        this.region = region;
        this.gender = gender;
        this.race_Culture = race_Culture;
        this.faith = faith;
        this.current_Emotions = current_Emotions;
        this.educational_Level = educational_Level;
        this.economic_Indicators = economic_Indicators;
        this.social_Impact = social_Impact;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace_Culture() {
        return race_Culture;
    }

    public void setRace_Culture(String race_Culture) {
        this.race_Culture = race_Culture;
    }

    public String getFaith() {
        return faith;
    }

    public void setFaith(String faith) {
        this.faith = faith;
    }

    public String getCurrent_Emotions() {
        return current_Emotions;
    }

    public void setCurrent_Emotions(String current_Emotions) {
        this.current_Emotions = current_Emotions;
    }

    public String getEducational_Level() {
        return educational_Level;
    }

    public void setEducational_Level(String educational_Level) {
        this.educational_Level = educational_Level;
    }

    public String getEconomic_Indicators() {
        return economic_Indicators;
    }

    public void setEconomic_Indicators(String economic_Indicators) {
        this.economic_Indicators = economic_Indicators;
    }

    public String getSocial_Impact() {
        return social_Impact;
    }

    public void setSocial_Impact(String social_Impact) {
        this.social_Impact = social_Impact;
    }
}
