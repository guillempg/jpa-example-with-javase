# jpa-example-with-javase
A simple Java SE application that uses JPA to store an object to a MySQL database table.

You need to have MySQL installed and running. Log into a MySQL client and create a database named "jpa":

create database jpa;

then grant all privileges to your user:

grant all privileges to USER@'localhost' identified by 'PASSWORD';

Remember to edit the file named persistence.xml inside src/main/resources/META-INF folder
with the USER and PASSWORD configured in MySQL above.
