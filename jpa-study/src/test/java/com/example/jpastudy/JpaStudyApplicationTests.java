package com.example.jpastudy;

import com.example.jpastudy.entity.Hello;
import com.example.jpastudy.entity.QHello;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JpaStudyApplicationTests {

	@Autowired
	EntityManager em;
	@Test
	void contextLoads() {
		Hello hello = new Hello();

		em.persist(hello);

		JPAQueryFactory query = new JPAQueryFactory(em);
		QHello qHello = new QHello("h");
		Hello result = query.selectFrom(qHello).fetchOne();

		assertThat(result).isEqualTo(hello);
		assertThat(result.getId()).isEqualTo(hello.getId());
	}

}
