import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class RockPaperScissors implements ActionListener{
    JButton[] buttons = new JButton[3];
    JLabel titleText = new JLabel("CHOOSE AND OPTION");
    JMenuItem winCount = new JMenuItem("Win: 0");
    JMenuItem lossCount = new JMenuItem("Loss: 0");
    JMenuItem tieCount = new JMenuItem("Tie: 0");
    int win = 0;
    int lose = 0;
    int tie = 0;

    RockPaperScissors(){
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 325);
        frame.setLocationRelativeTo(null);

        JPanel board = new JPanel();
        board.setLayout(new GridLayout(1,3));

        JPanel title = new JPanel();
        
        titleText.setFont(new Font(null, 0, 40));
        title.add(titleText);

        JMenuBar menu = new JMenuBar();
        JMenu checkScore = new JMenu("Check Score");

        menu.add(checkScore);
        checkScore.add(winCount);
        checkScore.add(lossCount);
        checkScore.add(tieCount);
        
        for(int i=0; i<3; i++){
            buttons[i] = new JButton();
            board.add(buttons[i]);
            buttons[i].addActionListener(this);
            buttons[i].setOpaque(true);
        }
        buttons[0].setText("Rock");
        buttons[1].setText("Paper");
        buttons[2].setText("Scissors");

        buttons[0].setFont(new Font(null, 0, 35));
        buttons[1].setFont(new Font(null, 0, 35));
        buttons[2].setFont(new Font(null, 0, 35));

        frame.getContentPane().add(BorderLayout.CENTER, board);
        frame.getContentPane().add(BorderLayout.NORTH, title);
        frame.getContentPane().add(BorderLayout.SOUTH, menu);
        frame.setVisible(true);
    }   

    public int randomChoice() {
        Random rand = new Random();
        return rand.nextInt(3); //return 0,1,2
    }

    public String checkWin(int computer, int user) { //1 win, 2 loss, 3 tie
        if(computer == user){
            tie++;
            return "Tie";
        }
        if(computer == 0){//rock
            if(user == 1){
                win++;
                return "You Win"; //win
            }
            if(user == 2){
                lose++;
                return "You Lose"; //loss
            }
        }
        if(computer == 1){//paper
            if(user == 0){
                lose++;
                return "You Lose"; //loss
            }
            if(user == 2){
                win++;
                return "You Win"; //win
            }
        }
        if(computer == 2){//scissors
            if(user == 0){
                win++;
                return "You Win"; //win
            }
            if(user == 1){
                lose++;
                return "You Lose"; //loss
            }
        }
        return "ERROR";
    }

    public void game(int user) {
        int computer = randomChoice();
        String output = checkWin(computer, user);
        titleText.setText("Computer choose " + getName(computer) + ": " + output + "!");
        winCount.setText("Win: " + win);
        lossCount.setText("Loss:" + lose);
        tieCount.setText("Tie: " + tie);
        
    }

    public String getName(int in) {
        if(in == 0)
            return "Rock";
        if(in == 1)
            return "Paper";
        if(in == 2)
            return "Scissors";
        return "ERROR";
    }

    public void resetButtons() {
        for(int i=0; i<3; i++){
            buttons[i].setBackground(Color.WHITE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttons[0]){
            resetButtons();
            buttons[0].setBackground(Color.BLACK);
            game(0);
        }else if(e.getSource() == buttons[1]){
            resetButtons();
            buttons[1].setBackground(Color.BLACK);
            game(1);
        }else if(e.getSource() == buttons[2]){
            resetButtons();
            buttons[2].setBackground(Color.BLACK);
            game(2);
        }
    }


}
