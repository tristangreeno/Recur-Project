-- Messages schema

-- !Ups

CREATE TABLE subscriptions (
  id SERIAL PRIMARY KEY,
  message varchar(255) NOT NULL
);

INSERT INTO subscriptions (message) Values('Hi!');
INSERT INTO subscriptions (message) Values('What''s up?');
INSERT INTO subscriptions (message) Values('Am I alive now?');

-- !Downs

DROP TABLE subscriptions;