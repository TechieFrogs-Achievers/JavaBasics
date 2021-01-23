CREATE TABLE UserType_tble
(
    usertype_ID int NOT NULL PRIMARY KEY  CHECK (usertype_ID <=2),
    usertype_name VARCHAR(255),
);

SELECT* FROM UserType_tble; 

sp_help UserType_tble

INSERT INTO UserType_tble(usertype_ID,usertype_name)
VALUES(1,'User');

INSERT INTO UserType_tble(usertype_ID,usertype_name)
VALUES(2,'Distributer');

---user table 

CREATE Table User_table
(
    userr_id int not null PRIMARY key,
    userr_name  VARCHAR(255),
    passwordd VARCHAR(255),
    userr_email VARCHAR(255),
    usetypee_ID int FOREIGN KEY REFERENCES UserType_tble(usertype_ID) CHECK (usetypee_ID = 1) ,

);

SELECT * FROM User_table;

sp_help User_table

INSERT INTO User_table(userr_id,userr_name,passwordd,userr_email,usetypee_ID)
VALUES(111,'mohana','mk26','mohanak45@gmail.com',1);


INSERT INTO User_table(userr_id,userr_name,passwordd,userr_email,usetypee_ID)
VALUES(112,'ramya','rk26','ramsk45@gmail.com',1);


INSERT INTO User_table(userr_id,userr_name,passwordd,userr_email,usetypee_ID)
VALUES(113,'Sree','sk26','Sree23@gmail.com',1);


---Distributers Table

CREATE TABLE Distributer_table
(
    dis_id int NOT NULL PRIMARY KEY,
    dis_name VARCHAR(255),
    pword VARCHAR(255) not null,
    dis_email VARCHAR(255),
    UserrType_id int FOREIGN KEY REFERENCES userType_tble(usertype_ID) CHECK  (UserrType_id =2),
    dis_address VARCHAR(255),
);

SELECT * FROM Distributer_table;

INSERT Into Distributer_table(dis_id,dis_name,pword,dis_email,UserrType_id,dis_address)
VALUES(201,'Sam','sam49','sam77@gmail.com',2,'hyd');


INSERT Into Distributer_table(dis_id,dis_name,pword,dis_email,UserrType_id,dis_address)
VALUES(202,'jam','jam49','jam77@gmail.com',2,'vzg');

CREATE TABLE ProductCategory_table
(
    productCategory_id int not NULL PRIMARY KEY,
    productCategory_name VARCHAR(255),
);

SELECT * FROM ProductCategory_table;

INSERT INTO ProductCategory_table
VALUES(301,'Women');

INSERT INTO ProductCategory_table
VALUES(302,'Men');

INSERT INTO ProductCategory_table
VALUES(303,'Kids');


CREATE TABLE Products_tble
(
    product_id int not NULL PRIMARY KEY,
    product_name VARCHAR(255),
    product_number VARCHAR(255),
    product_Description VARCHAR(2000),
    product_cost money,
    product_qnty int ,
    productCategory_id int FOREIGN KEY REFERENCES ProductCategory_table(productCategory_id),

);

SELECT * FROM Products_tble;

INSERT INTO Products_tble
VALUES(401,'palazo dress','2GTF45J','cotton cloth top and palazo',999,1,301);




CREATE TABLE OrderStatus_tble
(
    orederstatus_id int not NULL PRIMARY KEY,
    orederstatus VARCHAR(255),
);


SELECT* FROM OrderStatus_tble;

INSERT INTO OrderStatus_tble
VALUES(501,'packed');


CREATE TABLE Orders_tble
(
    order_id int not null PRIMARY KEY,
    order_number int,
    order_qnty int,
    product_id int FOREIGN KEY REFERENCES Products_tble(product_id),
    dis_id int FOREIGN Key REFERENCES Distributer_table(dis_id),
    orderstatus_id int FOREIGN KEY REFERENCES OrderStatus_tble(orederstatus_id),

);

SELECT * FROM Orders_tble;

INSERT INTO Orders_tble
VALUES(100,89765,1,401,201,501);

CREATE TABLE DefectOrderStatus_tble
(
    defectorderstatus_id int not NULL PRIMARY KEY,
    defectorderstatus VARCHAR(255),
);

SELECT * FROM DefectOrderStatus_tble;

INSERT INTO DefectOrderStatus_tble
VALUES(801,'inprocess'); 

CREATE TABLE DefectOrders_table
(
    defectorder_id int not null PRIMARY key,
    product_id int FOREIGN KEY REFERENCES Products_tble(product_id),
    dis_id int FOREIGN KEY REFERENCES Distributer_table(dis_id),
    defectorderstatus_id int FOREIGN KEY REFERENCES DefectOrderStatus_tble(defectorderstatus_id),
);


