package Utilities;

import java.sql.*;

public class DataBaseHelper {

    public static String valueID;
    public static String valueNAme;
    public static String valueTimeForm;
    public static String valueTimeTo;

    public static String lectureName;
    public static String lectureTime;

    public static String url = "Dummy URL";
    public static String user = "Dummy user";
    public static String password = "Dummy password";



    //Method to connect to oracle database and run SQL query
    public static void getValuesFromDataBase ()
    {
//		 String url = "Dummy URL";
//	        String user = "Dummy user";
//	        String password = "Dummy password";


        try (
                Connection connection =
                        DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "postgres", "postgres")
        {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("Dummy query");
            while (resultSet.next()) {
                //System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("model"), resultSet.getString("price"));
                valueID = resultSet.getString(1);
                valueNAme = resultSet.getString(2);
                valueTimeForm = resultSet.getString(3);
                valueTimeTo = resultSet.getString(3);
            }

        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
        System.out.println(valueID);
        System.out.println(valueNAme);
        System.out.println(valueTimeForm);
        System.out.println(valueTimeTo);

    }


    public static String getRoadExamNameFromDataBase(String dateToday){
//		String url = "Dummy URL";
//		String user = "Dummy username";
//		String password = "Dummy password";
        String roadExamName = null;

        try (
                Connection connection = DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "Dummy username", "Dummy password")
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Dummy query");
            //"+getReservationTimeForRoadExam()+"

            while (resultSet.next()) {
                roadExamName = resultSet.getString(1);
            }

        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
        //System.out.println("Road Exam name is : " + roadExamName);
        return roadExamName;
    }


    public static void setIexamPassScoreZero(String LicType) throws SQLException {


        Connection con = DriverManager.getConnection(url, user, password);
        try {
            int vtp = 501;
            String sql = null;
            switch (LicType) {
                case "LIC2775":
                    sql = "Dummy query";
                    break;
                case "LIC2777":
                    sql = "Dummy query";
                    break;
            }
            Statement statement = con.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }





    public static void updateClassForRoadExamToday(){

//		String url = "Dummy URL";
//		String user = "Dummy username";
//		String password = "Dummy password";

        try (
                Connection connection = DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "Dummy username", "Dummy password")
        {
            Statement statement = connection.createStatement();
            String sql = "Dummy query";
            statement.executeUpdate(sql);
            connection.close();
        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
    }

    public static String getUserNameForEmp(String nationalid){
//		String url = "Dummy URL";
//		String user = "Dummy username";
//		String password = "Dummy password";
        String username = null;

        try (
                Connection connection = DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "Dummy username", "Dummy password")
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Dummy query");
            //"+getReservationTimeForRoadExam()+"

            while (resultSet.next()) {
                username = resultSet.getString(1);
            }

        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
        //System.out.println("Road Exam name is : " + roadExamName);
        return username;
    }

    public static void getLectureNameAndTime(String nationalID){
//		String url = "Dummy URL";
//		String user = "Dummy username";
//		String password = "Dummy password";
        String username = null;

        try (
                Connection connection = DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "Dummy username", "Dummy password")
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Dummy query");
            //"+getReservationTimeForRoadExam()+"

            while (resultSet.next()) {
                lectureName = resultSet.getString(1);
                lectureTime = resultSet.getString(2);
            }

        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
        //System.out.println("Road Exam name is : " + roadExamName);
    }

    public static void updateTrianingClassForLectures(){

//		String url = "Dummy URL";
//		String user = "Dummy username";
//		String password = "Dummy password";

        try (
                Connection connection = DriverManager.getConnection(url, user, password))
        //Connection connection = DriverManager.getConnection("Dummy URL", "Dummy username", "Dummy password")
        {
            Statement statement = connection.createStatement();
            String sql = "Dummy query";
            statement.executeUpdate(sql);

            connection.close();
        } catch (Exception ex) {
            System.out.println("Connection failure.");
            ex.printStackTrace();
        }
    }
}
