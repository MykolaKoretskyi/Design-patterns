package creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The "Circle" class represents a geometric shape of a circle.
 */
public class Circle implements IGeometricShape {

  private static final Logger log = LoggerFactory.getLogger(Circle.class);

  @Override
  public void drawShape() {
    log.info("O");
  }
}
