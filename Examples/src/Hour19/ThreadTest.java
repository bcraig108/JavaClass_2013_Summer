package Hour19;

public class ThreadTest {

    public static void main(String[] args) {

        SimpleThread thread1 = new SimpleThread( "Java" );
        SimpleThread thread2 = new SimpleThread( "C++" );
        
        thread1.start();
        thread2.start();
    }
}
