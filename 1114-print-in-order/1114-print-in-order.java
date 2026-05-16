class Foo {
    private final CompletableFuture<Void> firstDone;
        private final CompletableFuture<Void> secondDone;

    public Foo() {

        firstDone=new CompletableFuture<>();
        secondDone=new CompletableFuture<>();



        



        
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstDone.complete(null);
    }

    public void second(Runnable printSecond) throws InterruptedException {

        firstDone.join();
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondDone.complete(null);
    }

    public void third(Runnable printThird) throws InterruptedException {
        secondDone.join();
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}