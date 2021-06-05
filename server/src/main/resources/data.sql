DROP TABLE IF EXISTS Accounts;
DROP TABLE IF EXISTS Clients;

CREATE TABLE Clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  pin VARCHAR(80) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  middle_name VARCHAR(50) NOT NULL
);

CREATE TABLE Accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  balance int DEFAULT 0,
  client_id  INT NOT NULL,
    foreign key (client_id) references Clients(id)
);

INSERT INTO Clients (pin, first_name, middle_name, last_name) VALUES
  ('a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', 'ИВАН', 'ИВАНОВИЧ', 'ИВАНОВ'),
  ('b3a8e0e1f9ab1bfe3a36f231f676f78bb30a519d2b21e6c530c0eee8ebb4a5d0', 'ПЕТР', 'ПЕТРОВИЧ', 'ПЕТРОВ'),
  ('35a9e381b1a27567549b5f8a6f783c167ebf809f1c4d6a9e367240484d8ce281', 'СЕРГЕЙ', 'СЕРГЕЕВИЧ', 'СЕРГЕЕВ');

INSERT INTO Accounts (balance,client_id) VALUES
  (123,1),
  (654,2),
  (967,3);