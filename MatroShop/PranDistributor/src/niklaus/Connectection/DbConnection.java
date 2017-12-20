
package niklaus.Connectection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConnection 
{
    public Connection condb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shopManagement","root","");
           // JOptionPane.showMessageDialog(null,"DataBase Connected","Success Message",JOptionPane.PLAIN_MESSAGE);
            return con;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Connection failed","Error Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
