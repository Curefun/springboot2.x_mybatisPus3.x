package cn.net.conet.mybatisplus.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    private String userId;

    /**
     * title
     */
    private String title;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 注册时间
     */
    private LocalDateTime userRegdate;

    /**
     * 最后登陆时间
     */
    private LocalDateTime userLastlogin;

    /**
     * 项目数
     */
    private String userProjectcount;

    /**
     * 主键数
     */
    private String userModulecount;

    /**
     * 漏洞数
     */
    private String userBugcount;

    private String userIndex;

    /**
     * 头像的url
     */
    private String userImg;

    /**
     * 是否管理员 true管理员 false普通用户
     */
    private String isadmin;


}
