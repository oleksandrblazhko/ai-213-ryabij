CREATE TABLE User (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(255),
    Email VARCHAR(255),
    Location VARCHAR(255)
);

CREATE TABLE AirConditionStateRequest (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Location VARCHAR(255),
    RequestType VARCHAR(255),
    Info VARCHAR(255),
    UserId INT,
    FOREIGN KEY (UserId) REFERENCES User(Id)
);

CREATE TABLE EFreshAir (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Location VARCHAR(255),
    AirConditionState VARCHAR(255)
);

CREATE TABLE AirConditionStateAnswer (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    AnswerTitle VARCHAR(255),
    Info VARCHAR(255),
    Date DATE,
    AirConditionStateRequestId INT,
    EFreshAirId INT,
    FOREIGN KEY (AirConditionStateRequestId) REFERENCES AirConditionStateRequest(Id),
    FOREIGN KEY (EFreshAirId) REFERENCES EFreshAir(Id)
);
