package appStudents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ManageStudents {
	private Connection connection;
	public void openConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost/school","uadmin","abc123.");
	}

	public void closeConnection() throws SQLException {
		connection.close();
	}

	public boolean addStudent(Students student) {
		try {
			String sql = "INSERT INTO student"+"VALUES (" + 
					"'" +student.getId()+ "'," +
					"'" +student.getName()+ "'," +
					"'" +student.getSurname()+ "'," +
					"'" +student.getAge()+ "')";
			openConnection();
			Statement sentence = connection.createStatement();
			int rows =sentence.executeUpdate(sql);
			closeConnection();
			return rows >0;
			
		} catch (SQLException e) {
			return false;
		}


	}
}
