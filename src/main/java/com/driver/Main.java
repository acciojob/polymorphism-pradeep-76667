package com.driver;

public class Main {
    // Task 1: create a class Product inside Main class
    public static class Product{

        // Task 3: create a method public int product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: create an overloaded method public int product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: create an overloaded method public double product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args) {

        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // operations
        int productXY = p.product(10, 20);
        System.out.println(productXY);

        int productXYZ = p.product(10, 20, 30);
        System.out.println(productXYZ);

        double product_XY = p.product(10.5, 20.5);
        System.out.println(product_XY);
    }
}