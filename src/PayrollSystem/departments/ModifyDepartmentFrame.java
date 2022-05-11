package PayrollSystem.departments;

// Imports
import PayrollSystem.Main;

import java.awt.*;
import java.awt.event.*;

// 'javax' used strictly for interfaces
import javax.swing.*; // JFrame

// import org.payroll.*;
import java.util.*; // ArrayList

public class ModifyDepartmentFrame extends JFrame {

    // Version 1L (Version of the interface)
    private static final long serialVersionUID = 1L;

    ArrayList<String> departments = Main.dbManager.getListOfDepartments();

    JLabel lbl_dep_name, lbl_basic_salary, lbl_da, lbl_hra, lbl_pf;
    JTextField txt_basic_salary, txt_da, txt_hra, txt_pf;
    JButton btn_cancel, btn_update;
    JComboBox<String> txt_dep_name;

    // Constructors
    public ModifyDepartmentFrame(){
        initFrame();
        initComponents();
        configureComponents();
        addActionListeners();
        addComponentsToFrame();
    }

    void initFrame(){
        setTitle("Update Department"); // Naming your interface
        setSize(320, 195);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    void initComponents(){

        /*JLabel lbl_dep_name, lbl_basic_salary, lbl_da, lbl_hra, lbl_pf;
    JTextField txt_basic_salary, txt_da, txt_hra, txt_pf;
    JButton btn_cancel, btn_create;
    JComboBox<String> txt_dep_name;*/

        // JLabel
        lbl_dep_name = new JLabel("           dep_name:  ");
        lbl_basic_salary = new JLabel("Basic Salary ");
        lbl_da = new JLabel("DA%:  ");
        lbl_hra = new JLabel("           HRA%: ");
        lbl_pf = new JLabel("           PF%: ");


        // JTextField
        txt_basic_salary = new JTextField(18);
        txt_da = new JTextField(18);
        txt_hra = new JTextField(18);
        txt_pf = new JTextField(18);
        txt_dep_name = new JComboBox<String>(departments.toArray(new String[departments.size()]));

        // Buttons
        btn_cancel = new JButton("Cancel");
        btn_update = new JButton("Update");
    }

    void configureComponents(){
        txt_da.setText("10");
        txt_hra.setText("14");
        txt_pf.setText("8");
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

        btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String dep_name = txt_dep_name.getSelectedItem().toString();
                    int basic_salary = Integer.parseInt(txt_basic_salary.getText());
                    int da = Integer.parseInt(txt_da.getText());
                    int hra = Integer.parseInt(txt_hra.getText());
                    int pf = Integer.parseInt(txt_pf.getText());

                    if(Main.dbManager.existsDepartmet(dep_name)){
                        Main.dbManager.updateDepartment(dep_name, basic_salary, da, hra, pf);
                        setVisible(false);
                        JOptionPane.showMessageDialog(
                                null,
                                "Updated successfully",
                                "Department Updated",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(
                                null,
                                "Doesn't exist",
                                "Error",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                }catch (NumberFormatException e1){
                    System.err.println(e1.getMessage());
                }
            }
        });
    }
}
