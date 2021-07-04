DROP TABLE IF EXISTS Medicine;  
CREATE TABLE Medicine (  
Serial_no INT AUTO_INCREMENT  PRIMARY KEY,  
Name VARCHAR(50) NOT NULL,
Date_of_expire VARCHAR(50) NOT NULL,
Price int NOT NULL,  
Quantity int NOT NULL  
);  
INSERT INTO medicine (Serial_no,Name,Date_of_expire,Price,Quantity)  VALUES (11, 'paracitamol','2008-11-11',200,50);    
INSERT INTO medicine (Serial_no,Name,Date_of_expire,Price,Quantity) VALUES (12, 'acilok','2008-11-11',200,50);    
INSERT INTO medicine (Serial_no,Name,Date_of_expire,Price,Quantity) VALUES (13, 'saridon','2008-11-11',200,50); 