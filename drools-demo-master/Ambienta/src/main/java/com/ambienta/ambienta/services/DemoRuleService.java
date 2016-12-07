package com.ambienta.ambienta.services;

import java.util.Collection;

import com.ambienta.ambienta.facts.Alarm;
import com.ambienta.ambienta.facts.Room;
import com.ambienta.ambienta.facts.Sprinkler;


public interface DemoRuleService<T> {

    Collection<Alarm>  addFire(String[] fires) ;
    
    Collection<Alarm>  remFire(String[]  fires) ;

	void addRooms(String[] names);
	
	Collection<Alarm> checkForFire();
    
	Room getRoom(String name);

	void addRoom(String name);

	Collection<Sprinkler> checkSprinklers();
    
}
