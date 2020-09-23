package view.telainicial;

import javax.swing.JFileChooser;

public class Choose extends JFileChooser{
	private static final long serialVersionUID = 1L;
	static int i;
	Choose(){
		
		this.setDialogTitle("Procure onde salvar o arquivo!");
		this.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		i = this.showSaveDialog(this);
	}
}
