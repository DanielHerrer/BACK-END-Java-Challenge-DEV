package com.company.challenge;
import com.company.challenge.model.*;
import com.company.challenge.controllers.*;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Cliente
        CustomerDB customerDB = new CustomerDB();
        Customer customer = new Customer();
        //Vendedor
        SellerDB sellerDB = new SellerDB();
        Seller seller = new Seller();
        //Producto
        ProductDB productDB = new ProductDB();
        Product product = new Product();
        //Recibo
        BillDB billDB = new BillDB();
        Bill bill = new Bill();

        //Lista de todos los Productos
        ArrayList<Product> listProduct;
        listProduct = productDB.getAllProducts();
        //Lista de Productos a comprar
        ArrayList<Product> listToBuy = new ArrayList<>();

        System.out.println("Welcome, please choose your option: ");
        System.out.println("1. Make a Sell");
        System.out.println("2. Customer");
        System.out.println("3. Seller");
        System.out.println("4. Product");
        System.out.println("5. Bill");
        System.out.print("Your option:  ");
        int option = scan.nextInt();

        switch(option){
            //REALIZAR UNA VENTA
            case 1:
                System.out.println("---------------------------------");
                //System.out.print("\nBuy Date: ");     HAY OTRA FORMA
                //String buyDate = scan.nextLine();
                System.out.print("\nCustomer ID: ");
                int idCustomer = scan.nextInt();
                Customer customer1 = customerDB.getCustomerByID(idCustomer);

                System.out.print("\nSeller ID: ");
                int idSeller = scan.nextInt();
                Seller seller1 = sellerDB.getSellerByID(idSeller);

                //System.out.print(customer1);       //customer1 accede al ToString

                //MUESTRA LA LISTA DE PRODUCTOS
                for (Product value: listProduct) {
                    System.out.println(value); //El value dentro del sout accede al ToString de Product
                }

                //LOOPEA HASTA LLENAR DE PRODUCTOS
                int flag = 1;
                while(flag==1){
                    System.out.print("\nProduct BarCode: ");
                    int idBarcode = scan.nextInt();

                    for (Product value : listProduct) {
                        if(value.getBarcode()==idBarcode){
                            listToBuy.add(value);
                        }
                    }

                    System.out.println("Have another product to buy? (0-no/1-yes): ");
                    flag = scan.nextInt();
                }

                bill.setCustomer(customer1);
                bill.setSeller(seller1);
                bill.setListToBuy(listToBuy);
                billDB.insertBill(bill);

                break;
            //ACCEDE A LA TABLA CLIENTE
            case 2:
                System.out.println("---------------------------------");
                System.out.println("1. Add a Customer");
                System.out.println("2. Update a Customer");
                System.out.println("3. Delete a Customer");
                System.out.print("Your option:  ");
                int option2 = scan.nextInt();
                switch (option2){
                    case 1:
                        System.out.println("---------------------------------");
                        System.out.print("Customer ID: ");
                        int id = scan.nextInt();
                        System.out.print("\nCustomer Name: ");
                        String name = scan.nextLine();
                        System.out.print("\nCustomer Last Name: ");
                        String lastName = scan.nextLine();
                        System.out.print("\nCustomer Address: ");
                        String address = scan.nextLine();
                        System.out.print("\nCustomer Date of Birth: ");
                        String dateBirth = scan.nextLine();

                        customer.setId(id);
                        customer.setName(name);
                        customer.setLastName(lastName);
                        customer.setAddress(address);
                        customer.setDateBirth(dateBirth);
                        customerDB.insertCustomer(customer);
                        System.out.println("Customer Added!");
                        break;
                    case 2:
                        //Updatear un cliente
                        break;
                    case 3:
                        //Eliminar un registro de un cliente
                        break;
                }
                break;
            //ACCEDE A LA TABLA VENDEDOR
            case 3:
                System.out.println("---------------------------------");
                System.out.println("1. Add a Seller");
                System.out.println("2. Update a Seller");
                System.out.println("3. Delete a Seller");
                System.out.print("Your option:  ");
                int option3 = scan.nextInt();
                switch (option3) {
                    case 1:
                        //Insertar un vendedor
                        System.out.println("---------------------------------");
                        System.out.print("Seller ID: ");
                        int id = scan.nextInt();
                        System.out.print("\nSeller Name: ");
                        String name = scan.nextLine();
                        System.out.print("\nSeller Last Name: ");
                        String lastName = scan.nextLine();
                        System.out.print("\nSeller Address: ");
                        String address = scan.nextLine();
                        System.out.print("\nSeller Date of Birth: ");
                        String dateBirth = scan.nextLine();
                        System.out.print("\nSeller Salary: ");
                        float salary = scan.nextFloat();

                        seller.setId(id);
                        seller.setName(name);
                        seller.setLastName(lastName);
                        seller.setAddress(address);
                        seller.setDateBirth(dateBirth);
                        seller.setSalary(salary);
                        sellerDB.insertSeller(seller);
                        System.out.println("Seller Added!");
                        break;
                    case 2:
                        //Updatear un vendedor
                        break;
                    case 3:
                        //Eliminar el registro de un vendedor
                        break;
                }
                break;
            //ACCEDE A LA TABLA PRODUCTO
            case 4:
                System.out.println("---------------------------------");
                System.out.println("1. Add a Product");
                System.out.println("2. Update a Product");
                System.out.println("3. Delete a Product");
                System.out.print("Your option:  ");
                int option4 = scan.nextInt();
                switch (option4){
                    case 1:
                        //Insertar un producto
                        System.out.println("---------------------------------");
                        System.out.print("Product Barcode: ");
                        int barCode = scan.nextInt();
                        System.out.print("\nProduct Name: ");
                        String name = scan.nextLine();
                        System.out.print("\nProduct Unity Price: ");
                        float unityPrice = scan.nextFloat();
                        System.out.print("\nProduct Quantity: ");
                        int quantity = scan.nextInt();
                        System.out.print("\nProduct Stock Min.: ");
                        int stockMin = scan.nextInt();

                        product.setBarcode(barCode);
                        product.setName(name);
                        product.setPriceUnit(unityPrice);
                        product.setQuantity(quantity);
                        product.setStockMin(stockMin);
                        productDB.insertProduct(product);
                        System.out.println("Product Added!");
                        break;
                    case 2:
                        //Updatear un producto
                        break;
                    case 3:
                        //Eliminar el registro de un producto
                        break;
                }
                break;
            //ACCEDE A FACTURAS
            case 5:
                // Factura
                break;
            default:
                break;
        }

    }
}