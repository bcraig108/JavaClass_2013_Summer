package Hour18;

public class ExceptionThrowDemo {

    public static void ThrowMethod() throws ArithmeticException {
        int temp = 1 / 0;
    }

    public static void CatchThrowMethod1() throws ArithmeticException {
        try {
            ThrowMethod();
        }
        catch ( ArithmeticException e ) {
            System.out.println( "CatchThrowMethod1: caught " + e.getMessage() ); 
            throw e;
        }
    }
    
    public static void CatchThrowMethod2() throws Exception {
        try {
            ThrowMethod();
        }
        catch ( Exception e ) {
            System.out.println( "CatchThrowMethod2: caught " + e.getMessage() );
            throw e;
        }
    }
    
    public static void IgnoreMethod() throws ArithmeticException {
        ThrowMethod();
    }
    
    public static void CatchMethod() {
        try {
            ThrowMethod();
        }
        catch ( Exception e ) {
            System.out.println( "CatchMethod: caught " + e.getMessage() );
        }
    }
    
    public static void main(String[] args) {

        try {
            ThrowMethod();
        }
        catch ( ArithmeticException e ) {
            System.out.println( "main(1): caught " + e.getMessage() );
        }

        try {
            CatchThrowMethod1();
        }
        catch ( ArithmeticException e ) {
            System.out.println( "main(2): caught " + e.getMessage() );
        }
        
        try {
            CatchThrowMethod2();
        }
        catch ( Exception e ) {
            System.out.println( "main(3): caught " + e.getMessage() );
        }
        
        try {
            IgnoreMethod();
        }
        catch ( ArithmeticException e ) {
            System.out.println( "main(4): caught " + e.getMessage() );
        }

        try {
            CatchMethod();
        }
        catch ( ArithmeticException e ) {
            System.out.println( "main(5): caught " + e.getMessage() );
        }
    }
}
