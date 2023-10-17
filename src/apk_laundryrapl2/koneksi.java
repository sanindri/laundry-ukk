
package apk_laundryrapl2;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/laundry_rrapl2";
    private String username = "root";
    private String password ="";
    private Connection conn;
    
    public void connect(){
        try{
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog( null, e.getMessage());
        }
        }
    
    public Connection getCon() {
        try{
            
        
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_rrapl2", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
