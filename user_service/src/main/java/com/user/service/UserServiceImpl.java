package com.user.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	//User list	
	List<User> list = List.of(
			new User(1211L, "Sachin Anil", "09877656345"),
			new User(1212L, "Sourav Ganguly", "09834656335"),
			new User(1213L, "Rahul Dravid","09809656545"),
			new User(1214L, "Yuvraj Singh", "09809865698"),
			new User(1215L, "Rohit Sharma", "09877965445")
	);
	@Override
	public User getUser(Long id) {
		return list.stream()
				.filter( user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
}
