import java.sql.*;
	public class testPack{ 
		public static void main(String a[])
		{
			 Connection con = null;
			 String url = "jdbc:mysql://localhost:3306/";
			 String dbName = "testDb";
			 String driver = "com.mysql.jdbc.Driver";
			 String userName = "root";
			 String password = "";
			 try {
	            Class.forName(driver).newInstance();
	            con = DriverManager.getConnection(url+dbName,userName,password);
	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery("select s.name,t.test_mark from Student s,testing t where s.test_id=t.id");
	            while( rs.next() ) {
	                String data = rs.getString(1);
                        String data2 = rs.getString(2);
	                System.out.println( data );
                         System.out.println( data2 );
	            }
	            System.out.println("Results");
	            st.close();
	        }
	        catch( Exception e ) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
		}
	}


