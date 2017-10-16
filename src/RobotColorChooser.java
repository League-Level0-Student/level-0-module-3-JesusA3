
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
  Robot gary = new Robot();
  
   gary.miniaturize();
   gary.setSpeed(100);
   gary.setPenWidth(10);
   for (int i = 0; i < 7; i++) {
	

   String color =  JOptionPane.showInputDialog(null, "What color would you like the robot to draw with?");
   if(color.equalsIgnoreCase("red")) {
	gary.setPenColor(Color.RED);
   }else if(color.equalsIgnoreCase("Blue")){
		gary.setPenColor(Color.BLUE);
   } else {gary.setRandomPenColor();}
   gary.penDown();
   gary.move(100);
   gary.turn(90);
   gary.move(100);
   gary.turn(90);
   gary.move(100);
   gary.turn(90);
   gary.move(100);
   gary.turn(90);
		//3. ask the user what color they would like the robot to draw
		
		//4. use an if/else statement to set the pen color that the user requested

        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
} }
