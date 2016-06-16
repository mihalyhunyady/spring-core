package com.epam.botor.domain;

public abstract class Person {

    private String name;
    private final Gender gender;

    public Person(final String name, final Gender gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
        return gender;
    }
    
    public int getIdentityHashCode() {
    	return System.identityHashCode(this);
    }
    
    public abstract String fight();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

    
}
