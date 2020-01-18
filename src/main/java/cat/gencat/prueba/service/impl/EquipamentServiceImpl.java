package cat.gencat.prueba.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import cat.gencat.prueba.model.Equipament;
import cat.gencat.prueba.service.EquipamentService;

@Service("equipamentService")
@Lazy
public class EquipamentServiceImpl implements EquipamentService {

//	@Autowired
//	private EquipamentRepository repository;
//
//	@Override
//	public List<Equipament> findAll() {
//		return repository.findAll();
//	}
//
//	@Override
//	public Page<Equipament> findPaginated(final Integer page, final Integer rpp, final String sort, final String filter) {
//
//		final GenericPredicateBuilder<Equipament> builder = new GenericPredicateBuilder<Equipament>(Equipament.class, "equipament");
//		builder.populateSearchCriteria(filter);
//		
//		final Pageable pageable = new PageRequest(page - 1, rpp, getOrdenacio(sort));
//
//		return repository.findAll(builder.build(), pageable);
//	}
//	
//	@Override
//	public Page<Equipament> findPaginatedProjeccio(final Integer page, final Integer rpp, final String sort, final String filter, final String fields) {
//
//		final GenericPredicateBuilder<Equipament> builder = new GenericPredicateBuilder<Equipament>(Equipament.class, "equipament");
//		builder.populateSearchCriteria(filter);
//
//		final Pageable pageable = new PageRequest(page - 1, rpp, getOrdenacio(sort));
//		
//		QEquipament qequipament = QEquipament.equipament;
//		
//		List<Expression> listFields = new ArrayList<Expression>(); 
//		
//		if (fields != null && fields != ""){
//			String[] selectedFields = fields.split(",");
//			for (int i = 0; i < selectedFields.length; i++){
//				switch (selectedFields[i]) {
//				case Equipament.ID:
//					listFields.add(qequipament.id);
//					break;
//				case Equipament.NOM:
//					listFields.add(qequipament.nom);
//					break;
//					
//				case Equipament.MUNICIPI:
//					listFields.add(qequipament.municipi);
//					break;
//
//				default:
//					break;
//				}
//			}
//		}
//		
//		Expression[] arrayExpression = listFields.toArray(new Expression[0]);
//		
//		
//		return repository.findAll(Projections.bean(Equipament.class, arrayExpression), builder.build(), pageable);
//	}
//	
//	// private //
//	
//	private Sort getOrdenacio (String sort){
//		Sort resultat = null;
//		
//		List<Order> orders = new ArrayList<Order>();
//
//		if (sort != null && sort != ""){
//			String[] fields = sort.split(",");
//			
//			for (int i = 0; i < fields.length; i++){
//				char direction = fields[i].charAt(0);
//				if (Character.toString(direction).equals("-")){
//					//Order descendente
//					String value = fields[i].substring(1);
//					orders.add(new Order(Direction.DESC, value));
//				}else{
//					//Orden ascendente
//					orders.add(new Order(Direction.ASC, fields[i]));
//				}
//			}
//		}
//		
//		resultat = new Sort(orders);
//		
//		return resultat;
//	}
	
	
	// end private //

	@Override
	public Equipament getEquipament(final Long equipamentId) {
		Equipament eq = new Equipament(equipamentId);
		eq.setMunicipi("Barcelona");
		eq.setNom("Barcelona");
		return eq;
	}

//	@Override
//	public Long saveEquipament(final Equipament equipament) {
//		repository.save(equipament);
//
//		return equipament.getId();
//	}
//
//	@Override
//	public void updateEquipament(final Equipament equipament) {
//		repository.save(equipament);
//	}
//
//	@Override
//	public void deleteEquipament(final Long equipamentId) {
//		final Equipament equipament = new Equipament(equipamentId);
//		repository.delete(equipament);
//	}

}
