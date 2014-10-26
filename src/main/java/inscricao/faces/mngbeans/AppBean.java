/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Gionatta
 */
@ManagedBean
@ApplicationScoped
public class AppBean {
    
    private ArrayList<Candidato> arrCandidato = new ArrayList<Candidato>();
    
    public void addCandidato(Candidato c) {
        arrCandidato.add(c);
    }
    
    public ArrayList<Candidato> getList() {
        return arrCandidato;
    }
    
}
