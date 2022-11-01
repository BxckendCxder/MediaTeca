package SqlOps;

import java.sql.*;

public class ComandosDeAcceso {

    public boolean validacion(String user, String pass) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String idUser = null;
        boolean estado = false;
        try {
            String query = String.format("SELECT id FROM credenciales where usuario = '%s' and password = '%s'", user, pass);
            Conexion.getConnection();
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getString("id");
            }
            try {
                if (!idUser.equals("")) {
                    estado = true;
                }
            } catch (Exception ex) {
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estado;
    }

    public boolean chkUser(String user) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String idUser = null;
        boolean estado = false;
        try {
            String query = String.format("SELECT id FROM credenciales where usuario = '%s'", user);
            Conexion.getConnection();
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                idUser = rs.getString("id");
            }
            try {
                if (!idUser.equals("")) {
                    estado = true;
                }
            } catch (Exception ex) {
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return estado;
    }

    public void insertUser(String user, String password) {
        Connection conn = null;
        Statement stmt = null;
        try {
            String query = String.format("INSERT INTO credenciales (usuario, password) VALUES('%s', '%s') ", user, password);
            Conexion.getConnection();
            conn = Conexion.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
