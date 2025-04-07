package cn.bootx.platform.starter.auth.service.impl;

import cn.bootx.platform.common.spring.util.WebServletUtil;
import cn.bootx.platform.starter.auth.service.RouterCheck;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author Haruki
 * @since 2025/4/7 14:37
 */
@Component
public class IgnoreFileStorageRouterCheck implements RouterCheck {
    @Override
    public boolean check(Object handler) {
        String path = WebServletUtil.getPath();
        return StringUtils.isNotBlank(path) && path.startsWith("/storage/");
    }
}
