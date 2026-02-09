CREATE DATABASE performance_db;
USE performance_db;

CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(50),
    salary INT
);

INSERT INTO employee (name, department, salary)
VALUES
('Amit', 'IT', 50000),
('Ravi', 'HR', 40000),
('Neha', 'IT', 60000),
('Priya', 'Finance', 55000);

-- Create index
CREATE INDEX dept_index ON employee(department);
