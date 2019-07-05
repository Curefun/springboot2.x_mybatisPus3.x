package cn.net.conet.mybatisplus.service.impl;

import cn.net.conet.mybatisplus.entity.UserData;
import cn.net.conet.mybatisplus.mapper.UserDataMapper;
import cn.net.conet.mybatisplus.service.IUserDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiyou
 * @since 2019-07-05
 */
@Service
public class UserDataServiceImpl extends ServiceImpl<UserDataMapper, UserData> implements IUserDataService {
    @Autowired
    private UserDataMapper userMapper;
}
