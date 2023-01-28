
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RIDDLE
 */
import javax.swing.*;
public class TicTacToe extends javax.swing.JFrame {
    private String turn;
    private int choicesCount;
    private int scoreX;
    private int scoreO;

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
        int choice = JOptionPane.showConfirmDialog(this,"Welcome to Tic Tac Toe Game ! \n Do you wish to start with X ?" , "Welcome" , JOptionPane.YES_NO_OPTION);
        
        if(choice == JOptionPane.YES_OPTION)
            turn = "X";
        else
            turn = "O";
    }
    
    private void changePlayer(){
        if(turn.equals("O"))
            turn = "X";
        else
            turn = "O";
    }
    
    private void resetGame(boolean choice){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        if(choice == true){
            scoreX=0;
            scoreO=0;
        }
        choicesCount=0;
    }
    
    private void checkWinner(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(!b1.equals("") && b1.equals(b2) && b1.equals(b3)){
            btn1.setBackground(Color.green);
            btn2.setBackground(Color.green);
            btn3.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                 changePlayer();
            }
            else
                System.exit(0);
           
        }
        
        if(!b1.equals("") && b1.equals(b4) && b1.equals(b7)){
            btn1.setBackground(Color.green);
            btn4.setBackground(Color.green);
            btn7.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b2.equals("") && b2.equals(b5) && b2.equals(b8)){
            btn2.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn8.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b3.equals("") && b3.equals(b6) && b3.equals(b9)){
            btn3.setBackground(Color.green);
            btn6.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?" , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_NO_OPTION)
                   changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b4.equals("") && b4.equals(b5) && b4.equals(b6)){
            btn4.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn6.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b7.equals("") && b7.equals(b8) && b7.equals(b9)){
            btn7.setBackground(Color.green);
            btn8.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                 changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b1.equals("") && b1.equals(b5) && b1.equals(b9)){
            btn1.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn9.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                changePlayer();
            }
            else
                System.exit(0);
        }
        
        if(!b3.equals("") && b3.equals(b5) && b3.equals(b7)){
            btn3.setBackground(Color.green);
            btn5.setBackground(Color.green);
            btn7.setBackground(Color.green);
            
            JOptionPane.showMessageDialog(this, "Player "+turn+" wins !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            if(turn.equals("X")){
                scoreX++;
                xScore.setText(scoreX+"");
            }
            else
            {
                scoreO++;
                OScore.setText(scoreO+"");
            }
            int confirm = JOptionPane.showConfirmDialog(this, "Do you wish to play again ?", "Continue", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confirm == JOptionPane.YES_OPTION){
                resetGame(false);
                int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with "+ turn+ " ?"  , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                changePlayer();
            }
        }
        else if(choicesCount == 9){
            JOptionPane.showMessageDialog(this, "It's a draw !" , "Result" , JOptionPane.INFORMATION_MESSAGE);
            resetGame(false);
        }
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
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        OScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                  Tic Tac Toe ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn2.setToolTipText("");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn3.setToolTipText("");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn1.setToolTipText("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn4.setToolTipText("");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn5.setToolTipText("");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn6.setToolTipText("");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn7.setToolTipText("");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn8.setToolTipText("");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 102, 102));
        exitBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        exitBtn.setText("EXIT");
        exitBtn.setToolTipText("");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btn9.setToolTipText("");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(51, 153, 255));
        resetBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.setToolTipText("");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Score Card");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel3.setText("Player X");

        jLabel4.setBackground(new java.awt.Color(255, 255, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setText("Player 0");

        xScore.setBackground(new java.awt.Color(255, 255, 153));
        xScore.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        xScore.setText("  0");

        OScore.setBackground(new java.awt.Color(255, 255, 153));
        OScore.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        OScore.setText("  0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OScore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xScore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OScore))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Do you want to exit ?" , "Continue" , JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
        if(option == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(!btn1.getText().equals(""))
            return;
        choicesCount++;
        btn1.setText(turn);
        if(btn1.getText().equals("X"))
            btn1.setForeground(Color.blue);
        else
            btn1.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(!btn2.getText().equals(""))
            return;
        choicesCount++;
        btn2.setText(turn);
        if(btn2.getText().equals("X"))
            btn2.setForeground(Color.blue);
        else
            btn2.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(!btn3.getText().equals(""))
            return;
        choicesCount++;
        btn3.setText(turn);
        if(btn3.getText().equals("X"))
            btn3.setForeground(Color.blue);
        else
            btn3.setForeground(Color.yellow);
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(!btn4.getText().equals(""))
            return;
        choicesCount++;
        btn4.setText(turn);
        if(btn4.getText().equals("X"))
            btn4.setForeground(Color.blue);
        else
            btn4.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(!btn5.getText().equals(""))
            return;
        choicesCount++;
        btn5.setText(turn);
        if(btn5.getText().equals("X"))
            btn5.setForeground(Color.blue);
        else
            btn5.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(!btn6.getText().equals(""))
            return;
        choicesCount++;
        btn6.setText(turn);
        if(btn6.getText().equals("X"))
            btn6.setForeground(Color.blue);
        else
            btn6.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(!btn7.getText().equals(""))
            return;
        choicesCount++;
        btn7.setText(turn);
        if(btn7.getText().equals("X"))
            btn7.setForeground(Color.blue);
        else
            btn7.setForeground(Color.yellow);
        
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(!btn8.getText().equals(""))
            return;
        
        choicesCount++;
        btn8.setText(turn);
        if(btn8.getText().equals("X"))
            btn8.setForeground(Color.blue);
        else
            btn8.setForeground(Color.yellow);
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(!btn9.getText().equals(""))
            return;
        
        choicesCount++;
        
        btn9.setText(turn);
        if(btn9.getText().equals("X"))
            btn9.setForeground(Color.blue);
        else
            btn9.setForeground(Color.yellow);
        checkWinner();
        changePlayer();
        

    }//GEN-LAST:event_btn9ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        resetGame(true);
        int choice = JOptionPane.showConfirmDialog(this,"Do you wish to start with X ?" , "Welcome" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                if(choice == JOptionPane.YES_OPTION)
                    turn = "X";
                else
                    turn = "O";
    }//GEN-LAST:event_resetBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OScore;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables

    
}
