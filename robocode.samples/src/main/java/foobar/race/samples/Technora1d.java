package foobar.race.samples;

import java.awt.Color;

import foobar.hippy.van.AbstractVan;
import foobar.hippy.van.fuel.CheapPetrol;
import foobar.hippy.van.fuel.RacingPetrol;
import foobar.hippy.van.fuel.ExpensivePetrol;
import robocode.ScannedRobotEvent;

/**
 * This is a spaceship fuel using example. Technora1d uses a mix of fuels.
 * 
 * @author Pablo Rodriguez (original)
 */
public class Technora1d extends AbstractVan {

	// Constructor
	public Technora1d() {
		super();

		// Set the colour of the spaceship
		setBodyColor(Color.GREEN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void runACI() {
		// Main loop
		while (true) {
			accelerate();
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFuel() {
		addFuel(CheapPetrol.name, 3950);
		addFuel(ExpensivePetrol.name, 1000);
		addFuel(RacingPetrol.name, 50);
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