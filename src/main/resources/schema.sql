create schema if not exists a1;

create table if not exists a1.customers (
id serial primary key,
name varchar (255) not null,
surname varchar (255) not null,
age int,
phone_number varchar (255) );

insert into a1.customers (name, surname, age, phone_number)
values ('alex', 'Petrov', 27, '+79990010101' ),
       ('Olga', 'Semenova', 33, '+79990010101');

CREATE TABLE  if not exists a1.orders(
id serial primary key,
date date not null,
customer_id int not null,
product_name varchar (255) not null,
amount int not null ,
foreign key (customer_id) references  a1.customers(id)
);

insert into A1.ORDERS (date, customer_id, product_name, amount)
values (current_date, 1, 'car', 100 ),
       (current_date, 2, 'dog', 50 );