package com.ashyleika.data;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class SpittleRepositoryImp implements SpittleRepository {
	
	private static List<Spittle> spittles = new ArrayList<>();
	
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		
		return spittles;
	}
	
	
	static {
		spittles.add(new Spittle("My first Spittle", Date.from(Instant.now())));
		spittles.add(new Spittle("My second Spittle", Date.from(Instant.now())));
		spittles.add(new Spittle("My third Spittle", Date.from(Instant.now())));
		spittles.add(new Spittle("My fourht Spittle", Date.from(Instant.now())));
		spittles.add(new Spittle("My fifth Spittle", Date.from(Instant.now())));
	}


	public SpittleRepositoryImp() {}


	@Override
	public Spittle findOne(long spittleId) {
		Optional<Spittle> spittle = spittles
				.stream()
				.filter(s -> (s.getId()==spittleId))
				.findFirst();
		
		return spittle.get();
	}
	
	
}
