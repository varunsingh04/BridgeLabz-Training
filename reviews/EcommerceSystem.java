package reviews;

import java.util.*;


class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}


interface Payment {
    void pay(double amount) throws PaymentFailedException;
}


class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (Math.random() < 0.05) throw new PaymentFailedException("Card payment failed");
        System.out.println("Paid via Card: " + amount);
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (Math.random() < 0.1) throw new PaymentFailedException("UPI payment failed");
        System.out.println("Paid via UPI: " + amount);
    }
}

class WalletPayment implements Payment {
    double balance = 100000;

    public void pay(double amount) throws PaymentFailedException {
        if (balance < amount) throw new PaymentFailedException("Insufficient balance in wallet");
        balance -= amount;
        System.out.println("Paid via Wallet: " + amount + ". Remaining balance: " + balance);
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Order {
    int orderId;
    Customer customer;
    LinkedList<Product> items = new LinkedList<>();

    Order(int id, Customer c) {
        orderId = id;
        customer = c;
    }

    double getTotal() {
        return items.stream().mapToDouble(p -> p.price).sum();
    }
}

public class EcommerceSystem {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Order> orders = new HashMap<>();
        Stack<Order> undoStack = new Stack<>();

        int custId = -1;
        while (custId == -1) {
            try {
                System.out.print("Enter Customer ID: ");
                custId = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for Customer ID.");
                sc.nextLine();
            }
        }

        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();
        Customer customer = new Customer(custId, custName);

        boolean continueOrdering = true;
        while (continueOrdering) {
            int orderId = -1;
            while (orderId == -1 || orders.containsKey(orderId)) {
                try {
                    System.out.print("Enter Order ID (unique): ");
                    orderId = sc.nextInt();
                    sc.nextLine();
                    if (orders.containsKey(orderId)) {
                        System.out.println("Order ID already exists. Please enter a unique ID.");
                        orderId = -1;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer for Order ID.");
                    sc.nextLine();
                }
            }

            Order order = new Order(orderId, customer);

            int numProducts = -1;
            while (numProducts == -1) {
                try {
                    System.out.print("Enter number of products: ");
                    numProducts = sc.nextInt();
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer for number of products.");
                    sc.nextLine();
                }
            }

            for (int i = 0; i < numProducts; i++) {
                System.out.println("Product " + (i + 1) + ":");

                int id = -1;
                while (id == -1) {
                    try {
                        System.out.print("Enter Product ID: ");
                        id = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer for Product ID.");
                        sc.nextLine();
                    }
                }

                System.out.print("Enter Product Name: ");
                String name = sc.nextLine();

                double price = -1;
                while (price == -1) {
                    try {
                        System.out.print("Enter Product Price: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number for Product Price.");
                        sc.nextLine();
                    }
                }

                Product product = new Product(id, name, price);
                order.items.add(product);
            }

            System.out.println("Choose payment method:");
            System.out.println("1. Card");
            System.out.println("2. UPI");
            System.out.println("3. Wallet");
            int choice = -1;
            while (choice == -1) {
                try {
                    System.out.print("Enter choice (1-3): ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice < 1 || choice > 3) {
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        choice = -1;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.nextLine();
                }
            }

            Payment payment;
            switch (choice) {
                case 1: payment = new CardPayment(); break;
                case 2: payment = new UPIPayment(); break;
                case 3: payment = new WalletPayment(); break;
                default: payment = new CardPayment();
            }

            try {
                payment.pay(order.getTotal());
                orders.put(orderId, order);
                undoStack.push(order);
                System.out.println("Order placed successfully!");
            } catch (PaymentFailedException e) {
                System.out.println("Payment failed: " + e.getMessage());
            }

            System.out.print("Do you want to place another order? (y/n): ");
            String cont = sc.nextLine();
            if (!cont.equalsIgnoreCase("y")) {
                continueOrdering = false;
            }
        }

        System.out.print("Do you want to undo the last order? (y/n): ");
        String undo = sc.nextLine();
        if (undo.equalsIgnoreCase("y")) {
            if (!undoStack.isEmpty()) {
                Order last = undoStack.pop();
                orders.remove(last.orderId);
                System.out.println("Last order undone.");
            } else {
                System.out.println("No orders to undo.");
            }
        }

        sc.close();
    }
}