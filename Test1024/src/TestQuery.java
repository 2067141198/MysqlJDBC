import java.sql.*;

public class TestQuery {
    private static final String URL = "jsbc:mysql://localhost:3306/test0925_2";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            //1.创建驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.创建对象
            Statement statement = connection.createStatement();
            //4.执行sql语句
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            //5.处理结果集
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
