package com.tns.ab;

public class Main {
	public static void main (String[] args) 
	{
		stat obj= new stat();
		obj.setdata(4,9);
		obj.showdata();
	}
}

class stat 
{
	int a;
	int b;
	public void setdata(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void showdata()
	{
		System.out.println("value of A ="+a);
		System.out.println("value of b ="+b);
	}
}

## Create Database CMSDB70622
/CREATE DATABASE CMSDB_71;/
USE CMSDB_71;

SELECT username FROM Customer
where customer_id = 603;

CREATE TABLE Customer(
Customer_Id VARCHAR(25) UNIQUE NOT NULL PRIMARY KEY,
Customer_Name VARCHAR(50) NOT NULL,
Username INTEGER UNIQUE NOT NULL,
login_password VARCHAR(25) NOT NULL,
Customer_Phone INTEGER UNIQUE NOT NULL,
Customer_Email VARCHAR(25) UNIQUE NOT NULL,
Customer_Coupon VARCHAR(25),
Customer_WalletBal DECIMAL(9,2)
);

## Inserting Duplicate Values
INSERT INTO Customer VALUES
('601','Lasya',717638,'Lasya@123',901078056, 'lasyavankayala@gmail.com','FLAT50',1550.35),
('602','Akash',748948,'Akash255',630109044,'akash143@gmail.com','IPL offer',2060.25),
('603','Reesheka',234546,'Reeshu@84',634062647,'reesheka2@gmail.com','ChashBack20%',190.50);

## Display customer table data
SELECT * FROM Customer;

## VendorProfile
CREATE TABLE Vendor(
Vendor_Id INTEGER UNIQUE NOT NULL AUTO_INCREMENT PRIMARY KEY,
Vendor_Name VARCHAR(50) NOT NULL,
Vendor_phone INTEGER UNIQUE NOT NULL,
Vendor_Specs VARCHAR(50) NOT NULL
);

## Inserting Duplicate Values
INSERT INTO Vendor VALUES
(3791, 'VaraLakshmi', 82478963, 'Staters'),
(3792, 'Bobby', 743234243, 'Dessert'),
(3793, 'Tharuni', 938933005, 'Italian Cuisine');

## Display Vendor table data
SELECT * FROM Vendor;

## Menu table
CREATE TABLE Menu(
Food_Id INTEGER UNIQUE NOT NULL AUTO_INCREMENT PRIMARY KEY,
Food_Name VARCHAR(25) NOT NULL,
Vendor_Id INTEGER NOT NULL,
Food_Price DECIMAL(9,2),
CONSTRAINT vendor_id_fk FOREIGN KEY(Vendor_Id) REFERENCES Vendor(Vendor_Id)
);

## Inserting Duplicate Values
INSERT INTO Menu VALUES
(1, 'Butter Naan', 3791, 100.00),
(2, 'Chilli Mushroom', 3793,180.00),
(3, 'Chole Bhature',3793, 130.00),
(4, 'Panner Dosa', 3791,120.00),
(5, 'Hyderabadi Dum Biryani', 3792,200.00),
(6, 'Sambar Idly', 3792,50.00),
(7, 'Malai Puri', 3793,110.00),
(8, 'Pizza Tandoori panner', 3793,230.00),
(9, 'Lasagne', 3791,140.00),
(10, 'Apricot Delight', 3793,150.00);

## Display Food menu table data
SELECT * FROM Menu;

## Orderfood table
CREATE TABLE orderDetails(
Order_No INTEGER UNIQUE NOT NULL AUTO_INCREMENT PRIMARY KEY,
Vendor_Id INTEGER NOT NULL,
Customer_Id VARCHAR(25) NOT NULL,
Food_Id INTEGER NOT NULL,
Quantity INTEGER NOT NULL,
Date_Time DATETIME,
ETA DATETIME DEFAULT "2022-04-08 00:15:00",
Order_Value DECIMAL(9,2),
Order_Status ENUM('ACCEPTED', 'REJECTED', 'ORDERED'),
CONSTRAINT customer_id_fk FOREIGN KEY(Customer_Id) REFERENCES Customer(Customer_Id),
CONSTRAINT vendor_id_fk2 FOREIGN KEY(Vendor_Id) REFERENCES Vendor(Vendor_Id),
CONSTRAINT food_id_fk FOREIGN KEY(Food_Id) REFERENCES Menu(Food_Id)
);

## Inserting Duplicate Values
INSERT INTO orderDetails VALUES
(1, '3791', '601', 6, 2, "2022-04-05", "2022-04-05 00:13:00", 100.00, "ORDERED"),
(2, '3792', '601', 2, 1, "2022-04-06", "2022-04-06 00:14:00", 150.00, "ORDERED"),
(3, '3792', '603', 10, 1, "2022-04-06", "2022-04-06 00:18:00", 200.00, "ORDERED"),
(4, '3793', '602', 7, 1, "2022-04-07", "2022-04-07 00:12:00", 110.00, "ORDERED"),
(5, '3791', '602', 3, 1, "2022-04-07", "2022-04-07 00:15:00", 130.00, "ORDERED");

## Display Orderdetails table data
SELECT * FROM orderDetails;

create table login(
username varchar(100) primary key,
passcode varchar(150) not null
);
insert into login (username,passcode) values('sne123@gmail.com','sne123'),('anu123@gmail.com','anu123'),('bir123@gmail.com','bir123'),('div123@gmail.com','div123');
insert into login (username,passcode) values ('sur123@abc.com','sur123'),('ram123@abc.com','ram123'),('sam123@abc.com','sam123'),('kar123@abc.com','kar123');


desc login;
select * from login;


alter table menu add constraint fk_vendor_id foreign key (vendor_Id) references vendor(vendor_Id);
alter table orderDetails add constraint fk_customer_Id foreign key (customer_Id) references customer(customer_Id);
alter table orderDetails add constraint fk_food_id foreign key (food_Id) references menu(food_Id);
alter table orderDetails add constraint fk_vendId foreign key (vendor_Id) references vendor(vendor_Id)