
DROP DATABASE IF EXISTS sims;
CREATE DATABASE sims;
-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(255) NOT NULL,
  `name` varchar(50) NOT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `grade` varchar(10) NOT NULL,
  `major` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO student VALUES ('201911671332', '张三','男', '大一', '信息管理与信息系统');
INSERT INTO student VALUES ('201911671553', '李四', '男', '大三', '社会科学');
INSERT INTO student VALUES ('201911671554', '赵六', '男', '大一', '土质探测学');
INSERT INTO student VALUES ('201911671666', '艾希', '女', '大三', '气象学');
INSERT INTO student VALUES ('201911971666', '杰哥', '男', '大三', '土地规划');
INSERT INTO student VALUES ('202111671995', '爱丽丝', '男', '大二', '财务管理');



