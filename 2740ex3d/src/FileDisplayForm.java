import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FileDisplayForm extends JFrame {

	private JPanel contentPane;
	private JTextField fileNameTextField;
	private JLabel fileContentsLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileDisplayForm frame = new FileDisplayForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FileDisplayForm() {
		setTitle("Exercise 3D: File Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFileName = new JLabel("File name:");
		lblFileName.setBounds(12, 13, 92, 16);
		contentPane.add(lblFileName);
		
		fileNameTextField = new JTextField();
		fileNameTextField.setText("exercise3d.txt");
		fileNameTextField.setBounds(116, 10, 129, 22);
		contentPane.add(fileNameTextField);
		fileNameTextField.setColumns(10);
		
		JLabel lblFileContents = new JLabel("File contents:");
		lblFileContents.setBounds(12, 42, 92, 16);
		contentPane.add(lblFileContents);

		fileContentsLabel = new JLabel("<html></html>");
		fileContentsLabel.setBounds(12, 71, 431, 194);
		fileContentsLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		fileContentsLabel.setHorizontalAlignment(JLabel.LEFT);
		fileContentsLabel.setVerticalAlignment(JLabel.TOP);
		contentPane.add(fileContentsLabel);	
		
		JButton display5Button = new JButton("Display 5 Lines");
		display5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_display5Button_actionPerformed(arg0);
			}
		});
		display5Button.setBounds(7, 278, 122, 25);
		contentPane.add(display5Button);
		
		JButton displayContentsButton = new JButton("Display Contents");
		displayContentsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_displayContentsButton_actionPerformed(e);
			}
		});
		displayContentsButton.setBounds(141, 278, 129, 25);
		contentPane.add(displayContentsButton);
		
		JButton displayLineNumButton = new JButton("Display With Line#");
		displayLineNumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_displayLineNumButton_actionPerformed(e);
			}
		});
		displayLineNumButton.setBounds(282, 278, 161, 25);
		contentPane.add(displayLineNumButton);
	}
	protected void do_display5Button_actionPerformed(ActionEvent arg0) {
		FileDisplay fd = new FileDisplay(fileNameTextField.getText());	
		fileContentsLabel.setText(fd.displayHead());
	}
	protected void do_displayContentsButton_actionPerformed(ActionEvent e) {
		
	}
	protected void do_displayLineNumButton_actionPerformed(ActionEvent e) {
		
	}
}
