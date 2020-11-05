package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();
	ArrayList<String>names=new ArrayList<String>();
	public static void main() {
	}
	public void run() {
		addName.setText("Add Name");
		addName.addMouseListener(this);
		viewNames.setText("View Names");
		viewNames.addMouseListener(this);
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==addName) {
			String s=JOptionPane.showInputDialog("Please enter a name.");
			names.add(s);
		}
		else {
			for (int i = 0; i < names.size(); i++) {
				int guest = i+1;
				JOptionPane.showMessageDialog(null,"Guest #"+guest+": "+names.get(i) );
				
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
