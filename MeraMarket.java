

import java.awt.event.*;
import javax.swing.*;



public class MeraMarket {

    public static void main(String[] args) {
        ToolCreater t = new ToolCreater("MeraMarket");
    }

}





//main page of meraMarket
class ToolCreater extends JFrame {

    int count=0;
    String name;
    public ToolCreater() {
        FrameCreator();
    }

    public ToolCreater(String s) {
        // super(s);
        name=s;
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(1600, 900);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 
     */
    public void setBackground() {
        JLabel logo=new JLabel(new ImageIcon("SwingBackground//logo.jpg"));
        add(logo);
        logo.setBounds(10,20,409,72);
        // setLayout(new BorderLayout());
        // setContentPane(new JLabel(new ImageIcon("SwingBackground\\mm.jpg")));
        // getContentPane().setBackground(Color.AQUA);
        
        // setBackground( "WHITESMOKE");
    }

    

    public void productImage()
    {
        JLabel lap1=new JLabel(new ImageIcon("product//laptop//asus.jpg"));
        JLabel name_lap1=new JLabel("Asus");
        JTextArea features_lap1=new JTextArea("Intel i5 11th gen\n8gb ddr4 Ram\n512gb ssd\nPrice:4999");
        JButton btn1=new JButton("Add to Cart");

        JLabel lap2=new JLabel(new ImageIcon("product//laptop//dell.jpg"));
        JLabel name_lap2=new JLabel("Dell Inpiron 15");
        JTextArea features_lap2=new JTextArea("Intel i5 11th gen\n8gb ddr4 Ram\n512gb ssd\nprice:54999");
        JButton btn2=new JButton("Add to Cart");

        JLabel lap3=new JLabel(new ImageIcon("product//laptop//hp.jpg"));
        JLabel name_lap3=new JLabel("Hp");
        JTextArea features_lap3=new JTextArea("Intel i5 11th gen\n8gb ddr4 Ram\n1TB ssd\nprice:59999");
        JButton btn3=new JButton("Add to Cart");

        JLabel lap4=new JLabel(new ImageIcon("product//laptop//macbook.jpg"));
        JLabel name_lap4=new JLabel("MackBook Air");
        JTextArea features_lap4=new JTextArea("A15\n8gb ddr4 Ram\n512gb ssd\nprice:99999");
        JButton btn4=new JButton("Add to Cart");

        JLabel lap5=new JLabel(new ImageIcon("product//laptop//mi.jpg"));
        JLabel name_lap5=new JLabel("MI");
        JTextArea features_lap5=new JTextArea("Intel i5 11th gen\n8gb ddr4 Ram\n512gb ssd\nprice:44999");
        JButton btn5=new JButton("Add to Cart");
        
        features_lap1.setEditable(false);
        features_lap2.setEditable(false);
        features_lap3.setEditable(false);
        features_lap4.setEditable(false);
        features_lap5.setEditable(false);

        add(lap1);
        add(lap2);
        add(lap3);
        add(lap4);
        add(lap5);

        add(name_lap1);
        add(name_lap2);
        add(name_lap3);
        add(name_lap4);
        add(name_lap5);

        add(features_lap1);
        add(features_lap2);
        add(features_lap3);
        add(features_lap4);
        add(features_lap5);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        

        lap1.setBounds(50, 300, 235, 234);
        lap2.setBounds(315, 300,235, 234);
        lap3.setBounds(580, 300,235, 234);
        lap4.setBounds(845, 300, 235, 234);
        lap5.setBounds(1110, 300, 235, 234);

        name_lap1.setBounds(90, 520, 185, 50);
        name_lap2.setBounds(355, 520,185, 50);
        name_lap3.setBounds(620, 520,185, 50);
        name_lap4.setBounds(895, 520, 185, 50);
        name_lap5.setBounds(1170, 520, 185, 50);

        features_lap1.setBounds(50, 570, 235, 100);
        features_lap2.setBounds(315, 570,235, 100);
        features_lap3.setBounds(580, 570,235, 100);
        features_lap4.setBounds(845, 570, 235, 100);
        features_lap5.setBounds(1110, 570, 235, 100);

        btn1.setBounds(90,700,110,50);
        btn2.setBounds(355,700,110,50);
        btn3.setBounds(620,700,110,50);
        btn4.setBounds(895,700,110,50);
        btn5.setBounds(1170,700,110,50);

        


        //mobile

        // JLabel mob1=new JLabel(new ImageIcon("product//mobile//g60.jpg"));
        // JButton btn5=new JButton("Add to Cart");
        // JLabel mob2=new JLabel(new ImageIcon("product//mobile//g72.jpg"));
        // JButton btn6=new JButton("Add to Cart");
        // JLabel mob3=new JLabel(new ImageIcon("product//mobile//realme.jpg"));
        // JButton btn7=new JButton("Add to Cart");
        // JLabel mob4=new JLabel(new ImageIcon("product//mobile//vivo.jpg"));
        // JButton btn8=new JButton("Add to Cart");
        
        // add(mob1);
        // add(mob2);
        // add(mob3);
        // add(mob4);

        // add(btn5);
        // add(btn6);
        // add(btn7);
        // add(btn8);

        // mob1.setBounds(50, 900, 235, 234);
        // mob2.setBounds(315, 900, 235, 234);
        // mob3.setBounds(580, 900, 235, 234);
        // mob3.setBounds(845, 900, 235, 234);

        // btn5.setBounds(90, 1000,110, 60);
        // btn6.setBounds(355, 1000, 110, 60);
        // btn7.setBounds(620, 1000, 110, 60);
        // btn8.setBounds(895, 1000, 110, 60);



        //actionListner
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count+=1;
                JOptionPane.showMessageDialog(null, "This item is added to Cart", "Cart", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count+=1;
                JOptionPane.showMessageDialog(null, "This item is added to Cart", "Cart", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count+=1;
                JOptionPane.showMessageDialog(null, "This item is added to Cart", "Cart", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count+=1;
                JOptionPane.showMessageDialog(null, "This item is added to Cart", "Cart", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count+=1;
                JOptionPane.showMessageDialog(null, "This item is added to Cart", "Cart", JOptionPane.INFORMATION_MESSAGE);

            }
        });


    }


    public void SaleImage() {
        //BufferedImage myPicture = ImageIO.read(new File("D:\\projects\\HoliSale\\HoliSale.jpg"));
        JLabel picLabel = new JLabel();
        
        add(picLabel);
        //picLabel.SetBounds(50,300,907,484);
        picLabel.setBounds(120, 200, 907, 484);

    }



    public void FrameCreator() {
        //calling background function
        
        setBackground();

        //initalization of compunents
        //1st row compunent intilization
        JLabel L_Search;
        JTextField T_SearchBox;
        JButton B_Search, B_Account, B_Wishlist, B_Cart, B_Feedback;

        //2nd row compunent intilization
        JComboBox C_Fashions, C_Electronics, C_Home, C_Application;

        //memmory allocation of compunents
        //1st row memmory allocation 
        L_Search = new JLabel("Search");
        T_SearchBox = new JTextField();
        T_SearchBox = new JTextField();
        B_Feedback = new JButton(new ImageIcon("SwingIcon\\feedback.jpg"));
        B_Search = new JButton(new ImageIcon("SwingIcon\\search_icon.png"));
        B_Account = new JButton(new ImageIcon("SwingIcon\\user.jpg"));
        B_Wishlist = new JButton(new ImageIcon("SwingIcon\\wishlist.jpg"));
        B_Cart = new JButton(new ImageIcon("SwingIcon\\cart.jpg"));

        //2nd row memmory allocation
        String[] fashion = {"fashion", "Men's Top wear", "Men's Bottom wear", "Female's Top wear", "Female's Bottom wear"};
        C_Fashions = new JComboBox(fashion);

        String[] Electronics = {"Electronics", "Laptop and Desktop", "Audio", "Mobiles", "Tablets"};
        C_Electronics = new JComboBox(Electronics);

        String[] Application = {"Applications", "Televisions", "Wasing machine", "Air conditioners"};
        C_Application = new JComboBox(Application);

        String[] Home = {"Home", "Home Furnishings", "Living Room", "Kitchen & Dining", "Bedroom"};
        C_Home = new JComboBox(Home);

        //adding the compunent into frame
        //1st row
        add(L_Search);
        add(B_Feedback);
        add(T_SearchBox);
        //add(C_Categories);
        add(B_Search);
        add(B_Account);
        add(B_Wishlist);
        add(B_Cart);

        //2nd row
        add(C_Fashions);
        add(C_Electronics);
        add(C_Application);
        add(C_Home);

        //setting up the dimension in frame
        //1st row     
        L_Search.setBounds(460, 35, 50, 50);
        T_SearchBox.setBounds(520, 35, 370, 40);

        B_Search.setBounds(890, 35, 50, 40);
        B_Account.setBounds(1040, 5, 105, 102);
        B_Wishlist.setBounds(1155, 5, 105, 102);
        B_Cart.setBounds(1270, 5, 105, 102);
        B_Feedback.setBounds(1385, 5, 105, 102);

        //2nd row
        C_Fashions.setBounds(100, 180, 200, 50);
        C_Electronics.setBounds(400, 180, 200, 50);
        C_Application.setBounds(700, 180, 200, 50);
        C_Home.setBounds(1000, 180, 200, 50);

        //calling actionlistener
        B_Feedback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //code
            //    new FeedBack();
                JOptionPane.showMessageDialog(null, "Please give us FeedBack", "FeedBack", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Database is not created", " ", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new RegistrationFrame();
                JOptionPane.showMessageDialog(null, "database is not created", " LOGIN", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Wishlist.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Please login first", "WISHLIST", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Cart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "please login first", "CART", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        //adding image
        SaleImage();
        productImage();
        setScrren();

    }
}
