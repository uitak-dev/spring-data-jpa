package study.querdsl;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class QuerdslApplicationTests {

	@Autowired EntityManager em;

	@Test
	void contextLoads() {
	}

}
