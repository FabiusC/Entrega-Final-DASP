import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;
import java.util.*;

class SoftwareEnterpriseBuilder extends UIBuilder {

    private JTextField txtLocation = new JTextField(15);
    private JTextField txtEmployeesQuantity = new JTextField(15);
    private JTextField txtEmail = new JTextField(20);
    private JTextField txtUrl = new JTextField(20);
    private JTextField txtPhoneNumber = new JTextField(15);

    public void addUIControls() {
        searchUI = new JPanel();
        JLabel lblLocation = new JLabel("Location :");
        JLabel lblEmployeesQuantity = new JLabel("Employees Quantity :");
        JLabel lblEmail = new JLabel("Email :");
        JLabel lblUrl = new JLabel("Url :");
        JLabel lblPhoneNumber = new JLabel("Phone Number :");

        GridBagLayout gridbag = new GridBagLayout();
        searchUI.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        searchUI.add(lblLocation);
        searchUI.add(txtLocation);
        searchUI.add(lblEmployeesQuantity);
        searchUI.add(txtEmployeesQuantity);
        searchUI.add(lblEmail);
        searchUI.add(txtEmail);
        searchUI.add(lblUrl);
        searchUI.add(txtUrl);
        searchUI.add(lblPhoneNumber);
        searchUI.add(txtPhoneNumber);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(lblLocation, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(lblEmployeesQuantity, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(lblEmail, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gridbag.setConstraints(lblUrl, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(lblPhoneNumber, gbc);

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gridbag.setConstraints(txtLocation, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(txtEmployeesQuantity, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(txtEmail, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(txtUrl, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(txtPhoneNumber, gbc);
        

    }

    public void initialize() {
        txtLocation.setText("Bogotá");
        txtEmployeesQuantity.setText("50");
        txtEmail.setText("correodeejemplo@ejemplo.com");
        txtUrl.setText("urldeejemplo.com");
        txtPhoneNumber.setText("0123456789");
    }

    public String getSQL() {

        return ("Select * from SoftwareEnterprise where Location='"
                + txtLocation.getText() + "' and EmployeesQuantity" 
                + txtEmployeesQuantity.getText() + "* and Email='"
                + txtEmail.getText() + "' and Url=*" + txtUrl.getText()
                + "* and PhoneNumber=*" + txtPhoneNumber.getText()+"*");

    }

}
