package creational.factory;

/**
 * The "AppFactory" class demonstrates the use of a factory pattern to create geometric shapes.
 */


public class AppFactory {

  private static final String CIRCLE = "circle";
  private static final String SQUARE = "square";
  private static final String LINE = "line";

  /**
   * Entry point of the application.
   */
  public static void main(String[] args) {

    IShapeCreator creator = new ShapeCreator();

    IGeometricShape shapeCircle = creator.createShape(CIRCLE);
    shapeCircle.drawShape();

    IGeometricShape shapeSquare = creator.createShape(SQUARE);
    shapeSquare.drawShape();

    IGeometricShape shapeLine = creator.createShape(LINE);
    shapeLine.drawShape();

  }
}
