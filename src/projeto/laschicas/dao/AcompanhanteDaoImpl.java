/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public class AcompanhanteDaoImpl implements AcompanhanteDAO {


    @Override
    public void inserir(Acompanhante acompanhante) throws Exception {
      
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "INSERT INTO ACOMPANHANTE (nome,idade,cpf,valorHora,descricao) VALUES (?,?,?,?,?)";
                         
            PreparedStatement statement = con.prepareStatement(query);
            
            statement.setString(1, acompanhante.getNome());
            statement.setInt(2, acompanhante.getIdade());
            statement.setString(3, acompanhante.getCpf());
            statement.setDouble(4, acompanhante.getValorHora());
            statement.setString(5, acompanhante.getDescricao());
            
            
            statement.executeUpdate();
        
        } catch (SQLException ex) {
                throw new Exception(ex.getMessage());
        }
    }

    @Override
    public void deletar(Integer id) throws Exception {
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
        String query = "DELETE ACOMPANHANTE FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setInt(1,id);
        statement.executeUpdate();
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }

    }

    @Override
    public void atualizar(Acompanhante acompanhante) throws Exception{
       
       try {
        
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
          String query = "UPDATE ACOMPANHANTE SET NOME = ? ,IDADE = ? , CPF = ? ,VALORHORA = ?, DESCRICAO = ? WHERE IDACOMPANHANTE = ?";
          PreparedStatement statement = con.prepareStatement(query);
       
          
          statement.setString(1, acompanhante.getNome());
          statement.setInt(2, acompanhante.getIdade());
          statement.setString(3, acompanhante.getCpf());
          statement.setDouble(4, acompanhante.getValorHora());
          statement.setString(5, acompanhante.getDescricao());
          statement.setInt(6, acompanhante.getId());
       
          statement.executeUpdate();
       
       }catch (SQLException ex) {
          throw new Exception(ex.getMessage());
        }
       
    }

    @Override
    public Acompanhante getAcompanhanteById(Integer id) throws Exception{
                Acompanhante acompanhante = new Acompanhante();
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ? ";
            PreparedStatement statement = con.prepareStatement(query);            
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                String idReturn = result.getString(1);
                String name = result.getString(2);
                String idade = result.getString(3);
                String cpf = result.getString(4);
                String valorHora = result.getString(5);
                String descricao = result.getString(6);
                
                acompanhante.setId(Integer.parseInt(idReturn));
                acompanhante.setNome(name);
                acompanhante.setIdade(Integer.parseInt(idade));
                acompanhante.setCpf(cpf);
                acompanhante.setValorHora(Double.parseDouble(valorHora));
                acompanhante.setDescricao(descricao);

            }
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhante;
    }

    @Override
    public Acompanhante getAcompanhanteByName(String nome) throws Exception{
            Acompanhante acompanhante = new Acompanhante();
        try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE WHERE NOME like ?";
            PreparedStatement statement = con.prepareStatement(query);            
            statement.setString(1,nome);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                String id = result.getString(1);
                String name = result.getString(2);
                String idade = result.getString(3);
                String cpf = result.getString(4);
                String valorHora = result.getString(5);
                String descricao = result.getString(6);
                
                acompanhante.setId(Integer.parseInt(id));
                acompanhante.setNome(name);
                acompanhante.setIdade(Integer.parseInt(idade));
                acompanhante.setCpf(cpf);
                acompanhante.setValorHora(Double.parseDouble(valorHora));
                acompanhante.setDescricao(descricao);

            }
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhante;
    }
    
    public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception{
        ArrayList<Acompanhante> acompanhanteList = new ArrayList<Acompanhante>();
        Acompanhante acompanhante = new Acompanhante();
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE";
            PreparedStatement statement = con.prepareStatement(query);            
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                String id = result.getString(1);
                String name = result.getString(2);
                String idade = result.getString(3);
                String cpf = result.getString(4);
                String valorHora = result.getString(5);
                String descricao = result.getString(6);
                
                acompanhante.setId(Integer.parseInt(id));
                acompanhante.setNome(name);
                acompanhante.setIdade(Integer.parseInt(idade));
                acompanhante.setCpf(cpf);
                acompanhante.setValorHora(Double.parseDouble(valorHora));
                acompanhante.setDescricao(descricao);
                acompanhanteList.add(acompanhante);
            }
                
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhanteList;
    }
    
}
