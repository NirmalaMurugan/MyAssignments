package week2.day4;

public class APIClient {

	void sendRequest(String endpoint) {
		System.out.println("1 argument method of send request is displayed");
	}

	void sendRequest(String endpoint, String requestBody, int requestStatus) {
		System.out.println("3 arguments method of send request is displayed");
	}

	public static void main(String[] args) {
		System.out.println("Method Overloading");
		APIClient A = new APIClient();
		A.sendRequest("Endpoint");
		A.sendRequest("Endpoint", "RequestBody", 5);
	}

}
