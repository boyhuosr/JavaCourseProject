import javax.swing.*;
import java.awt.event.*;

public class RpsEvent implements ActionListener,Runnable{
	
	RpsView action;
	Thread playing;
	int scorenumber = 0;
	String computerChoice;

	public RpsEvent(RpsView in){
		action = in;
	}

	public void actionPerformed(ActionEvent event){
		String command = event.getActionCommand();
		if(command.equals("Rock")){
			computerChoice=command;
			startPlay();
			
		}
		if(command.equals("Paper")){
			computerChoice=command;
			startPlay();
			
		}
		if(command.equals("Scissors")){
			computerChoice=command;
			startPlay();
			
		}
		if(command.equals("Reset")){
			clearScore();
		}

	}

	void clearScore(){
		action.score.setText("0");
		action.computer.setText(" ");
	}

	void startPlay(){
		
		int temp =  (int )(Math. random() * 3 + 1);
		if(temp==1){
			action.computer.setText("Rock");
			if(computerChoice.equals("Paper")){
				scorenumber++;
				action.score.setText(scorenumber+"");
			}else if(computerChoice.equals("Scissors")){
				scorenumber--;
				action.score.setText(scorenumber+"");
			}else{action.score.setText(scorenumber+"");
			}	
		}
		else if (temp==2){
			action.computer.setText("Paper");
			if(computerChoice.equals("Scissors")){
				scorenumber++;
				action.score.setText(scorenumber+"");
			}else if(computerChoice.equals("Rock")){
				scorenumber--;
				action.score.setText(scorenumber+"");
			}else{action.score.setText(scorenumber+"");}
		}
		else{
			action.computer.setText("Scissors");
			if(computerChoice.equals("Rock")){
				scorenumber++;
				action.score.setText(scorenumber+"");
			}else if(computerChoice.equals("Paper")){
				scorenumber--;
				action.score.setText(scorenumber+"");
			}else{action.score.setText(scorenumber+"");}
			
		}

	}


	public void run(){
		Thread thisThread = Thread.currentThread();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			//do nothing
		}
		
	}

}