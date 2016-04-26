/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.CandidateDAO;

/**
 *
 * @author Lenin
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CandidateDAO cdao= new CandidateDAO();
        String nm;
        int num;
        nm= cdao.nmCandidate(1);
        cdao.addVote(1);
        num=cdao.numOfCandidates();
        
        
         System.out.print(nm);
        System.out.print(num);
        
    }
    
}
