package Ticketing_Projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class Window_User extends JFrame{
	private JPanel panel = new JPanel();
	private JPanel panelSouth = new JPanel();
	private JPanel panelWest = new JPanel();
	private JPanel panelCenter = new JPanel();
	private JButton reset = new JButton("Reinitialiser");
	private JButton done = new JButton("Valider");
	private JButton cancel = new JButton("Annuler");
	private JComboBox<String> boxType = new JComboBox<String>();
	private JComboBox<String> boxPriority = new JComboBox<String>();
	private JLabel titre = new JLabel("Titre du ticket");
	private JLabel description = new JLabel("Description");
	private JTextField titreField = new JTextField("Titre");
	private JTextField descField = new JTextField("Description");
	private JLabel client = new JLabel("Nom du client");
	private JTextField clientField = new JTextField("Nom");
	
	public Window_User() {
		this.setVisible(true); // page visible
	    this.setTitle("User Window Test"); //title
	    this.setSize(700, 300); //size
	    this.setLocationRelativeTo(null); //fenetre centrée
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //arret du processus quand fermeture de la fenetre
	    this.setContentPane(panel); // ajout d'un JPanel dans la frame
	    this.setLayout(new BorderLayout());
	    panelWest.add(done);
	    panelWest.add(cancel, BorderLayout.NORTH);
	    boxType.setPreferredSize(new Dimension(100, 20));
	    boxType.addItem("Problème");
	    boxType.addItem("Question");
	    boxType.addItem("Incident");
	    panelSouth.add(boxType);
	    boxPriority.setPreferredSize(new Dimension(100, 20));
	    boxPriority.addItem("Haute");
	    boxPriority.addItem("Normale");
	    boxPriority.addItem("Faible");
//	   	panel.add(boxPriority);
	    titreField.setPreferredSize(new Dimension(450, 30));
	    descField.setPreferredSize(new Dimension(450, 300));
	    clientField.setPreferredSize(new Dimension(150,30));
	    titreField.setForeground(Color.GRAY);
	    descField.setForeground(Color.GRAY);
	    clientField.setForeground(Color.GRAY);
	    panelCenter.add(client);
	    panelCenter.add(clientField);
	    panelCenter.add(titre);
		panelCenter.add(titreField);
		panelCenter.add(description);
		panelCenter.add(descField);
	    panel.add(panelSouth, BorderLayout.SOUTH);
	    panel.add(panelWest, BorderLayout.WEST);
	    panel.add(panelCenter, BorderLayout.CENTER);
	    titre.setAlignmentX(400);
	}
}
