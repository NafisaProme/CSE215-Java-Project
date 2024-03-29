package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentPage implements ActionListener
{
	JFrame frame = new JFrame("Mastermind International School");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField[] text = new JTextField[10];
	String[] s = {"Name", "ID", "Address", "Phone"};
	Main obj = new Main();

	public StudentPage()
	{
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		panel.setBackground(Color.DARK_GRAY);
		frame.add(panel);
		
		label = new JLabel("Enter the Student's info: ");
		label.setFont(new Font("Serif", Font.BOLD, 17));
		label.setForeground(Color.white);
		label.setBounds(110, 100, 250, 25);
		panel.add(label);
		
		for(int i = 0, y = 130; i < 4; i++, y += 35)
		{
			label = new JLabel(s[i] + " : ");
			label.setFont(new Font("Serif", Font.BOLD, 17));
			label.setForeground(Color.white);
			label.setBounds(110, y, 250, 25);
			panel.add(label);
			
			text[i] = new JTextField();
			text[i].setBounds(210, y, 165, 25);
			panel.add(text[i]);
						
		}
		
		JButton button = new JButton();
		button = new JButton("Enter");
		button.setFont(new Font("Serif", Font.BOLD, 16));
		button.setForeground(Color.black);
		button.setBounds(110, 275, 110, 30);
		button.addActionListener(this);
		
		panel.add(button);
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		frame.dispose();

		try
		{
			String ans[] = new String[10];
			for(int i = 0; i < 4; i++)
			{
				ans[i] = text[i].getText();
			}
			
			obj.stud[obj.ind] = new Student(ans[0], ans[1], ans[2], ans[3]);
			obj.ind++;
			new Page2();
		}
		catch(Exception a)
		{
			
		}
	}
}
