package week3.day1;

public abstract class MySqlConnection implements DatabaseConnection {
	void executeQuery() {
		System.out.println("ExecuteQuery is implemented and executed from abstract class");
	}
}
