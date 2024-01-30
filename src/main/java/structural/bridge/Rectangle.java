package structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {

  private static final Logger log = LoggerFactory.getLogger(Rectangle.class);

  public Rectangle(IColor color) {
    super.color = color;
  }

  @Override
  public void draw() {
    log.info("Shape: []");
    color.fillColor();
  }

}
