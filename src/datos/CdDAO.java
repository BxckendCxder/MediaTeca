package datos;

import SqlOps.Conexion;
import domain.*;
import java.sql.*;
import java.util.*;

public class CdDAO extends MaterialAudioVisual{

    private static final String SQL_SELECT = "SELECT id, titulo, artista, "
            + "genero, duracion, numeroDeCanciones, unidadesDisponibles "
            + "FROM cds";
    
    private static final String SQL_SELECT2 = "SELECT id, titulo, artista, "
            + "genero, duracion, numeroDeCanciones, unidadesDisponibles "
            + "FROM cds WHERE id=?";
    
    private static final String SQL_INSERT = "INSERT INTO cds (titulo, artista, genero, "
            + "duracion, numeroDeCanciones, unidadesDisponibles)"
            + "VALUES (?,?,?,?,?,?)";
    
    private static final String SQL_UPDATE = "UPDATE cds SET titulo=?, artista=?, "
            + "genero=?, duracion=?, numeroDeCanciones=?, "
            + "unidadesDisponibles=? WHERE id = ?";
    
    private static final String SQL_DELETE = "DELETE FROM cds WHERE ID=?";

    String artista = null;
    int numeroCanciones;
    int unidadesDisponibles;
    
    public List<Cd> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cd cd = null;
        List<Cd> cds = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                artista = rs.getString("artista");
                genero = rs.getString("genero");
                duracion = rs.getString("duracion");
                numeroCanciones = rs.getInt("numeroDeCanciones");
                unidadesDisponibles = rs.getInt("unidadesDisponibles");
                cd = new Cd(id, titulo, artista, genero, duracion, numeroCanciones, unidadesDisponibles);
                cds.add(cd);
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
        return cds;
    }
    
    //SEGUNDO METODO
    public int insertar(Cd cd) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cd.getTitulo());
            stmt.setString(2, cd.getArtista());
            stmt.setString(3, cd.getGenero());
            stmt.setString(4, cd.getDuracion());
            stmt.setInt(5, cd.getNumeroCanciones());
            stmt.setInt(6, cd.getUnidadesDisponibles());
            
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
    
    public List<Cd> buscar(int codigo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cd cd = null;
        List<Cd> cds = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                artista = rs.getString("artista");
                genero = rs.getString("genero");
                duracion = rs.getString("duracion");
                numeroCanciones = rs.getInt("numeroDeCanciones");
                unidadesDisponibles = rs.getInt("unidadesDisponibles");
                cd = new Cd(id, titulo, artista, genero, duracion, numeroCanciones, unidadesDisponibles);
                cds.add(cd);
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
        return cds;
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
    
    public int actualizar(Cd cd) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cd.getTitulo());
            stmt.setString(2, cd.getArtista());
            stmt.setString(3, cd.getGenero());
            stmt.setString(4, cd.getDuracion());
            stmt.setInt(5, cd.getNumeroCanciones());
            stmt.setInt(6, cd.getUnidadesDisponibles());
            stmt.setInt(7, cd.getId());
            
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
