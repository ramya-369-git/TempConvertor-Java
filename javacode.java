import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class javacode extends JFrame{
    public javacode(){ 

        setTitle("Temperature Converter");

        JLabel l1=new JLabel("Temp in Degree Centigrade");
        l1.setBounds(20,30,200,20);
        add(l1); 

        JLabel l2=new JLabel("Temp in Degree Farenheit");
        l2.setBounds(20,80,200,20);
        add(l2);

        JTextField t1=new JTextField();
        t1.setBounds(220,30,50,20);
        add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(220,80,50,20);
        add(t2);

        JButton b=new JButton("Convert");
        b.setBounds(150,150,90,20);
        add(b);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){
                try{
                        String str;
                        float f,c;
                        str = t1.getText();
                        c=Float.parseFloat(str);
                        f=c*9/5+32;
                        str=Float.toString(f);
                        t2.setText(str);
                    }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    });

        setSize(400,500);
        setLayout(null);
        setVisible(true);
}
    public static void main(String[] args) {
        new javacode();
    }
}


