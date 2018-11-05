package staff;

import java.sql.*;

public class Drivers extends ParkStaff {

    public Drivers(String name, String surname, int id, double salary) {
        super(name, surname, id, salary);
    }

    public static final String sqldriver = "com.mysql.cj.jdbc.Driver";
    public static final String server ="localhost";
    public static final String db_name = "Staff";
    public static final String url = "jdbc:mysql://" + server + "/" + db_name;
    public static final String login = "java";
    public static final String password = "6666";
    private static Connection connection;
    static PreparedStatement ps;
    static ResultSet rs;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(sqldriver);
        return DriverManager.getConnection(url, login, password);
    }

    public static void getDrivers() throws SQLException, ClassNotFoundException {
        String selectDriver = "select * from drivers";
        try {
            connection = getConnection();
            ps = connection.prepareStatement(selectDriver);
            rs = ps.executeQuery(selectDriver);
            while (rs.next()) {

                Drivers cardriver = new Drivers(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
                addPeople(cardriver);

            }
            for (ParkStaff cardriver : people) {
                System.out.println(cardriver.getId() + ": " + cardriver.getName()+ "_" + cardriver.getSurname() + " - car driver");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }


}
