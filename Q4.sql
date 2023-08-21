-- Person table
CREATE TABLE Person (
    person_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    phone VARCHAR(100),
    height DECIMAL(5, 2),
    email VARCHAR(100),
    cpf VARCHAR(14),
    birthday DATE,
    address_id INT
);

-- Address table
CREATE TABLE Address (
    addressId INT PRIMARY KEY,
    zip VARCHAR(100),
    street VARCHAR(255),
    complement VARCHAR(100),
    neighborhood VARCHAR(100),
    city VARCHAR(100),
    state VARCHAR(50),
    country VARCHAR(50),
   
    FOREIGN KEY (addressId) REFERENCES Person(person_id)
);
SELECT *
FROM Person;

SELECT *
FROM Address;
