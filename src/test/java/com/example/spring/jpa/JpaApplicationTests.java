package com.example.spring.jpa;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class JpaApplicationTests {
@Autowired
ApplicationContext ac;


	@Test
	void contextLoads() {

ProductRepository pr=ac.getBean(ProductRepository.class);
MemberPremium p=new MemberPremium();
p.setMemberid(1);
p.setPolicyid(2);
p.setTopup(1000);
p.setPremiumAmountDue(2000);
p.setLastpremiumAmount(3000);
p.setDueDate("10/20/1000");
pr.save(p);

//System.out.println(pr.findByNameAndPrice("mac",100));
	}

}
