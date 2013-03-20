/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Aula {
    private int id;
    private String tipoVinculo;
    private boolean extraordinaria, atribuida;

 

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public boolean isExtraordinaria() {
        return extraordinaria;
    }

    public void setExtraordinaria(boolean extraordinaria) {
        this.extraordinaria = extraordinaria;
    }

    public boolean isAtribuida() {
        return atribuida;
    }

    public void setAtribuida(boolean atribuida) {
        this.atribuida = atribuida;
    }

 
        
}
