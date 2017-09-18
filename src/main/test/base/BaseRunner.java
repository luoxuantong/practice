package base;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * @author 王兴岭
 * @create 2017-07-17 13:44
 */
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public abstract class BaseRunner extends AbstractTransactionalJUnit4SpringContextTests {

}
