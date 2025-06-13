/**
 * Wheel of Fortune game
 * ICS4U Final Project
 * Homepage/GamePlay jFrame
 * June 11th 2025

 */
package wheeloffortune2;
//import statements

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class GamePlay extends javax.swing.JFrame {

    //define private variables that will be used throughout the jFrame
    private Instructions instructions;
    private HighScores score;
    private PlayFrame1 firstPlayScreen;
    private ArrayList<Phrase> phrases;
    private String username;
    private Player player;
    private int spinMoney;
    /**
     * Accessor that returns a Phrases arraylist which has all the Phrase objects from the data file
     * @return arrayList of phrases
     */
    public ArrayList<Phrase> getPhrases() {
        return phrases;
    }
    /**
     * Mutator that sets the Phrases arrayList which has all the Phrase objects from file
     * @param phrases ArrayList containing Phrase objects
     */
    public void setPhrases(ArrayList<Phrase> phrases) {
        this.phrases = phrases;
    }
    /**
     * Accessor that returns the username that the user has entered
     * @return valid string that is used to differentiate users 
     */
    public String getUsername() {
        return username;
    }
    /**
     * Accessor that returns the Player object, defined by username, highscore, and spins left
     * @return Player object for current user
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
        initComponents();

    }

    /**
     * Method that reads the playList file to use for the username check
     *
     * @return an arrayList of the usernames read from the file
     */
    public static ArrayList scanPlayerListFile() {
        //new arraylist that will store all the usernames from the file
        ArrayList<String> username = new ArrayList();

        try {
            //create new File using the PlayerList file stored in this package
            File f = new File("src/wheeloffortune2/playerList.txt");
            //scan the file
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String playerInfo[] = s.nextLine().split(" ");
                //add the username to the arraylist
                username.add(playerInfo[0]);

            }
        } catch (FileNotFoundException e) {//error checking to make sure the file is found
            System.out.println("Error " + e);//print statement if not found
        }
        //return the arraylist with all of the usernames so far
        return username;

    }

    /**
     * UsernameCheck method that determines whether or not username entered is
     * valid
     * @param u the String that the user entered in the GUI text field
     * @return true or false based on whether its valid
     */
    public static boolean usernameCheck(String u) {
        //create a new arraylist for the username
        ArrayList<String> usernameList = new ArrayList();
        //initialize variable with the scan method
        usernameList = scanPlayerListFile();
        //set the check equal var to false
        boolean equals = false;
        //for statement to determine if the username has alrady been used/stored in the file
        for (int i = 0; i < usernameList.size(); i++) {
            //go through the username list and see if any indexes equal the user input
            if (usernameList.get(i).equals(u)) {
                equals = true;
            }
        }
        if (u.length() > 20) {//if the character length is longer than 20, username isn't valid
            JOptionPane.showMessageDialog(null, "Username is too long. Try again");
            return false;

        } else if (equals) {//if the username equals another one already stored, username isn't valid
            JOptionPane.showMessageDialog(null, "Username has already been used. Try again");
            return false;
        } else if (u.equals("")) {//if the user didn't enter any characters, username isn't valid
            JOptionPane.showMessageDialog(null, "Please enter a valid username.");
            return false;
        }
        //otherwise, username is valid and return true
        return true;
    }
    /**
     * method that reads the phrases file to get the hints and answers and assigns it to an object
     * @param phrases the arrayList that has the  
     */
    public static void scanFile(ArrayList<Phrase> phrases) {
        //intialize variables for the atrributes of the Phrases class
        String question, hint, answer;
        //create a new Phrase
        Phrase p;
        try {
            //create a new file using the phrase txt file in this package
            File f = new File("src/wheeloffortune2/phrase.txt");
            //create a new scanner and scan the file
            Scanner s = new Scanner(f);
            
            while (s.hasNextLine()) {
                //set the string variables to what is on the next line
                question = s.nextLine();
                hint = s.nextLine();
                answer = s.nextLine();
                //create a new Phrase using these variables
                p = new Phrase(question, hint, answer);
                //add this phrase to the phrase list
                phrases.add(p);
            }
        } catch (FileNotFoundException e) {//catch if the file isn't found
            System.out.println("Error " + e);//print an error statement
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        instructionsButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        highScoresButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        wheelIcon = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        instructionsButton.setBackground(new java.awt.Color(255, 255, 102));
        instructionsButton.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
        instructionsButton.setForeground(new java.awt.Color(0, 51, 204));
        instructionsButton.setText("INSTRUCTIONS");
        instructionsButton.setToolTipText("");
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(255, 255, 102));
        playButton.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
        playButton.setForeground(new java.awt.Color(0, 51, 204));
        playButton.setText("PLAY");
        playButton.setToolTipText("");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        highScoresButton.setBackground(new java.awt.Color(255, 255, 102));
        highScoresButton.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
        highScoresButton.setForeground(new java.awt.Color(0, 51, 204));
        highScoresButton.setText("HIGHSCORES");
        highScoresButton.setToolTipText("");
        highScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoresButtonActionPerformed(evt);
            }
        });

        quitButton.setBackground(new java.awt.Color(255, 255, 102));
        quitButton.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
        quitButton.setForeground(new java.awt.Color(0, 51, 204));
        quitButton.setText("QUIT");
        quitButton.setToolTipText("");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        wheelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wheeloffortune2/IMG_5739-modified.png"))); // NOI18N

        nameLabel.setBackground(new java.awt.Color(255, 255, 102));
        nameLabel.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 102));
        nameLabel.setText("Please enter username before playing: ");

        usernameTextField.setBackground(new java.awt.Color(255, 255, 102));
        usernameTextField.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructionsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wheelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(wheelIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(highScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(instructionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        //if the user wants to quit, close the GUI
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void highScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoresButtonActionPerformed
        //When the user presses the highscores button the highscores jFrame will open
        //check that the score is null before creating a new frame
        if (score == null) {
            //create a new jFrame using the current frame
            score = new HighScores(this);
        }

        score.setVisible(true);//set new frame's visibility to true
        this.setVisible(false);//set this frame's visiblity to false
    }//GEN-LAST:event_highScoresButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        //create a new arrayList for the phrases which will be read in from the phrase.txt file
        phrases = new ArrayList();
        //scan phrase.txt file
        scanFile(phrases);
        //call the usernameCheck method and assign it to a boolean 
        boolean usernameTest = usernameCheck(usernameTextField.getText());
        //in order to move onto the next screen, the username must be valid and the next screen must be null
        if (firstPlayScreen == null && usernameTest) {
            //create a new player using the valid username, start the highscore at 0, and full spins left
            player = new Player(usernameTextField.getText(), 0, 3);
            //create a new screen for the next frame, using this frame as the paramter
            firstPlayScreen = new PlayFrame1(this);
            //On the next screen make sure the user can't press the guess button, as they have to press spin button first
            firstPlayScreen.getGuess().setEnabled(false);
            //set the next sceen's visiblity to true so user can sede it
            firstPlayScreen.setVisible(true);
            //close this screen by setting it equal to false
            this.setVisible(false);
            
//Otherwise, if the username is not valid, don't switch screens, and set the text in the field back to nothing so user can reenter a username
        } else if (!usernameTest) {
            usernameTextField.setText("");

        }


    }//GEN-LAST:event_playButtonActionPerformed

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsButtonActionPerformed
        //if the instructions button is pressed, the instructions jFrame will open
        
        if (instructions == null) {//if the instructions screen is null
            //initialize it with the instructions frame using this frame as a parameter
            instructions = new Instructions(this);

        }
        //set the instructions frame's visibilty to true
        instructions.setVisible(true);
        //set this frame's visibility to false
        this.setVisible(false);
    }//GEN-LAST:event_instructionsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton highScoresButton;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel wheelIcon;
    // End of variables declaration//GEN-END:variables
}
