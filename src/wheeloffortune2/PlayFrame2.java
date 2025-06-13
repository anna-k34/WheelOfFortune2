/*
Wheel of Fortune Game
ICS4U final project
Play Frame 2-Guessing Board
 */
package wheeloffortune2;
//import statements to be used through the code

import java.awt.TextField;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlayFrame2 extends javax.swing.JFrame {

    //private variables that will be used throughout the frame
    //playframes for the previous + next screens
    private PlayFrame1 firstFrame;
    private PlayFrame3 thirdFrame;
    private PlayFrame4 fourthFrame;
    //button & textField variables
    private TextField letters[];
    private JTextField clue;
    private JButton hintBtn;
    private JButton vowelBtn;
    private JButton consBtn;
    private JTextField hint;
    private JTextField guessPhrase;
    //other variables
    private Player player;
    private Phrase p;
    private int currentTotal;
    private String answer;
    private int spinMoney;
    private DecimalFormat money;
    private int guessesLeft = 6;
    private int totalMoney;
    private ArrayList<Character> guessedLetters;

    //create this frame using the first play screen (wheel) as it is invoked after that screen
    public PlayFrame2(PlayFrame1 f) {
        //new decimalformat for money formatting
        money = new DecimalFormat("$#,##0.00");
        initComponents();
        firstFrame = f;
        //get the previous data stored about the player from the previous screen
        player = firstFrame.getPlayer();
        //add the letters (boxes on screen) to the textField arrayList
        letters = new TextField[]{letter0, letter1, letter2, letter3, letter4, letter5, letter6, letter7,
            letter8, letter9, letter10, letter11, letter12, letter13, letter14, letter15, letter16, letter17,
            letter18, letter19, letter20, letter21, letter22, letter23, letter24, letter25};
        //get clue, hint and phrase from the text fields previously set in the last screen
        clue = clueField;
        hint = hintTextField;
        hintBtn = hintButton;
        guessPhrase = phraseTextField;
        //get the phrase & answer the user has to guess
        p = firstFrame.getPhrase();
        answer = p.getAnswer();
        //get the spin money from what the user landed on in the previous screen
        spinMoney = firstFrame.getSpinMoney();
        //set the labels to the # of guesses user has left and totalMoney
        totalMoneyLabel.setText("Total money:   " + money.format(player.getHighscore()));
        //set the phrase and hint text field to nothing so that the user can reenter their answer without deleting previously
        //set text from a different spin
        phraseTextField.setText("");
        hintTextField.setText("");
        guessesLeft = 6;
        guessesLeftLabel.setText("Guesses left:    " + guessesLeft);
        guessedLetters = new ArrayList<>();

    }

    /**
     * Accessor that returns the array of letter text fields.
     *
     * @return array of TextFields for the letter board
     */
    public TextField[] getLetters() {
        return letters;
    }

    /**
     * Accessor that returns the players high score from p-in case the getter
     * from class isn't working in some cases
     *
     * @return player's current highscore
     */
    public int getHighscore() {
        return player.getHighscore();
    }

    /**
     * Accessor that returns the Player object, defined by username, highscore,
     * and spins left.
     *
     * @return Player object for current user
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Accessor that returns the clue input field.
     *
     * @return JTextField used to display the clue
     */
    public JTextField getClueField() {
        return clueField;
    }

    /**
     * Accessor that returns the first play frame (with the wheel)
     *
     * @return first frame-PlayFrame 1 object
     */
    public PlayFrame1 getFirstFrame() {
        return firstFrame;
    }

    /**
     * Accessor that returns the current total score of the round
     *
     * @return current total score
     */
    public int getCurrentTotal() {
        return currentTotal;
    }

    /**
     * Accessor that returns the field where the user guesses the phrase .
     *
     * @return jtextfield for guess phrase input
     */
    public JTextField getGuessPhrase() {
        return guessPhrase;
    }

    /**
     * Accessor that returns the hint text field
     *
     * @return jTextfield for hint
     */
    public JTextField getHint() {
        return hint;
    }

    /**
     * Accessor that returns the button used for hint
     *
     * @return jButton for hint
     */
    public JButton getHintBtn() {
        return hintBtn;
    }

    /**
     * Mutator that sets the Phrase object being used
     *
     * @param p Phrase object used
     */
    public void setP(Phrase p) {
        this.p = p;
    }

    /**
     * Mutator that sets the answer to the answer stored in the Phrase object
     *
     * @param answer phrase answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * Accessor that returns the guess a consonant button
     *
     * @return jButton for consonant
     */
    public JButton getGuessConsonantButton() {
        return guessConsonantButton;
    }

    /**
     * Accessor that returns the guess a vowel button
     *
     * @return jButton for vowel
     */
    public JButton getGuessVowelButton() {
        return guessVowelButton;
    }

    /**
     * Accessor that returns the number of letter guesses that the user has left
     *
     * @return remaining guesses
     */
    public int getGuessesLeft() {
        return guessesLeft;
    }

    /**
     * mutator that sets the number of letter guesses the user has left
     *
     * @param guessesLeft remaining guesses
     */
    public void setGuessesLeft(int guessesLeft) {
        this.guessesLeft = guessesLeft;
    }
    /**
     * Accessor for the guessesleft label to be used in previous screen
     * @return the guesses left jlabel
     */
    public JLabel getGuessesLeftLabel() {
        return guessesLeftLabel;
    }

    /**
     * an accessor method that returns the consonants JTextField to be used in
     * another frame
     *
     * @return the consonants JtextField
     */
    public JTextField getConsField1() {
        return consField1;
    }

    /**
     * an accessor method that returns the vowels JTextField to be used in
     * another
     *
     * @return the vowels JTextField
     */
    public JTextField getVowelField() {
        return vowelField;
    }

    /**
     * an accessor
     *
     * @return
     */
    public JLabel getTotalMoneyLabel() {
        return totalMoneyLabel;
    }
    /**
     * Accessor for the gameplay window
     * @return the first window
     */
    public GamePlay getGamePlay() {
        return firstFrame.getFirstWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        totalMoneyLabel = new javax.swing.JLabel();
        guessVowelButton = new javax.swing.JButton();
        guessesLeftLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        letter0 = new java.awt.TextField();
        letter1 = new java.awt.TextField();
        letter2 = new java.awt.TextField();
        letter3 = new java.awt.TextField();
        letter4 = new java.awt.TextField();
        letter5 = new java.awt.TextField();
        letter6 = new java.awt.TextField();
        letter7 = new java.awt.TextField();
        letter8 = new java.awt.TextField();
        letter9 = new java.awt.TextField();
        letter10 = new java.awt.TextField();
        letter11 = new java.awt.TextField();
        letter12 = new java.awt.TextField();
        letter13 = new java.awt.TextField();
        letter14 = new java.awt.TextField();
        letter15 = new java.awt.TextField();
        letter16 = new java.awt.TextField();
        letter17 = new java.awt.TextField();
        letter18 = new java.awt.TextField();
        letter19 = new java.awt.TextField();
        letter20 = new java.awt.TextField();
        letter21 = new java.awt.TextField();
        letter22 = new java.awt.TextField();
        letter23 = new java.awt.TextField();
        letter24 = new java.awt.TextField();
        letter25 = new java.awt.TextField();
        nameLabel = new javax.swing.JLabel();
        vowelField = new javax.swing.JTextField();
        consLabel = new javax.swing.JLabel();
        consField1 = new javax.swing.JTextField();
        guessConsonantButton = new javax.swing.JButton();
        hintButton = new javax.swing.JButton();
        hintTextField = new javax.swing.JTextField();
        guessPhraseLabel = new javax.swing.JLabel();
        phraseTextField = new javax.swing.JTextField();
        guessPhraseButton = new javax.swing.JButton();
        noEditHintLabel = new javax.swing.JLabel();
        hintLabel = new javax.swing.JLabel();
        clueField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        totalMoneyLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        totalMoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalMoneyLabel.setText("Total Money:");
        totalMoneyLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        guessVowelButton.setBackground(new java.awt.Color(255, 255, 102));
        guessVowelButton.setFont(new java.awt.Font("MS UI Gothic", 1, 21)); // NOI18N
        guessVowelButton.setForeground(new java.awt.Color(0, 51, 204));
        guessVowelButton.setText("Guess ($300)");
        guessVowelButton.setToolTipText("");
        guessVowelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessVowelButtonActionPerformed(evt);
            }
        });

        guessesLeftLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        guessesLeftLabel.setForeground(new java.awt.Color(255, 255, 255));
        guessesLeftLabel.setText("Guesses Left:");
        guessesLeftLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        letter0.setBackground(new java.awt.Color(255, 0, 0));
        letter0.setEditable(false);
        letter0.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter0.setForeground(new java.awt.Color(255, 255, 255));
        letter0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter0ActionPerformed(evt);
            }
        });

        letter1.setBackground(new java.awt.Color(255, 0, 0));
        letter1.setEditable(false);
        letter1.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter1.setForeground(new java.awt.Color(255, 255, 255));

        letter2.setBackground(new java.awt.Color(255, 0, 0));
        letter2.setEditable(false);
        letter2.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter2.setForeground(new java.awt.Color(255, 255, 255));

        letter3.setBackground(new java.awt.Color(255, 0, 0));
        letter3.setEditable(false);
        letter3.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter3.setForeground(new java.awt.Color(255, 255, 255));

        letter4.setBackground(new java.awt.Color(255, 0, 0));
        letter4.setEditable(false);
        letter4.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter4.setForeground(new java.awt.Color(255, 255, 255));

        letter5.setBackground(new java.awt.Color(255, 0, 0));
        letter5.setEditable(false);
        letter5.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter5.setForeground(new java.awt.Color(255, 255, 255));
        letter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letter5ActionPerformed(evt);
            }
        });

        letter6.setBackground(new java.awt.Color(255, 0, 0));
        letter6.setEditable(false);
        letter6.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter6.setForeground(new java.awt.Color(255, 255, 255));

        letter7.setBackground(new java.awt.Color(255, 0, 0));
        letter7.setEditable(false);
        letter7.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter7.setForeground(new java.awt.Color(255, 255, 255));

        letter8.setBackground(new java.awt.Color(255, 0, 0));
        letter8.setEditable(false);
        letter8.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter8.setForeground(new java.awt.Color(255, 255, 255));

        letter9.setBackground(new java.awt.Color(255, 0, 0));
        letter9.setEditable(false);
        letter9.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter9.setForeground(new java.awt.Color(255, 255, 255));

        letter10.setBackground(new java.awt.Color(255, 0, 0));
        letter10.setEditable(false);
        letter10.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter10.setForeground(new java.awt.Color(255, 255, 255));

        letter11.setBackground(new java.awt.Color(255, 0, 0));
        letter11.setEditable(false);
        letter11.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter11.setForeground(new java.awt.Color(255, 255, 255));

        letter12.setBackground(new java.awt.Color(255, 0, 0));
        letter12.setEditable(false);
        letter12.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter12.setForeground(new java.awt.Color(255, 255, 255));

        letter13.setBackground(new java.awt.Color(255, 0, 0));
        letter13.setEditable(false);
        letter13.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter13.setForeground(new java.awt.Color(255, 255, 255));

        letter14.setBackground(new java.awt.Color(255, 0, 0));
        letter14.setEditable(false);
        letter14.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter14.setForeground(new java.awt.Color(255, 255, 255));

        letter15.setBackground(new java.awt.Color(255, 0, 0));
        letter15.setEditable(false);
        letter15.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter15.setForeground(new java.awt.Color(255, 255, 255));

        letter16.setBackground(new java.awt.Color(255, 0, 0));
        letter16.setEditable(false);
        letter16.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter16.setForeground(new java.awt.Color(255, 255, 255));

        letter17.setBackground(new java.awt.Color(255, 0, 0));
        letter17.setEditable(false);
        letter17.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter17.setForeground(new java.awt.Color(255, 255, 255));

        letter18.setBackground(new java.awt.Color(255, 0, 0));
        letter18.setEditable(false);
        letter18.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter18.setForeground(new java.awt.Color(255, 255, 255));

        letter19.setBackground(new java.awt.Color(255, 0, 0));
        letter19.setEditable(false);
        letter19.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter19.setForeground(new java.awt.Color(255, 255, 255));

        letter20.setBackground(new java.awt.Color(255, 0, 0));
        letter20.setEditable(false);
        letter20.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter20.setForeground(new java.awt.Color(255, 255, 255));

        letter21.setBackground(new java.awt.Color(255, 0, 0));
        letter21.setEditable(false);
        letter21.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter21.setForeground(new java.awt.Color(255, 255, 255));

        letter22.setBackground(new java.awt.Color(255, 0, 0));
        letter22.setEditable(false);
        letter22.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter22.setForeground(new java.awt.Color(255, 255, 255));

        letter23.setBackground(new java.awt.Color(255, 0, 0));
        letter23.setEditable(false);
        letter23.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter23.setForeground(new java.awt.Color(255, 255, 255));

        letter24.setBackground(new java.awt.Color(255, 0, 0));
        letter24.setEditable(false);
        letter24.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter24.setForeground(new java.awt.Color(255, 255, 255));

        letter25.setBackground(new java.awt.Color(255, 0, 0));
        letter25.setEditable(false);
        letter25.setFont(new java.awt.Font("MS UI Gothic", 1, 60)); // NOI18N
        letter25.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(letter0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(letter13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letter24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(letter25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(letter12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letter13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter24, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letter25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.setBackground(new java.awt.Color(255, 255, 102));
        nameLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 102));
        nameLabel.setText("Guess Vowel:   ");

        vowelField.setBackground(new java.awt.Color(255, 255, 105));
        vowelField.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        vowelField.setForeground(new java.awt.Color(0, 51, 204));
        vowelField.setToolTipText("");

        consLabel.setBackground(new java.awt.Color(255, 255, 102));
        consLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        consLabel.setForeground(new java.awt.Color(255, 255, 102));
        consLabel.setText("Guess Consonant: ");

        consField1.setBackground(new java.awt.Color(255, 255, 105));
        consField1.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        consField1.setForeground(new java.awt.Color(0, 51, 204));
        consField1.setToolTipText("");

        guessConsonantButton.setBackground(new java.awt.Color(255, 255, 102));
        guessConsonantButton.setFont(new java.awt.Font("MS UI Gothic", 1, 21)); // NOI18N
        guessConsonantButton.setForeground(new java.awt.Color(0, 51, 204));
        guessConsonantButton.setText("Guess");
        guessConsonantButton.setToolTipText("");
        guessConsonantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessConsonantButtonActionPerformed(evt);
            }
        });

        hintButton.setBackground(new java.awt.Color(255, 255, 102));
        hintButton.setFont(new java.awt.Font("MS UI Gothic", 1, 21)); // NOI18N
        hintButton.setForeground(new java.awt.Color(0, 51, 204));
        hintButton.setText("Get Hint ($500)");
        hintButton.setToolTipText("");
        hintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButtonActionPerformed(evt);
            }
        });

        hintTextField.setEditable(false);
        hintTextField.setBackground(new java.awt.Color(0, 51, 204));
        hintTextField.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        hintTextField.setForeground(new java.awt.Color(255, 255, 102));
        hintTextField.setToolTipText("");
        hintTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintTextFieldActionPerformed(evt);
            }
        });

        guessPhraseLabel.setBackground(new java.awt.Color(255, 255, 102));
        guessPhraseLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        guessPhraseLabel.setForeground(new java.awt.Color(255, 255, 102));
        guessPhraseLabel.setText("Guess Phrase: ");

        phraseTextField.setBackground(new java.awt.Color(255, 255, 105));
        phraseTextField.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        phraseTextField.setForeground(new java.awt.Color(0, 51, 204));
        phraseTextField.setToolTipText("");

        guessPhraseButton.setBackground(new java.awt.Color(255, 255, 102));
        guessPhraseButton.setFont(new java.awt.Font("MS UI Gothic", 1, 21)); // NOI18N
        guessPhraseButton.setForeground(new java.awt.Color(0, 51, 204));
        guessPhraseButton.setText("Guess Phrase");
        guessPhraseButton.setToolTipText("");
        guessPhraseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessPhraseButtonActionPerformed(evt);
            }
        });

        noEditHintLabel.setBackground(new java.awt.Color(255, 255, 255));
        noEditHintLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        noEditHintLabel.setForeground(new java.awt.Color(255, 255, 255));
        noEditHintLabel.setText("CLUE:");

        hintLabel.setBackground(new java.awt.Color(255, 255, 255));
        hintLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        hintLabel.setForeground(new java.awt.Color(255, 255, 255));

        clueField.setFont(new java.awt.Font("MS UI Gothic", 1, 20)); // NOI18N
        clueField.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(guessVowelButton)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nameLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(vowelField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(consLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(guessConsonantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(guessesLeftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hintButton)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guessPhraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(guessPhraseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phraseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(noEditHintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(clueField, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(hintLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clueField)
                    .addComponent(noEditHintLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(vowelField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessesLeftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(guessVowelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(consLabel)
                            .addComponent(consField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guessConsonantButton)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hintButton)
                            .addComponent(hintTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guessPhraseLabel)
                            .addComponent(phraseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(guessPhraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method that is invoked whenever the user presses the guess vowel or guess
     * consonant button & the letter isn't valid/isn't in phrase It tracks how
     * many guesses the user has left and tracks if they get too low
     */
    public void countGuesses() {
        //if the guesses left are greater than 2 (starts at 6)
        if (guessesLeft > 2) {
            //take one off of the count
            guessesLeft -= 1;
            //set the label to the new number of guesses left
            guessesLeftLabel.setText("Guesses left:    " + guessesLeft);
        } else if (guessesLeft == 2) {
            //if there are two guesses left, take one off then warn the user that they only have one left now
            guessesLeft -= 1;
            guessesLeftLabel.setText("Guesses left:    " + guessesLeft);
            JOptionPane.showMessageDialog(null, "You have one more guess, choose carefully");
        } else if (guessesLeft == 1) {
            //if there's only one guess left, take one off the counter and then tell the user they must guess the phrase
            guessesLeft -= 1;
            guessesLeftLabel.setText("Guesses left:    " + guessesLeft);
            JOptionPane.showMessageDialog(null, "That was your last guess, you must guess the phrase now");
            //set all buttons to false so they can't guess any more letters/get a hint
            guessVowelButton.setEnabled(false);
            guessConsonantButton.setEnabled(false);
            hintButton.setEnabled(false);
            //set the text field edibility to false so the user can't type anything in the guess boxes
            consField1.setEditable(false);
            vowelField.setEditable(false);
        }

    }

    private void guessVowelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessVowelButtonActionPerformed
        //if the guess vowel button is clicked, error check to make sure the user entered a valid letter
        //take away $300, and then check to see if vowel is in the phrase
        //then, set the textfield where the vowel is to its letter

        //first declare necessary variables
        boolean letterCheck;
        int vowValue;
        char vowel;
        char answerLetter;
        int count = 0;
        String checkVowel = vowelField.getText();
        boolean equals = false;
        totalMoney = player.getHighscore();

        //if the totalmoney is greater than 300 than the vowel can be bought
        if (totalMoney >= 300) {
            //take away 300 from total money
            totalMoney -= 300;
            //if the user enters more than one character, the letter can't be found-display error statement
            if (checkVowel.length() != 1) {
                JOptionPane.showMessageDialog(null, "You can only answer one vowel at a time!", "Error", JOptionPane.ERROR_MESSAGE);
                countGuesses();

            } else {
                vowel = checkVowel.charAt(0);
                letterCheck = Character.isLetter(vowel);
                //if the letter isn't a letter-display error statement 
                if (!letterCheck) {
                    JOptionPane.showMessageDialog(null, "That is not a letter, let alone a vowel! Try again", "Error", JOptionPane.ERROR_MESSAGE);
                    countGuesses();
                    //otherwise-continue with the error checking
                } else {
                    vowValue = Character.getNumericValue(vowel);
                    //check the letter's numerical values to see if its actually a vowel-if its a consonant display error message
                    if (vowValue != 10 && vowValue != 14 && vowValue != 18 && vowValue != 24 && vowValue != 30) {
                        JOptionPane.showMessageDialog(null, "That is a consonant not a vowel!", "Error", JOptionPane.ERROR_MESSAGE);
                        countGuesses();

                    } else {
                        //check if they have already guesses this vowel
                        if (guessedLetters.contains(Character.toLowerCase(vowel))) {
                            //they have output an error message and deduct a guess
                            JOptionPane.showMessageDialog(null, "You already guessed that vowel!", "Error", JOptionPane.ERROR_MESSAGE);
                            countGuesses();
                            //reset the text field to nothing so that the user can guess again 
                            vowelField.setText("");
                            //the user repeated a guess, there is no need to execute the rest of the code for this button
                            return;
                        } else {//they have not guessed the vowel
                            for (int i = 0; i < answer.length(); i++) {
                                //go through the answer and set the comparison to each letter in the answer
                                answerLetter = answer.charAt(i);
                                if (Character.toLowerCase(answerLetter) == Character.toLowerCase(vowel)) {
                                    //if any of the answer letters equal the letter the user entered set the letter text field at that index to the letter
                                    letters[i].setText(Character.toString((Character.toUpperCase(vowel))));
                                    count++;
                                    equals = true;
                                }

                            }

                        }
                        //check to see if letter was found in phrase-if it wasn't display error message
                        if (!equals) {
                            JOptionPane.showMessageDialog(null, "Letter not present in phrase");
                            countGuesses();
                            //if letter was found in phrase, add the spinMoney multiplied by the number of times it was found to the totalMoney count
                        } else {
                            totalMoney += spinMoney * count;
                        }
                        
                        guessedLetters.add(Character.toLowerCase(vowel));//add the letter to the guessed letter array list

                    }

                }

            }
            //if the user has less than $300, they can't buy a vowel
        } else {
            JOptionPane.showMessageDialog(null, "You do not have enough money to buy a vowel", "Error", JOptionPane.ERROR_MESSAGE);
            countGuesses();
        }
        //reset the text field to nothing so that the user can guess again 
        vowelField.setText("");
        //set the totalMoneyLabel to the new total
        totalMoneyLabel.setText("Total money: " + money.format(totalMoney));
        //set the new high score in the player class
        player.setHighscore(totalMoney);

    }//GEN-LAST:event_guessVowelButtonActionPerformed

    private void guessConsonantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessConsonantButtonActionPerformed
        //if the guess consonant button is clicked, error check to make sure the user entered a valid letter, 
        //check to see if vowel is in the phrase then set the textfield where the consonant is to its letter

        //first declare necessary variables 
        boolean letterCheck;
        int consValue;
        String checkConsonant = consField1.getText();
        char consonant;
        char answerLetter;
        int count = 0;
        boolean equals = false;
        totalMoney = player.getHighscore();

        //first check if the length is greater than one character
        if (checkConsonant.length() != 1) {
            //if it is display error message
            JOptionPane.showMessageDialog(null, "You can only answer one consonant at a time!", "Error", JOptionPane.ERROR_MESSAGE);
            countGuesses();

        } else {
            consonant = checkConsonant.charAt(0);
            letterCheck = Character.isLetter(consonant);

            if (!letterCheck) {
                //if the letter isn't a letter-display error statement 
                JOptionPane.showMessageDialog(null, "That is not a letter, let alone a consonant! Try again", "Error", JOptionPane.ERROR_MESSAGE);
                countGuesses();
            } else {
                consValue = Character.getNumericValue(consonant);
                //check to see if the letter entered is actually a consonant or if its a vowel
                if (consValue == 10 || consValue == 14 || consValue == 18 || consValue == 24 || consValue == 30) {
                    JOptionPane.showMessageDialog(null, "That is a vowel not a consonant!", "Error", JOptionPane.ERROR_MESSAGE);
                    countGuesses();
                } else {
                    //check if they have already guesses this consonant
                    if (guessedLetters.contains(Character.toLowerCase(consonant))) {
                        //they have output an error message and deduct a guess
                        JOptionPane.showMessageDialog(null, "You already guessed that consonant!", "Error", JOptionPane.ERROR_MESSAGE);
                        countGuesses();
                        //set the field to nothing so the user can reguess
                        consField1.setText("");
                        //the user repeated a guess, there is no need to execute the rest of the code for this button
                        return;
                    } else {
                        for (int i = 0; i < answer.length(); i++) {
                            //for each letter in the phrase, check to see if it equasl the letter that the user entereed
                            answerLetter = answer.charAt(i);
                            if (Character.toLowerCase(answerLetter) == Character.toLowerCase(consonant)) {
                                //if it does, set the text field(s) wtih the vowel entered
                                letters[i].setText(Character.toString((Character.toUpperCase(consonant))));
                                count++;
                                equals = true;
                            }

                        }

                    }
                    //if the letter isn't found in phrase output statement
                    if (!equals) {
                        JOptionPane.showMessageDialog(null, "Letter not present in phrase");
                        countGuesses();
                    } else {
                        //otherwise, multiplly the number of letters found by the spin money and add it to the totalMoney var
                        totalMoney += spinMoney * count;
                    }
                    
                    guessedLetters.add(Character.toLowerCase(consonant));//add the letter to the guessed letters array list

                }
            }

        }
        //set the field to nothing so the user can reguess
        consField1.setText("");
        //set the moneylabel to the new totalMoney
        totalMoneyLabel.setText("Total Money:  " + money.format(totalMoney));
        //set the new high score in the player class
        player.setHighscore(totalMoney);

    }//GEN-LAST:event_guessConsonantButtonActionPerformed

    private void hintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButtonActionPerformed
        totalMoney = player.getHighscore();
        //if the user presses the hint button-check to see if they have more than 500 in their totalMoney
        if (totalMoney >= 500) {
            //take 500 away
            totalMoney -= 500;
            //set the hint field to the hint found in the Player object
            hintTextField.setText(p.getHint());
            //set the button to false so the user can't buy the hint again
            hintButton.setEnabled(false);
        } else {
            //the user doesn't a have any money to buy the hint-nothing happens
            JOptionPane.showMessageDialog(null, "You do not have enough money to buy a hint", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //set the total money label to the new number
        totalMoneyLabel.setText("Total Money: " + money.format(totalMoney));
        //set the new high score in the player class
        player.setHighscore(totalMoney);

    }//GEN-LAST:event_hintButtonActionPerformed

    private void hintTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hintTextFieldActionPerformed

    private void guessPhraseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessPhraseButtonActionPerformed

        JLabel correct;
        guessedLetters.clear();
        //if there are more spins left-go to the the third frame instead of the fourth
        if (player.getSpinsLeft() != 0) {
            if (thirdFrame == null) {
                //create a new third frame using PlayFrame3
                thirdFrame = new PlayFrame3(this);
            }
            //set the phraseAnswer on the next screen to what the answer of the phrase is
            JLabel phraseAnswer = thirdFrame.getPhraseAnswerLabel();
            phraseAnswer.setText(answer);

            //initialize the correct var with the correct label from the third frame 
            correct = thirdFrame.getCorrectLabel();
            //if the user enters the right answer:
            if (answer.equalsIgnoreCase(phraseTextField.getText())) {
                //set the label in the next screen to correct
                correct.setText("That is correct!");
                //multiply the spinMoney by 3 as a prize
                totalMoney += spinMoney * 3;
                //set the highscore because they won prize money
                player.setHighscore(totalMoney);
            } else {
                //set the label in the next screen to incorrect
                correct.setText("That is incorrect!");
            }

            //set the current earnings label in the previous screen to the user's current total money
            firstFrame.getCurrentEarningsLabel1().setText(money.format(totalMoney));
            //set the label in the next screen to the user's current total money
            thirdFrame.getTotalMoneyLabel().setText(money.format(totalMoney));
            //set the frame's visibility to true so it appears
            thirdFrame.setVisible(true);
            //set this frame's visibilty to false so it disappears
            this.setVisible(false);

        } else {
            //if the user doesn't have spins left-they go to the final (fourth) screen when they press next
            if (fourthFrame == null) {
                //create a new playFrame 4 using this frame
                fourthFrame = new PlayFrame4(this);
                //set the answer label on the fourth frame to the phrase ans
                JLabel phraseAnswer = fourthFrame.getPhraseAnswerLabel();
                phraseAnswer.setText(answer);

            }
            //use the previous code to determine if the phrase was correct
            correct = fourthFrame.getCorrectLabel();
            //if the answer is correct-set label as so
            if (answer.equalsIgnoreCase(phraseTextField.getText())) {
                correct.setText("That is correct!");
                //multiply the spinMoney by 3 as a prize
                totalMoney += spinMoney * 3;
                //set the highscore because they won prize money
                player.setHighscore(totalMoney);
                //otherwise set label to it's incorrect
            } else {
                correct.setText("That is incorrect!");
            }
            fourthFrame.getTotalMoneyLabel().setText(money.format(player.getHighscore()));
            //make the fourth frame visible
            fourthFrame.setVisible(true);
            //make this frame invisible
            this.setVisible(false);
        }


    }//GEN-LAST:event_guessPhraseButtonActionPerformed

    private void letter0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter0ActionPerformed

    private void letter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letter5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letter5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clueField;
    private javax.swing.JTextField consField1;
    private javax.swing.JLabel consLabel;
    private javax.swing.JButton guessConsonantButton;
    private javax.swing.JButton guessPhraseButton;
    private javax.swing.JLabel guessPhraseLabel;
    private javax.swing.JButton guessVowelButton;
    private javax.swing.JLabel guessesLeftLabel;
    private javax.swing.JButton hintButton;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JTextField hintTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField letter0;
    private java.awt.TextField letter1;
    private java.awt.TextField letter10;
    private java.awt.TextField letter11;
    private java.awt.TextField letter12;
    private java.awt.TextField letter13;
    private java.awt.TextField letter14;
    private java.awt.TextField letter15;
    private java.awt.TextField letter16;
    private java.awt.TextField letter17;
    private java.awt.TextField letter18;
    private java.awt.TextField letter19;
    private java.awt.TextField letter2;
    private java.awt.TextField letter20;
    private java.awt.TextField letter21;
    private java.awt.TextField letter22;
    private java.awt.TextField letter23;
    private java.awt.TextField letter24;
    private java.awt.TextField letter25;
    private java.awt.TextField letter3;
    private java.awt.TextField letter4;
    private java.awt.TextField letter5;
    private java.awt.TextField letter6;
    private java.awt.TextField letter7;
    private java.awt.TextField letter8;
    private java.awt.TextField letter9;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noEditHintLabel;
    private javax.swing.JTextField phraseTextField;
    private javax.swing.JLabel totalMoneyLabel;
    private javax.swing.JTextField vowelField;
    // End of variables declaration//GEN-END:variables
}
