package com.practice.personal.modules.sys.controller;


import com.practice.personal.common.utils.R;
import com.practice.personal.modules.sys.dto.LoginDto;
import com.practice.personal.modules.sys.shiro.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SysLoginController {

    @ResponseBody
    @RequestMapping(value = "/sys/login", method = RequestMethod.POST)
    public R login(@RequestBody LoginDto loginDto) {
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();
        try{
            Subject subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            subject.login(token);
        }catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return R.error("账号或密码不正确");
        }catch (LockedAccountException e) {
            return R.error("账号已被锁定,请联系管理员");
        }catch (AuthenticationException e) {
            return R.error("账户验证失败");
        }
        return R.ok();
    }

}
