package ch05.se08;

public class GenericMaterial<T extends Material> {
  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  public String toString() {
    return material.toString();
  }
}
