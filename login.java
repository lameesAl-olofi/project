import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class login {

    public static void main(String[] args) {

        ControlMedicine medicines = new ControlMedicine();

        //اسم الصيدلية
        final String namePharmacy ="";

        //النافذة الرئيسية تحتوي على اسم المستخدم و كلمة المرور الخاصة به
        JFrame frame=new JFrame(namePharmacy+" pharmacy");
        frame.setSize(1000,700);
        frame.setLocation(250,90);
        ImageIcon img = new ImageIcon("p.png");
        frame.setIconImage(img.getImage());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //الخلفية
        frame.setLayout(new BorderLayout());
        Container container= new Container();
        frame.setContentPane(new JLabel(new ImageIcon("p.jpg")));
        container.setSize(200,200);


        //تغيير نوع الخط وحجمه
        Font newFont = new Font("Times New Roman", Font.BOLD, 18);

        //  تعريف العناصر التي سنضعها في ال panel  و panel
        JPanel panelLogin =new JPanel();
        JLabel labelTitle = new JLabel("Login to pharmacy");
        JLabel labelName = new JLabel(" User Name: ");
        JLabel labelPass = new JLabel(" Password: ");
        JCheckBox checkBox = new JCheckBox(" Show characters");
        JTextField textPharmacist = new JTextField();
        JPasswordField passwordPharmacist = new JPasswordField();
        JButton btn_login= new JButton("Login");

        //تغيير الاحجام و المواقع للعناصر
        panelLogin.setBounds            (0,30,400,490);
        labelTitle.setBounds        (70, 100, 500, 50);
        labelName.setBounds         (10, 230, 200, 30);
        textPharmacist.setBounds    (150, 230, 200, 30);
        labelPass.setBounds         (10, 300, 200, 30);
        passwordPharmacist.setBounds(150, 300, 200, 30);
        checkBox.setBounds          (10, 350, 200, 30);
        btn_login.setBounds         (100,  450, 110,  30);

        //نوع الخط وحجمه
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 36));
        labelName.setFont(newFont);
        labelPass.setFont(newFont);
        checkBox.setFont(newFont);
        btn_login.setFont(newFont);

        //لون الخط
        Color color =new Color(0x385EE7);
        labelTitle.setForeground(color);
        labelName.setForeground(color);
        labelPass.setForeground(color);
        checkBox.setForeground(color);
        btn_login.setForeground(color);

        //تغيير خلفية الازرار
        checkBox.setBackground(Color.white);
        panelLogin.setBackground(Color.white);
        btn_login.setBackground(new Color(0xFD79F1));

        //اضافة العناصر لل panel
        panelLogin.add(btn_login);
        panelLogin.add(labelTitle);
        panelLogin.add(labelName);
        panelLogin.add(textPharmacist);
        panelLogin.add(checkBox);
        panelLogin.add(passwordPharmacist);
        panelLogin.add(labelPass);
        //اضافة ال panel لل frame
        frame.add(panelLogin);

        panelLogin.setLayout(null);
        // لتفعيل زر Enter


        //عرض كلمة السر أو اخفاءها عند الضغط على check
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(checkBox.isSelected())
                    //اظهار كلمة السر
                    passwordPharmacist.setEchoChar('\0');
                else
                    // اخفاء كلمة السر
                    passwordPharmacist.setEchoChar('•');
            }
        });
