package foobar.race.samples;

import foobar.hippy.van.AbstractVan;
import foobar.hippy.van.fuel.CheapPetrol;
import foobar.hippy.van.fuel.RacingPetrol;
import foobar.hippy.van.fuel.ExpensivePetrol;
import robocode.ScannedRobotEvent;

/**
 * This is a spaceship fuel using example. Technora1a uses only coal.
 * 
 * @author Pablo Rodriguez (original)
 */
public class HappyVan2 extends AbstractVan {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void runACI() {

		//
		// Hardcode the route so the Van will go to the center ( aprox ) of the
		// screen so it will hit the Treasure
		//
		turnLeft(90);
		for (int i = 0; i < 150; i++) {
			accelerate();
		}
		turnRight(90);
		for (int i = 0; i < 150; i++) {
			accelerate();
		}

		// Main loop
		while (true) {

			// Move forward 30 turns
			for (int i = 0; i < 30; i++) {
				accelerate();
			}

			// Scan for other spaceships / asteroids.
			moveRadar();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFuel() {
		addFuel(CheapPetrol.name, 2500);
		addFuel(ExpensivePetrol.name, 0);
		addFuel(RacingPetrol.name, 0);
	}

	private void moveRadar() {
		turnRadarRight(360);
	}

	@Override
	public void onScannedAnimal(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onScannedStone(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onScannedTreasure(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onScannedVan(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

}