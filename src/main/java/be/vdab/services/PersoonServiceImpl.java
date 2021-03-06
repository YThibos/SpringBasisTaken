package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.entities.Persoon;
import be.vdab.repositories.PersoonRepository;

class PersoonServiceImpl implements PersoonService {

	private final PersoonRepository persoonRepo;
	
	PersoonServiceImpl(PersoonRepository persoonRepo) {
		this.persoonRepo = persoonRepo;
	}
	
	@Override
	public List<Persoon> findAll() throws IOException {
		return persoonRepo.findAll();
	}

	
	
}
