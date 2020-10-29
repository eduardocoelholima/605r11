import java.util.*;

public class Thread_5 extends Thread    {
        private String info;
        static  Vector aVector;

        public Thread_5 (String info, Vector aVector) {
                this.info = info;
                this.aVector = aVector;
        }

        public void inProtected () {
           synchronized ( aVector )     {
                System.err.println(info + ": is in protected()");
                try {
                        if ( info.equals("second") )
                                sleep(1000);
                        else
                                sleep(3000);
                }
                catch (  InterruptedException e ) {
                        System.err.println("Interrupted!");
                }
                System.err.println(info + ": exit run");
           }
        }

        public void run () {
                inProtected();
        }

        public static void main (String args []) {
            (new Thread_5("first", new Vector())).start();
            (new Thread_5("second", new Vector())).start();
        }
}
