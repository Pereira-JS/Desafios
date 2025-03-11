import javax.swing.*;
public class Main {
    public static void main (String[]args){
        String entrada = JOptionPane.showInputDialog("quantos cigarros e por quanto anos você fuma");
        String[] dados = entrada.split(" ");
        //10 min de vida a cada cigarro. dias um fumante perderá e exiba o total em dias.
        int CigasP = (Integer.parseInt(dados[0]));
        int anos = (Integer.parseInt(dados[1]));
        float diasP = (float) CigasP /144*(anos*365);
        JOptionPane.showMessageDialog(null, "os dias totais peridos por fumar é: "+diasP+" dias");
        System.out.println(diasP);
    }
}
