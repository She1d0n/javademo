/*
Navicat MySQL Data Transfer

Source Server         : localhost-mysql
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : ssm_crud

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-12-14 17:31:58
*/
CREATE DATABASE IF NOT EXISTS ssm_crud DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_dept
-- ----------------------------
INSERT INTO `tbl_dept` VALUES ('1', 'qwe');
INSERT INTO `tbl_dept` VALUES ('2', 'qwrwe');
INSERT INTO `tbl_dept` VALUES ('3', 'sdef ');
INSERT INTO `tbl_dept` VALUES ('4', 'sdfswe');
INSERT INTO `tbl_dept` VALUES ('5', 'sf mkam ka');
INSERT INTO `tbl_dept` VALUES ('6', 'skdjk nika');
INSERT INTO `tbl_dept` VALUES ('7', 'kooannifa');
INSERT INTO `tbl_dept` VALUES ('8', '开发部');
INSERT INTO `tbl_dept` VALUES ('9', '测试部');

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `fk_emp_dept` (`d_id`),
  CONSTRAINT `fk_emp_dept` FOREIGN KEY (`d_id`) REFERENCES `tbl_dept` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
INSERT INTO `tbl_emp` VALUES ('27', 'lilian', '女', '9433104877@qq.com', null);
