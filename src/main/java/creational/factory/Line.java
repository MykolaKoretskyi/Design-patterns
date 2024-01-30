package creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The "Line" class represents a geometric shape of a line.
 */
public class Line implements IGeometricShape {

  private static final Logger log = LoggerFactory.getLogger(Line.class);

  @Override
  public void drawShape() {
    log.info("---");
  }
}
