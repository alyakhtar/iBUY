import java.sql.*;

public class accessDB {
    static Connection cn;
    static Statement stmnt;
    static String URL="jdbc:mysql://localhost:3306/";
    static String username="root";
    static String pass="password";
    static ResultSet r;
    public static void connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){}
        try{
            cn= DriverManager.getConnection(URL,username,pass);
            stmnt=cn.createStatement();
        }catch(SQLException ex){}
        try{
            stmnt.execute("USE onlineproject");            
        }catch(SQLException exep){}        
    }
    
    
    public static void setUser(String s){
        try{
            stmnt.executeUpdate("UPDATE log SET name='"+s+"' WHERE id=1");
        }catch(SQLException exe){}
    }
    
    
    public static String getUser(){
        String s="";
        try{
            r=stmnt.executeQuery("SELECT * FROM log");
            r.next();
            s=r.getString(2);
            r.previous();
        }catch(SQLException exepti){}
        return s;
    } 
    public static int checkUser(String name,String pass){
        String n="",p="";
        int i=0;
        try{
            r=stmnt.executeQuery("SELECT * FROM customer where c_name='"+name+"' AND c_pass='"+pass+"'");
            if(r.next())
                i=1;
        }catch(SQLException exep){}
        return i;
    }
    public static void createUser(String name,String ph,String email,String passwd,String cpasswd,String add1,String add2,String city,String state,String pin,String amount){
        int phone=Integer.parseInt(ph);
        int pinno=Integer.parseInt(pin);
        int amt=Integer.parseInt(amount);
        try{
            stmnt.executeUpdate("INSERT INTO customer(c_name,c_no,c_email,c_pass,c_cpass,c_amt) VALUES('"+name+"',"+phone+",'"+email+"','"+passwd+"','"+cpasswd+"',"+amt+")");
            r=stmnt.executeQuery("SELECT c_id FROM customer WHERE c_name='"+name+"'");
            r.next();
            int i=r.getInt(1);
            stmnt.executeUpdate("INSERT INTO address VALUES("+i+",'"+add1+"','"+add2+"','"+city+"','"+state+"',"+pinno+")");
        }catch(SQLException e){
        }
        
    }
    
    public static ResultSet itemdata(String s){
        try{
            r=stmnt.executeQuery("SELECT * FROM items WHERE i_name='"+s+"'");
            r.next();
        }catch(SQLException e){}
        return r;
    }
    public static ResultSet getComments(int i){
        try{
            r=stmnt.executeQuery("SELECT * FROM ratings WHERE i_id="+i);
        }catch(SQLException e){}
        return r;
    }
    public static void setItem(int i){
        try{
            stmnt.executeUpdate("UPDATE iflag SET item="+i+" WHERE id=1");
        }catch(SQLException exe){}
    }
    public static int getItem(){
        int i=0;
        try{
            r=stmnt.executeQuery("SELECT * FROM iflag");
            r.next();
            i=r.getInt(2);
            r.previous();
        }catch(SQLException exepti){}
        return i;
    } 
    public static void addComment(String s,int i){
        int id;
        String str;
        str=accessDB.getUser();
        id=accessDB.getCustId(str);
        try{
            stmnt.executeUpdate("INSERT into ratings VALUES(now(),'"+s+"',"+id+","+i+")");
        }catch(SQLException e){}
    }
    public static int getCustId(String s){
        ResultSet rs;
        int i=0;
        try{
            rs=stmnt.executeQuery("Select c_id FROM customer WHERE c_name='"+s+"'");
            rs.next();
            i=rs.getInt(1);
            rs.previous();
            rs.close();
        }catch(SQLException e){}
        return i;
    }
    public static ResultSet getCart(int item,int cust){
    ResultSet rs=null;
    String i_name;
    int price;
    try{
        rs=stmnt.executeQuery("SELECT i_name,price FROM items WHERE i_id="+item);
        rs.next();
        i_name=rs.getString(1);
        price=rs.getInt(2);
        stmnt.executeUpdate("INSERT INTO cart(prod,price,c_id,i_id) VALUES('"+i_name+"',"+price+","+cust+","+item+")");
        rs=stmnt.executeQuery("SELECT prod,price,count(*) FROM cart WHERE c_id="+cust+" GROUP BY i_id"); 
    }catch(SQLException e){}
    return rs;
    
    }
    
    public static int getTotal(int item,int cust){
        int t=0;
        ResultSet rs;
        try{
            rs=stmnt.executeQuery("SELECT sum(price) FROM cart WHERE c_id="+cust);
            rs.next();
            t=rs.getInt(1);
        }catch(SQLException e){}
        return t;
    }
    
    public static void removecart(){
    String s=accessDB.getUser();
    int c=accessDB.getCustId(s);
    try{
    stmnt.executeUpdate("DELETE FROM cart WHERE c_id="+c);
    }catch(SQLException e){}
    }
    
    
}
