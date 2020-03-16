

CREATE TABLE product(
id INTEGER PRIMARY KEY NOT NULL,
sku VARCHAR(255)  NOT NULL,
name VARCHAR(255)  NOT NULL,
description NCHAR,
item_size VARCHAR(64),
color VARCHAR(64),
price NUMERIC,
total_count INTEGER,
status VARCHAR(64)
);

create table categories (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null
);
create table brand (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
);
create table sellers (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,

);

create table product_categories (
   product_id  integer                  not null,
   category_id integer                  not null
);

create table product_brand(
   product_id  integer                  not null,
   brand_id integer               not null
);

create table product_sellers(
   product_id  integer                  not null,
   seller_id integer                  not null
);

