import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Tables {
    static JFrame frame = new JFrame("Medicine");
    static JLabel label = new JLabel("ID");
    static JLabel label_1 = new JLabel("Name");
    static JLabel label_2 = new JLabel("Price");
    static JLabel label_3 = new JLabel("Expiry Date");
    static JLabel label_4 = new JLabel("Production Date");
    static JLabel label_5 = new JLabel("Company");
    static JLabel label_6 = new JLabel("Qty");


    static JTextField textField_1 = new JTextField();
    static JTextField textField_2 = new JTextField();
    static JTextField textField_3 = new JTextField();
    static JTextField textField_4 = new JTextField();
    static JTextField textField_5 = new JTextField();
    static JTextField textField_6 = new JTextField();

    static JButton btn_add = new JButton("Add");
    static JButton btn_clear = new JButton("Clear");
    static JButton btn_delete = new JButton("Delete Selected");
    static JButton btn_deleteAll = new JButton("Delete All");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable( model );
    static JScrollPane tableScroller = new JScrollPane( table );

    public static void main(String[] args) {

        //   أعمدة الجدول
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Expiry Date");
        model.addColumn("Production Date");
        model.addColumn("Company");

        frame.setSize(1000,700);
        frame.setLocation(250,90);
        ImageIcon img = new ImageIcon("p.png");
        frame.setIconImage(img.getImage());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        Font newFont = new Font("Times New Roman", Font.BOLD,20);


        label_1.setBounds(40, 50,  100, 20);
        label_2.setBounds(40, 90,  100, 20);
        label_3.setBounds(40, 130, 100, 20);
        label_4.setBounds(40, 170, 100, 20);
        label_5.setBounds(40, 210, 100, 20);
        label_6.setBounds(40, 250, 100, 20);

        textField_1.setBounds(140, 50,  150, 20);
        textField_2.setBounds(140, 90,  150, 20);
        textField_3.setBounds(140, 130, 150, 20);
        textField_4.setBounds(140, 170, 150, 20);
        textField_5.setBounds(140, 210, 150, 20);
        textField_6.setBounds(140, 250, 150, 20);

        btn_add.setBounds      (40,  300, 110,  30);
        btn_clear.setBounds    (180, 300, 110,  30);
        btn_delete.setBounds   (350, 600, 250, 30);
        btn_deleteAll.setBounds(650, 600, 250, 30);
        tableScroller.setBounds(350, 50,  550, 500);

        tableScroller.getViewport().setBackground(new Color(0xFF0000));



        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        frame.add(label_5);
        frame.add(label_6);

        frame.add(textField_1);
        frame.add(textField_2);
        frame.add(textField_3);
        frame.add(textField_4);
        frame.add(textField_5);
        frame.add(textField_6);

        frame.add(btn_add);
        frame.add(btn_clear);
        frame.add(btn_delete);
        frame.add(btn_deleteAll);
        frame.add(tableScroller);

        // btn_add الأوامر التي تنفذ عند النقر على الـ
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // إذا قام المستخدم بإدخال بيانات في مربعات النصوص الثلاثة
                if( !textField_1.getText().equals("") && !textField_2.getText().equals("") && !textField_3.getText().equals("") )
                {
                    // عندها سيتم تخزينهم في متغيرات بشكل مؤقت
                    String id = textField_1.getText();
                    String name = textField_1.getText();

                    // الخاصة بالجدول model بعدها سيتم تخزينهم في مصفوفة واحدة, ثم إضافتها في الـ
                    String[] userInfo = { id, name };
                    model.addRow( userInfo );
                }
                else
                    JOptionPane.showMessageDialog(null,"Error input ! \nThere are items that have not been entered.","Error Message",JOptionPane.ERROR_MESSAGE);

            }
        });


        // btn_clear هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // سيتم مسح النصوص المدخلة في مربعات النصوص الثلاثة
                textField_1.setText("");
                textField_2.setText("");
            }
        });


        // btn_delete هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // إذا كان المستخدم قد قام بتحديد سطر واحد على الأقل من الجدول
                if( table.getSelectedRowCount() > 0 )
                {
                    // الخاص فيه index كل سطر قام المستخدم بتحديده من الجدول بعدها سيتم حذف كل سطر من خلال رقم الـ index سيتم تخزين رقم
                    int[] selectedIndices = table.getSelectedRows();
//                    JOptionPane.showMessageDialog(null,"Do you want to delete ?","Question Message",JOptionPane.QUESTION_MESSAGE);

                    for( int i=selectedIndices.length-1; i>=0; i-- )
                    {

                        model.removeRow( selectedIndices[i] );
                    }
                }
            }
        });


        // btn_deleteAll هنا نضع الأوامر التي نريد تنفيذها عند النقر على الـ
        btn_deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // يساوي 0. أي سيتم مسح جميع العناصر الموجودة فيها model هنا سيتم جعل عدد أسطر الـ
                model.setRowCount(0);
            }
        });

        //لاظهار قائمة عند الضغط على الزر الأيمن للفأرة
        class PopUpDemo extends JPopupMenu {
            JMenuItem Update ;
            JMenuItem Delete ;
            JMenuItem View ;


            public PopUpDemo() {
                Delete = new JMenuItem("Delete");
                Update = new JMenuItem("Update");
                View   = new JMenuItem("View");
                add(View);
                add(Update);
                add(Delete);
            }
        }
        class PopClickListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    doPop(e);
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    doPop(e);
            }

            private void doPop(MouseEvent e) {
                PopUpDemo menu = new PopUpDemo();
                menu.show(e.getComponent(), e.getX(), e.getY());
            }
        }

        tableScroller.addMouseListener(new PopClickListener());

    }
}



