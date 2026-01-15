public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java Docker container 🚀");
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
