
import java.awt.event.*;

import javax.swing.*;

/*Login page */
class LoginFrame extends JFrame  {

    LoginFrame() {
        FrameCreator();
    }

    LoginFrame(String s) {
        super(s);
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(600, 700);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }

    public void FrameCreator() {
        //defineing the compunent
        JLabel L_UserId, L_psd;
        JTextField T_UserTextArea;
        JPasswordField P_Pass;
        
        JButton B_Login, B_Skip, B_Exit ,J_BRegistration,B_ForgetPassword;

        //allocation of memmory to compunents
        L_UserId = new JLabel("USER ID");
        L_psd = new JLabel("PASSWORD");
        T_UserTextArea = new JTextField();
        P_Pass = new JPasswordField();
        B_Login = new JButton("LOGIN");
        B_Skip = new JButton("SKIP");
        B_ForgetPassword = new JButton("Forget Password");
        B_Exit = new JButton("EXIT");
        J_BRegistration= new JButton("CREATE  YOUR  ACCOUNT  WITH   MeraMarket");
        
        //set the dimension
        L_UserId.setBounds(75, 100, 115, 20);
        T_UserTextArea.setBounds(225, 100, 260, 20);
        L_psd.setBounds(75, 200, 115, 20);
        P_Pass.setBounds(225, 200, 260, 20); 
        B_ForgetPassword.setBounds(75,400,400,30); 
        B_Login.setBounds(75, 300, 70, 30);        
        B_Skip.setBounds(250, 300, 70, 30); 
        B_Exit.setBounds(425, 300, 70, 30);       
        J_BRegistration.setBounds(75, 480, 400, 30);  
                
            
                
       
        
        
        //adding the element
        add(L_UserId);
        add(L_psd);
        
        add(T_UserTextArea);
        add(P_Pass);
        add(B_ForgetPassword);
        add(B_Login);
        add(B_Skip);
        add(B_Exit);
        add(J_BRegistration);     
        
        
        
        
        //event handling 
        
        
        B_Login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              String s=T_UserTextArea.getText();
            //   JOptionPane.showMessageDialog(null,"Dear "+s+"  we are currently facing issue so please press skip button to jump in MeraMarket" ," ",JOptionPane.INFORMATION_MESSAGE);
              //GET PASSWORD AND TEXT COMPARE AND THEN LOGIN
               
               }
        });
        
        
        
        B_Skip.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new ToolCreater().setVisible(true);
               dispose();
               }
        });
        
        
        B_Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               System.exit(0);
            }
        });
        
        
        
        J_BRegistration.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new RegistrationFrame();
               dispose();
            }
        });
        //calling the frame
        setScrren();
        
    
    }
}









/*FeedBack page */
class FeedBack extends JFrame
{
    FeedBack()
    {
       FrameCreator(); 
    }
    
    FeedBack(String s)
    {
        super(s);
        FrameCreator();
    }
    
    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(600,600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }
    
    public void FrameCreator()
    {
        //initilization of compunent
        JLabel L_TOP,L_Feedback;
        JTextArea T_Feedback;
        JButton B_Submit;
        
        
        //memmory allocation of compunents
        L_TOP=new JLabel("PLEASE GIVE YOUR FEEDBACK");
        L_Feedback=new JLabel("PLEASE GIVE US FEEDBACK FOR YOUR BETTER EXPERINCE");
        
        T_Feedback=new JTextArea();
        B_Submit=new JButton("SUBMIT");
        
        //size set
        L_TOP.setBounds(150, 50, 400, 50);
        L_Feedback.setBounds(100, 200, 400, 50);
        T_Feedback.setBounds(80, 250, 400, 200);
        B_Submit.setBounds(250, 500, 80, 30);
        
        
        //adding compunent in java
        add(L_TOP);
        add(L_Feedback);
        add(T_Feedback);
        add(B_Submit);
        
        
        //calling actionlistener
        B_Submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //code
                //new ToolCreater();
                JOptionPane.showMessageDialog(null,"this project is underconstruction"," ",JOptionPane.PLAIN_MESSAGE);
                
                
            }
        });

        //scrren set
        setScrren();
    }
}








