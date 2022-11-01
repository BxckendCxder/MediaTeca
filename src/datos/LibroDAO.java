package datos;

import SqlOps.Conexion;
import domain.*;
import java.sql.*;
import java.util.*;

public class LibroDAO extends MaterialEscrito {

    private static final String SQL_SELECT = "SELECT Id, titulo, autor, "
            + "numeroDePaginas, editorial, ISBN, yearPub, unidadesDisponibles "
            + "FROM libros";

    private static final String SQL_SELECT2 = "SELECT Id, titulo, autor, "
            + "numeroDePaginas, editorial, ISBN, yearPub, unidadesDisponibles "
            + "FROM libros WHERE ID = ?";

    private static final String SQL_INSERT = "INSERT INTO libros (titulo, autor, "
            + "numeroDePaginas, editorial, ISBN, yearPub, unidadesDisponibles)"
            + "VALUES (?,?,?,?,?,?,?)";

    private static final String SQL_DELETE = "DELETE FROM libros WHERE ID=?";
    
    private static final String SQL_UPDATE = "UPDATE libros SET titulo = ?, autor = ?, "
            + "numeroDePaginas = ?, editorial = ?, ISBN = ?, yearPub = ?,"
            + "unidadesDisponibles = ? WHERE id = ?";

    String autor = null;
    String isbn = null;
    int numDePag;
    int yearPub;

    public List<Libro> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Libro libro = null;
        List<Libro> libros = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                numDePag = rs.getInt("numeroDePaginas");
                editorial = rs.getString("editorial");
                isbn = rs.getString("ISBN");
                yearPub = rs.getInt("yearPub");
                unidadesDisponibles = rs.getInt("unidadesDisponibles");
                libro = new Libro(id, titulo, autor, numDePag, editorial, isbn, yearPub, unidadesDisponibles);
                libros.add(libro);
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
        return libros;
    }

    public List<Libro> buscar(int codigo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Libro libro = null;
        List<Libro> libros = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT2);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();

            while (rs.next()) {
                id = rs.getInt("Id");
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                numDePag = rs.getInt("numeroDePaginas");
                editorial = rs.getString("editorial");
                isbn = rs.getString("ISBN");
                yearPub = rs.getInt("yearPub");
                unidadesDisponibles = rs.getInt("unidadesDisponibles");
                libro = new Libro(id, titulo, autor, numDePag, editorial, isbn, yearPub, unidadesDisponibles);
                libros.add(libro);
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
        return libros;
    }

    //SEGUNDO METODO
    public int insertar(Libro libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setInt(3, libro.getNumeroDePag());
            stmt.setString(4, libro.getEditorial());
            stmt.setString(5, libro.getIsbn());
            stmt.setInt(6, libro.getYearPub());
            stmt.setInt(7, libro.getUnidadesDisponibles());
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

    public int actualizar(Libro libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setInt(3, libro.getNumeroDePag());
            stmt.setString(4, libro.getEditorial());
            stmt.setString(5, libro.getIsbn());
            stmt.setInt(6, libro.getYearPub());
            stmt.setInt(7, libro.getUnidadesDisponibles());
            stmt.setInt(8, libro.getId());
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
