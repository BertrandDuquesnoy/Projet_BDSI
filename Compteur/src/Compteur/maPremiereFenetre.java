package Compteur;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class maPremiereFenetre extends JFrame implements ActionListener{
	private int cpt;
	private JButton inter;
	private JButton plus1;
	private JButton moins1;
	private JLabel jlab;
	private JLabel jlab2;
	private JMenu menu;
	private JMenu menu2;
	private JMenu menu3;
	private JMenuItem jmi;
	private JMenuItem ajter1;
	private JMenuItem soustre1;
	private JMenuItem min;
	private JMenuItem max;
	private int borneMax = 29;
	private int borneMin = -9;
	private String newMin = "";
	private String newMax = "";
	
	public maPremiereFenetre(){
		super("Compteur borné");
		setPreferredSize(new Dimension(500, 300));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();		
		
		//bouton intervalle
		inter = new JButton("Intervalle");
		inter.addActionListener(this);
		this.add(inter,BorderLayout.SOUTH);
		
		//bouton +1
		plus1 = new JButton("+1"); 
		plus1.addActionListener(this);
		this.add(plus1,BorderLayout.EAST);
				
		//bouton -1
		moins1 = new JButton("-1"); 
		moins1.addActionListener(this);
		this.add(moins1, BorderLayout.WEST);
		
		//Jlabel valeur
		jlab = new JLabel ("0"); 
		this.add(jlab, BorderLayout.CENTER);
		
		//Intervalle de variation
		jlab2 = new JLabel ("                       borne minimale : "+borneMin+"        borne maximale : "+borneMax);
		this.add(jlab2, BorderLayout.NORTH);
		
		//Menu 
		JMenuBar barreMenu = new JMenuBar();
		
		//Fichier mais sans la possibilité de quitter
		menu = new JMenu("Fichier");
		menu.setMnemonic(KeyEvent.VK_M);
		jmi = new JMenuItem("Quitter");
		jmi.setMnemonic(KeyEvent.VK_B);
		jmi.setActionCommand("Quitter");
		menu.add(jmi);
		
		//Modifier compteur
		menu2 = new JMenu("Modifier compteur");
		menu2.setMnemonic(KeyEvent.VK_M);
		ajter1 = new JMenuItem("+1");
		soustre1 = new JMenuItem("-1");
		ajter1.setMnemonic(KeyEvent.VK_B);
		soustre1.setMnemonic(KeyEvent.VK_B);
		ajter1.setActionCommand("+1");
		soustre1.setActionCommand("-1");
		menu2.add(ajter1);
		menu2.add(soustre1);
				
		//Modifier intervalle
		menu3 = new JMenu("Intervalle");
		menu3.setMnemonic(KeyEvent.VK_M);
		min = new JMenuItem("définir le minimum");
		max = new JMenuItem("définir le maximum");
		min.setMnemonic(KeyEvent.VK_B);
		max.setMnemonic(KeyEvent.VK_B);
		min.setActionCommand("définir le minimum");
		max.setActionCommand("définir le maximum");
		menu3.add(min);
		menu3.add(max);
		
		//On ajoute tous les sous menus à la barre de menu
		barreMenu.add(menu);
		barreMenu.add(menu2);
		barreMenu.add(menu3);
		
		//Actions
		jmi.addActionListener(this);//quitter
		ajter1.addActionListener(this);//ajouter
		soustre1.addActionListener(this);//soustraire
		min.addActionListener(this);//définir le min
		max.addActionListener(this);//définir le max
		
		//Mise en place de la barre avec les sous menus
		this.setJMenuBar(barreMenu);
		
		setVisible(true);
	}
	
	public static void main(String[] a){
		new maPremiereFenetre();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		//Action +1
		if(source == plus1||source==ajter1){
			this.increment();
			jlab.setText(""+cpt);
		}
		
		//Action -1 
		if(source == moins1||source==soustre1){
			this.decrement();
			jlab.setText(""+cpt);
		}
		
		//Action quitter
		if(source == jmi){
			this.dispose();
		}
		
		//Action intervalle redéfinir le minimum
		if(source == min){
			newMin = JOptionPane.showInputDialog("Nouveau minimum ?");
			borneMin = Integer.valueOf(newMin);
			cpt=0;
			jlab.setText(""+cpt);
		}
		
		//Action intervalle redéfinir le maximum
		if(source == max){
			newMax = JOptionPane.showInputDialog("Nouveau maximum ?");
			borneMax = Integer.valueOf(newMax);
			cpt=0;
			jlab.setText(""+cpt);
		}
		
		//Action intervalle bouton
		if(source == inter){
			newMin = JOptionPane.showInputDialog("Nouveau minimum ?");
			borneMin = Integer.valueOf(newMin);
			newMax = JOptionPane.showInputDialog("Nouveau maximum ?");
			borneMax = Integer.valueOf(newMax);
			cpt=0;
			jlab.setText(""+cpt);
		}
	}
	public void increment(){
		if(cpt<borneMax){
			cpt++;
		}else{
			JOptionPane.showMessageDialog(null, "La borne maximale a été atteinte");
		}
	}
	public void decrement(){
		if(cpt>borneMin){
			cpt--;
		}else{
			JOptionPane.showMessageDialog(null, "La borne minimale a été atteinte");
		}
	}
	public int getBorneMax(){
		return borneMax;
	}
	public int getBorneMin(){
		return borneMin;
	}
}