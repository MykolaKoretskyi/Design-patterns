package creational.factory;

/**
 * The "ShapeCreator" class implements the "IShapeCreator" interface as a factory for creating
 * geometric shapes. It provides a "createShape" method that returns an instance of
 * "IGeometricShape" based on the specified "shapeType" parameter (e.g., "circle," "square," or
 * "line"). If an unsupported shape type is provided, it throws an IllegalArgumentException.
 */
public class ShapeCreator implements IShapeCreator {

  /**
   * Creates and returns an "IGeometricShape" instance based on the provided "shapeType."
   *
   * @param shapeType The type of geometric shape to create ("circle," "square," "line").
   * @return An "IGeometricShape" corresponding to the specified shape type.
   * @throws IllegalArgumentException If the provided "shapeType" is not supported.
   */
  @Override
  public IGeometricShape createShape(String shapeType) {
    switch (shapeType) {
      case "circle":
        return new Circle();
      case "square":
        return new Square();
      case "line":
        return new Line();
      default:
        throw new IllegalArgumentException("Unsupported shape type: " + shapeType);
    }
  }

}
