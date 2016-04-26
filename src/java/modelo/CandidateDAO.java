/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenin
 */
public class CandidateDAO {
    
    public static Connection cnProductoBD() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/lenindb","root","mysql");       
    }
    
    public String nmCandidate(int i) throws Exception{
        //List lista=null;
        String nameCd="";
        String sql="select * from candidates_tb where id=?";
        
        Connection cn=cnProductoBD();
        PreparedStatement pst=cn.prepareStatement(sql);
        pst.setInt(1, i);
        ResultSet rs= pst.executeQuery();
        //lista= new ArrayList<Candidate>();
        //Candidate cd;
        while (rs.next()) {
            if (rs.getInt("id")==i) {
                nameCd = rs.getString("name_candidate");
            }
        }
        rs.close();
        pst.close();
        cn.close();
        return nameCd;
    }
    
    public void addVote(int i) throws Exception{
        String sql="update candidates_tb set votes_quantity=votes_quantity+1"
                + " where id=?";//falto poner espacio xd
        Connection cn=cnProductoBD();
        PreparedStatement pst= cn.prepareStatement(sql);
        pst.setInt(1, i);
        pst.executeUpdate();
        pst.close();
        cn.close();
        
    }
    
    public int numVotes(int i) throws Exception{
        int numVotes=0;
        String sql="select * from candidates_tb where id=?";
        Connection cn=cnProductoBD();
        PreparedStatement pst= cn.prepareStatement(sql);
        pst.setInt(1, i);
        ResultSet rs= pst.executeQuery();
        //lista= new ArrayList<Candidate>();
        //Candidate cd;
        while (rs.next()) {
            if (rs.getInt("id")==i) {
                numVotes = rs.getInt("votes_quantity");
            }
        }
        rs.close();
        pst.close();
        cn.close();
        return numVotes;       
    }
    
    public String pathIcon(int i) throws Exception{
        //List lista=null;
        String pathicon="";
        String sql="select * from candidates_tb where id=?";
        
        Connection cn=cnProductoBD();
        PreparedStatement pst=cn.prepareStatement(sql);
        pst.setInt(1, i);
        ResultSet rs= pst.executeQuery();
        //lista= new ArrayList<Candidate>();
        //Candidate cd;
        while (rs.next()) {
            if (rs.getInt("id")==i) {
                pathicon = rs.getString("icon");
            }
        }
        rs.close();
        pst.close();
        cn.close();
        return pathicon;
    }
    
     public int numOfCandidates() throws Exception{
        int numofcdt=0;
        String sql="select count(*) count from candidates_tb";
        Connection cn=cnProductoBD();
        PreparedStatement pst= cn.prepareStatement(sql);
        ResultSet rs= pst.executeQuery();
        //lista= new ArrayList<Candidate>();
        //Candidate cd;
        while (rs.next()) {
            
                numofcdt = rs.getInt("count");
            
        }
        rs.close();
        pst.close();
        cn.close();
        return numofcdt;       
    }
}
