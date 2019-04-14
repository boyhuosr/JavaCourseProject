import java.awt.*;
import javax.swing.*;

public class RpsView extends JFrame{
	RpsEvent rps = new RpsEvent(this);

	JPanel row1 = new JPanel();
	JLabel label1 = new JLabel("Computer's choice:");
	JTextField computer = new JTextField(10);

	JPanel row2 = new JPanel();
	JLabel label2 = new JLabel("Your choice:");
	JButton rock = new JButton("Rock");
	JButton paper = new JButton("Paper");
	JButton scissors = new JButton("Scissors");

	JPanel row3 = new JPanel();
	JLabel label3 = new JLabel("Your score:");
	JTextField score = new JTextField(5);
	JButton reset = new JButton("Reset");

	public RpsView(){
		super("Rock-Paper-Scissors");
		setLookAndFeel();
		setSize(350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout = new GridLayout(5,1,10,10);
		setLayout(layout);

		//Add listeners
		rock.addActionListener(rps);
		paper.addActionListener(rps);
		scissors.addActionListener(rps);		
		reset.addActionListener(rps);

		FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row1.setLayout(layout1);
		row1.add(label1);
		row1.add(computer);
		add(row1);

		FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row2.setLayout(layout2);
		row2.add(label2);
		row2.add(rock);
		row2.add(paper);
		row2.add(scissors);
		add(row2);

		FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		row3.setLayout(layout3);
		row3.add(label3);
		row3.add(score);
		row3.add(reset);
		add(row3);

		setVisible(true);
	}

	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception exc){
			//ignore error
		}
	}


	public static void main(String[] arguments){
			RpsView frame = new RpsView();
		}
}