/*Regidtration page */
class RegistrationFrame extends JFrame {

    public RegistrationFrame() {
        FrameCreator();

    }

    public RegistrationFrame(String s) {
        super(s);
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(800, 800);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }

    public void FrameCreator() {
        JLabel L_CreateAccount, L_Name, L_Gender, L_PhoneNo, L_Email, L_Password, L_RePassword, L_CheckButton;
        JTextField T_Name, T_PhoneNo, T_Email, T_CheckButton;
        JPasswordField P_Password, P_RePassword;
        JRadioButton R_Male, R_Female;
        JCheckBox C_ChechBox;
        JButton B_Submit;

        //
        L_CreateAccount = new JLabel("CREATE   ACCOUNT");
        L_Name = new JLabel("YOUR  NAME");
        L_Gender = new JLabel("ENTER YOUR GENDER");
        L_PhoneNo = new JLabel("PHONE NO");
        L_Email = new JLabel("EMAIL ADDRESS");
        L_Password = new JLabel("PASSWORD");
        L_RePassword = new JLabel("CONFORM PASSWORD");
        L_CheckButton = new JLabel("I HAD READ ALL THE TERMS AND CONDITIONS");

        T_Name = new JTextField();
        T_PhoneNo = new JTextField();
        T_Email = new JTextField();
        T_CheckButton = new JTextField();
        P_Password = new JPasswordField();

        P_RePassword = new JPasswordField();
        R_Male = new JRadioButton("MALE");
        R_Female = new JRadioButton("FEMALE");
        ButtonGroup bg=new ButtonGroup();
        bg.add(R_Male);
        bg.add(R_Female);
        C_ChechBox = new JCheckBox();
        B_Submit=new JButton("SUBMIT");
        

        //dimension seeting
        L_CreateAccount.setBounds(280, 25, 300, 50);
        L_Name.setBounds(50, 150, 100, 30);
        T_Name.setBounds(180,150,400,30);
        L_Gender.setBounds(50, 210, 150, 30);
        R_Male.setBounds(200, 210, 200, 30);  
        R_Female.setBounds(200, 260, 200, 30);        
        L_PhoneNo.setBounds(50, 310, 100, 30); 
        T_PhoneNo.setBounds(180,310,400,30);
        L_Email.setBounds(50, 360, 100, 30);        
                
        T_Email.setBounds(180, 360, 400, 30);       
                
        L_Password.setBounds(50, 410, 100, 30);    
        P_Password.setBounds(180, 410, 400, 30);   
        L_RePassword.setBounds(50, 460, 130, 30);   
        P_RePassword.setBounds(180, 460, 400, 30);  
        C_ChechBox.setBounds(50, 560, 50, 30);  
        L_CheckButton.setBounds(100, 560, 300, 30);  
        B_Submit.setBounds(300, 650, 100, 30);  
                
        
        
        
        add(L_CreateAccount);
        add(L_Name);
        add(L_Gender);
        add(L_PhoneNo);
        add(L_Email);
        add(L_Password);
        add(L_RePassword);
        add(L_CheckButton);
        add(T_Name);
        add(T_PhoneNo);
        add(T_Email);
        add(T_CheckButton);
        add(P_Password);
        add(P_RePassword);
        add(R_Male);
        add(R_Female);
        add(C_ChechBox);
        add(B_Submit);
               
        
        
         //calling actionlistener
        B_Submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //code
               
                
                JOptionPane.showMessageDialog(null,"this project is underconstruction"," ",JOptionPane.INFORMATION_MESSAGE);
                //new LoginFrame();
                dispose();
               
                
                
            }
        });
        
        
        
        
        
        
        setScrren();

    }

}






/*Main class */
public class LoginJava {
    public static void main(String[] args)
    {
        LoginFrame b = new LoginFrame("user login");
    }

    
}
