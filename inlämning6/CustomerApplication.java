import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerApplication {

	private JFrame frmCustomer; 
	private JTextField textField_Name;
	private JTextField textField_CNbr;
	private final ButtonGroup buttonGroup = new ButtonGroup(); 
	private JTextField textField_CardType;
	private JTextField textField_CardNbr; 
	private JRadioButton rdbtnHasCard; 
	private JRadioButton rdbtnNoCard; 
	private JLabel lblResponse;

	private Controller controller; //Koppling till klassen Controller 
	private CustomerRegister customerRegister;
	private AbstractButton btnAdd;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerApplication window = new CustomerApplication();
					window.frmCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomer = new JFrame();
		frmCustomer.setTitle("Customer");
		frmCustomer.setBounds(100, 100, 450, 300);
		frmCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCustomer.getContentPane().setLayout(null);
		

	
		
		JButton btnNewButton = new JButton("Add");
	
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
            String cName = textField_Name.getText();
            String cNumber = textField_CNbr.getText();
            if (rdbtnHasCard.isSelected()) {
                String cardType = textField_CardType.getText();
                int cardNumber;
                try {
                	cardNumber = Integer.parseInt(textField_CardNbr.getText()); 
                	controller.addCustomer(cNumber, cName, cardNumber, cardType); 
                	lblResponse.setText("Response:");
                }catch (Exception e1) {
                	lblResponse.setText("Response: Ogiltigt värde, Card Number.");
                }
            	} else {
                controller.addCustomer(cNumber, cName);
                lblResponse.setText("Response:");
            }
			} });
		btnNewButton.setBounds(23, 140, 117, 29);
		frmCustomer.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Find");
		btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
		          String cNumber = textField_CNbr.getText();
		          String[] tmpCustomer = controller.findCustomer(cNumber);
		          if (tmpCustomer != null) {
		               lblResponse.setText("Response:");
		               if (tmpCustomer.length == 4) { //Have creditcard
		                   textField_CNbr.setText(tmpCustomer[0]);
		                   textField_Name.setText(tmpCustomer[1]);
		                   textField_CardType.setText(tmpCustomer[2]);
		                   textField_CardNbr.setText(tmpCustomer[3]);
		                   rdbtnHasCard.setSelected(true);
		              } else if (tmpCustomer.length == 2) {
		                   textField_CNbr.setText(tmpCustomer[0]);
		                   textField_Name.setText(tmpCustomer[1]);
		                   textField_CardType.setText("");
		                   textField_CardNbr.setText("");
		                   rdbtnNoCard.setSelected(true);
		              }
		               }else {
		               lblResponse.setText("Response: Customer not found");
		          }
		}
		 });
		btnNewButton_1.setBounds(169, 140, 117, 29);
		frmCustomer.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(169, 193, 117, 29);
		frmCustomer.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New name");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cNumber = textField_CNbr.getText();
		        String[] tmpCustomer = controller.findCustomer(cNumber);
		        if (tmpCustomer != null) {
		            lblResponse.setText("Response:");
		            String newName = textField_Name.getText();
		            controller.updateCustomerName(cNumber, newName);
		        }else{
		        	lblResponse.setText("Response: Customer not found");
		        } 
			}
		});
		btnNewButton_3.setBounds(23, 193, 117, 29);
		frmCustomer.getContentPane().add(btnNewButton_3);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(6, 26, 130, 26);
		frmCustomer.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_CNbr = new JTextField();
		textField_CNbr.setBounds(148, 26, 130, 26);
		frmCustomer.getContentPane().add(textField_CNbr);
		textField_CNbr.setColumns(10);
		
		textField_CardType = new JTextField();
		textField_CardType.setBounds(6, 84, 130, 26);
		frmCustomer.getContentPane().add(textField_CardType);
		textField_CardType.setColumns(10);
		
		textField_CardNbr = new JTextField();
		textField_CardNbr.setBounds(148, 84, 130, 26);
		frmCustomer.getContentPane().add(textField_CardNbr);
		textField_CardNbr.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(6, 6, 61, 16);
		frmCustomer.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Number");
		lblNewLabel_1.setBounds(148, 6, 119, 16);
		frmCustomer.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Card Type");
		lblNewLabel_2.setBounds(6, 68, 119, 16);
		frmCustomer.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Card Number");
		lblNewLabel_3.setBounds(148, 68, 130, 16);
		frmCustomer.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnHasCard = new JRadioButton("Has card");
		buttonGroup.add(rdbtnHasCard);
		rdbtnHasCard.setBounds(303, 27, 141, 23);
		frmCustomer.getContentPane().add(rdbtnHasCard);
		
		JRadioButton rdbtnNoCard = new JRadioButton("No card");
		buttonGroup.add(rdbtnNoCard);
		rdbtnNoCard.setBounds(303, 64, 141, 23);
		frmCustomer.getContentPane().add(rdbtnNoCard);
	}
}
