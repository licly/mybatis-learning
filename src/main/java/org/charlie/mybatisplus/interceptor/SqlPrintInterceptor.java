package org.charlie.mybatisplus.interceptor;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * 输出SQL语句拦截器
 *
 * @author Charlie-6327
 * @date 2023/2/27
 */

@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})
})
public class SqlPrintInterceptor extends MybatisPlusInterceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        BoundSql boundSql = (BoundSql) args[5];
        String sql = boundSql.getSql();
        Object parameter = args[1];
        System.out.println(sql.replace("?", "%s"));
        System.out.printf(sql, parameter);
        return invocation.getMethod().invoke(invocation.getTarget(), args);
    }
}
