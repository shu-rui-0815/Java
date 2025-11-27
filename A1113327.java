import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DumplingShop {
    private int porkDumplings;
    private int beefDumplings;
    private int vegetableDumplings;
    
    private final Object lock = new Object();
    
    public DumplingShop(int pork, int beef, int vegetable) {
        porkDumplings = pork;
        beefDumplings = beef;
        vegetableDumplings = vegetable;
    }
    
    public boolean sellDumplings(String type, int quantity) {
        synchronized (lock) {
            switch (type) {
                case "pork":
                    if (porkDumplings >= quantity) {
                        porkDumplings -= quantity;
                        return true;
                    }
                    break;
                case "beef":
                    if (beefDumplings >= quantity) {
                        beefDumplings -= quantity;
                        return true;
                    }
                    break;
                case "vegetable":
                    if (vegetableDumplings >= quantity) {
                        vegetableDumplings -= quantity;
                        return true;
                    }
                    break;
            }
            return false;
        }
    }
    
    public int getPorkDumplings() {
        return porkDumplings;
    }
    
    public int getBeefDumplings() {
        return beefDumplings;
    }
    
    public int getVegetableDumplings() {
        return vegetableDumplings;
    }
}

class Customer implements Runnable {
    private static final Random random = new Random();
    
    private DumplingShop shop;
    
    public Customer(DumplingShop shop) {
        this.shop = shop;
    }
    
    public void run() {
        int quantity = random.nextInt(41) + 10;  
        String[] types = {"pork", "beef", "vegetable"};
        String type = types[random.nextInt(3)];  
        
        boolean sold = shop.sellDumplings(type, quantity);
        
        if (sold) {
            System.out.println(Thread.currentThread().getName() + " purchased " + quantity + " " + type + " dumplings.");
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to purchase " + quantity + " " + type + " dumplings but they are sold out.");
        }
    }
}

public class A1113327 {
    public static void main(String[] args) {
        DumplingShop shop = new DumplingShop(5000, 3000, 1000);
        int numOfCustomers = 10;  
        
        ExecutorService executorService = Executors.newFixedThreadPool(numOfCustomers);
        
        for (int i = 1; i <= numOfCustomers; i++) {
            executorService.execute(new Customer(shop));
            try {
                Thread.sleep(3000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        executorService.shutdown();
        
        while (!executorService.isTerminated()) {

        }
        
        System.out.println("Pork dumplings remaining: " + shop.getPorkDumplings());
        System.out.println("Beef dumplings remaining: " + shop.getBeefDumplings());
        System.out.println("Vegetable dumplings remaining: " + shop.getVeget