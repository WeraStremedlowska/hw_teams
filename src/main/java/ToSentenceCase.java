public class ToSentenceCase {

    public String toSentenceCase(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase();
    }
}
