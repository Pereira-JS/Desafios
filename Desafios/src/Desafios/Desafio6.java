package Desafios;
import javax.swing.JOptionPane;
public class Desafio6 {
    static Desafio5 a = new Desafio5();
    static void rdm(){
        int i=4;
        while(i>0) {
            if (Desafio5.match(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um numero de 0 a 5", "Chute", 1)))) {
                JOptionPane.showMessageDialog(null,
                        "Acertou!");
                break;
            }else{
                i--;
                if(i==0){
                    JOptionPane.showMessageDialog(null,
                            "Acabaram suas tentativas!","Aviso",0);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Errou! Ainda restam "+i+" Tentativas!","Aviso",1);
                }
            }
        }
    }
    public static void main(String[] args) {
        rdm();
    }
}