//_________________________________________________________________________________________________________-

        //الاوامر التي ستنفذ عند الضغط على زر login
        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //التأكد من كلمة السر واسم المستخم اذا كانت صحيحة ينفذ  الاتي
            //passwordPharmacist.getPassword().equals(pharmacist.getPassword())  && textPharmacist.getText().equals(pharmacist.getPharmacistName())
             if (true){

                panelLogin.setVisible(false);
                JPanel panelBuy =new JPanel(null);
                JMenu medicine = new JMenu("Medicine");
                JMenuItem view = new JMenuItem("view all");
                JMenuItem search = new JMenuItem("search");
                JMenu account = new JMenu("pharmacist account");
                JMenuItem logout = new JMenuItem("logout");
                JMenuBar menuBar = new JMenuBar();
                JLabel label1 = new JLabel("Name");
                JLabel label2 = new JLabel("Price of one");
                JLabel label3 = new JLabel("Expiry date");
                JLabel label4 = new JLabel("Production date");
                JLabel label5 = new JLabel("Company");
                JLabel label6 = new JLabel("Qty");
                JButton btnSell = new JButton("Sell");

                 JTextField textField1 = new JTextField();
                JTextField textField2 = new JTextField();
                JTextField textField3 = new JTextField();
                JTextField textField4 = new JTextField();
                JTextField textField5 = new JTextField();
                JTextField textField6 = new JTextField();

                label1.setBounds(200, 50,  200, 30);
                label5.setBounds(200, 90,  200, 30);
                label3.setBounds(200, 130, 200, 30);
                label4.setBounds(200, 170, 200, 30);
                label2.setBounds(200, 210, 200, 30);
                label6.setBounds(200, 250, 200, 30);

                textField1.setBounds(350, 50,  300, 30);
                textField2.setBounds(350, 90,  300, 30);
                textField3.setBounds(350, 130, 300, 30);
                textField4.setBounds(350, 170, 300, 30);
                textField5.setBounds(350, 210, 300, 30);
                textField6.setBounds(350, 250, 300, 30);
                btnSell.setBounds(350,330,300,40);

                 label1.setFont(newFont);
                 label2.setFont(newFont);
                 label3.setFont(newFont);
                 label4.setFont(newFont);
                 label5.setFont(newFont);
                 label6.setFont(newFont);
                 btnSell.setFont(newFont);

                panelBuy.setBackground(Color.white);
                panelBuy.setSize(1000,700);

                medicine.add(view);
                medicine.add(search);
                menuBar.add(medicine);
                account.add(logout);
                menuBar.add(account);
                panelBuy.add(menuBar);
                panelBuy.add(label1);
                panelBuy.add(label2);
                panelBuy.add(label3);
                panelBuy.add(label4);
                panelBuy.add(label5);
                panelBuy.add(label6);
                panelBuy.add(textField1);
                panelBuy.add(textField2);
                panelBuy.add(textField3);
                panelBuy.add(textField4);
                panelBuy.add(textField5);
                panelBuy.add(textField6);
                panelBuy.add(btnSell);

                view.setFont(new Font("Times New Roman", Font.BOLD, 14));
                search.setFont(new Font("Times New Roman", Font.BOLD, 14));
                account.setFont(new Font("Times New Roman", Font.BOLD, 14));
                logout.setFont(new Font("Times New Roman", Font.BOLD, 14));

                // الاوامر التي ستحدث عند الضغط على زر sell
                 btnSell.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e)
                 {
                     // حساب الفاتورة

                     //انقاص من الكمية في الملف
                 }
            });
