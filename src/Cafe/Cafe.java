package Cafe;

import java.util.Scanner;

public class Cafe {
	
		
			
			
			    private static double runningTotal;
			    private static Scanner sc = new Scanner(System.in);

			    public static void main(String[] args) {
			        boolean ordering = true;

			        while (ordering) {
			            menu();
			            System.out.print("-------------------------------------------\n");
			            System.out.println("Do you want to order more items? (y/n)");
			            String answer = sc.nextLine();
			            if (answer.equalsIgnoreCase("n")) {
			                ordering = false;
			                System.out.print("================================================\n");
			            }
			        }

//			        double discountedTotal = DiscountCalculator(runningTotal);
//			        double discountAmount = runningTotal - discountedTotal;
//		        displayReceipt(discountedTotal, discountAmount);
			    }

//			    private static double DiscountCalculator(double runningTotal2) {
//					// TODO Auto-generated method stub
//			  	double discountedTotal = DiscountCalculator.applyDiscount(runningTotal);
//					return discountedTotal;
//					
//				}

				

				public static void menu() {
			        System.out.println("Welcome Cafe Java Junction.....\n" +
			                "1. Burger (Rs 100)\n2. Fries (Rs 50)\n3. Pizza (Rs 120)\n4. Momos(Rs 60)\n5. Sandwich(Rs 80)");
			        System.out.print("================================================\n");
			        System.out.print("Enter the number of items you want to order: ");
			        System.out.print("\n-------------------------------------------------\n");
			        int numItems = sc.nextInt();
			        sc.nextLine(); // Consume newline character

			        for (int i = 0; i < numItems; i++) {
			            System.out.println("Enter details for item " + (i + 1) + ":");
			            System.out.print("Item name: ");
			            String itemName = sc.nextLine();
			            System.out.print("Quantity: ");
			            int quantity = sc.nextInt();
			            sc.nextLine(); // Consume newline character

			            double itemPrice = getItemPrice(itemName);
			            if (itemPrice == -1) {
			                System.out.println("Invalid item name. Please enter again.");
			                i--;
			                continue;
			            }

			            double subTotal = calculateSubTotal(quantity, itemPrice);
			            runningTotal += subTotal;
			        }
			    }

			    public static double getItemPrice(String itemName) {
			        switch (itemName.toUpperCase()) {
			            case "BURGER":
			                return 100;
			            case "FRIES":
			                return 50;
			            case "PIZZA":
			                return 120;
			            case "MOMOS":
			                return 60;
			            case "SANDWICH":
			                return 80;
			            default:
			                return -1;
			        }
			    }

			    public static double calculateSubTotal(int quantity, double itemPrice) {
			        return quantity * itemPrice;
			    }

		/*	    public static double applyDiscount(double total) {
			        if (total > 50) {
			            return total * 0.9;
			        } else {
			            return total;
			        }
			    }
	*/
			    public static void displayReceipt(double discountedTotal, double discountAmount) {
			        System.out.println("Receipt:");
			        System.out.println("---------");
			        System.out.println("Total amount before discount: Rs " + String.format("%.2f", runningTotal));
			        System.out.println("Discount: Rs " + String.format("%.2f", discountAmount));
			        System.out.println("Total amount after discount: Rs " + String.format("%.2f", discountedTotal));
			        System.out.println("Thank you for dining at Cafe Java Junction!");
			        System.out.println("Enjoy your meal!");
			    }
			}

		




