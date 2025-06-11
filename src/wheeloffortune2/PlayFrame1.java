/**
 * Wheel of Fortune Game
 * ICS4U Final Project
 * PlayFrame1-Spin Wheel
 */
package wheeloffortune2;
//import statements to use throughout frame

import java.awt.Color;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.*;

public class PlayFrame1 extends javax.swing.JFrame {

    //decalre private variables that will be used throughout the frame
    private PlayFrame2 secondFrame;
    GamePlay firstWindow;
    private PlayFrame3 thirdFrame;
    private String username;
    private int highscore;
    private ArrayList<Phrase> phrases;
    private Phrase p;
    private SelectionWheel selectionWheel;
    private Player player;
    private int spinMoney;
    private int spinsLeft;
    private JButton spin;
    private JButton guess;

    //create this frame using the GamePlay/homescreen as it is invoked after that screen
    public PlayFrame1(GamePlay f) {
        //new DecimalFormat object for the money formatting
        DecimalFormat money = new DecimalFormat("$0.00");
        firstWindow = f;

        //This if statement determines which frame the player should be called from 
        //because this game loops through the playFrame screens 3 times, after the first 'spin', the Player should come from the thirdFrame
        //however, if it is the first spin, the Player should come from the gamePlay/homescreen
        //check which case it is by determing if the third frame is null or not
        if (thirdFrame != null) {
            player = thirdFrame.getPlayer();
        } else {
            player = firstWindow.getPlayer();

        }
        //assign the the spinsLeft and highScore from the Player object to variables 
        spinsLeft = player.getSpinsLeft();
        highscore = player.getHighscore();
        //From the gamePlay screen, assign the username and phrases to variables
        username = firstWindow.getUsername();
        phrases = firstWindow.getPhrases();

        initComponents();
        //set the the labels to default text
        currentEarningsLabel.setText("Current Earnings:  ");
        spinsLeftLabel.setText("Spins Left:    " + spinsLeft);

        try {
            ArrayList<String> list = new ArrayList<String>();
            list.add("$600");
            list.add("$500");
            list.add("$550");
            list.add("$600");
            list.add("$650");
            list.add("Bankruptcy");
            list.add("$650");
            list.add("$500");
            list.add("$600");
            list.add("$650");
            list.add("Bankruptcy");
            list.add("$550");
            list.add("$600");
            list.add("$650");
            list.add("Bankruptcy");

            selectionWheel = new SelectionWheel(list);
            selectionWheel.hasBorders(true);

            wheelPanel.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER, 0, 0));
            wheelPanel.add(selectionWheel);

        } catch (Exception e) {
            e.printStackTrace();
        }

        wheelPanel.revalidate();
        wheelPanel.repaint();
        spin = spinButton1;
        guess = guessPhraseButton;

    }

    /**
     * Accessor that returns the username that is assigned to the Player object
     * This is necessary because sometimes variables don't update in the next
     * screen if they're just stored in the Player object
     *
     * @return the username of current player
     */
    public String getUsername() {
        return username;
    }

    /**
     * Accessor that returns the Player object, defined by username, highscore,
     * and spins left
     *
     * @return Player object for current user
     */
    public Player getPlayer() {
        return firstWindow.getPlayer();
    }

    /**
     * Accessor that returns the money that the user will use in the next frame
     * to determine how much they win for every right answer
     *
     * @return what the ticker landed on when the user spun the wheel
     */
    public int getSpinMoney() {
        return spinMoney;
    }

    /**
     * Accessor that returns how many spins/'rounds' the user has remaining in
     * the game
     *
     * @return int of rounds left
     */
    public int getSpinsLeft() {
        return spinsLeft;
    }

    /**
     * Accessor that returns the GamePlay frame which was displayed right before
     * this frame
     *
     * @return gamePlay/homepage first frame
     */
    public GamePlay getFirstWindow() {
        return firstWindow;
    }

    /**
     * Accessor that returns the spin jButton on the GUI
     *
     * @return spin jButton
     */
    public JButton getSpin() {
        return spin;
    }

    /**
     * Accessor that returns the guess jButton on the GUI
     *
     * @return guess/next screen jButton
     */
    public JButton getGuess() {
        return guess;
    }

    /**
     * Accessor that returns the phrase object that will be used in the next
     * frame
     *
     * @return the Phrase object to be used
     */
    public Phrase getPhrase() {
        return p;
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
        spinsLeftLabel = new javax.swing.JLabel();
        currentEarningsLabel = new javax.swing.JLabel();
        guessPhraseButton = new javax.swing.JButton();
        spinMoneyLabel = new javax.swing.JLabel();
        spinButton1 = new javax.swing.JButton();
        wheelPanel = new javax.swing.JPanel();
        moneyLabel = new javax.swing.JLabel();
        currentEarningsLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        spinsLeftLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        spinsLeftLabel.setForeground(new java.awt.Color(255, 255, 255));
        spinsLeftLabel.setText("Spins Left:");

        currentEarningsLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        currentEarningsLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentEarningsLabel.setText("Current Earnings:");

        guessPhraseButton.setBackground(new java.awt.Color(255, 255, 102));
        guessPhraseButton.setFont(new java.awt.Font("MS UI Gothic", 1, 21)); // NOI18N
        guessPhraseButton.setForeground(new java.awt.Color(0, 51, 204));
        guessPhraseButton.setText("Next: Guess Phrase");
        guessPhraseButton.setToolTipText("");
        guessPhraseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessPhraseButtonActionPerformed(evt);
            }
        });

        spinMoneyLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        spinMoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        spinMoneyLabel.setText("Spin Money:");

        spinButton1.setBackground(new java.awt.Color(255, 255, 102));
        spinButton1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        spinButton1.setForeground(new java.awt.Color(0, 51, 204));
        spinButton1.setText("SPIN WHEEL");
        spinButton1.setToolTipText("");
        spinButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wheelPanelLayout = new javax.swing.GroupLayout(wheelPanel);
        wheelPanel.setLayout(wheelPanelLayout);
        wheelPanelLayout.setHorizontalGroup(
            wheelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        wheelPanelLayout.setVerticalGroup(
            wheelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );

        moneyLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        moneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        moneyLabel.setPreferredSize(new java.awt.Dimension(57, 51));

        currentEarningsLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        currentEarningsLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(wheelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(spinButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(spinsLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(21, 21, 21)
                            .addComponent(currentEarningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(currentEarningsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spinMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guessPhraseButton)
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentEarningsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spinsLeftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(currentEarningsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(spinButton1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guessPhraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(wheelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessPhraseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessPhraseButtonActionPerformed
        //create a copy of the phrases ArrayList
        ArrayList<Phrase> copy = (ArrayList<Phrase>) phrases.clone();
        //generate a random number using the size of the arrayList as the max
        int rNum = (int) (Math.random() * copy.size()) + 0;
        //assign the phrase at the random number to variable 'p'
        p = copy.get(rNum);
        //remove this phrase from the list so it isn't used again in the next rounds
        copy.remove(p);
        //if the second frame is null create a new frame using the PlayFrame2 frame
        if (secondFrame == null) {
            secondFrame = new PlayFrame2(this);
        }
        //declare variables
        String answer;
        String answerSplit[];
        int count;
        int totalCount = 0;
        //get the answer stored in the object
        answer = p.getAnswer();
        //split the answer at every word
        answerSplit = answer.split(" ");
        //get the letters for the phrase from secondFrame 
        TextField letters[] = secondFrame.getLetters();
        //for the letters, set the text fields equal to "" to make sure no letters from other spins are on the screen
        for (int j = 0; j < letters.length; j++) {
            letters[j].setText("");
        }
        for (int i = 0; i < answerSplit.length; i++) {
            count = answerSplit[i].length();
            //for the letters in the field that will have an letter from the phrase, set the background colour to green
            for (int j = totalCount; j < count + totalCount; j++) {
                letters[j].setBackground(Color.green);
            }
            //for the letters in the field that will have a space fromt the phrase, set the background colour to white
            if (i < answerSplit.length - 1) {
                letters[totalCount + count].setBackground(Color.white);
            }

            totalCount += count + 1;

        }
        //get the clue text field from the next frame
        JTextField clue = secondFrame.getClueField();
        //set the clue text field to the question from the randomly generated Phrase so it appears when on the next frame
        clue.setText(p.getQuestion());

        secondFrame.pack();
        secondFrame.repaint();
        //set the phrase in the second frame to the randomly generated one
        secondFrame.setP(p);
        //set the answer to the answer from the phrase 
        secondFrame.setAnswer(answer);
        //set the next frame's visibility to true so it's displayed
        secondFrame.setVisible(true);
        //set this frame's visibility to false so that the user doesn't see it anymore and it closes
        this.setVisible(false);
    }//GEN-LAST:event_guessPhraseButtonActionPerformed


    private void spinButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinButton1ActionPerformed
        //new DecimalFormat object for the money formatting
        DecimalFormat money = new DecimalFormat("$##,##0.00");
        //set the user's current earnings label to false that way they can't see
        //how much money theyr'e going to get while the wheel is still spinning
        currentEarningsLabel1.setVisible(false);
        spin.setEnabled(false); // disable spin button while spinning
        selectionWheel.setRotationAngle(Math.random() * 360);
        //set the wheelMoney label's visibility to false so user can't see how much they're going to get before the spinner stops
        moneyLabel.setVisible(false);
        //This code will spin the wheel
        try {
            //Start the spin with a chosen speed, direction and deceleration that ensures the wheel starts fast and then slows down
            selectionWheel.spinStartAsync(300, -1, -50);
            //create a new timer and start it
            Timer tickTimer = new Timer(33, e -> selectionWheel.repaintTick());
            tickTimer.start();

            new Thread(() -> {
                while (selectionWheel.isSpinning()) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ignored) {
                    }
                }

                tickTimer.stop();
                //after the wheel stops spinning, set the money labels visibile to true so user can see their spin money and current total
                SwingUtilities.invokeLater(()
                        -> moneyLabel.setVisible(true));
                currentEarningsLabel1.setVisible(true);
                //allow the user to press guess to move onto the next frame
                guess.setEnabled(true);

            }).start();

        } catch (Exception e) {//catch if there's an error for the spin
            e.printStackTrace();
            return;
        }
        //set the result variable to what the ticker landed on after the wheel stopped
        String result = selectionWheel.getSelectedString();

        int total;
        //if the ticker ended on bankruptcy, then the user gets $500 as their 'spin money' so they can start to earn money back in the next screen
        if (result.equalsIgnoreCase("Bankruptcy")) {
            result = "$500";
            //however, their highsscore will get set to 0, and they will have no money in their current total
            player.setHighscore(0);

        }
        //set the moneyLabel to what the ticker landed on
        moneyLabel.setText(result);
        //split the string to disregard the $ and parse the new string into an int.
        spinMoney = Integer.parseInt(result.substring(1));
        //the total is  the player's highscore
        total = player.getHighscore();
        //set the current earnings label to the user's total
        currentEarningsLabel1.setText(money.format(total));
        //take a spin away from user
        spinsLeft -= 1;
        //set the spinsLeft label with the new number of spins left
        spinsLeftLabel.setText("Spins Left:    " + spinsLeft);
        //set the spinsLeft within the Player, so that it is saved and doesn't reset when the user spins again.
        player.setSpinsLeft(spinsLeft);

    }//GEN-LAST:event_spinButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentEarningsLabel;
    private javax.swing.JLabel currentEarningsLabel1;
    private javax.swing.JButton guessPhraseButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel moneyLabel;
    private javax.swing.JButton spinButton1;
    private javax.swing.JLabel spinMoneyLabel;
    private javax.swing.JLabel spinsLeftLabel;
    private javax.swing.JPanel wheelPanel;
    // End of variables declaration//GEN-END:variables
}
