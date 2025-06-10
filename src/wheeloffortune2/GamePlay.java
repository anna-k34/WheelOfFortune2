package wheeloffortune2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class GamePlay extends javax.swing.JFrame {

    private Instructions instructions;
    private HighScores score;
    private PlayFrame1 firstPlayScreen;
    private ArrayList<Phrase> phrases;
    private String username;
    private Player player;
    private int spinMoney;
    //private int guessesLeft=8;

    public ArrayList<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(ArrayList<Phrase> phrases) {
        this.phrases = phrases;
    }
    public String getUsername() {
        return username;
    }
    public Player getPlayer(){
        return player;
    }
    //public int getGuessesLeft(){
        //return guessesLeft;
    //}
    /**
     * Creates new form GamePlay
     */
    public GamePlay() {
        initComponents();

    }

    public static ArrayList scanPlayerListFile() {
        ArrayList<String> username = new ArrayList();
        Player p;
        int highscore;
        try {
            File f = new File("src/wheeloffortune2/playerList");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                username.add(s.nextLine());
                highscore = Integer.parseInt(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
        }

        return username;

    }

    public static boolean usernameCheck(String u) {
        ArrayList<String> usernameList = new ArrayList();
        usernameList = scanPlayerListFile();
        boolean equals = false;
        for (int i = 0; i < usernameList.size(); i++) {
            if (usernameList.get(i).equals(u)) {
                equals = true;
            }
        }
        if (u.length() > 20) {
            JOptionPane.showMessageDialog(null, "Username is too long. Try again");
            return false;
        } else if (equals) {
            JOptionPane.showMessageDialog(null, "Username has already been used. Try again");
            return false;
        } else if (u.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid username.");
            return false;
        }
        return true;
    }

    public static void scanFile(ArrayList<Phrase> phrases) {
        String question, hint, answer;
        Phrase p;
        try {
            File f = new File("src/wheeloffortune2/phrase.txt");//THIS DOESN'T WORK
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                question = s.nextLine();
                hint = s.nextLine();
                answer = s.nextLine();
                p = new Phrase(question, hint, answer);
                phrases.add(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e);
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
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed
    
    private void highScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoresButtonActionPerformed
        if (score == null) {
            score = new HighScores(this);
        }

        score.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_highScoresButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // add error checking for username!!!!
        phrases = new ArrayList();
        scanFile(phrases);
        
        boolean usernameTest = usernameCheck(usernameTextField.getText());
        if (firstPlayScreen == null && usernameTest) {
                        player = new Player(usernameTextField.getText(), 0, 3);

            firstPlayScreen = new PlayFrame1(this);
            firstPlayScreen.getGuess().setEnabled(false);
            firstPlayScreen.setVisible(true);
            this.setVisible(false);
        } else if (!usernameTest) {
            usernameTextField.setText("");

        }

        
        

    }//GEN-LAST:event_playButtonActionPerformed
    
    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsButtonActionPerformed
        if (instructions == null) {
            instructions = new Instructions(this);

        }
        instructions.setVisible(true);
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
