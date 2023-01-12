package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
	// Cao Thanh Tung 20200569
	private Media media;
	// 2 nut ButtonAdd va Button Play de public de gan su o lop khac
	public JButton ButtonAdd;
	public JButton ButtonPlay;
	public MediaStore(Media mediaInit) {
		
		this.media = mediaInit;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		ButtonAdd = new JButton("Add to cart");
		container.add(ButtonAdd);
		if(media instanceof Playable) {
			ButtonPlay = new JButton("Play");
			container.add(ButtonPlay);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
