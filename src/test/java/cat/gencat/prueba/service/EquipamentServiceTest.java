package cat.gencat.prueba.service;


import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cat.gencat.prueba.model.Equipament;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/canigo-core.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipamentServiceTest {
	
	@Autowired
	private EquipamentService service;

	@Test
	public void testRecoverEquipament() {
		
		Equipament equipament = service.getEquipament(1234L);
		
		assertTrue(equipament.getId() == 1234L);
		assertTrue(equipament.getNom().equalsIgnoreCase("Barcelona"));
		assertTrue(equipament.getMunicipi().equalsIgnoreCase("Barcelona"));
	}
	
	
//	@Before
//	public void settingUp(){
//		Assert.assertNotNull(service);
//		deleteAll();
//	}
	
//	private void deleteAll(){
//		List<Equipament> list = service.findAll();
//		for(Equipament item:list){
//			service.deleteEquipament(item.getId());
//		}
//	}
//	
//	@Test
//	public void test1CRUDOperations(){
//
//		//Test if table is empty
//		Assert.assertTrue(service.findAll().isEmpty());
//		
//		//Test save
//		Equipament equipament = new Equipament();
//		equipament.setNom("CAP La Pau");
//		equipament.setMunicipi("Barcelona");
//		service.saveEquipament(equipament);
//
//		//Test insert and recover
//		Equipament equipament2 = new Equipament();
//		equipament2.setNom("CAP Santa Coloma");
//		service.saveEquipament(equipament2);
//		Equipament equipament3 = service.getEquipament(equipament2.getId());
//		Assert.assertEquals(equipament3.getId(), equipament2.getId());
//		Assert.assertEquals(equipament3.getNom(), "CAP Santa Coloma");
//		
//		//Test delete all
//		List<Equipament> list = service.findAll();
//		for(Equipament item:list){
//			service.deleteEquipament(item.getId());
//		}
//		
//	}
//	
//	@Test
//	public void test2MultipleCRUD(){
//		
//		//Test if table is empty
//		Assert.assertTrue(service.findAll().isEmpty());
//		
//		List<Equipament> list = new ArrayList<Equipament>();
//		
//		Equipament equipament1 = new Equipament();
//		Equipament equipament2 = new Equipament();
//		Equipament equipament3 = new Equipament();
//		
//		list.add(equipament1);
//		list.add(equipament2);
//		list.add(equipament3);
//		
//		//Test save
//		equipament1.setNom("equipament1");
//		equipament2.setNom("equipament2");
//		equipament3.setNom("equipament3");
//		for(Equipament item:list){
//			service.saveEquipament(item);
//		}
//		Assert.assertEquals(list.size(), service.findAll().size());
//		
//		//Test update
//		equipament1.setNom("equipament1 updated!");
//		equipament2.setNom("equipament2 updated!");
//		equipament3.setNom("equipament3 updated!");
//		for(Equipament item:list){
//			service.saveEquipament(item);
//		}
//		Assert.assertEquals(list.size(), service.findAll().size());
//		
//		List<Equipament> elsMeusEquipaments = service.findAll();
//		Assert.assertEquals(equipament1.getId(), elsMeusEquipaments.get(0).getId());
//		Assert.assertEquals(equipament1.getNom(), elsMeusEquipaments.get(0).getNom());
//		Assert.assertEquals(equipament2.getId(), elsMeusEquipaments.get(1).getId());
//		Assert.assertEquals(equipament2.getNom(), elsMeusEquipaments.get(1).getNom());
//		Assert.assertEquals(equipament3.getId(), elsMeusEquipaments.get(2).getId());
//		Assert.assertEquals(equipament3.getNom(), elsMeusEquipaments.get(2).getNom());
//
//	}
	
}
