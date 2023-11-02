/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : addressbook

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 31/10/2023 20:42:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `telephone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '胡桃', '成都', '12345674789');
INSERT INTO `person` VALUES (3, '王五', '成都', '12321317443');
INSERT INTO `person` VALUES (4, '小李', '遂宁', '13122343553');
INSERT INTO `person` VALUES (5, '杨杨', '南充', '13123843874');
INSERT INTO `person` VALUES (6, '二万', '达州', '19039138018');
INSERT INTO `person` VALUES (7, '小红', '广安', '19039138018');
INSERT INTO `person` VALUES (8, 'Tom', '杭州', '19039138018');
INSERT INTO `person` VALUES (9, '鲍勃', '上海', '19039138018');
INSERT INTO `person` VALUES (10, '小强', '广元', '19039138018');
INSERT INTO `person` VALUES (11, '青青', '达州', '19039138018');
INSERT INTO `person` VALUES (12, '王老师', '北京', '19039138018');
INSERT INTO `person` VALUES (13, '林老师', '北京', '19039138018');
INSERT INTO `person` VALUES (14, '陈老师', '杭州', '19039138018');
INSERT INTO `person` VALUES (15, '肖老师', '上海', '19039138018');
INSERT INTO `person` VALUES (16, '刘老师', '成都', '19039138018');
INSERT INTO `person` VALUES (17, '蒋老师', '成都', '19039138018');

SET FOREIGN_KEY_CHECKS = 1;
