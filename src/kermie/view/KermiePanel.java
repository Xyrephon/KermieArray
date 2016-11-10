package kermie.view;

import javax.swing.*;
import kermie.controller.KermieController;
import java.awt.Color;

public class KermiePanel extends JPanel
{

		private SpringLayout baseLayout;
		private JComboBox dropDown;
		private JLabel infoLabel;
		private JButton myButton;
		private KermieController baseController;
		
		public KermiePanel(KermieController baseController)
		{
			this.baseController = baseController;
			this.baseLayout = new SpringLayout();
			this.myButton = new JButton("Click the button");
			this.infoLabel = new JLabel("Wow words!");
			this.dropDown = new JComboBox(baseController.getWords());
			
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPanel()
		{
			this.setBackground(Color.ORANGE);
			this.setLayout(baseLayout);
			this.add(dropDown);
			this.add(infoLabel);
			this.add(myButton);
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.EAST, myButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 128, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 173, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, dropDown, 23, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, myButton, -1, SpringLayout.NORTH, dropDown);
			baseLayout.putConstraint(SpringLayout.SOUTH, dropDown, -38, SpringLayout.SOUTH, this);
			
		}
		
		private void setupListeners()
		{
			
		}
}
