package controle;

import javax.swing.JOptionPane;

public class ControladorMenssagem {
	private static ControladorMenssagem controleMensagem;
	
	public static ControladorMenssagem getInstance() {
		if(controleMensagem == null) controleMensagem = new ControladorMenssagem();
		return controleMensagem;
	}
	
	public String showInputDialog(String texto) {
		String entrada = JOptionPane.showInputDialog(texto);
		return entrada;
	}
	
	public void showMessageDialog(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public int showConfirmDialog(String texto) {
		return JOptionPane.showConfirmDialog(null, texto);	
	}
	
}
