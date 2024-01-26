package com.wujianlong.EnvironmentalSystems.service;

import com.wujianlong.EnvironmentalSystems.domain.Environment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

/**
 * @author 26376
 * @version 1.0.0
 * @description TODO
 * @date 2024/1/8 17:37
 */
public class EnvironmentService {
    String resourcePath = "src/main/resources/xx.txt";

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    private String region;
    private String gender;
    private String race_Culture;
    private String faith;
    private String current_Emotions;
    private String educational_Level;
    private String economic_Indicators;
    private String social_Impact;
    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    private int macroSum;
    private int microcosmicSum;

    public int getMacroSum() {
        return macroSum;
    }

    public void setMacroSum(int macroSum) {
        this.macroSum = macroSum;
    }

    public int getMicrocosmicSum() {
        return microcosmicSum;
    }

    public void setMicrocosmicSum(int microcosmicSum) {
        this.microcosmicSum = microcosmicSum;
    }

    char key = ' ';
    Random random = new Random();

    public void First(String resourcePath) {

        byte[] bytes = new byte[1024];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(resourcePath);
            while (fileInputStream.read(bytes) != -1) {
                switch (new String(bytes, 0, 3)) {
                    case "A-1":
                        region = "Asia";
                        break;
                    case "A-2":
                        region = "North America";
                        break;
                    case "A-3":
                        region = "Europe";
                        break;
                    case "A-4":
                        region = "Africa";
                        break;
                    case "A-5":
                        region = "Oceania";
                        break;
                    case "A-6":
                        region = "South America";
                        break;
                    case "A-7":
                        region = "Arctic and Antarctic";
                        break;
                }
                switch (new String(bytes, 4, 3)) {
                    case "B-1":
                        gender = "Male";
                        break;
                    case "B-2":
                        gender = "Female";
                        break;
                    case "B-3":
                        gender = "Prefer Not to Disclose/Other";
                        break;
                }
                switch (new String(bytes, 8, 3)) {
                    case "C-1":
                        race_Culture = "Asian";
                        break;
                    case "C-2":
                        race_Culture = "African";
                        break;
                    case "C-3":
                        race_Culture = "European";
                        break;
                    case "C-4":
                        race_Culture = "Hispanic or Latino";
                        break;
                    case "C-5":
                        race_Culture = "Middle Eastern";
                        break;
                    case "C-6":
                        race_Culture = "Indigenous or Aboriginal";
                        break;
                }
                switch (new String(bytes, 12, 3)) {
                    case "D-1":
                        faith = "Christianity";
                        break;
                    case "D-2":
                        faith = "Islam";
                        break;
                    case "D-3":
                        faith = "Hinduism";
                        break;
                    case "D-4":
                        faith = "Buddhism";
                        break;
                    case "D-5":
                        faith = "Atheism/Agnosticism";
                        break;
                    case "D-6":
                        faith = "Other Faiths or Spiritual Beliefs";
                        break;
                }
                switch (new String(bytes, 16, 3)) {
                    case "E-1":
                        current_Emotions = "Hopeful";
                        break;
                    case "E-2":
                        current_Emotions = "Anxious";
                        break;
                    case "E-3":
                        current_Emotions = "Angry";
                        break;
                    case "E-4":
                        current_Emotions = "Indifferent";
                        break;
                    case "E-5":
                        current_Emotions = "Inspired";
                        break;
                    case "E-6":
                        current_Emotions = "Sad";
                        break;
                }
                switch (new String(bytes, 20, 3)) {
                    case "F-1":
                        educational_Level = "Primary Education";
                        break;
                    case "F-2":
                        educational_Level = "Secondary Education";
                        break;
                    case "F-3":
                        educational_Level = "Tertiary Education (Non-Environmental Field)";
                        break;
                    case "F-4":
                        educational_Level = "Tertiary Education (Environmental Field)";
                        break;
                    case "F-5":
                        educational_Level = "Continuing Education or Self-Taught";
                        break;
                }
                switch (new String(bytes, 24, 3)) {
                    case "G-1":
                        economic_Indicators = "Low Income";
                        break;
                    case "G-2":
                        economic_Indicators = "Middle Income";
                        break;
                    case "G-3":
                        economic_Indicators = "High Income";
                        break;
                    case "G-4":
                        economic_Indicators = "Financially Unstable";
                        break;
                }
                switch (new String(bytes, 28, 3)) {
                    case "H-1":
                        social_Impact = "Family Influence";
                        break;
                    case "H-2":
                        social_Impact = "Peer Influence";
                        break;
                    case "H-3":
                        social_Impact = "Community and Cultural Influenc";
                        break;
                    case "H-4":
                        social_Impact = "Workplace or Professional Influence";
                        break;
                    case "H-5":
                        social_Impact = "Media and Public Discourse Influence";
                        break;


                }
            }
            environment = new Environment(region, gender, race_Culture, faith, current_Emotions, educational_Level, economic_Indicators, social_Impact);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("A-1 Asia\tA-2 North America\tA-3 Europe\tA-4 Africa\tA-5 Oceania\tA-6 South America\tA-7 Arctic and Antarctic");
        System.out.println(new String(bytes, 0, 3) + "\t" + environment.getRegion());
        System.out.println("B-1 Male\tB-2 Female\tB-3 Prefer Not to Disclose/Other");
        System.out.println(new String(bytes, 4, 3) + "\t" + environment.getGender());
        System.out.println("C-1 Asian\tC-2 African\tC-3 European\tC-4 Hispanic or Latino\tC-5 Middle Eastern\tC-6 Indigenous or Aboriginal");
        System.out.println(new String(bytes, 8, 3) + "\t" + environment.getRace_Culture());
        System.out.println("D-1 Christianity\tD-2 Islam\tD-3 Hinduism\tD-4 Buddhism\tD-5 Atheism/Agnosticism\tD-6 Other Faiths or Spiritual Beliefs");
        System.out.println(new String(bytes, 12, 3) + "\t" + environment.getFaith());
        System.out.println("E-1 Hopeful\tE-2 Anxious\tE-3 Angry\tE-4 Indifferent\tE-5 Inspired\tE-6 Sad");
        System.out.println(new String(bytes, 16, 3) + "\t" + environment.getCurrent_Emotions());
        System.out.println("F-1 Primary Education\tF-2 Secondary Education\tF-3 Tertiary Education (Non-Environmental Field)\tF-4 Tertiary Education (Environmental Field)\tF-5 Continuing Education or Self-Taught");
        System.out.println(new String(bytes, 20, 3) + "\t" + environment.getEducational_Level());
        System.out.println("G-1 Low Income\tG-2 Middle Income\tG-3 High Income\tG-4 Financially Unstable");
        System.out.println(new String(bytes, 24, 3) + "\t" + environment.getEconomic_Indicators());
        System.out.println("H-1 Family Influence\tH-2 Peer Influence\tH-3 Community and Cultural Influenc\tH-4 Workplace or Professional Influence\tH-5 Media and Public Discourse Influence");
        System.out.println(new String(bytes, 28, 3) + "\t" + environment.getSocial_Impact());
    }

