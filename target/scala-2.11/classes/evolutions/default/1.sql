-- Messages schema

-- !Ups

CREATE TABLE subscriptions (
  id      SERIAL PRIMARY KEY,
  message VARCHAR(255) NOT NULL
);

INSERT INTO subscriptions (message) VALUES ('Hi!');
INSERT INTO subscriptions (message) VALUES ('What''s up?');
INSERT INTO subscriptions (message) VALUES ('Am I alive now?');

-- !Downs

DROP TABLE subscriptions;