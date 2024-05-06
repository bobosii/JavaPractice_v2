package DatabaseOperations;

import java.sql.*;

public class DBConnect {
    public static final String url = "jdbc:postgres://localhost:5432/university";
    public static final String user = "postgres";
    public static final String password = "postgres";

    public static void main(String[] args) {
        Connection connect = null;
        String select = "SELECT * FROM student";
        String prInsert = "INSERT INTO student(student_name,student_class) VALUES(?,?)";
        try {
            connect = DriverManager.getConnection(url,user,password);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(select);
            while (data.next()){
                System.out.println("ID : " + data.getInt("student_id"));
                System.out.println("İsim : " + data.getString("student_name"));
                System.out.println("Sınıf : " + data.getInt("student_class"));
            }
            PreparedStatement prSt = connect.prepareStatement(prInsert);
            prSt.setString(1,"Doğa");
            prSt.setInt(2,4);

            connect.close();
            prSt.close();
            st.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
