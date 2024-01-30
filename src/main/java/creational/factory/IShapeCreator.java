package creational.factory;

/**
 * Interface for creating shapes.
 */
public interface IShapeCreator {

  IGeometricShape createShape(String shapeTypeName);
}
