package creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The "Square" class represents a geometric shape of a square.
 */
public class Square implements IGeometricShape {

  private static final Logger log = LoggerFactory.getLogger(Square.class);

  @Override
  public void drawShape() {
    log.info("[]");
  }
}
