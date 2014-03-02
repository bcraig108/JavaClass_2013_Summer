public class GradeScale {

    public static void main(String[] args) {

        int grade = Integer.parseInt(args[0]);
        char letter;
        
        if ( grade >= 90 )
        {
            letter = 'A';
        }
        else if ( grade >= 80 )
        {
            letter = 'B';
        }
        else
        {
            letter = 'F';
        }
        
        System.out.println( "Your scored a(n) " + letter );        
    }
}
