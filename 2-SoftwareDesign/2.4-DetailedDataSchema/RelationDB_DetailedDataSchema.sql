CREATE TABLE Users (
  userno INT NOT NULL,
  full_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  location VARCHAR(255) NOT NULL
);

CREATE TABLE AirConditionStateRequests (
  air_condition_state_requestno INT NOT NULL,
  location VARCHAR(255) NOT NULL,
  request_type VARCHAR(255) NOT NULL,
  info VARCHAR(255) NOT NULL
);

CREATE TABLE AirConditionStateAnswers (
  air_condition_state_answerno INT NOT NULL,
  answerTitle VARCHAR(255) NOT NULL,
  info VARCHAR(255) NOT NULL,
  date DATE NOT NULL
);

CREATE TABLE EFreshAir (
  e_fresh_airno INT NOT NULL,
  location VARCHAR(255) NOT NULL,
  air_condition_state VARCHAR(255) NOT NULL
);

CREATE TABLE PhysicalHealthSpecialist (
  physical_health_specialistno INT NOT NULL,
  full_name VARCHAR(255) NOT NULL,
  gender VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
);

CREATE TABLE HealthConsultationRequests (
  health_consultation_requestno INT NOT NULL,
  request_date DATE NOT NULL,
  description VARCHAR(255) NOT NULL,
  user_info VARCHAR(255) NOT NULL
);

/* Первинні ключі */
ALTER TABLE Users ADD CONSTRAINT user_pk
    PRIMARY KEY (userno);
	
ALTER TABLE AirConditionStateRequests ADD CONSTRAINT AirConditionStateRequests_pk
    PRIMARY KEY (air_condition_state_requestno);

ALTER TABLE AirConditionStateAnswers ADD CONSTRAINT AirConditionStateAnswers_pk
    PRIMARY KEY (air_condition_state_answerno);

ALTER TABLE EFreshAir ADD CONSTRAINT EFreshAir_pk
    PRIMARY KEY (e_fresh_airno);

ALTER TABLE PhysicalHealthSpecialist ADD CONSTRAINT PhysicalHealthSpecialist_pk
    PRIMARY KEY (physical_health_specialistno);

ALTER TABLE HealthConsultationRequests ADD CONSTRAINT HealthConsultationRequests_pk
    PRIMARY KEY (health_consultation_requestno);

/* Зовнішні ключі */
ALTER TABLE AirConditionStateRequests ADD CONSTRAINT userno_fk
    FOREIGN KEY (userno) REFERENCES Users(userno);

ALTER TABLE AirConditionStateAnswers ADD CONSTRAINT state_request_fk
    FOREIGN KEY (air_condition_state_requestno) REFERENCES AirConditionStateRequests(air_condition_state_requestno);

ALTER TABLE AirConditionStateAnswers ADD CONSTRAINT frash_air_fk
    FOREIGN KEY (e_fresh_airno) REFERENCES EFreshAir(e_fresh_airno);

ALTER TABLE PhysicalHealthSpecialist ADD CONSTRAINT consultation_request_fk
    FOREIGN KEY (health_consultation_requestno) REFERENCES HealthConsultationRequests(health_consultation_requestno);

ALTER TABLE HealthConsultationRequests ADD CONSTRAINT userno_fk
    FOREIGN KEY (userno) REFERENCES Users(userno);

/* Jбмеження змісту атрибутів таблиць */

ALTER TABLE AirConditionStateRequests
ADD CONSTRAINT max_info_length
CHECK (LENGTH(info) <= 255);

ALTER TABLE Users
ADD CONSTRAINT valid_email_format
CHECK (email ~* '^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$');

ALTER TABLE PhysicalHealthSpecialist
ADD CONSTRAINT valid_phone_format
CHECK (phone_number ~* '^[0-9]{10}$');

ALTER TABLE HealthConsultationRequests
ADD CONSTRAINT request_date_in_past
CHECK (request_date <= CURRENT_DATE);

ALTER TABLE AirConditionStateRequests
ADD CONSTRAINT valid_location_format
CHECK (location ~* '^[A-Za-z ]+$');
