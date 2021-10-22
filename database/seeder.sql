USE adlister_db;

INSERT INTO users (username, email, password) VALUES
('afonse', 'afonse@email.com', 'codeup');

INSERT INTO ads (user_id, title, description) VALUES
(1, 'Test Ad 1', 'This is the description of Test Ad 1.'),
(1, 'Test Ad 2', 'This is the description of Test Ad 2.'),
(1, 'Test Ad 3', 'This is the description of Test Ad 3.'),
(1, 'Test Ad 4', 'This is the description of Test Ad 4.'),
(1, 'Test Ad 5', 'This is the description of Test Ad 5.');