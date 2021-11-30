package dao;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;

    public class DataBase {
    
   
    public static void createTable() {
    	try {
    		Connection conn = getConnection();
    		PreparedStatement create = conn.prepareStatement(
    				"CREATE TABLE IF NOT EXISTS "
    				+ "management(seq INT(11) NOT NULL AUTO_INCREMENT,"
    				+ "id VARCHAR(30) NOT NULL,"
    				+ "password VARCHAR(30) NOT NULL,"
    				+ "name VARCHAR(10) NOT NULL,"
    				+ "gender VARCHAR(10) NOT NULL,"
    				+ "tel VARCHAR(20) NOT NULL,"
    				+ "email VARCHAR(30) NOT NULL,"
    				+ "createDate DATE NOT NULL,"
    				+ "PRIMARY KEY(seq));");
    		create.execute();
    	}
    	catch (Exception e) {
    		System.out.println(e.getMessage());
    	}finally {
    		System.out.println("테이블이 성공적으로 생성되었습니다.");
    	}
    }
    public static Connection dbConn;
    public static Connection getConnection() {

        Connection conn = null;

        try {
            String id = "sql5455191"; 
            String pw = "kJU8nmzweV";
            String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5455191";

            Class.forName("com.mysql.cj.jdbc.Driver");        
            conn = DriverManager.getConnection(url, id, pw);

            System.out.println("Database 연결 성공");
          
        } catch (Exception e) {
            System.out.println("Database 연결 실패");
            e.printStackTrace();
        }
        return conn;     
    }

    public static void close(PreparedStatement stmt, Connection conn) {
        if (stmt != null) {
            try {
                if (!stmt.isClosed())
                    stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                stmt = null;
            }
        }

        if (conn != null) {
            try {
                if (!conn.isClosed())
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
        if (rs != null) {
            try {
                if (!rs.isClosed())
                    rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }

        if (stmt != null) {
            try {
                if (!stmt.isClosed())
                    stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                stmt = null;
            }
        }
        if (conn != null) {
            try {
                if (!conn.isClosed())
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

    public static void main(String[] args) {
       
        createTable();
      }
    }