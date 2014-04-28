package Hour18;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            int temp = 1 / 0;
        }
        finally {
            System.out.println( "Inside finally!" );
        }
    }
}

