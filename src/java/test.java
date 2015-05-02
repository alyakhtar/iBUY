import java.sql.*;

public class test {
    static Connection cn;
    static Statement stmnt;
    static String URL="jdbc:mysql://localhost:3306/";
    static String username="root";
    static String pass="password";
    static ResultSet r;
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){}
        try{
            cn= DriverManager.getConnection(URL,username,pass);
            stmnt=cn.createStatement();
        }catch(SQLException ex){}
        try{
            stmnt.execute("USE onlineproject");            
        }catch(SQLException exep){System.out.println(exep.getMessage());}
        test.getCart(4,5);
    }
    public static ResultSet getCart(int item,int cust){
    ResultSet rs=null,res=null;
    String i_name;
    int price;
    try{
        rs=stmnt.executeQuery("SELECT i_name,price FROM items WHERE i_id="+item);
        rs.next();
        i_name=rs.getString(1);
        price=rs.getInt(2);
        stmnt.executeUpdate("INSERT INTO cart(prod,price,c_id,i_id) VALUES('"+i_name+"',"+price+","+cust+","+item+")");
        res=stmnt.executeQuery("SELECT prod,price,count(*) FROM cart WHERE c_id="+cust+" GROUP BY i_id"); 
        res.next();
        System.out.println(res.getInt(3));
    }catch(SQLException e){System.out.println(e.getMessage());}
    return res;
    
    }
}