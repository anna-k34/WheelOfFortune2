package wheeloffortune2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lauragarcia
 */
public class Phrase {
    private String question;
    private String hint;
    private String answer;

    public Phrase() {
        question = null;
        hint = null; 
        answer = null;
    }

    public Phrase(String question, String hint, String answer) {
        this.question = question;
        this.hint = hint;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean equals(Phrase p) {
        return (p.question.equalsIgnoreCase(question) && p.hint.equalsIgnoreCase(hint) && p.answer.equalsIgnoreCase(answer));
    }
    
    public Phrase clone() {
        Phrase p = new Phrase(question,hint,answer);
        return p;
    }
    
    public String toString() {
        return "Phrase{" + "question=" + question + ", hint=" + hint + ", answer=" + answer + '}';
    }
    
    
    
    
    
}
