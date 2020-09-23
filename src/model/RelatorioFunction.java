package model;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JOptionPane;

public class RelatorioFunction{
	public static void Relatorio(String string) {
		
		PrintStream escritos = null;
		try {
			//criando um escritor em arquivos
			escritos = new PrintStream (new FileOutputStream(string + ".txt"));
			
			//Criando o relat�rio
			escritos.println("Relat�rio: \n Complexidade \n ");
			
			// Informando que o relat�rio est� onde o usuario escolheu
			JOptionPane.showMessageDialog(null, "Pronto! O arquivo est� na pasta que voc� selecionou! \n Clique em 'VER ESTAT�STICAS' para saber mais ou leia o relat�rio");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		escritos.close();
	}
}