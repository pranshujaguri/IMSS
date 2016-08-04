package com.brainmentors.ims.ui.Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.brainmentors.ims.ui.welcome.SplashScreen;

public class Loginscreen extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		
		Loginscreen frame = new Loginscreen();
		frame.setVisible(true);
	}
		
	public Loginscreen() {
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().setBackground(SystemColor.activeCaption);
		getContentPane().setForeground(new Color(153, 180, 209));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel UserID = new JLabel("USER ID");
		UserID.setFont(new Font("Times New Roman", Font.BOLD, 18));
		UserID.setBounds(32, 61, 76, 22);
		getContentPane().add(UserID);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Your User ID");
		textField.setBounds(165, 65, 155, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Password.setBounds(32, 113, 86, 22);
		getContentPane().add(Password);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Your Password");
		passwordField.setBounds(165, 113, 155, 28);
		getContentPane().add(passwordField);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(27, 192, 86, 35);
		getContentPane().add(submit);
		
		JButton Reset = new JButton("RESET");
		
		Reset.setBounds(122, 192, 86, 35);
		getContentPane().add(Reset);
		
		JLabel LOGIN = new JLabel("LOGIN ");
		LOGIN.setFont(new Font("Times New Roman", Font.BOLD, 22));
		LOGIN.setBounds(109, 11, 119, 22);
		getContentPane().add(LOGIN);
		
		
	}
}

