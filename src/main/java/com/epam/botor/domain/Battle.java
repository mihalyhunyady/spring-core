package com.epam.botor.domain;

import java.util.List;

public class Battle {

    private final Battleground battleground;
    private final List<Army> armies;

    public Battle(final Battleground battleground, final List<Army> armies) {
        super();
        this.battleground = battleground;
        this.armies = armies;
    }

    public String play() {

        StringBuilder result = new StringBuilder(toString());

        if (armies.size() == 2) {

            for (Army army : armies) {

                Person armyLeader = army.getLeader();

                result.append(armyLeader.getName());
                result.append(" shouts: ");
    
                result.append("\n");
                result.append("\n");

                result.append(armyLeader.getName() + "'s army attacks!");
                result.append("\n");

                for (Person attacker : army.getFighters()) {
                	result.append(attacker.getName() + " says: " + attacker.fight());
                    result.append("\n");
                }

                result.append("\n");

            }

        } else {
            result.append("There must be exactly 2 armies!");
        }

        return result.toString();

    }


    
    public Battleground getBattleground() {
        return battleground;
    }

    public List<Army> getArmies() {
        return armies;
    }

}
