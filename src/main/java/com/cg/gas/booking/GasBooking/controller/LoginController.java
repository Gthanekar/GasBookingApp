//package com.cg.gas.booking.GasBooking.controller;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseCookie;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.cg.gas.booking.GasBooking.model.Login;
//import com.cg.gas.booking.GasBooking.model.Role;
//import com.cg.gas.booking.GasBooking.repository.CustomerRepo;
//import com.cg.gas.booking.GasBooking.security.JwtUtils;
//
//public class LoginController {
//
//	  @Autowired
//	  AuthenticationManager authenticationManager;
//
//	  @Autowired
//	  CustomerRepo customerRepo;
//
////	  @Autowired
////	  RoleRepository roleRepository;
//
//	  @Autowired
//	  PasswordEncoder encoder;
//
//	  @Autowired
//	  JwtUtils jwtUtils;
//
//	  @PostMapping("/signin")
//	  public ResponseEntity<?> authenticateUser(@RequestBody Login login) {
//
//	    Authentication authentication = authenticationManager
//	        .authenticate(new UsernamePasswordAuthenticationToken(login.getUserName(), login.getPassword()));
//
//	    SecurityContextHolder.getContext().setAuthentication(authentication);
//
//	    UserDetails userDetails = (UserDetailsImpl) authentication.getPrincipal();
//
//	    ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(userDetails);
//
//	    List<String> roles = userDetails.getAuthorities().stream()
//	        .map(item -> item.getAuthority())
//	        .collect(Collectors.toList());
//
//	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jwtCookie.toString())
//	        .body(new UserInfoResponse(userDetails.getId(),
//	                                   userDetails.getUsername(),
//	                                   userDetails.getEmail(),
//	                                   roles));
//	  }
//
//	  @PostMapping("/signup")
//	  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
//	    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
//	      return ResponseEntity.badRequest().body(new MessageResponse("Error: Username is already taken!"));
//	    }
//
//	    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
//	      return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already in use!"));
//	    }
//
//	    // Create new user's account
//	    User user = new User(signUpRequest.getUsername(),
//	                         signUpRequest.getEmail(),
//	                         encoder.encode(signUpRequest.getPassword()));
//
//	    Set<String> strRoles = signUpRequest.getRole();
//	    Set<Role> roles = new HashSet<>();
//
//	    if (strRoles == null) {
//	      Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//	          .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//	      roles.add(userRole);
//	    } else {
//	      strRoles.forEach(role -> {
//	        switch (role) {
//	        case "admin":
//	          Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
//	              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//	          roles.add(adminRole);
//
//	          break;
//	        case "mod":
//	          Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
//	              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//	          roles.add(modRole);
//
//	          break;
//	        default:
//	          Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//	              .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//	          roles.add(userRole);
//	        }
//	      });
//	    }
//
//	    user.setRoles(roles);
//	    userRepository.save(user);
//
//	    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
//	  }
//
//	  @PostMapping("/signout")
//	  public ResponseEntity<?> logoutUser() {
//	    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
//	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
//	        .body(new MessageResponse("You've been signed out!"));
//	  }
//}
