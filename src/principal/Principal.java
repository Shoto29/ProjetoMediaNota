package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {

    public static void main(String[] args) {
        //Declaração
        Aluno aluno1 = new Aluno();

        //Entrada
        aluno1.setNome(JOptionPane.showInputDialog(null, "Insira o nome do aluno"));
        aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a primeira nota")));
        aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a segunda nota")));
        aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a terceira nota")));
        
        String result = String.format("%.2f",aluno1.getMedia());
        
        //Saida
        JOptionPane.showMessageDialog(null,"O nome do aluno é "+aluno1.getNome()+" e sua media é: "+result);
    }

}
