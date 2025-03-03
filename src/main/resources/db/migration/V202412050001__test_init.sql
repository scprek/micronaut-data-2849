CREATE TABLE test_table
(
    id                  UUID NOT NULL PRIMARY KEY,
    scheduled_time      TIMESTAMP NOT NULL,
    destination         VARCHAR(256) NOT NULL,
    payload             VARCHAR(1024) NOT NULL,
    attempts            INTEGER NOT NULL DEFAULT 0,
    created             TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
