/**
 * projectName: starter
 * fileName: SpringJdbcController.java
 * packageName: com.sikiapp.starter.web
 * date: 2019-04-09 下午11:48
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.sikiapp.starter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: SpringJdbcController
 * @packageName: com.sikiapp.starter.web
 * @description: soringboot jdbc
 * @author: Robert
 * @data: 2019-04-09 下午11:48
 * @version: V1.0
 **/
@RestController
@RequestMapping("/userauths")
public class SpringJdbcController {

//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public SpringJdbcController(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @GetMapping
//    public List<UserAuth> queryUsers() {
//        // 查询所有用户
//        String sql = "select * from user_auth";
//        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(UserAuth.class));
//    }
//
//    @GetMapping("/{id}")
//    public UserAuth getUserAuth(@PathVariable Long id) {
//        // 根据主键ID查询
//        String sql = "select * from user_auth where id = ?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(UserAuth.class));
//    }
//
//    @DeleteMapping("/{id}")
//    public int delUserAuth(@PathVariable Long id) {
//        // 根据主键ID删除用户信息
//        String sql = "delete from user_auth where id = ?";
//        return jdbcTemplate.update(sql, id);
//    }
//
//    @PostMapping
//    public int addUserAuth(@RequestBody UserAuth userAuth) {
//        // 添加用户
//        String sql = "insert into user_auth (`user`, identity_type, identifier, certificate, `name`, gender, face) " +
//                "values (?, ?, ?, ?, ?, ?, ?)";
//        return jdbcTemplate.update(sql, userAuth.getUser(), userAuth.getIdentityType(), userAuth.getIdentifier(),
//                userAuth.getCertificate(), userAuth.getName(), userAuth.getGender(), userAuth.getFace());
//    }
//
//    @PutMapping("/{id}")
//    public int editUserAuth(@PathVariable Long id, @RequestBody UserAuth userAuth) {
//        // 根据主键ID修改用户信息
//        String sql = "update user_auth set certificate = ? where id = ?";
//        return jdbcTemplate.update(sql, userAuth.getCertificate(), id);
//    }



}