    public void Second() {

        macroSum = 0;
        System.out.println("To what extent do you find environmental issues personally important?");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How much impact do you believe your actions have on the environment?");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("To what extent do social norms and pressures influence your environmental behavior?");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How much are your environmental actions motivated by a desire for social status or recognition? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("To what extent does an emotional connection to nature affect your behavior towards the environment? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How would you rate your understanding of environmental issues and their causes? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How willing are you to make personal sacrifices for the sake of the environment?");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("To what extent do you consider long-term environmental sustainability in your daily decisions? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How much do you trust authorities and scientific experts in guiding your environmental actions? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);
        System.out.println("How often do you think about the impact of your environmental behavior on future generations? ");
        System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
        auxiliary(key);

    }

    public void Third(Environment environment) {

        microcosmicSum = 0;
        switch (environment.getRegion()) {
            case "Asia":
                System.out.println("To what extent do seasonal changes in your region affect your daily life and view of nature?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "North America":
                System.out.println("To what extent do you feel compelled to take personal actions when facing environmental changes in your region (e.g., extreme weather)?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Europe":
                System.out.println("To what extent do you take pride in and wish to protect a specific aspect of your region's environment?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Africa":
                System.out.println("How frequently do you observe your community interacting with the natural environment?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Oceania":
                System.out.println("To what extent does living in or near diverse marine environments influence your views on ocean conservation?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "South America":
                System.out.println("To what extent does the concept of 'Pachamama' or Mother Earth influence your daily environmental decisions?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Arctic and Antarctic":
                System.out.println("How strongly do images or news about melting ice caps and polar wildlife evoke emotions in you?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
        switch (environment.getGender()) {
            case "Male":
                System.out.println("To what extent does the concept of masculinity in your culture influence your sense of personal responsibility toward environmental protection?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Female":
                System.out.println("To what extent do societal expectations about femininity affect your views and behaviors toward environmental sustainability?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Prefer Not to Disclose/Other":
                System.out.println("To what extent do you believe a more inclusive understanding of gender impacts environmental activism and policy?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
        switch (environment.getRace_Culture()) {
            case "Asian":
                System.out.println("To what extent do traditional Asian philosophies or practices related to nature influence your environmental attitudes?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "African":
                System.out.println("To what extent does the concept of 'Ubuntu' (I am because we are) or similar community-focused philosophies shape your environmental actions");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "European":
                System.out.println("To what extent have Europe's cultural history and its environmental movements influenced your personal environmental commitment?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Hispanic or Latino":
                System.out.println("To what extent do concepts of 'La Tierra' or the earth play a role in your cultural understanding of environmental stewardship?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Middle Eastern":
                System.out.println("To what extent do Middle Eastern cultural narratives around water and land influence your perceptions of resource conservation?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Indigenous or Aboriginal":
                System.out.println("To what extent does the concept of living in harmony with nature manifest in your daily actions and decisions?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;

        }
        switch (environment.getFaith()) {
            case "Christianity":
                System.out.println("To what extent do Christian teachings about stewardship of the Earth influence your environmental actions?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Islam":
                System.out.println("To what extent do practices during Ramadan or other Islamic traditions encourage conservation and mindfulness of resources?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Hinduism":
                System.out.println("To what extent does the reverence for rivers, mountains, and other natural elements in Hinduism affect your personal environmental behavior?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Buddhism":
                System.out.println("To what extent do aspects of your daily meditation or mindfulness practice contribute to your environmental awareness?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Atheism/Agnosticism":
                System.out.println("To what extent does a secular view of the world shape your perception of and responsibility toward the environment?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Other Faiths or Spiritual Beliefs":
                System.out.println("To what extent does your faith or spiritual belief system inspire you to engage with environmental issues?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
        switch (environment.getCurrent_Emotions()) {
            case "Hopeful":
                System.out.println("To what extent does feeling hopeful about the future influence your daily environmental choices and actions?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Anxious":
                System.out.println("To what extent do specific environmental concerns cause you anxiety, and how do you cope with these feelings?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Angry":
                System.out.println("To what extent does anger towards environmental injustices or negligence influence your activism or advocacy?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Indifferent":
                System.out.println("To what extent do certain factors contribute to your feelings of indifference toward environmental issues?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Inspired":
                System.out.println("To what extent do you translate your inspiration into tangible environmental contributions or changes?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Sad":
                System.out.println("To what extent does sadness over environmental degradation or loss affect your worldview and behaviors?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
        switch (environment.getEducational_Level()) {
            case "Primary Education":
                System.out.println("To what extent did your early education shape your initial understanding of the environment and its importance?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Secondary Education":
                System.out.println("To what extent do you apply the knowledge and skills gained from your secondary education to environmental concerns in your daily life?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Tertiary Education (Non-Environmental Field)":
                System.out.println("To what extent do you integrate environmental considerations into your field of study or work?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Tertiary Education (Environmental Field)":
                System.out.println("To what extent do you stay updated with the latest research and developments in the environmental field, and how do they influence your perspectives?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Continuing Education or Self-Taught":
                System.out.println("To what extent does your journey of continuous learning impact your sense of responsibility and capability in dealing with environmental challenges?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;


        }
        switch (environment.getEconomic_Indicators()) {
            case "Low Income":
                System.out.println("To what extent do you prioritize environmental concerns when faced with other financial pressures?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Middle Income":
                System.out.println("To what extent do you balance economic considerations with environmental impact in your daily choices?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "High Income":
                System.out.println("To what extent do you ensure that your affluent lifestyle is aligned with sustainable and ethical practices?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Financially Unstable":
                System.out.println("To what extent does financial instability affect your perspective and actions regarding environmental issues?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
        switch (environment.getSocial_Impact()) {
            case "Family Influence":
                System.out.println("To what extent do differences in environmental beliefs within your family impact your actions?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Peer Influence":
                System.out.println("To what extent do you engage in environmental discussions or activities with your friends, and what impact does this have on you?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Community and Cultural Influence":
                System.out.println("To what extent do you participate in or feel influenced by community-led environmental initiatives or cultural practices?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Workplace or Professional Influence":
                System.out.println("To what extent have you been inspired to take environmental action due to a professional experience or colleague's influence?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
            case "Media and Public Discourse Influence":
                System.out.println("To what extent do media portrayals and public discourse on environmental issues affect your perceptions and behaviors?");
                System.out.println("A  Not at all\t\tB  Slightly\t\tC  Moderately\t\tD  Strongly\t\tE  Extremely");
                auxiliary(key);
                break;
        }
    }

    public void Result(int macroSum, int microcosmicSum) {

        if (macroSum >= 20 && macroSum < 40) {
            System.out.println("The macro-climatic attitude of this individual sample is: Indifferent");
        }
        if (macroSum >= 40 && macroSum < 60) {
            System.out.println("The macro-climatic attitude of this individual sample is: Aware");
        }
        if (macroSum >= 60 && macroSum < 80) {
            System.out.println("The macro-climatic attitude of this individual sample is: Considerate");
        }
        if (macroSum >= 80 && macroSum < 100) {
            System.out.println("The macro-climatic attitude of this individual sample is: Committed");
        }
        if (macroSum == 100) {
            System.out.println("The macro-climatic attitude of this individual sample is: Champion");
        }

        if (microcosmicSum >= 16 && microcosmicSum < 32) {
            System.out.println("The micro-climatic attitude of this individual sample is: Indifferent");
        }
        if (microcosmicSum >= 32 && microcosmicSum < 48) {
            System.out.println("The micro-climatic attitude of this individual sample is: Indifferent");
        }
        if (microcosmicSum >= 48 && microcosmicSum < 64) {
            System.out.println("The micro-climatic attitude of this individual sample is: Indifferent");
        }
        if (microcosmicSum >= 64 && microcosmicSum < 80) {
            System.out.println("The micro-climatic attitude of this individual sample is: Indifferent");
        }
        if (microcosmicSum == 80) {
            System.out.println("The micro-climatic attitude of this individual sample is: Indifferent");
        }

    }

    public void auxiliary(char key) {
        key = (char) ('A' + random.nextInt(4));
        //key = Utility.readChar();
        if (key == 'A') {
            System.out.println(key);
            macroSum += 2;
            microcosmicSum += 2;
        } else if (key == 'B') {
            System.out.println(key);
            macroSum += 4;
            microcosmicSum += 4;
        } else if (key == 'C') {
            System.out.println(key);
            macroSum += 6;
            microcosmicSum += 6;
        } else if (key == 'D') {
            System.out.println(key);
            macroSum += 8;
            microcosmicSum += 8;
        } else {
            System.out.println(key);
            macroSum += 10;
            microcosmicSum += 10;
        }


    }


}


