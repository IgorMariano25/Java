public class floatAndDouble {
    public static void main(String[] args) throws Exception {
    System.out.println("===============================================");
    System.out.println("  MINIMUN AND MAXIMUM VALUE OF A FLOAT NUMBER  ");
    System.out.println("===============================================");
    float myMinimumFloatValue = Float.MIN_VALUE;
    float myMaximumFloatValue = Float.MAX_VALUE;
    System.out.println("The minimum value of a float number is equal to: " + myMinimumFloatValue);
    System.out.println("The maximum value of a float number is equal to: " + myMaximumFloatValue);
    
    System.out.println();
    
    System.out.println("===============================================");
    System.out.println(" MINIMUN AND MAXIMUM VALUE OF A DOUBLE NUMBER ");
    System.out.println("===============================================");
    double myMinimumDoubletValue = Double.MIN_VALUE;
    double myMaximumDoubletValue = Double.MAX_VALUE;
    System.out.println("The minimum value of a double number is equal to: " + myMinimumDoubletValue);
    System.out.println("The maximum value of a double number is equal to: " + myMaximumDoubletValue);
    
    System.out.println();
    
    int myIntValue = 5;

    // TWO WAYS TO USE A DOUBLE VARIABLE
    // First WAY
    float myFloatValue = 5.85f;
    // SECOND WAY
    float myOtherFloatValue = (float)(5.85);

    double myDoubleValue = 5d;

    System.out.println("myIntValue is equal to: " + myIntValue);
    System.out.println("myFloatValue is equal to: " + myFloatValue);
    System.out.println("myOtherFloatValue is equal to: " + myOtherFloatValue);
    System.out.println("myDoubleValue is equal to: " + myDoubleValue);

    int myIntDividedValue = 5 / 2;

    float myFloatDivideValue = 5.5f / 2f;

    double myDoubleDividedValue = 5.5d / 2d;
    }
}
