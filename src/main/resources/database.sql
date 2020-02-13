create database socnet;
use socnet;

CREATE TABLE role (
  role_id   BINARY(16) NOT NULL,
  role_role VARCHAR(128),
  PRIMARY KEY (role_id)
);
CREATE TABLE user (
  user_id        BINARY(16) NOT NULL,
  user_login     VARCHAR(128),
  user_password  VARCHAR(128),
  user_role_id   BINARY(16),
  user_nick_name VARCHAR(128),
  user_avatar    BLOB,
  PRIMARY KEY (user_id),
  FOREIGN KEY (user_role_id)
  REFERENCES role (role_id)
);

INSERT INTO role
VALUES (unhex(replace(uuid(), '-', '')), "Administrator");
INSERT INTO role
VALUES (unhex(replace(uuid(), '-', '')), "User");
INSERT INTO role
VALUES (unhex(replace(uuid(), '-', '')), "Guest");

SELECT role_id
FROM role
WHERE role_role = "Administrator";

INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login1",
        "pass1",
        (SELECT role_id FROM role WHERE role_role = "Administrator"),
        "Name1");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login2",
        "pass2",
        (SELECT role_id FROM role WHERE role_role = "Guest"),
        "Name2");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login3",
        "pass3",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name3");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login4",
        "pass4",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name4");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login5",
        "pass5",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name5");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login6",
        "pass6",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name6");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login7",
        "pass7",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name7");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login8",
        "pass8",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name8");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login9",
        "pass9",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name9");
INSERT INTO user (user_id, user_login, user_password, user_role_id, user_nick_name)
VALUES (unhex(replace(uuid(), '-', '')),
        "login10",
        "pass10",
        (SELECT role_id FROM role WHERE role_role = "User"),
        "Name10");

SELECT BIN_TO_UUID(user_id), user_login, user_password, role_role, user_nick_name
FROM user
       JOIN role
WHERE user_role_id = role_id;
select *
from user;
