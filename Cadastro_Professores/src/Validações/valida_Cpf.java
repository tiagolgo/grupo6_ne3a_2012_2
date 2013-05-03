/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validações;

/**
 *
 * @author Tiago
 */
public class valida_Cpf {

    private String cpf;
    private int ver1;

    private void valida(String cpf) {
        if (cpf.length() == 11) {
            valida2(cpf);
        } else {
            System.out.println("cpf inválido");
        }

    }

    private void valida2(String cpf) {
        int dig1 = Integer.parseInt(cpf.substring(0, 1));
        int dig2 = Integer.parseInt(cpf.substring(1, 2));
        int dig3 = Integer.parseInt(cpf.substring(2, 3));
        int dig4 = Integer.parseInt(cpf.substring(3, 4));
        int dig5 = Integer.parseInt(cpf.substring(4, 5));
        int dig6 = Integer.parseInt(cpf.substring(5, 6));
        int dig7 = Integer.parseInt(cpf.substring(6, 7));
        int dig8 = Integer.parseInt(cpf.substring(7, 8));
        int dig9 = Integer.parseInt(cpf.substring(9, 10));

        valida3(dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9);
    }

    private void valida3(int dig1, int dig2, int dig3, int dig4, int dig5, int dig6, int dig7, int dig8, int dig9) {
        int soma = dig1 * 10 + dig2 * 9 + dig3 * 8 + dig4 * 7 + dig5 * 6 + dig4 * 5 + dig3 * 4 + dig2 * 3 + dig1 * 2;
        
        int resto=soma%11;
        if(resto==0||resto==1){
            this.ver1=0;
        }else{
            this.ver1=11-resto;
        }
        
        System.out.println("ver1 "+ver1);
    }
    
    public static void main(String[] args) {
        valida_Cpf vc = new valida_Cpf();
//        vc.valida("05247234932");
        vc.valida("05247234932");
    }
}
