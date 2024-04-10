package first.bean;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TestBean {
	@Autowired
	List list;
	@Autowired
	Set set;
	@Autowired
	Map map;
	

}
