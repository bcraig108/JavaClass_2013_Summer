package Hour9;

public class MathRandomExamples {

    public static void main(String[] args) {
        
        // Math.random generates a pseudo-random number between greater than or
        // equal to 0.0 and less than 1.0
        double rand = Math.random();
        
        System.out.println( "rand = " + rand ); 
        
        // we can use our random number to select one student from our list
        String [] students = { "Carter", "Ben", "Robert", 
                               "Alec", "Josiah", "Joey" };
        
        int index = (int)Math.floor( students.length * rand );
        
        System.out.println( "Random index = " + index );
        System.out.println( "Random student: " + students[index] );
    }
}
