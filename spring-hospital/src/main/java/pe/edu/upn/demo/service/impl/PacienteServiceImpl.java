package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.Paciente;
import pe.edu.upn.demo.model.repository.PacienteRepository;
import pe.edu.upn.demo.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Paciente> findAll() throws Exception {
		return pacienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Paciente> findById(String id) throws Exception {
		return pacienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Paciente save(Paciente entity) throws Exception {
		return pacienteRepository.save(entity);
	}

	@Override
	@Transactional
	public Paciente update(Paciente entity) throws Exception {
		return pacienteRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(String id) throws Exception {
		pacienteRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		pacienteRepository.deleteAll();
	}

}
