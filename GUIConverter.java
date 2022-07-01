import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIConverter implements ActionListener{

	
	
	GUIConverter(){
		JPanel panel = new JPanel();
		JButton exitButton = new JButton("Exit"); 
		JButton distanceButton = new JButton("Distance Converter");
		JButton tempButton = new JButton("Temperature Converter"); 
		JFrame window = new JFrame("Welcome to Converter"); 
		
		ExitOption exit = new ExitOption(); //Implements exit from exit button
		TempOption temp = new TempOption(); 
		DistanceOption dist = new DistanceOption(); 
		
		panel.setLayout(new BorderLayout());//create new border Layout
		panel.add(tempButton, BorderLayout.EAST);//add button location
		panel.add(distanceButton, BorderLayout.CENTER);//add button location
		panel.add(exitButton, BorderLayout.PAGE_END);// add button location
		window.setContentPane(panel); 
		window.setSize(400, 300);//set the width and height for the window
		window.setLocation(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//adds close functionality 
		exitButton.addActionListener(exit); //adds listener for exit button
		distanceButton.addActionListener(dist);//adds listener for distance button 
		tempButton.addActionListener(temp);// adds listener for temperature button
		
		window.setVisible(true);//makes the window visible
		
	}
	public static class ExitOption implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	public static class  TempOption implements ActionListener {
		public void actionPerformed (ActionEvent e) {
		 double option = Double.parseDouble(JOptionPane.showInputDialog("Input Fahrenheit temperature to convert")) ;
			
		 TemperatureConverter tempconverter = new TemperatureConverter(option);//creates instance of class
			
			tempconverter.convert(); option = (int)option; 
			JOptionPane.showMessageDialog(null, String.format(option +"f equals" + tempconverter.getInput()+"C"));
		}
	}
	
	public static class DistanceOption implements ActionListener {
		public void actionPerformed (ActionEvent e) {
		double option = Double.parseDouble(JOptionPane.showInputDialog("Input miles distance to convert"));
		DistanceConverter distConverter = new DistanceConverter(option); //creates instance of the class
		 	
		distConverter.convert();
		JOptionPane.showMessageDialog(null, String.format(option + "equals  "+distConverter.getInput()));
		
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

