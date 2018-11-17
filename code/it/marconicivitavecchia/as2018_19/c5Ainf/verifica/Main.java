
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder ("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1><b>SSH first aid</b></h1>");
		sb.append("<div style='display:table'>");
		//this is the first row is about the table title
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table cell'>");
		sb.append("alias");
		sb.append("</div>");
		
		sb.append("<div style='display:table cell'>");
		sb.append("hostname");
		sb.append("</div>");
		//this is the row n.2
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table cell'>");
		sb.append("raspberry");
		sb.append("</div>");
		
		sb.append("<div style='display:table cell'>");
		sb.append("server.marconi.it");
		sb.append("</div>");
		//this is the row n.3
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table cell'>");
		sb.append("coreswitch");
		sb.append("</div>");
		
		sb.append("<div style='display:table cell'>");
		sb.append("10.0.100.1");
		sb.append("</div>");
		
		
		
		
		
		// TODO Convertire lo StringBuilder in String
		
		String HtmlText = sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(HtmlText));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

