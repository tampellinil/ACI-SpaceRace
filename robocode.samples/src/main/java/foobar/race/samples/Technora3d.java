package foobar.race.samples;

import foobar.coolingsystem.LiquidHydrogen;
import foobar.fuel.Coal;
import foobar.fuel.Hydrogen;
import foobar.fuel.Petrol;
import foobar.hippy.van.AbstractVan;
import robocode.ScannedRobotEvent;

/**
 * This is a spaceship scanning example. Technora3d uses only coal
 * (=Technora1a). It spins the spaceship every 30 turns. Max.degrees/turn = 10.
 * 
 * @author Pablo Rodriguez (original)
 */
public class Technora3d extends AbstractVan {

	// Constructor
	public Technora3d() {
		super();

		// Set the cooling System
		setCoolingSystem(new LiquidHydrogen());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void runACI() {

		// Main loop
		while (true) {

			// Move 30 turns
			for (int i = 0; i < 30; i++) {
				accelerate();
			}

			// Spin the Spaceship
			spinpaceship();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFuel() {
		addFuel(Coal.name, 5000);
		addFuel(Petrol.name, 0);
		addFuel(Hydrogen.name, 0);
	}

	/**
	 * Rotate the spaceship 360 degrees left.
	 */
	private void spinpaceship() {
		// turnRight(360);
		turnLeft(360);
	}

	@Override
	public void onScannedAsteroid(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onScannedSpaceship(ScannedRobotEvent event) {
		// TODO Auto-generated method stub

	}

}