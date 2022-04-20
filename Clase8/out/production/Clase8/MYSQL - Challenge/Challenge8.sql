CREATE OR REPLACE DATABASE db_shop;

USE db_shop;

CREATE OR REPLACE TABLE Customer(
  id_Customer INT NOT NULL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  lastName VARCHAR(45) NOT NULL,
  address VARCHAR(45) NOT NULL,
  dateBirth DATE NOT NULL
);

CREATE OR REPLACE TABLE Seller (
  id_Seller INT NOT NULL PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  lastName VARCHAR(45) NOT NULL,
  address VARCHAR(45) NOT NULL,
  salary FLOAT NOT NULL,
  dateBirth DATE NOT NULL
);

CREATE OR REPLACE TABLE Product (
  id_BarCode INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  priceUnity FLOAT NOT NULL,
  quantity INT NOT NULL,
  stockMin INT NOT NULL
);

CREATE OR REPLACE TABLE Bill (
  id_Bill INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  dateBuy DATE NOT NULL,

  Customer_idCustomer INT NOT NULL,
  CONSTRAINT fk_idCustomer FOREIGN KEY(Customer_idCustomer) REFERENCES Customer(id_Customer),

  Seller_idSeller INT NOT NULL,
  CONSTRAINT fk_idSeller FOREIGN KEY(Seller_idSeller) REFERENCES Seller(id_Seller)

);

CREATE OR REPLACE TABLE Bills_x_Products (
  id_Bill INT NOT NULL,
  id_BarCode INT NOT NULL,
  CONSTRAINT fk_idBill FOREIGN KEY(id_Bill) REFERENCES Bill(id_Bill),
  CONSTRAINT fk_idBarCode FOREIGN KEY(id_BarCode) REFERENCES Product(id_BarCode)
);


