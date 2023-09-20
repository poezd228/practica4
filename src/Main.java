import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class scoreTable extends JFrame{
    public int scoreMilan;
    public int scoreMadrid;

    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel score = new JLabel();
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: Draw");


    public scoreTable(){
        super("AC Milan X Real Madrid");
        setSize(300,200);
        add(milan, BorderLayout.WEST);
        add(madrid, BorderLayout.EAST);
        add(score, BorderLayout.CENTER);
        add(LastScorer, BorderLayout.SOUTH);
        add(Winner, BorderLayout.NORTH);
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                LastScorer.setText("Last Scorer: AC Milan");
                score.setText("Result: " + scoreMilan +"X" + scoreMadrid);
                if (scoreMilan > scoreMadrid){
                    Winner.setText("AC Milan");


                } else if (scoreMilan< scoreMadrid) {
                    Winner.setText("Real Madrid");


                }
                else Winner.setText("Draw");
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                LastScorer.setText("Last Scorer: Real Madrid");
                score.setText("Result: " + scoreMilan +"X" + scoreMadrid);
                if (scoreMilan > scoreMadrid){
                    Winner.setText("AC Milan");


                } else if (scoreMilan< scoreMadrid) {
                    Winner.setText("Real Madrid");


                }
                else Winner.setText("Draw");
            }
        });
        String itogScore = "Result: " + scoreMilan +"X" + scoreMadrid;
        score.setText(itogScore);


    }
    public static void main(String[] args){
        new scoreTable().setVisible(true);
    }
}
