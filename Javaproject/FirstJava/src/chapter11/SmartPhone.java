package chapter11;

public class SmartPhone implements Comparable<SmartPhone> {
	private String name;
	private String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	// HashSet 에서 중복 저장을 하지 않는다.!
	// hashcode 참조 ->
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return phoneNumber.charAt(phoneNumber.length() - 1);
		// 0 ~ 9 사이값나옴
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null && obj instanceof SmartPhone) {
			SmartPhone phone = (SmartPhone) obj;
			result = phoneNumber.equals(phone.getPhoneNumber());
		}
		return result;
	}

	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName())*-1;//1은 -1로 -1은 1로 바뀜
	}

	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
