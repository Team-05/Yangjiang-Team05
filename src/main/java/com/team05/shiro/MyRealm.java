package com.team05.shiro;

import com.team05.domain.base.Staff;
import com.team05.mapper.StaffMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 18/2/5.
 */
public class MyRealm extends AuthorizingRealm{
    @Resource
    private StaffMapper staffMapper;
    @Override
    public String getName() {
        return "myrealm";
    }


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username= (String) principalCollection.getPrimaryPrincipal();
        List<String> roleList=new ArrayList<String>();
        roleList.add("CEO");
        roleList.add("HR");

        List<String> perList=new ArrayList<String>();
        perList.add("user:create");
        perList.add("user:query");

        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addRoles(roleList);
        info.addStringPermissions(perList);
        return info;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获得用户此次输入的用户名
        String username= (String) authenticationToken.getPrincipal();
        Staff staff=staffMapper.selectByName(username);
        //此处应该拿username取数据苦衷查询,是否存在该用户
        if(staff==null){
            throw new UnknownAccountException("用户名不存在");
        }
        String password= new String ((char[]) authenticationToken.getCredentials());
        if(!staff.getStaffPwd().equals(password)){
            throw new IncorrectCredentialsException("密码错误");
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
