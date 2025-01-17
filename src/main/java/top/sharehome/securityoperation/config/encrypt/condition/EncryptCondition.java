package top.sharehome.securityoperation.config.encrypt.condition;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 请求参数加密自定义配置条件
 *
 * @author AntonyCheng
 */
public class EncryptCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String encryptProperty = context.getEnvironment().getProperty("encrypt.enable");
        return StringUtils.equals(Boolean.TRUE.toString(), encryptProperty);
    }

}