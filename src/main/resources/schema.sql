DROP TABLE IF EXISTS CURRENCY;
  
CREATE TABLE CURRENCY (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  CURRENCY_FROM VARCHAR(250) NOT NULL,
  CURRENCY_TO VARCHAR(250) NOT NULL,
  CURRENCY_MULTIPLE INT DEFAULT NULL
);