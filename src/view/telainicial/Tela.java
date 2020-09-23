package view.telainicial;

import javax.swing.*;

import model.RelatorioFunction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela{
	
	private static JTextField tf;

	public static void main(String[] args) {
		TelaBase tela = new TelaBase("APS - Gerador");
		tela.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(5, 86, 484, 22);
		tela.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton btnNewButton = new JButton("GERAR O RELAT”RIO");
		btnNewButton.setBounds(5, 121, 240, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Choose choose = new Choose();
					
					if(Choose.i == JFileChooser.APPROVE_OPTION){
						RelatorioFunction.Relatorio(choose.getSelectedFile() + "/" + tf.getText());
					}
					else if(tf.getText().trim() == ""){
						RelatorioFunction.Relatorio(choose.getSelectedFile() + "/RelatÛrio");
					}
					else {
						JOptionPane.showMessageDialog(null, "Seu Armando, 12:24 da matina e tu quer que eu ADVINHE onde tenho que salvar? Escolhe o destino aee, Seu Armando");
					}
				} catch(Exception e) {
					System.out.println("Oxi");
				}
			}
		});
		tela.getContentPane().add(btnNewButton);
		
		JButton btnVerEstatsticas = new JButton("VER ESTAT\u00CDSTICAS");
		btnVerEstatsticas.setBounds(249, 121, 240, 25);
		tela.getContentPane().add(btnVerEstatsticas);
		
		JLabel lblFileName = new JLabel("DIGITE O NOME DO SEU RELAT\u00D3RIO:");
		lblFileName.setBounds(5, 57, 226, 16);
		tela.getContentPane().add(lblFileName);
		
		JLabel lblInstrucoes = new JLabel("INSTR«’ES");
		lblInstrucoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "1 - Logo Abaixo, digite o nome do seu arquivo! \n 2 - Clique em 'GERAR O RELAT√ìRIO' \n 3 - Em seguida, escolha o local que ir√° salvar seu arquivo na tela em que se abrir! \n Agora voc√™ pode tanto clicar em 'VER ESTAT√?STICAS' quanto ir at√© seu relat√≥rio!", "Instru√ß√µes", 3);
			}
		});
		lblInstrucoes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInstrucoes.setBounds(5, 13, 81, 16);
		tela.getContentPane().add(lblInstrucoes);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 42, 477, 2);
		tela.getContentPane().add(separator);
		
		JLabel lblIntegrantes = new JLabel("INTEGRANTES");
		lblIntegrantes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Kelly Moana Brasil de Oliveira D91FJE5 CC4Q04 \n"
						+ "Tatiana de Oliveira Ferreira N387076 CC4Q04 \n"
						+ "Leonardo dos Santos Pimentel F036707 CC4Q04 \n"
						+ "Carlos Eduardo da Silva F037266 CC4P04 \n"
						+ "Willians dos Santos de Faria F0607A9 CC4P04 \n"
						+ "Thiago Silva Marques N3971H5 CC4P04 \n"
						+ "Jackson Barbos Vilela D978ID8 CC4Q04 \n"
						+ "Gabriel Paulino de Aguiar N4003C0 CC4P04 \n"
						+ "Erick Leandro Moura Lira F1065H1 CC3P04 \n"
						+ "Josenilda Barbosa Novaes da Silva F1118D4 CC3P04", "Integrantes", -1);
			}
		});
		lblIntegrantes.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIntegrantes.setBounds(98, 13, 88, 16);
		tela.getContentPane().add(lblIntegrantes);
		tela.setVisible(true);
	}
}
