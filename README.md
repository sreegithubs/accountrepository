# accountrepository

## Project Description

The Banking System project is a java application that allows users to register and manage their accounts. Clients can register accounts and they are able to edit their profile, view their account, transfer money.

## Technologies Used

* My SQL -version 8.0.28.0
* JDBC   -version 8
* Eclipse-verion 2022-23

## Features

List of features ready and TODOs for future development
* Account details can be retrieve from the user and transactions can be done.
* Also created methods like Save, Edit, and Count.
* By using set and get methods the data can be accessed.
* Balance enquiry.

To-do list:
* UPI payments
* Request Debit card/Cheque book

## Getting Started
   
git clone git@https://github.com/sreegithubs/accountrepository.git
Eclipse or webdevelopers
MYSQL 8.0.28.0/MYSQL workbench
Create project database in mysql 
Create table  trans with tyhe property given below
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| fromid      | varchar(20) | YES  |     | NULL    |       |
| toid        | varchar(20) | YES  |     | NULL    |       |
| transamount | double      | YES  |     | NULL    |       |
| date        | date        | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
  Create table accountdetials (Account details) 
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| id        | int         | NO   | PRI | NULL    | auto_increment |
| user_name | varchar(20) | YES  |     | NULL    |                |
| phone_no  | varchar(20) | YES  |     | NULL    |                |
| address   | varchar(50) | YES  |     | NULL    |                |
| balance   | double      | YES  |     | NULL    |                |
| aadhar_no | int         | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+

## Usage

We can able to add the values in both the entities, count the number of transactions, deleting the account and transferring the amount from one account to another account by giving specific details of the users.

