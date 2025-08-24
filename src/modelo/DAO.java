
package modelo;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class DAO implements RecursosDAO{
    @Override
    public boolean comprobarConexionB() {
        try(Connection con = ConexionBD.establecerConexion()){
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<String> consultaIdiomaPais(String nombrepais) {
        List<String>listaIdiomas = new ArrayList<>();
        String sql = "SELECT language "
                + "FROM country "
                + "INNER JOIN countrylanguage ON country.code = countrylanguage.countrycode "
                + "WHERE name = ? ";
        
        try(Connection con = ConexionBD.establecerConexion();
                PreparedStatement pst = con.prepareStatement(sql)){
            
            pst.setString(1, nombrepais);
            
            try(ResultSet rs = pst.executeQuery()){
                while(rs.next()){
                    listaIdiomas.add(rs.getString(1));
                }
                Pais pais = new Pais(nombrepais, listaIdiomas);
                return pais.getListaIdiomas();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return listaIdiomas;
        }
    }
}
