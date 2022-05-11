package PayrollSystem.employees;

// Imports
import PayrollSystem.Main;

import java.awt.*;
import java.awt.event.*;

// 'javax' used strictly for interfaces
import javax.swing.*; // JFrame

// import org.payroll.*;
import java.util.*; // ArrayList

public class DeleteEmployeeFrame extends JFrame{
    private static final long serialVersionUID = 1L;

    JLabel lbl_id;
    JTextField txt_id;
    JButton btn_cancel, btn_delete;

    // Constructors
    public DeleteEmployeeFrame(){
        initFrame();
        initComponents();
        configureComponents();
        addActionListeners();
        addComponentsToFrame();
    }
    void initFrame(){
        setTitle("Delete Employee"); // Naming your interface
        setSize(260, 100);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    void initComponents(){

        // JLabel
        lbl_id = new JLabel("           ID: ");


        // JTextField
        txt_id = new JTextField(18);

        // Buttons
        btn_cancel = new JButton("Cancel");
        btn_delete = new JButton("Delete");
    }

    void configureComponents(){
    }


    // Adding action listeners
    void addActionListeners(){
        btn_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int id = Integer.parseUnsignedInt(txt_id.getText());

                    if(Main.dbManager.existsEmployeeID(id)){
                        Main.dbManager.deleteEmployee(id);
                        setVisible(false);
                        JOptionPane.showMessageDialog(
                                null,
                                "Deleted Successfully",
                                "Delete Employee",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(
                                null,
                                "ID does not exist",
                                "Error",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                } catch (NumberFormatException e1){
                    System.err.println(e1.getMessage());
                }
            }
        });
    }

    void addComponentsToFrame(){
        add(lbl_id);
        add(txt_id);
        add(btn_cancel);
        add(btn_delete);
    }
}
