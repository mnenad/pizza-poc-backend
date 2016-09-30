CREATE TABLE users (
	user_id VARCHAR(256) PRIMARY KEY,
	user_email VARCHAR(256)
);
CREATE TABLE orders (
	order_id SERIAL PRIMARY KEY,
	user_id VARCHAR(256),
	order_json VARCHAR(4096)
);
INSERT INTO users (user_id, user_email) VALUES ('nenadm','nenadm@pivotal.io');
INSERT INTO users (user_id, user_email) VALUES ('shiehn','shiehn@pivotal.io');
INSERT INTO users (user_id, user_email) VALUES ('kabdul','kabdul@pivotal.io');
INSERT INTO users (user_id, user_email) VALUES ('test','test');
INSERT INTO orders(user_id, order_json) VALUES ('test', '{"userId":"10157582987105515","orderDate":"","premadeName":"Dutch Delight","size":"medium","crustStyle":"GlutenFree","baseSauce":"tomato","cheese":"Cheddar","meats":["pepperoni","sausage"],"otherToppings":["Basil","BlackOlives","FriedEgg"]}');
INSERT INTO orders(user_id, order_json) VALUES ('test', '{"userId":"10157582987105515","orderDate":"","premadeName":"Somalian Slice","size":"medium","crustStyle":"WholeWheat","baseSauce":"alfredo","cheese":"Cheddar","meats":["pepperoni"],"otherToppings":["CaramelizedOnions","Mushrooms","Pineapple"]}');


