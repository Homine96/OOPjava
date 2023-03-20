package Seminar_4_HW;

public class NonComparTypeExcept extends Exception{
    public NonComparTypeExcept(String type) {
        super(String.format("Type %s is not comparable", type));
    }
}