package JavaCollections.DeadLock;

public class DeadLockConcept {

/*
    When two thread wants to access same resource then it is called deadlock and it is a never ending process
      To overcome this, threads should maintain a order to access the same resource
       like thread A wants to access X and Y resource then first it should access X and then y and likewise other threads.
*/


    public void test1() {

        synchronized (Test.ob1) { //thread 1

            synchronized (Test.ob2) {


            }

        }

    }


    public void test2() {

        synchronized (Test.ob2) { //thread2

            synchronized (Test.ob1) {


            }

        }

    }


}
