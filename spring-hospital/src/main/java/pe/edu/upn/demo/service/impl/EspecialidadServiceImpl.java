package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Especialidad;
import pe.edu.upn.demo.model.repository.EspecialidadRepository;
import pe.edu.upn.demo.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Especialidad> findAll() throws Exception {
		return especialidadRepository.findAll();
	}

	@Override
	public Optional<Especialidad> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad save(Especialidad entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad update(Especialidad entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
