-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `authority` VALUES ('2', 'ROLE_USER');
-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', '1', '`这是测试`\n\n`这是测试`\n\n\n`这是测试`\n\n\n\n`这是测试`\n\n\n![](//localhost:8081/view/5b7e8a71916b631834341813) \n', '2018-08-23 18:19:28', '<p><code>这是测试</code></p>\n<p><code>这是测试</code></p>\n<p><code>这是测试</code></p>\n<p><code>这是测试</code></p>\n<p><img src=\"//localhost:8081/view/5b7e8a71916b631834341813\" alt=\"\" /></p>\n', '4', 'Blog', '231', '测试', '1', '1', '1');
INSERT INTO `blog` VALUES ('2', '0', '哈哈\n\n哈哈\nhaha\n![](//localhost:8081/view/5b7e8d56916b631834341814) \n', '2018-08-23 18:32:59', '<p>哈哈</p>\n<p>哈哈\nhaha\n<img src=\"//localhost:8081/view/5b7e8d56916b631834341814\" alt=\"\" /></p>\n', '1', 'hello', '哈哈', '你好  这是博客', '0', '1', '1');
-- ----------------------------
-- Records of blog_comment
-- ----------------------------
INSERT INTO `blog_comment` VALUES ('1', '1');
-- ----------------------------
-- Records of blog_vote
-- ----------------------------
INSERT INTO `blog_vote` VALUES ('1', '1');
-- ----------------------------
-- Records of catalog
-- ----------------------------
INSERT INTO `catalog` VALUES ('1', '123', '1');
INSERT INTO `catalog` VALUES ('2', '哈哈', '1');
-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', 'Hello', '2018-08-23 18:21:05', '1');
-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '', 'l@terry.com', 'Terry', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVKIUi', 'admin');
INSERT INTO `user` VALUES ('2', '', '1196@123.com', 'Liu', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVKIUi', 'user');
-- ----------------------------
-- Records of user_authority
-- ----------------------------
INSERT INTO `user_authority` VALUES ('1', '1');
INSERT INTO `user_authority` VALUES ('2', '2');
-- ----------------------------
-- Records of vote
-- ----------------------------
INSERT INTO `vote` VALUES ('1', '2018-08-23 18:32:18', '1');