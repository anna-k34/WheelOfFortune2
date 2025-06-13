
/*
Wheel of Fortune Game
ICS4U Final project
Phrase class
 */
package wheeloffortune2;

public class Phrase {
    //encapsulation of attributes

    private String question;
    private String hint;
    private String answer;

    /**
     * Primary constructor for the Phrase
     */
    public Phrase() {
        //set the attributes to null
        question = null;
        hint = null;
        answer = null;
    }

    /**
     * Secondary constructor that creates a Phrase with a question, hint and
     * answer
     * @param question the prompt given to user
     * @param hint a hint if the user buys it
     * @param answer the phrase the user will try to solve
     */
    public Phrase(String question, String hint, String answer) {
        this.question = question;
        this.hint = hint;
        this.answer = answer;
    }

    /**
     * an accessor that returns the question prompt
     * @return the clue shown to the user
     */
    public String getQuestion() {
        return question;
    }

    /**
     * a mutator that sets the question prompt
     * @param question the clue to display
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * an accessor that returns the hint for the phrase.
     * @return the hint for the phrase
     */
    public String getHint() {
        return hint;
    }

    /**
     * a mutator that sets the hint for the phrase.
     * @param hint the hint for the user
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * an accessor that returns the phrase answer
     * @return the correct answer for phrase
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * a mutator that sets the phrase answer
     * @param answer the answer for phrase
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * method to check for the equality of the phrase and another phrase
     * @param p car to check equality with
     * @return whether phrases are identical or not
     */
    public boolean equals(Phrase p) {
        return (p.question.equalsIgnoreCase(question) && p.hint.equalsIgnoreCase(hint) && p.answer.equalsIgnoreCase(answer));
    }

    /**
     * cloning method that creates an identical phrase
     * @return identical phrase
     */
    public Phrase clone() {
        Phrase p = new Phrase(question, hint, answer);
        return p;
    }

    /**
     * To string method that returns formatted output
     * @return output that will be put into the file when saved
     */
    public String toString() {
        return "Phrase{" + "question=" + question + ", hint=" + hint + ", answer=" + answer + '}';
    }

}
