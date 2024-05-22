/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelPegawai;
import connector.koneksi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BIMA
 */
public class DAOpegawai implements interfaceDAOpegawai {

    @Override
    public List<modelPegawai> getAll() {
        List<modelPegawai> listPegawai = null;
        try {
            listPegawai = new ArrayList<>();
            
            Statement statement = koneksi.connection().createStatement();
            
            String query = "SELECT * FROM pegawai;";
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
              
                modelPegawai hew = new modelPegawai();
                
                hew.setId(resultSet.getInt("id"));
                hew.setNama(resultSet.getString("nama"));
                hew.setEmail(resultSet.getString("email"));
                hew.setRole(resultSet.getString("role"));
                
    
                listPegawai.add(hew);
            }
            
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return listPegawai;
    }
    }

   
    
    