//_________________________________________________________________________________________________________-
                 // البحث
                    search.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e)
                     {
                         frame.remove(panelLogin);

                     JPanel panelSearch = new JPanel(null);
                     JLabel label1 = new JLabel("id: ");
                    JLabel label2 = new JLabel("Name: ");
                    JLabel label3 = new JLabel("Company: ");
                    JTextField field1 = new JTextField();
                    JTextField field2 = new JTextField();
                    JTextField field3 = new JTextField();
                    JButton btnSearch = new JButton("Search");
                    JButton btnBack = new JButton("Back");
                    DefaultTableModel model = new DefaultTableModel();
                    JTable table = new JTable( model );
                    JScrollPane tableScroller = new JScrollPane( table );

                    //   أعمدة الجدول
                    model.addColumn("ID");
                    model.addColumn("Name");
                    model.addColumn("Price");
                    model.addColumn("Expiry Date");
                    model.addColumn("Production Date");
                    model.addColumn("Company");

                    //اضافة البيانات للجدول
                    //                         model.addRow(  );

                    panelSearch.setBackground(Color.white);

                    panelSearch.setSize   (1000,700);
                    label1.setBounds(10, 40, 200, 30);
                    label2.setBounds(10, 80, 200, 30);
                    label3.setBounds(10, 120, 200, 30);
                    field1.setBounds(100, 40, 200, 30);
                    field2.setBounds(100, 80, 200, 30);
                    field3.setBounds(100, 120, 200, 30);
                    btnSearch.setBounds(105,200,100,30);
                    btnBack.setBounds(10,600,100,30);
                    tableScroller.setBounds(350, 40,  600, 550);

                    label1.setFont(newFont);
                    label2.setFont(newFont);
                    label3.setFont(newFont);
                    field1.setFont(newFont);
                    field2.setFont(newFont);
                    field3.setFont(newFont);
                    btnSearch.setFont(newFont);
                    btnBack.setFont(newFont);


                    //                        medicines.searchForMedicine();
                    panelSearch.add(label1);
                    panelSearch.add(label2);
                    panelSearch.add(label3);
                    panelSearch.add(field1);
                    panelSearch.add(field2);
                    panelSearch.add(field3);
                    panelSearch.add(btnSearch);
                    panelSearch.add(btnBack);
                    panelSearch.add(tableScroller);

                    btnBack.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                     panelSearch.setVisible(false);
                     panelBuy.setVisible(true);
                    }
                    });

                    // الاوامر التي ستحدث عند الضغط على زر search
                         btnSearch.addActionListener(new ActionListener() {
                             @Override
                             public void actionPerformed(ActionEvent e)
                             {
                                 //البحث في الملف عن البيانات المطلوبة وعرضها في الجدول
                                 // " ممكن حذف جميع البيانات و ابقاء البيانات المطلوبة
                                 // او تحديد البيانات المطلوبة من جميع البيانات و التحديد عليها بلون مختلف"

                             }
                         });
                         //////
                    frame.add(panelSearch);
                    }
                 });

//_________________________________________________________________________________________________________-
                 //زر العرض
                 view.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e)
                     {
                         frame.remove(panelBuy);

                         JPanel panelView = new JPanel(null);
                         DefaultTableModel model = new DefaultTableModel();
                        JTable table = new JTable( model );
                        JScrollPane tableScroller = new JScrollPane( table );
                         JButton btnBack = new JButton("Back");

                         //   أعمدة الجدول
                        model.addColumn("ID");
                        model.addColumn("Name");
                        model.addColumn("Price");
                        model.addColumn("Expiry Date");
                        model.addColumn("Production Date");
                        model.addColumn("Company");

                        panelView.setBackground(Color.white);

                        panelView.setSize   (1000,700);
                        tableScroller.setBounds(100, 10,  800, 550);
                        btnBack.setBounds(20,600,100,30);

                        panelView.add(tableScroller);
                        panelView.add(btnBack);
                        frame.add(panelView);

                         btnBack.addActionListener(new ActionListener() {
                             @Override
                             public void actionPerformed(ActionEvent e)
                             {
                                 panelView.setVisible(false);
                                 panelBuy.setVisible(true);
                             }
                         });
                     }
                 });
//_________________________________________________________________________________________________________-
                 //تسجيل الخروج للمستخدم

                 logout.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e)
                     {
                         frame.remove(panelBuy);

                         JLabel label1 = new JLabel("Sing out successfully");

                         label1.setBounds(70, 200, 500, 50);

                         label1.setFont(new Font("Times New Roman", Font.BOLD, 36));

                         label1.setForeground(color);

                         frame.add(label1);
                     }

                 });
//_________________________________________________________________________________________________________-

                 frame.setJMenuBar(menuBar);
                 frame.add(panelBuy);

             }
//_________________________________________________________________________________________________________-
// اذا كانت كلمة السر او اسم المسخدم خطأ
              else
                  JOptionPane.showMessageDialog(null, "There is no account with this name or password.", "Error Message", JOptionPane.ERROR_MESSAGE);

            }
// ارسال المحاولات الخاطئة الى المدير

        });


        frame.setVisible(true);

    }
}