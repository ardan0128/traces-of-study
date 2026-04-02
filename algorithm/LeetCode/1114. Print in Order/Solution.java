
class Foo {

    private Semaphore secondSemaphore;
    private Semaphore thirdSemaphore;

    public Foo() {
        secondSemaphore = new Semaphore(0);
        thirdSemaphore = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        secondSemaphore.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        secondSemaphore.acquire();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        thirdSemaphore.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        thirdSemaphore.acquire();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
