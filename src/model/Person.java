package model;

public class Person {
	
	private String personName;
	
	private long currentMilliSecs;
	
	public Person() {
		currentMilliSecs = System.currentTimeMillis();
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getCurrentMilliSecs() {
		return currentMilliSecs;
	}

	public void setCurrentMilliSecs(long currentMilliSecs) {
		this.currentMilliSecs = currentMilliSecs;
	}


	
}
