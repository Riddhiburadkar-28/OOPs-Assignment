class MusicPlayer extends Thread {
    public void run() {
        System.out.println("Playing song...");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MusicPlayer t = new MusicPlayer();
        t.start();
    }
}