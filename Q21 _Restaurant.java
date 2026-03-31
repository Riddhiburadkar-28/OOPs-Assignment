class Restaurant {
    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait();
            }
            System.out.println("Waiter served food");
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> r.prepareFood());
        Thread waiter = new Thread(() -> r.serveFood());

        waiter.start();
        chef.start();
    }
}