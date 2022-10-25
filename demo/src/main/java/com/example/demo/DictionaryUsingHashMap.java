package com.example.demo;

import java.net.PortUnreachableException;
//import java.sql.*;
import java.util.HashMap;

public class DictionaryUsingHashMap {
    private HashMap<String, String> dictionary;

    DictionaryUsingHashMap(){
        dictionary = new HashMap<>();
        addWord("Famished", "extremly hungry");
        addWord("hobies", "love of life");
        addWord("family ", "Everything ");
        addWord("Music", "realise a stress");
        addWord("assimilate", "to learn something new");
        addWord("Cricket ", "is a game");
        addWord("angad", "im the meaning ✌");
        addWord("acciojob", "placement");
        addWord("aesthetic", "concered with beauty or art");
        addWord("Solitary ", "Alone");
        addWord("Almanack", "Diary");
        addWord("Serene", "Calm");
        addWord("Ecstatic", "Very excited");
        addWord("solitude", "Happy while being alone");
        addWord("dog", "opposite of cat");
        addWord("abc", "first letters of alphabet");
        addWord("deepfake", "An image or recording that has been convincingly altered to misrepresent someone as doing or saying something that was not actually done or said");
        addWord("de-extinction", "The (proposed or imagined) revival of an extinct species, typically by cloning or selective breeding.");
        addWord("deleter", "A person who or thing which deletes something.");
        addWord("delicense", "To deprive (a person, business, vehicle, etc.) of a license providing official permission to operate");
        addWord("denialism", "The policy or stance of denying the existence or reality of something, esp. something which is supported by the majority of scientific evidence.");
        addWord("denialist", "A person who denies the existence or reality of something, esp. something which is supported by the majority of scientific or historical evidence");
        addWord("destigmatizing", "The action or process of removing the negative connotation or social stigma associated with something");
        addWord("dof", "Stupid, dim-witted; uninformed, clueless.");
        addWord("droning", "The action of using a military drone or a similar commercially available device");
        addWord("e-bike", "An electric bike");
        addWord("eco-anxiety", "A state of stress caused by concern for the earth’s environment");
        addWord("enoughness", "The quality or fact of being enough; sufficiency, adequacy.");
        addWord("Epidemic curve", "A visual representation in the form of a graph or chart depicting the onset and progression of an outbreak of disease in a particular population");
        addWord("e-waste", "Worthless or inferior electronic text or content");
        addWord("fantoosh", "Fancy, showy, flashy; stylish, sophisticated; fashionable, exotic. Often used disparagingly, implying ostentation or pretentiousness.");
        addWord("forehead thermometer", "A thermometer that is placed on, passed over, or pointed at the forehead to measure a person’s body temperature.");
        addWord("franger", "A condom.");
        addWord("hair doughnut", "A doughnut-shaped sponge or similar material used as the support for a doughnut bun or similar updo");
        addWord("hench", "Of a person having a powerful, muscular physique; fit, strong.");
        addWord("hir", "Used as a gender-neutral possessive adjective (his/her/hir watch). In later use often corresponding to the subjective pronoun ze (he/she/ze wears a watch).");
        addWord("hygge", "A Danish word for a quality of cosiness that comes from doing simple things such as lighting candles, baking, or spending time at home with your family");
        addWord("influencer", "Someone who affects or changes the way that other people behave:");
        addWord("jerkweed", "An obnoxious, detestable, or stupid person (esp. a male). Often as a contemptuous form of address.");
        addWord("kvell", "Meaning to talk admiringly, enthusiastically, or proudly about something");
        addWord("kvetchy", "Given to or characterized by complaining or criticizing; ill-tempered, irritable.");
        addWord("LOL", "To laugh out loud; to be amused.");
        addWord("macaron", "A confection consisting of two small, round (usually colourful) biscuits with a meringue-like consistency");
        addWord("MacGyver", "To construct, fix, or modify (something) in an improvised or inventive way, typically by making use of whatever items are at hand");
        addWord("mama put", "A street vendor, typically a woman, selling cooked food at low prices from a handcart or stall. Also a street stall or roadside restaurant.");
        addWord("mentionitis", "A tendency towards repeatedly or habitually mentioning something (esp. the name of a person one is infatuated with), regardless of its relevance to the topic of conversation");
        addWord("microtarget", "To direct tailored advertisements, political messages, etc., at (people) based on detailed information about them");
        addWord("misgendering", "The action or fact of mistaking or misstating a person’s gender, esp. of addressing or referring to a transgender person in terms that do not reflect…");
        addWord("next tomorrow", "The day after tomorrow.");
        addWord("oat milk", "A milky liquid prepared from oats, used as a drink and in cooking");
        addWord("onboarding", "The action or process of integrating a new employee into an organ");
    }

    public boolean addWord(String word, String meaning){
        dictionary.put(word,meaning);
        return true;
    }

    public String findMeaning(String word){
        if(!dictionary.containsKey(word)){
            return "Given word not found";
        }
        else{
            return dictionary.get(word);
        }
    }

    /*public void connectToDatabase(){
        final String DB_URL = "jdbc:mysql://localhost:3306/my_dict";
        final String USER = "root";
        final String PASS = "Ranjan@122";

        System.out.println("Connecting to database");
        String newId = "select * from word_list";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(newId);
        ) {
            while (rs.next()) {
                //Display values
                System.out.println(rs.getInt("id") + rs.getString("word") + rs.getString("meaning")); //rs.getInt("rollno");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } */
}
