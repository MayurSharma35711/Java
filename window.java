import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//has to have select person button, file search for music, place to insert where the rests are in the music, 
//create button, file search for the coordinates

public class window{
	static GraphicsConfiguration gc;
	static JLabel text;
	static JLabel completion;
	static JTextField input;
	static JButton buttonCreation;
	String info;
	String directions = new String("dotbook number, file prefix for 1st piece, file prefix for 2nd piece, file prefix for 3rd piece");
	
	window()
	{
		int x = 600;
		int y = 400;
		JFrame platform = new JFrame("Dotbook Manager", gc);
		platform.setLocation(0,0);
		platform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		platform.setResizable(true);
		platform.setLayout(new FlowLayout());
		platform.getContentPane().setPreferredSize(new Dimension(x,y)); //sets stuff for window 
		
		text = new JLabel();
		text.setText("To create a dotbook, replace the 3 following key terms with the info corresponding to you");//these are the directions
		text.setBounds(5,5,100,10);
		completion = new JLabel();
		completion.setBounds(50,100,150,20);//sign of completion
		platform.add(completion);
		platform.add(text);//ad the labels to the window 
		
		input = new JTextField(directions,65);
		input.setBounds(5,20,100,10);
		platform.add(input);
		buttonCreation = new JButton("CREATE");// add code to create it with the saved info
		buttonCreation.setBounds(40,40,10,10);
		platform.add(buttonCreation);
		buttonCreation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				completion.setText("SUBMITTED");
				info = new String(input.getText()); //take your info from here and use it
				input.setText(directions);
				System.out.println(info); //testing purposes
				//platform.remove(buttonCreation); //this will destroy the button after use
			}
		});
		platform.pack();
		platform.setVisible(true); //joins everything together and makes it visible
	}

	public static void main(String args[])
	{
		 new window();
	}	
}