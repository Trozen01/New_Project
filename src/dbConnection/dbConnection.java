package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnection {
	
public static String ocl, ocl1, ocl2,ocl3;

	public static void main(String[] args) {
		// Object of Statement. It is used to create a Statement to execute the query
        ResultSet rs = null ;
     // ResultSet rs1 = null ;
        ResultSet rs2 = null ;
        ResultSet rs3 = null ;
     // boolean result = false;
     // boolean status = false;
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException e) {

          System.out.println("Where is your Oracle JDBC Driver?");
          e.printStackTrace();
            }
        
        System.out.println("Oracle JDBC Driver Registered!");
        
        String username="Insight_sit4";
        String password="Insight_sit4";

        Connection connection = null;
        // 
        try {
            
            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.10.11.148:1521:INSIGHTDR", username, password);
            
            
              if (connection != null) {
                System.out.println("You made it, take control your database now for DBUsername:");
              } else {
                System.out.println("Failed to make connection!");
              }
        
              Thread.sleep(4000);
              Statement stmt=connection.createStatement();
           // String query1 = "select * from AXIS_QSTATUS where MERCHANTCODE ='"+ mercode + "'";
             
              String query1 = "select * from XP_MESOURCEFILE where ROWNUM = 1 order by 1 DESC";
                         
              
              
              rs= stmt.executeQuery(query1); 
            
              while(rs.next()){
              
                   ocl = rs.getString("MESF_ID");
              	
                  System.out.println("MESF_ID ="+ocl);
            }
              
              Thread.sleep(4000); 
            Statement stmt1=connection.createStatement();
            
            Thread.sleep(2000);
            //String query2= "select MERCHANTPROFILEID  from XP_ME_BULKUPLOAD where MESF_ID ='"+164583+"'";
            String query2= "select MERCHANTPROFILEID  from XP_ME_BULKUPLOAD where MESF_ID ='"+ocl+"'";

            //System.out.println("sql queri is:-"+query2);
            
            rs2= stmt1.executeQuery(query2); 
            
            while(rs2.next()){
          	  
          	  ocl2 = rs2.getString("MERCHANTPROFILEID");
            	
                System.out.println("MERCHANTPROFILEID = "+ocl2);
            	}
            
            Thread.sleep(4000);
            Statement stmt2=connection.createStatement();
           
            String query3 = "select MERCHANTCODE from XP_MERCHANTPROFILE where MERCHANTPROFILEID ='"+ocl2+"'";

            //System.out.println("sql queri is:-"+query3);
            
            rs3= stmt2.executeQuery(query3);  
            
            System.out.println("sql query:-" +query3);
              
            while(rs3.next()){
          	  
          
          	  ocl3 = rs3.getString("MERCHANTCODE");
          	  
                System.out.println("MERCHANTCODE ="+ocl3);
                
          
            	}  

            
        } catch (Exception e) {

            System.out.println("Problem in codce?");
            e.printStackTrace();
           
          }
        System.out.println("return value ="+ocl3);
        

	}

}
