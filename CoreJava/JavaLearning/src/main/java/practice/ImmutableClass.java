package practice;

public final class ImmutableClass {
    private final int value;

    private ImmutableClass(int value) {
        this.value = value;
    }

    public static ImmutableClass createInstance(int value) {
    	System.out.println("val : "+value);
        return new ImmutableClass(value);
    }

    public int getValue() {
        return value;
    }}