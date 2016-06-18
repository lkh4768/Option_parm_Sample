
public class Employee {
	private final String id;
	private final String name;
	private final Options options;

	public static class Options {
		private int age = 0;
		private String phoneNum = null;

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
	}

	public Employee(String id, String name, Options options) {
		this.id = id;
		this.name = name;
		this.options = options;
	}

	public String toString() {
		String str = "id : " + this.id + "\nname : " + this.name;
		if (this.options.age != 0)
			str += "\nage : " + this.options.age;
		if (!this.options.phoneNum.equals("") || this.options.phoneNum != null)
			str += "\nphoneNum : " + this.options.phoneNum;
		return str;
	}
}
