import javax.swing.*;
import java.awt.*;

public class MedicineInterface {

    public static void main(String[] args) {
/*
نافذة اضافة الادوية
 */
        // هنا قمنا بإنشاء النافذة مع تحديد بعض خصائصها
        JFrame frame = new JFrame("Manage");
        frame.setSize(1000, 700);
        frame.setLocation(250,90);
        ImageIcon img = new ImageIcon("C:\\Users\\IT-Support\\Desktop\\Basma\\Term 3\\java\\prooog\\p.png");
        frame.setIconImage(img.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        Font newFont = new Font("Times New Roman", Font.BOLD, 18);
        //
        JPanel panel = new JPanel(null);
        panel.setBorder(BorderFactory.createTitledBorder("ADD MEDICINE "));
        panel.setBounds(20, 20, 950, 620);
        frame.add(panel);
        //الادخال لبيانات الادوية
        JLabel label1 = new JLabel("Name: ");
        JLabel label2 = new JLabel("Production Date: ");
        JLabel label3 = new JLabel("Expiry Date: ");
        JLabel label4 = new JLabel("Price: ");
        JLabel label5 = new JLabel("Company: ");

        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();

        label1.setFont(newFont);
        label2.setFont(newFont);
        label3.setFont(newFont);
        label4.setFont(newFont);
        label5.setFont(newFont);

        JButton button = new JButton("ADD");

        label1.setBounds(300, 130, 200, 25);
        label2.setBounds(300, 170, 200, 25);
        label3.setBounds(300, 210,200, 25);
        label4.setBounds(300, 250,200, 25);
        label5.setBounds(300, 290,200, 25);

        field1.setBounds(500, 130, 200, 25);
        field2.setBounds(500, 170, 200, 25);
        field3.setBounds(500, 210, 200, 25);
        field4.setBounds(500, 250, 200, 25);
        field5.setBounds(500, 290, 200, 25);

        button.setBounds(450, 400, 130, 25);
        button.setFont(newFont);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(field1);
        panel.add(field2);
        panel.add(field3);
        panel.add(field4);
        panel.add(field5);
        panel.add(button);

        frame.setVisible(true);
    }
}

