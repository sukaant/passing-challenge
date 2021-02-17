DROP TABLE IF EXISTS passing_challenge;

CREATE TABLE passing_challenge (
	id VARCHAR(64) PRIMARY KEY,
	challenge_id VARCHAR(64) NOT NULL,
	question VARCHAR(64) NOT NULL,
	answer VARCHAR(64) NOT NULL,
	is_correct BOOLEAN);