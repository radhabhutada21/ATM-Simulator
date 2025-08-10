//package ASimulatorSystem;
        import java.awt.Image;
        import java.awt.*;
        import java.awt.event.*;

        import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton login,signUp, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    String pin;
    Login() {
        this.pin=pin;
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card no. ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,220,250,30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(300,350,230,30);
        signUp.setBackground(Color.black);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        add(signUp);

        getContentPane().setBackground(Color.white);
        setSize(800, 480); //Defines the length and breadth of the frame
        setVisible(true); //Allows to visible the frame
        setLocation(250,0); //350 aage se and 250 upar se It is used to set the location
    };
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == login) {
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
        else if(ae.getSource() == signUp) {
            setVisible(false);
            new Signup().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
