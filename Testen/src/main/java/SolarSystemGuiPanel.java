
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SolarSystemGuiPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static SolarSystemAnimationPanel solarPanel;
	private JButton startButton;
	private JButton stopButton;
	private JButton exitButton;
	private JLabel title;
	
	public SolarSystemGuiPanel() {
		super();
		setPreferredSize(new Dimension(1280,720)); 
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		title = new JLabel("Das Sonnensystem"); 
		solarPanel = new SolarSystemAnimationPanel(1000, 700); 
		startButton = new JButton("Start"); 
		stopButton  = new JButton("Stop"); 
		exitButton = new JButton("Exit");
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		exitButton.addActionListener(this);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.X_AXIS));
		buttonPanel.add(startButton);
		buttonPanel.add(stopButton);
		buttonPanel.add(exitButton);
		add(title, BorderLayout.PAGE_START);
		add(solarPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.LINE_END);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==startButton) start();
		else if (e.getSource()==stopButton) stop();
		else if (e.getSource()==exitButton) System.exit(0);
	}

	public void start() {solarPanel.start();}
	public void stop() {solarPanel.stop();}

}
