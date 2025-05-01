package com.concurrent.problems;
import java.util.concurrent.*;


public class CompletableFutureDemo {

	
	    // Simulate fetching user details from DB (takes 2 seconds)
	    public static CompletableFuture<String> fetchUserDetails(int userId) {
	        return CompletableFuture.supplyAsync(() -> {
	            sleep(2000);
	            return "User ID: " + userId + " (John Doe)";
	        });
	    }

	    // Simulate processing a payment (takes 3 seconds)
	    public static CompletableFuture<String> processPayment(int amount) {
	        return CompletableFuture.supplyAsync(() -> {
	            sleep(3000);
	            if (amount > 5000) throw new RuntimeException("Payment limit exceeded!"); // Simulated error
	            return "Payment of $" + amount + " successful!";
	        }).exceptionally(ex -> "Payment failed: " + ex.getMessage());
	    }

	    // Simulate sending a confirmation email (takes 1 second)
	    public static CompletableFuture<String> sendEmailConfirmation(String userEmail) {
	        return CompletableFuture.supplyAsync(() -> {
	            sleep(1000);
	            return "Email sent to " + userEmail;
	        });
	    }

	    public static void main(String[] args) {
	        int userId = 101;
	        int paymentAmount = 6000; // Change this to >5000 to trigger an error

	        // Fetch user and process payment in parallel
	        CompletableFuture<String> future = fetchUserDetails(userId)
	                .thenCombine(processPayment(paymentAmount), (user, payment) -> user + "\n" + payment)
	                .thenCompose(result -> sendEmailConfirmation("john.doe@example.com")
	                        .thenApply(email -> result + "\n" + email)) // Chain email after payment success
	                .exceptionally(ex -> "Error processing payment: " + ex.getMessage());

	        // Main thread continues while async tasks run
	        System.out.println("Processing payment asynchronously...");
	        
	        // Get final result (blocking, but only at the end)
	        System.out.println(future.join());
	    }

	    // Helper method to simulate delay
	    private static void sleep(int millis) {
	        try { Thread.sleep(millis); } catch (InterruptedException ignored) {}
	    }
	}

 
