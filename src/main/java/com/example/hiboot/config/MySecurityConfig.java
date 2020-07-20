package com.example.hiboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * description :
 *
 * @author : HandSomeMaker
 * @date : 2020/7/19 19:48
 */
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 禁止隧道 禁止跨域 禁止头部
        http.csrf().disable().cors().disable().headers().disable();
        // 定制请求的授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                // 添加特殊页面特殊权限
                .antMatchers("/level1/*").hasRole("Role1")
                .antMatchers("/level2/*").hasRole("Role2")
                .antMatchers("/level3/*").hasRole("Role3");

        /*
         开启自动配置的登录功能，如果没有登录就会来到登录页面
            1. 会自动生成登录页面 /login
            2. 登录失败会自动重定向到 /login?error
         */
        http.formLogin()
                /*
                自定义登录页面设置
                    1. 登录的路径还是设置成/login，否则算是自定义登录路径，其他的设置也需要改变
                       /login（get）：到登录页，， 自定义的话就是 /authenticate（get）
                       /login（post）：登录检查，，自定义的话就是 /authenticate（post）
                    2. 可以自定义form表达提交的参数名称
                       默认username字段提交用户名，可以通过usernameParameter自定义
                       默认password字段提交密码，可以用过passwordParameter自定义
                    3. loginProcessingUrl("/xxx") 可以自定义登录成功后跳转的路径
                 */
                .loginPage("/login");
        // 登录请求来到登录页
        // 重定向到/login?error标识登陆失败

        // 开启注销功能 logoutSuccessUrl注销成功访问地址
        // 注销成功默认返回 login?logout界面
        http.logout();

        // 开启记住我功能
        http.rememberMe();
        // 登录成功后将Session发送给浏览器保存，以后访问页面带上这个Cookie，通过检查就可以免登陆
        // 注销后会删除Cookie
    }
    /**
     * 说明：
     * 1.这里采用的的是把用户角色保存在内存中，数据是写死的，当然数据可以从数据库中查出再写入内存中；
     * 2.随后定义的三个用户，没有用户定义了其用户名，密码和角色
     * 3.Security5默认要求密码使用加密，不加密的话就使用"{noop}123456"这样的写法，加密的话需要使用
     * PasswordEncoder的实现类进行加密
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                // 项目启动 账户-密码-角色 信息保存进内存中
                .withUser("level1").password("{noop}123456").roles("Role1")
                .and().withUser("level2").password("{noop}123456").roles("Role2")
                .and().withUser("level3").password("{noop}123456").roles("Role1", "Role3");
    }
}
