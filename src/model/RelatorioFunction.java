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
			
			//Criando o relatório
			escritos.println("Relatório: \n Complexidade \n ");
			
			// Informando que o relatório está onde o usuario escolheu
			JOptionPane.showMessageDialog(null, "Pronto! O arquivo está na pasta que você selecionou! \n Clique em 'VER ESTATÍSTICAS' para saber mais ou leia o relatório");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		escritos.close();
	}
}