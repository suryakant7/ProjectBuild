package project.Services;



import org.springframework.security.core.userdetails.UserDetailsService;

import project.Entity.User;
import project.Temp.CurrentUser;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();
}
