package com.epam.botor.domain;

import java.util.List;

public class Army {

    private final Person leader;
    private final List<Person> fighters;

    public Army(final Person leader, final List<Person> fighters) {
        super();
        this.leader = leader;
        this.fighters = fighters;
    }

    public Person getLeader() {
        return leader;
    }

    public List<Person> getFighters() {
        return fighters;
    }

	@Override
	public String toString() {
		return "Army [leader=" + leader + ", fighters=" + fighters + "]";
	}
    
    

}
