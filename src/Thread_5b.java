import java.util.*;

public class Thread_5b extends Thread    {
        private String info;
        private Vector aVector = new Vector();

        public Thread_5b (String info) {
                this.info = info;
        }

        public void inProtected () {
           synchronized ( aVector )     {
                System.err.println(info + ": is in protected()");
                try {
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
            (new Thread_5b("first")).start();
            (new Thread_5b("second")).start();
        }
}
