/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Meus Documentos
 */
public class Afastamento {
    private int id;
    private Professor afastado;
    private int dataAfast, início, fim;
    private String motivo;

    public Professor getAfastado() {
        return afastado;
    }

    public void setAfastado(Professor afastado) {
        this.afastado = afastado;
    }

    public int getDataAfast() {
        return dataAfast;
    }

    public void setDataAfast(int dataAfast) {
        this.dataAfast = dataAfast;
    }

    public int getInício() {
        return início;
    }

    public void setInício(int início) {
        this.início = início;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }    
}
