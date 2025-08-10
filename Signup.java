//package ASimulatorSystem;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    private long formNumber;
    JTextField nameTextField, fname,fnameTextField, emailTextField, cityTextField, addressTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, married, unmarried, others;
    JDateChooser dateChooser;
    Signup() {
        setLayout(null);
        /*Random ran = new Random();
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);*/
        try {
            FileReader fr = new FileReader("formnumber.txt");
            BufferedReader br = new BufferedReader(fr);
            String lastFormNumber = br.readLine();
            if (lastFormNumber != null) {
                formNumber = Long.parseLong(lastFormNumber);
            } else {
                formNumber = 0;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Increment the formNumber for the current form
        formNumber++;
        try {
            FileWriter fw = new FileWriter("formnumber.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(formNumber));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        JLabel formno = new JLabel("Application Form No. "+formNumber);
        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(300,290,60,30);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(450,290,120,30);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(300,390,100,30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450,390,100,30);
        add(unmarried);

        others = new JRadioButton("Other");
        others.setBackground(Color.WHITE);
        others.setBounds(630,390,100,30);
        add(others);

        ButtonGroup other = new ButtonGroup();
        other.add(married);
        other.add(unmarried);
        other.add(others);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway", Font.BOLD, 14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Railway", Font.BOLD, 14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        next.setBounds(620,660,80,30);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(250,0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + formNumber; //long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        }
        else if(female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        }
        else if(unmarried.isSelected()) {
            marital = "Unmarried";
        }
        else if(others.isSelected()) {
            marital = "Other";
        }


        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"','"+address+"', '"+city+"','"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new Signup2(formno).setVisible(true);
            }
            if(fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is Required");
            }
            if(dob.equals("")) {
                JOptionPane.showMessageDialog(null, "DOB is Required");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Signup();

    }

}
