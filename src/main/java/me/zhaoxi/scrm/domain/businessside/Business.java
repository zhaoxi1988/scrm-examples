package me.zhaoxi.scrm.domain.businessside;

import me.zhaoxi.scrm.domain.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class Business {
    private static final Logger logger = LoggerFactory.getLogger(Business.class);
    private long identity = 0L;
    private Set<Shop> shops = new HashSet<>(0);


    public void beCustomer(Customer newCustomer) {
    }
}
