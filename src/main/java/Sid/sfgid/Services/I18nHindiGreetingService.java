package Sid.sfgid.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HI","default"})
@Service("I18nService")
public class I18nHindiGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Kya bolte Duniya";
	}

}
