package datos;

import SqlOps.Conexion;
import domain.*;
import java.sql.*;
import java.util.*;

public class DvdDAO extends MaterialAudioVisual {

    private static final String SQL_SELECT = "SELECT id, titulo, director, "
            + "duracion, genero FROM dvds";

    private static final String SQL_SELECT2 = "SELECT id, titulo, director, "
            + "duracion, genero FROM dvds WHERE id=?";

    private static final String SQL_INSERT = "INSERT INTO dvds (titulo, director, "
            + "duracion, genero) VALUES (?,?,?,?)";

    private static final String SQL_DELETE = "DELETE FROM dvds WHERE ID=?";
    
    private static final String SQL_UPDATE = "UPDATE dvds SET titulo=?, director=?, "
            + "duracion=?, genero=? WHERE id = ?";

    String director = null;

    public List<Dvd> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dvd dvd = null;
        List<Dvd> dvds = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                director = rs.getString("director");
                duracion = rs.getString("duracion");
                genero = rs.getString("genero");
                dvd = new Dvd(id, titulo, director, duracion, genero);
                dvds.add(dvd);
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
        return dvds;
    }

    //SEGUNDO METODO
    public int insertar(Dvd dvd) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, dvd.getTitulo());
            stmt.setString(2, dvd.getDirector());
            stmt.setString(3, dvd.getDuracion());
            stmt.setString(4, dvd.getGenero());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
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

    public List<Dvd> buscar(int codigo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dvd dvd = null;
        List<Dvd> dvds = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                director = rs.getString("director");
                duracion = rs.getString("duracion");
                genero = rs.getString("genero");
                dvd = new Dvd(id, titulo, director, duracion, genero);
                dvds.add(dvd);
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
        return dvds;
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
    
    public int actualizar(Dvd dvd) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, dvd.getTitulo());
            stmt.setString(2, dvd.getDirector());
            stmt.setString(3, dvd.getDuracion());
            stmt.setString(4, dvd.getGenero());
            stmt.setInt(5, dvd.getId());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
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
    
}
