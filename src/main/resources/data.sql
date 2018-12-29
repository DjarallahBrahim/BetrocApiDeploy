-- init database (roles and test user ) this file will be executed automatically when we run the server
INSERT IGNORE INTO `betroc_sql`.`roles` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT IGNORE INTO `betroc_sql`.`roles` (`id`, `name`) VALUES ('2', 'ROLE_USER');
INSERT IGNORE INTO `betroc_sql`.`user` (`id`, `email`, `enabled`, `name`, `password`, `username`) VALUES ('1', 'betroc@gmail.com', true, 'betroc', '$2a$10$1f4sH0S8W2XXa6wuVlOQY.a49KYkhpYwL9epbA8R5bYkz98xOvA6i', 'betroc');
