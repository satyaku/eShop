CREATE TABLE product(
id INTEGER PRIMARY KEY NOT NULL,
sku VARCHAR(255)  NOT NULL,
name VARCHAR(255)  NOT NULL,
description NCHAR,
item_size VARCHAR(64),
color VARCHAR(64),
price NUMERIC,
brand_id INTEGER,
seller_id INTEGER,
total_count INTEGER
);

create table categories (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
   inserted_at timestamp with time zone not null,
   updated_at  timestamp with time zone not null,
);
create table brands (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
   inserted_at timestamp with time zone not null,
   updated_at  timestamp with time zone not null,
);
create table sellers (
   id          INTEGER PRIMARY KEY      not null,
   name        varchar(255)             not null,
   inserted_at timestamp with time zone not null,
   updated_at  timestamp with time zone not null,
);

create table product_categories (
   category_id integer                  not null,
   product_id  integer                  not null,
   inserted_at timestamp with time zone not null,
   updated_at  timestamp with time zone not null,
)   ;

create table product_brands (
   brand_id integer                  not null,
   product_id  integer                  not null,
   inserted_at timestamp with time zone not null,
   updated_at  timestamp with time zone not null,
)   ;
