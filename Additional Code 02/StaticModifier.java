public class StaticModifier {
  private static int numInstances = 0;

  protected static int getCount() {
    return numInstances;
  }

  private static void addInstance() {
    numInstances++;
  }

  StaticModifier() {
    StaticModifier.addInstance();
  }

  public static void main(String[] arguments) {
    System.out.println("Starting with " + StaticModifier.getCount() + " instances");
    for (int i = 0; i < 500; ++i) {
      new StaticModifier();
    }
    System.out.println("Created " + StaticModifier.getCount() + " instances");
  }
}
