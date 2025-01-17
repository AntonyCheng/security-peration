package top.sharehome.securityoperation.aop.studyDemo.normal.beanAop.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.sharehome.securityoperation.aop.studyDemo.normal.beanAop.bean.AopBean;
import top.sharehome.securityoperation.aop.studyDemo.normal.beanAop.service.BeanService;

/**
 * 针对切点参数为bean型的切面类的服务实现类
 *
 * @author AntonyCheng
 */
@Service
public class BeanServiceImpl implements BeanService {

    @Resource
    private AopBean aopBean;

    @Override
    public void doMethod() {
        AopBean bean = aopBean.getAopBean();
        System.out.println(aopBean.toString());
        System.out.println("bean = " + bean.toString());
    }

}