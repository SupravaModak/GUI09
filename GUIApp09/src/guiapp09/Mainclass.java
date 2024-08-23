package guiapp09;
//checkbox
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MainPanel extends JPanel
{
    private JCheckBox cbx1,cbx2,cbx3,cbx4;
    private JCheckBox makeCheckBox(String cap,int x,int y,int w,int h)
    {
        JCheckBox temp=new JCheckBox(cap);
        temp.setFont(new Font("Courier New",1,14));
        temp.setBounds(x,y,w,h);
        temp.setOpaque(false);
        temp.putClientProperty("color",prp);
        temp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "OK");
            }
        });
        super.add(temp);
        return temp;
    }
    public MainPanel()
    {
        cbx1=makeCheckBox("Item1",10,10,150,30,"CYAN");
         cbx2=makeCheckBox("Item2",10,60,150,30,"MAGENTA");
          cbx3=makeCheckBox("Item3",10,110,150,30,"YELLOW");
           cbx4=makeCheckBox("Item4",10,160,150,30,"BLACK");
    }
}
class MainFrame extends JFrame
{
    private MainPanel panel;
    public MainFrame()
    {
        panel = new MainPanel();
        panel.setBackground(Color.BLUE);
        panel.setLayout(new BorderLayout());
        super.add(panel);
    }
}

public class Mainclass
{
    public static void main(String[] args)
    {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Musical Maestro");
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}
