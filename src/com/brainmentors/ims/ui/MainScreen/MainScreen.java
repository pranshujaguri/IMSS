package com.brainmentors.ims.ui.MainScreen;



import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.brainmentors.ims.ui.Login.Loginscreen;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class MainScreen extends JFrame {


	public MainScreen() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(MainScreen.this,"Do u really wanna to close this window","IMS",JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION){
					
					System.exit(0);
				}
				else
				{
					return;
				}
			}
		});
		
		setAlwaysOnTop(true);
		getContentPane().setBackground(SystemColor.activeCaption);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		this.setTitle("IMS-2016");
		
		
		 /*ImageIcon imageIcon = new ImageIcon(MainScreen.class.getResource("logo.png"));
		this.setIconImage(imageIcon.getImage());
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("User");
		mnUser.setMnemonic('U');
		menuBar.add(mnUser);
		
		JMenuItem menuItem = new JMenuItem("Login");
		menuItem.setMnemonic('L');
		menuItem.setIcon(new ImageIcon(MainScreen.class.getResource("/com/brainmentors/ims/ui/MainScreen/loginicon.png")));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginscreen frame = new Loginscreen();
			frame.setVisible(true);
			
			
			}
			
		});
		mnUser.add(menuItem);*/
		
		JSeparator separator = new JSeparator();
		mnUser.add(separator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("EXIT");
		mntmNewMenuItem.setMnemonic('E');
		mntmNewMenuItem.setIcon(new ImageIcon(MainScreen.class.getResource("/com/brainmentors/ims/ui/MainScreen/images.jpg")));
		mnUser.add(mntmNewMenuItem);
		
		
		
		
	
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), menuBar, mnUser, mntmNewMenuItem, menuItem}));
	}
}

