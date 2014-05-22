driver 'org.apache.derby.jdbc.ClientDriver';

CONNECT 'jdbc:derby:testdb4;create=true';



AUTOCOMMIT OFF;

DROP TABLE BOOK;

CREATE TABLE BOOK(ID_BOOK VARCHAR(20) NOT NULL,TITLE VARCHAR(200) NOT NULL);


ALTER TABLE BOOK
   ADD CONSTRAINT BOOK_PK Primary Key (
      ID_BOOK);

COMMIT;

CONNECT 'jdbc:derby:testdb4;shutdown=true';
