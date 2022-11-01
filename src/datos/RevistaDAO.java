package datos;

import SqlOps.Conexion;
import domain.*;
import java.sql.*;
import java.util.*;

public class RevistaDAO extends MaterialEscrito {
    //FORMATO DE FECHA YYYY-MM-DD
    private static final String SQL_SELECT = "SELECT Id, titulo, editorial, "
            + "periodicidad, fechaPublicacion, unidadesDisponibles "
            + "FROM revistas";
    
    private static final String SQL_SELECT2 = "SELECT Id, titulo, editorial, "
            + "periodicidad, fechaPublicacion, unidadesDisponibles "
            + "FROM revistas WHERE Id =?";
    
    private static final String SQL_INSERT = "INSERT INTO revistas (titulo, editorial, periodicidad, "
            + "fechaPublicacion, unidadesDisponibles)"
            + "VALUES (?,?,?,?,?)";
    
    private static final String SQL_DELETE = "DELETE FROM revistas WHERE ID=?";

    private static final String SQL_UPDATE = "UPDATE revistas SET titulo =?,"
            + " editorial =?, periodicidad =?, fechaPublicacion=?, "
            + "unidadesDisponibles =? WHERE id = ?";
    
    public List<Revista> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Revista revista = null;
        List<Revista> revistas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                editorial = rs.getString("editorial");
                String periodicidad = rs.getString("periodicidad");
                String fechaPub = rs.getString("fechaPublicacion");
                int unidadesDisp = rs.getInt("unidadesDisponibles");
                revista = new Revista(id, titulo, editorial, periodicidad, fechaPub, unidadesDisp);
                revistas.add(revista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return revistas;
    }
    
    public int insertar(Revista revista) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, revista.getTitulo());
            stmt.setString(2, revista.getEditorial());
            stmt.setString(3, revista.getPeriodicidad());
            stmt.setString(4, revista.getFechaPub());
            stmt.setInt(5, revista.getUnidadesDisponibles());
            stmt.setInt(6, revista.getId());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public List<Revista> buscar(int codigo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Revista revista = null;
        List<Revista> revistas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                editorial = rs.getString("editorial");
                String periodicidad = rs.getString("periodicidad");
                String fechaPub = rs.getString("fechaPublicacion");
                int unidadesDisp = rs.getInt("unidadesDisponibles");
                revista = new Revista(id, titulo, editorial, periodicidad, fechaPub, unidadesDisp);
                revistas.add(revista);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return revistas;
    }
    
    public int borrar(int codigo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, codigo);
            registros = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Revista revista) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, revista.getTitulo());
            stmt.setString(2, revista.getEditorial());
            stmt.setString(3, revista.getPeriodicidad());
            stmt.setString(4, revista.getFechaPub());
            stmt.setInt(5, revista.getUnidadesDisponibles());
            stmt.setInt(6, revista.getId());
            
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
}
