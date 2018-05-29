import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Project {
	
	JList<String> lista;
	JLabel labela;
	JTextArea texta;
	JButton buttona;
	DefaultListModel<String> listmodela;
	JFrame TextGUI;
	
	public static void main(String[] args) {
		new Project();
	}
	
	public Project() {
		System.out.println("Text.");
		TextGUI = new JFrame();
		TextGUI.setTitle("This is a Text Box.");
		TextGUI.setSize(1280, 720);
		TextGUI.setResizable(true);
		TextGUI.setLocationRelativeTo(null);
		TextGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextGUI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		Font s = new Font("plain", Font.PLAIN, 12);
		Font b = new Font("plain", Font.PLAIN, 36);
		
		ListenForEdit editItemListener = new ListenForEdit();
		ListenForSize sizeItemListener = new ListenForSize();
		ListenForTexta textItemListener = new ListenForTexta();
		ListenForFont fontItemListener = new ListenForFont();
		ListenForText TextListener = new ListenForText();
		ListenForOpenItem OpenItemListener = new ListenForOpenItem();
		ListenForCopyItem CopyItemListener = new ListenForCopyItem();
		ListenForItalics ItalicsItemListener = new ListenForItalics();
		ListenForBold BoldItemListener = new ListenForBold();
		ListenForPlain PlainItemListener = new ListenForPlain();
		ListenForSizea SmallItemListener = new ListenForSizea();
		ListenForSizeb LargeItemListener = new ListenForSizeb();
		
		
		JPanel panel = new JPanel();

		panel.setLayout(null);
		
		texta = new JTextArea(); 
		texta.setBounds(0, 0, 1270, 710);
		panel.add(texta);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("Size");
		JMenuItem sizeMenuItem = new JMenuItem("12", KeyEvent.VK_O);
		sizeMenuItem.addActionListener(SmallItemListener);
		fileMenu.add(sizeMenuItem);
		fileMenu.addSeparator();
		JMenuItem size4MenuItem = new JMenuItem("36", KeyEvent.VK_P);
		size4MenuItem.addActionListener(LargeItemListener);
		fileMenu.add(size4MenuItem);
		
		
		
		
		JMenu textMenu = new JMenu("Text");
		JMenuItem ItalicsMenuItem = new JMenuItem("Italics", KeyEvent.VK_I);
		textMenu.add(ItalicsMenuItem);
		ItalicsMenuItem.addActionListener(ItalicsItemListener);
		textMenu.addSeparator();
		JMenuItem BoldMenuItem = new JMenuItem("Bold", KeyEvent.VK_B);
		textMenu.add(BoldMenuItem);
		BoldMenuItem.addActionListener(BoldItemListener);
		textMenu.addSeparator();
		JMenuItem PlainMenuItem = new JMenuItem("Plain", KeyEvent.VK_U);
		textMenu.add(PlainMenuItem);
		PlainMenuItem.addActionListener(PlainItemListener);
		textMenu.addSeparator();
		textMenu.add(PlainMenuItem);
		
		
		JMenu editMenu = new JMenu("Edit");
		JMenuItem copyMenuItem = new JMenuItem("Copy", KeyEvent.VK_C);
		copyMenuItem.addActionListener(CopyItemListener);
		editMenu.add(copyMenuItem);
		editMenu.addSeparator();

		menuBar.add(textMenu);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		TextGUI.add(menuBar);
		TextGUI.setJMenuBar(menuBar);
		
		
		TextGUI.add(panel);
		TextGUI.setVisible(true);
		
	}
	//Add Action Listeners Here
	private class ListenForSize implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class ListenForText implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class ListenForTexta implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		
		}

			
	}
	
	private class ListenForOpenItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	private class ListenForCopyItem implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(TextGUI, texta.getText());
			
		}
		
	}
	
	
	private class ListenForFont implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class ListenForEdit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	private class ListenForItalics implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			texta.setFont(new Font(texta.getName(), Font.ITALIC, 12));
			
		}
	}
	private class ListenForBold implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			texta.setFont(new Font(texta.getName(), Font.BOLD, 12));
		}
	}
	private class ListenForPlain implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texta.setFont(new Font(texta.getName(), Font.PLAIN, 12));

		}
	}
	private class ListenForSizea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			texta.setFont(new Font("serif", Font.PLAIN, 12));
		}
	}
	private class ListenForSizeb implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texta.setFont(new Font("serif", Font.PLAIN, 36));
		}
	}
}
		