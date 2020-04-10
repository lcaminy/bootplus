package io.github.service;

import com.baomidou.mybatisplus.plugins.Page;
import io.github.entity.SysUserEntity;
import io.github.base.BaseAppTest;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统用户测试
 *
 * @author Joey
 * @Email 2434387555@qq.com
 */
public class SysUserServiceTest extends BaseAppTest {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询列表
     */
    @Test
    public void selectList() {
        List<SysUserEntity> selectList = sysUserService.selectList(null);
        for (SysUserEntity sysUserEntity : selectList) {
            System.out.println(sysUserEntity);
        }
        Page<SysUserEntity> adminList = sysUserService.queryListByPage(1, 2,
                null, null, null, null);
    }

    /**
     * 测试事务回滚
     * 加了 @Transactional 默认事务就是会回滚的
     * AnnotatedElementUtils.findMergedAnnotation
     *
     * @see org.springframework.test.context.transaction.TransactionalTestExecutionListener#isDefaultRollback(TestContext)
     * @see org.springframework.test.context.transaction.TransactionalTestExecutionListener#isRollback(TestContext)
     */
    @Test
    @Rollback(false)
    public void save() {
        long timeMillis = System.currentTimeMillis();
        SysUserEntity user = SysUserEntity.builder().username("zhousiwei" + timeMillis + timeMillis + timeMillis + timeMillis + timeMillis + timeMillis).build();
        sysUserService.save(user);
        user = SysUserEntity.builder().username("zhousiwei2").build();
        sysUserService.save(user);
    }


}
