package edu.ccsu.cs417.vehicleAbstractFactory;

import edu.ccsu.cs417.enumeration.Direction;

/**
 *
 * @author cw1491
 */
public interface Vehicle {
  public void move(Direction d);
  public double getVehicleSoundLevel();
}
