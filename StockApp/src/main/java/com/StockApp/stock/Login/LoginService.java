package com.StockApp.stock.Login;

import com.StockApp.stock.Repository.LoginDetailsRepo;
import com.StockApp.stock.model.LoginDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private LoginDetailsRepo loginDetailsRepo;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginDetails user = loginDetailsRepo.findByvUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new User(user.getVUserName(), user.getVPassword(),
				new ArrayList<>());
	}
	
	public LoginDetails save(LoginDetailsDTO user) {
		LoginDetails newUser = LoginDetails.builder()
				.vUserName(user.getVUserName())
				.iEmpId(user.getIEmpId())
				.vPassword(bcryptEncoder.encode(user.getVPassword()))
				.build();
		return loginDetailsRepo.save(newUser);
	}
}