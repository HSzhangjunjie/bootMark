package com.example.hiboot.exception;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.exception
 * @ClassName: UserNotExistException
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/8 19:05
 * @Version: 1.0
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在！");
    }
}
