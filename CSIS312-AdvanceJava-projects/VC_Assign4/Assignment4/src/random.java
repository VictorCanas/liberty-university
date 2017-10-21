/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */

//Import the random 
import java.util.Random;

public class random {
 
    private static class Word {

        //The article array must contain the articles “the,” “a,” “one,” “some,” and “any.” 
        public static String[] article = {"the", "a", "one", "some", "any"};
        //The noun array must contain the nouns “boy,” “girl,” “dog,” “town,” and “car.” 
        public static String[] noun = {"boy", "girl", "dog", "town", "car"};
        //The verb array must contain the verbs “drove,” “jumped,” “ran,” “walked,” and “skipped.”
        public static String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        //The preposition array must contain the prepositions “to,” “from,” “over,” “under” and “on.”
        public static String[] preposition = {"to", "from", "over", "under", "on"};
        
        public static Random random = new Random(System.currentTimeMillis());

        public static String getArticle() {
            return article[random.nextInt(article.length)];
        }

        public static String getNoun() {
            return noun[random.nextInt(noun.length)];
        }

        public static String getVerb() {
            return verb[random.nextInt(verb.length)];
        }

        public static String getPreposition() {
            return preposition[random.nextInt(preposition.length)];
        }

    }

    public String getRandom() {
        StringBuilder random = new StringBuilder();
        String s = Word.getArticle();
        String firstWord = s.charAt(0) + "";
        firstWord = firstWord.toUpperCase();
        for (int j = 1; j < s.length(); j++) {
            firstWord += s.charAt(j);
        }
        random.append(firstWord).append(" ");

        random.append(Word.getNoun()).append(" ");
        random.append(Word.getVerb()).append(" ");
        random.append(Word.getPreposition()).append(" ");
        random.append(Word.getArticle()).append(" ");
        random.append(Word.getNoun()).append(".");
        return random.toString();
    }

}

 
