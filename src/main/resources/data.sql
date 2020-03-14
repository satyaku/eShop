CREATE TABLE products(
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

INSERT INTO product (id, sku, name, description,item_size,color,price,brand_id,seller_id,total_count) VALUES
(1, 'shitrsmall001', 'tshirt', 'test desc', 'm' , 'black' , 123 , 1,2,10),
(2, 'shitrsmall002', 'tshirt', 'test desc1', 's' , 'black' , 13 , 1,2,110),
(3, 'shitrsmall003', 'tshirt', 'test desc2', 'm' , 'black' , 123 , 1,2,10);