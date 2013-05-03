/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validações;

/**
 *
 * @author Tiago
 */
public class Valida_Datas {

    private int dia;
    private int mes;
    private String ano;

    private Valida_Datas(String data) {
        this.dia = Integer.parseInt(data.substring(0, 2));
        this.mes = Integer.parseInt(data.substring(2, 4));
        this.ano = data.substring(4);
    }

    private String validações() {
        if (dia == 00 || mes == 00 || "0000".equals(ano)) {
            return "Data Inválida";
        } else if (this.dia > 31) {
            return "Dia inválido!";
        } else if (this.dia == 31) {
            return meses_30Dias();
        } else if (this.dia == 30 & mes == 2) {
            return "Dia inválido para o Mês 2";
        } else if (dia == 29 & mes == 2) {
            return verifica_SeBissexto();
        } else if (mes > 12) {
            return "Mês Inválido";
        }
        return "";
    }

    private String meses_30Dias() {
        if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return "Dia inválido para o Mês!";
        }
        return "";
    }

    private String verifica_SeBissexto() {
        if (this.ano.substring(2).equals("00")) {
            if ((Integer.parseInt(this.ano) % 400) != 0) {
                return "Data Inválida!";
            }
        } else if ((Integer.parseInt(this.ano) % 4) != 0) {
            return "Data Inválida!";
        }
        return "";
    }
}
