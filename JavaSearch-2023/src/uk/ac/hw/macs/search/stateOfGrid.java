package uk.ac.hw.macs.search;

import java.util.Objects;

public class stateOfGrid implements State{

    private final int x, y;  // Coordinates of the current state
    private final int goalX, goalY;  // Goal coordinates
    private final int gCost;  // Cost from the start state to this state

	
    public stateOfGrid(int x, int y, int goalX, int goalY, int gCost) {
        this.x = x;
        this.y = y;
        this.goalX = goalX;
        this.goalY = goalY;
        this.gCost = gCost;
    }
	
	@Override
	public boolean isGoal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getHeuristic() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getgCost() {
		return gCost;
	}

}
