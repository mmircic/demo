CREATE TABLE sportEvents (
                              id SERIAL PRIMARY KEY,
                              startTime TIMESTAMP NOT NULL,
                              endTime TIMESTAMP NOT NULL,
                              sportFieldId BIGINT NOT NULL,
                              FOREIGN KEY (sportFieldId) REFERENCES sportField(id)
);
