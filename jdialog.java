import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class dialogex {  
    private static JDialog d;  
    dialogex() {  
        JFrame f= new JFrame();  
        d = new JDialog(f,"Dialog Example",true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("OK");  
        b.addActionListener (new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                dialogex.d.setVisible(false);  
            }  
        });  
        d.add(new JLabel("click to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new dialogex();  
    }  
}  
