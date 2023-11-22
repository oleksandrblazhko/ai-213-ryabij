CREATE TABLE User (
    id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(255),
    email VARCHAR(255),
    location VARCHAR(255)
)
 we 5y w
     
CREATE TABLE  (
    id INT PRIMARY KEY AUTO_INCREMENT,
    location VARCHAR(255),
    request_type VARCHAR(255),
    info VARCHAR(255),
    userno INT,
    FOREIGN KEY (userno) REFERENCES User(id)
);

CREATE TABLE EFreshAir (
    id INT PRIMARY KEY AUTO_INCREMENT,
    location VARCHAR(255),
    air_condition_state VARCHAR(255)
);

CREATE TABLE AirConditionStateAnswer (
    id INT PRIMARY KEY AUTO_INCREMENT,
    answer_title VARCHAR(255),
    info VARCHAR(255),
    date DATE,
    air_condition_state_requestno INT,
    efresh_airno INT,
    FOREIGN KEY (air_condition_state_requestno) REFERENCES AirConditionStateRequest(id),
    FOREIGN KEY (efresh_airno) REFERENCES EFreshAir(id)
);
