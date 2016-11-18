package kermie.view;

import javax.swing.JFrame;
import kermie.controller.KermieController;
import java.awt.Dimension;

public class KermieFrame extends JFrame
{
	private KermieController baseController;
	private KermiePanel appPanel;
	
	public KermieFrame(KermieController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new KermiePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Hipster Day 2016");
		this.setSize(new Dimension (800,600));
		this.setResizable(false);
		this.setVisible(true);
	}
}
