import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CozaLozaWoza extends JFrame
{
	private JButton button1;
	private JTextArea output;
	
	public CozaLozaWoza()
	{
		super("CozaLozaWoza: weird name for a program");
		setLayout(new FlowLayout());
		
		button1 = new JButton("Click this and see the Magic of CozaLozaWoza!");
		add(button1);
		
		output = new JTextArea("/*The output is as follow: */\n",15,30);
		JScrollPane scrollPane = new JScrollPane(output);
		output.setEditable(false);
		add(output);
		
		Handle handler = new Handle();
		button1.addActionListener(handler);
		
	}
	
	private class Handle implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			for(int i=1; i<=110; i++)
			{

				if(((i-1)%11 == 0) && (i!=1))
					output.append("\n");
				if(i%3 == 0)
					output.append("Coza...");
				else if(i%5 == 0)
					output.append("Loza...");
				else if((i%3==0)&&(i%5==0))
					output.append("Woza...");
				else
					output.append(i+"...");
				
			}
		}
	}
}