package org.termi.plugin.hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class IndexService {
    private static final Log LOG = LogFactory.getLog(HelloInit.class);

    @Before("execution(public * org.termi.community.service.question.QuestionService.selectAll(..))")
    public void selectAll() {
        LOG.info("You are selecting all questions v0.0.2 -- hello plugin.");
    }
}
