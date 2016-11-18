package kermie.view;

import javax.swing.*;
import kermie.controller.KermieController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
			this.dropDown = new JComboBox(baseController.getKermie());
			
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPanel()
		{
			this.setBackground(Color.GREEN);
			this.setLayout(baseLayout);
			this.add(dropDown);
			this.add(infoLabel);
			this.add(myButton);
		}
		
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -228, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, myButton, 16, SpringLayout.SOUTH, infoLabel);
			baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 114, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, myButton, 90, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 6, SpringLayout.SOUTH, myButton);
			baseLayout.putConstraint(SpringLayout.WEST, dropDown, 133, SpringLayout.WEST, this);
			
		}
		
		private void setupListeners()
		{
			dropDown.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent selection)
				{
					infoLabel.setText(dropDown.getSelectedItem().toString());
				}
			});
			
			myButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					baseController.impactKermie();
					repaint();
				}
			});
		}
}
