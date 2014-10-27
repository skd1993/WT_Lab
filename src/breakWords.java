import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class breakWords extends JFrame
{
	//private JLabel item1;
	private JTextField item2;
	private JTextArea item3;

	public breakWords(){
		super("Break String to Words");
		setLayout(new FlowLayout());
		
		/*item1 = new JLabel("Enter the text here!");
		add(item1);*/
		
		item2 = new JTextField("Enter the text here and press Enter", 30);
		add(item2);
		
		item3 = new JTextArea("/*The output is as follow: */\n",10,30);
		JScrollPane scrollPane = new JScrollPane(item3);
		item3.setEditable(false);
		add(item3);
		
		theHandler handler = new theHandler();
		item2.addActionListener(handler);	
	}
	private class theHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==item2)
			{
				String text = item2.getText();
				text = text +" ";
				String temp = "";
				int l = text.length();
				for(int i=0; i<l; i++)
				{
					char ch = text.charAt(i);
					
					if(ch == ' ')
					{
						item3.append(temp+"\n");
						temp="";
						//i++;
					}
					else if(ch =='.' || ch ==',' || ch =='?' || ch =='!')
					{
						item3.append(temp);
						temp="";
					}
					else
					{
						temp = temp+ch;
					}
				}
			}
		}
	}
}
