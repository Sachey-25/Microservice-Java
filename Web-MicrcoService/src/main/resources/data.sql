create table Exchange_values(id bigint primary key,currency_from varchar(20),
currency_to varchar(20),conversion_multiple bigint,port int);
insert into Exchange_values(id,currency_from,currency_to,conversion_multiple,port)
values(1001,'USD','INR',74.2,0);