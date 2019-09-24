
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Pblakenberg)
 * @version (92019)
 */
import java.util.Random;
public class SentenceBuilder
{
    String[] nouns = {"puppy", "egg","pizza", "snake","boy","girl","baby","doorbell","building", "mortal", "child", "extremist", "cooler", "freezer"};
    String[] verbs = {"jumps", "runs", "flies", "eats", "makes", "cooks", "swims", "wants", "bakes", "protests", "anhilates", "seeks", "scouts", "shoots", "bakes", "fries", "cuts", "codes", "builds"};
    String[] adjectives = {"burnt", "bright", "cool","little", "silly", "funny", "stuffy", "shady", "hopeful", "graceful", "red", "white", "green", "blue", "black", "brown", "purple", "commie", "cooked"};
    String[] determiners = {"The", "My", "Your", "His","Hers","Our","Their", "The Commune's"};
    String[] adverbs = {"quickly", "happily", "smoothly", "often", "incredibly", "never"};
    String[] prepositions = {"over","near","on top of","behind","next to","inside of", "under"};
    private String sentence = "";
    public SentenceBuilder() 
    {
        
    }
    public String randomArray(String[] array) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }
    public String returnSentence() {
        return buildNounPhrase() + buildVerbPhrase() + buildPrepositionalPhrase() + ".";
    }
    public String buildNounPhrase() {
        return randomArray(determiners) + " " + randomArray(adjectives) + " " + randomArray(nouns) +" ";
    }
    public String buildVerbPhrase() {
        return randomArray(adverbs) + " " +  randomArray(verbs) + " ";
    }
    public String buildPrepositionalPhrase() {
        return randomArray(prepositions) + " " + randomArray(determiners) + " " + randomArray(adjectives) + " " + randomArray(nouns)+ " ";
    }
}
