package com.bsf.transaction;

import com.bsf.transaction.exception.CheckedExceptionForTest;
import com.bsf.transaction.service.IOrder;
import com.bsf.transaction.service.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class TransactionApplicationTests {


    @Test
    void contextLoads(){
    }

}
