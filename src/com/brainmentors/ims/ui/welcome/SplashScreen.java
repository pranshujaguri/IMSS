package com.brainmentors.ims.ui.welcome;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

import com.brainmentors.ims.ui.MainScreen.MainScreen;

public class SplashScreen extends JWindow {

	
	public static void main(String[] args) {
		
					SplashScreen frame = new SplashScreen();
					frame.setVisible(true);
			        frame.doProgress();
	}
	private Timer  timer ;


	private int counter=1;


	JProgressBar progressBar = new JProgressBar();

	JLabel lblInventoryManagementSystem = new JLabel("   INVENTORY MANAGEMENT SYSTEM ");


	private boolean isVisible = true;


	private void doProgress(){


	// Anonymous Class 


	ActionListener al = new ActionListener() 
	{


	@Override


	public void actionPerformed(ActionEvent e){


		lblInventoryManagementSystem.setVisible(isVisible);


	isVisible = !isVisible;


	progressBar.setValue(counter);


	if(counter>=1000)
	{
		
		
	
timer.stop();

	SplashScreen.this.setVisible(false);


	SplashScreen.this.dispose();


	MainScreen mainScreen = new MainScreen();


	mainScreen.setVisible(true);


	}


	counter++;



	}
	

	};
	
	timer = new Timer(100, al);
	timer.start();
	

	}


	

	

	public SplashScreen() {
		Icon icon=new ImageIcon(SplashScreen.class.getResource("images.png"));
		getContentPane().setBackground(SystemColor.activeCaption);
		
		setBounds(100, 100, 486, 502);
		getContentPane().setLayout(null);
		
		JLabel welcomeScreen = new JLabel("");
		
		
		welcomeScreen.setBounds(79, 86, 352, 213);
		getContentPane().add(welcomeScreen);
        welcomeScreen.setIcon(icon);	
        
       
        progressBar.setForeground(new Color(50, 205, 50));
        progressBar.setStringPainted(true);
        progressBar.setBounds(78, 297, 331, 14);
        getContentPane().add(progressBar);
        
        
        lblInventoryManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblInventoryManagementSystem.setBounds(53, 40, 378, 35);
        getContentPane().add(lblInventoryManagementSystem);
	}
}
