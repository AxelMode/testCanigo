package cat.gencat.prueba.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.gencat.prueba.model.Equipament;
import cat.gencat.prueba.service.EquipamentService;

@RestController
@RequestMapping("/equipaments")
public class EquipamentServiceController {

	@Autowired
	EquipamentService equipamentService;

//	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
//	public ResponsePage<Equipament> findPaginated(
//			@ApiParam(value = "Nombre de p&agrave;gines")@RequestParam(defaultValue = "1", value = "page", required = false) final Integer page,
//			@ApiParam(value = "Valors per p&agrave;gina")@RequestParam(defaultValue = "10", value = "rpp", required = false) final Integer rpp,
//			@ApiParam(value = "Camp Ordenaci&oacute; Ex(id,-municipi)")@RequestParam(defaultValue = "id,-municipi", value = "sort", required = false) final String sort,
//			@ApiParam(value = "Filtre Ex(Municipi:Cambrils)")@RequestParam(value = "filter", required = false) final String filter) {
//		
//		final Page<Equipament> equipaments = equipamentService.findPaginated(page, rpp, sort, filter);
//
//		long offset = equipaments.getNumber() * equipaments.getSize();
//		
//		Data<Equipament> data = new Data<Equipament>(equipaments.getTotalElements(), equipaments.getSize(), equipaments.getNumberOfElements(), offset, equipaments.getContent());
//		
//		return new ResponsePage<Equipament>(data);
//	}
	
//	@GetMapping(value = "/projeccio", produces = { MediaType.APPLICATION_JSON_VALUE })
//	public ResponsePage<Equipament> findPaginatedProjeccio(
//			@ApiParam(value = "Nombre de p&agrave;gines")@RequestParam(defaultValue = "1", value = "page", required = false) final Integer page,
//			@ApiParam(value = "Valors per p&agrave;gina")@RequestParam(defaultValue = "10", value = "rpp", required = false) final Integer rpp,
//			@ApiParam(value = "Camp Ordenaci&oacute; Ex(id,-municipi)")@RequestParam(defaultValue = "id,-municipi", value = "sort", required = false) final String sort,
//			@ApiParam(value = "Filtre Ex(Municipi:Cambrils)")@RequestParam(value = "filter", required = false) final String filter,
//			@ApiParam(value = "Camps retornats")@RequestParam(defaultValue = "id,municipi", value = "fields", required = true) final String fields) {
//		
//			final Page<Equipament> equipaments = equipamentService.findPaginatedProjeccio(page, rpp, sort, filter, fields);
//
//			long offset = equipaments.getNumber() * equipaments.getSize();
//			
//			Data<Equipament> data = new Data<Equipament>(equipaments.getTotalElements(), equipaments.getSize(), equipaments.getNumberOfElements(), offset, equipaments.getContent());
//
//			return new ResponsePage<Equipament>(data);
//	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Equipament getEquipament(@PathVariable("id") final Long equipamentId) {
		return equipamentService.getEquipament(equipamentId);
	}

//	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//	public void saveEquipament(@RequestBody final Equipament equipament) throws Exception {
//		equipamentService.saveEquipament(equipament);
//	}
//
//	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, headers = "content-type=application/x-www-form-urlencoded")
//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void saveEquipamentFromForm(@ModelAttribute final Equipament equipament) throws Exception {
//		equipamentService.saveEquipament(equipament);
//	}
//
//	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//	public void updateEquipament(@RequestBody final Equipament equipament) throws Exception {
//		equipamentService.updateEquipament(equipament);
//	}
//
//	@DeleteMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//	public void deleteEquipament(@PathVariable("id") final Long equipamentId) throws Exception {
//		equipamentService.deleteEquipament(equipamentId);
//	}

}
