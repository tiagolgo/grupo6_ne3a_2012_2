/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validações;

import java.util.List;
import modelo.Pessoa.Professor;
import modelo.curricular.Disciplina;

/**
 *
 * @author Tiago
 */
public class Valida_CargaHoraria {

    public boolean verificaCH(Professor p, List<Disciplina> l) {

        List<Disciplina> d = p.getDisciplina();

        int chp = 0;

        for (Disciplina disciplina : d) {
            chp = chp + disciplina.getCargaHorária();
        }
        
        int cha=0;
        
        for (Disciplina disc : l) {
            cha=cha+disc.getCargaHorária();
        }

        if (chp+cha > 32) {
            return false;
        } else {
            return true;
        }

    }
}
