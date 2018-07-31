DROP DATABASE IF EXISTS uc;

CREATE DATABASE uc
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE uc;

-- ----------------------------
--  Table structure for tb_user
-- ----------------------------
DROP TABLE
IF EXISTS tb_user;

CREATE TABLE tb_user
(
  id           BIGINT(20) PRIMARY KEY AUTO_INCREMENT NOT NULL
  COMMENT '主键, 自增',
  username     VARCHAR(32)                           NOT NULL
  COMMENT '用户名',
  name         VARCHAR(32)                           NOT NULL
  COMMENT '姓名',
  password     VARCHAR(64)                           NOT NULL
  COMMENT '密码',
  salt         VARCHAR(64)                           NOT NULL
  COMMENT '密码盐',
  avatar       VARCHAR(256)                          NOT NULL                    DEFAULT ''
  COMMENT '头像',
  status       TINYINT                               NOT NULL                    DEFAULT 0
  COMMENT '状态:{0:可用, 1:禁用}',
  created_time TIMESTAMP                             NOT NULL                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  updated_time TIMESTAMP                             NOT NULL                    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  COMMENT '更新时间'
)
  COMMENT '用户表';
CREATE UNIQUE INDEX username_UNIQUE
  ON tb_user (username);

-- ----------------------------
--  data for tb_user
-- ----------------------------
INSERT INTO tb_user
(username, name, password, salt)
VALUES
  ('admin', '管理员', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('guest', '客官', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaotiao', '小跳', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin', '小新', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin2', '小新2', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin3', '小新3', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin4', '小新4', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin5', '小新5', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin6', '小新6', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin7', '小新7', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin8', '小新8', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin9', '小新9', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin10', '小新10', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f'),
  ('xiaoxin11', '小新11', 'e592a7cd1ea88a2abb369efe7fd7e3fb5f854030', 'bedabd281e33df9f');
