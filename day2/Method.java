package week1.day2;

public class Method {

	public void browserName() {
		System.out.println("Browser name is chrome");

	}

	private void browserVersion(int a) {
		System.out.println("Browser version is " + a);

	}
	int numberOfBrowser() {
		return 2;

	}

	protected String browserUrl(String url, String applicationName) {
		return "Url :" + url + " ApplicationName :" + applicationName;
	}

	public static void main(String[] args) {

		// ClassName object=new ClassName();
		Method lm = new Method();

		// objectname.method()
		// void -returnType
		// object.method()
		lm.browserName();
		lm.browserUrl("www.testleaf.com", "EdTech");
		lm.browserVersion(4);

		// returnTypes - dataTypes
		// way1 - ctrl+2 +>l
		String browserUrl = lm.browserUrl("www.testleaf.com", "EdTech");
		System.out.println(browserUrl);

		// way2
		System.out.println(lm.numberOfBrowser());

	}
}