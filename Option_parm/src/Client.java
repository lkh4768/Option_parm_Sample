public class Client {
	public static void main(String[] args) {
		Employee.Options options = new Employee.Options();
		options.setAge(11);
		options.setPhoneNum("010-1234-1234");
		Employee employee = new Employee("160001", "lee", options);
		System.out.println(employee.toString());
	}
}
