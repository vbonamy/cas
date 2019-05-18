package org.apereo.cas.web.support;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link RedisThrottledAllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.1.0
 */
@SelectClasses({
    RedisThrottledSubmissionHandlerInterceptorAdapterTests.class,
    RedisSentinelThrottledSubmissionHandlerInterceptorAdapterTests.class
})
public class RedisThrottledAllTestsSuite {
}
