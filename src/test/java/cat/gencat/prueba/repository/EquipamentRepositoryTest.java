package cat.gencat.prueba.repository;


import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/canigo-core.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipamentRepositoryTest {
	
//	@Autowired
//	private EquipamentRepository repository;
//
//	@Before
//	public void settingUp(){
//		Assert.assertNotNull(repository);
//		repository.deleteAll();
//	}
//
//	@Test
//	public void test1CRUDOperations(){
//
//		//Test if table is empty
//		Assert.assertTrue(repository.findAll().isEmpty());
//		
//		//Test save
//		Equipament equipament = new Equipament();
//		equipament.setNom("CAP La Pau");
//		equipament.setMunicipi("Barcelona");
//		repository.save(equipament);
//
//		//Test insert and recover
//		Equipament equipament2 = new Equipament();
//		equipament2.setNom("CAP Santa Coloma");
//		repository.save(equipament2);
//		Equipament equipament3 = repository.findById(equipament2.getId()).orElse(null);
//		Assert.assertEquals(equipament3.getId(), equipament2.getId());
//		Assert.assertEquals(equipament3.getNom(), "CAP Santa Coloma");
//		
//		//Test delete all
//		repository.deleteAll();
//		Assert.assertTrue(repository.findAll().isEmpty());
//		
//	}
//	
//	@Test
//	public void test2MultipleCRUD(){
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
//		repository.saveAll(list);
//		Assert.assertEquals(list.size(), repository.findAll().size());
//		
//		//Test update
//		equipament1.setNom("equipament1 updated!");
//		equipament2.setNom("equipament2 updated!");
//		equipament3.setNom("equipament3 updated!");
//		repository.saveAll(list);
//		Assert.assertEquals(list.size(), repository.findAll().size());
//		
//		List<Equipament> elsMeusEquipaments = repository.findAll();
//		Assert.assertEquals(equipament1.getId(), elsMeusEquipaments.get(0).getId());
//		Assert.assertEquals(equipament1.getNom(), elsMeusEquipaments.get(0).getNom());
//		Assert.assertEquals(equipament2.getId(), elsMeusEquipaments.get(1).getId());
//		Assert.assertEquals(equipament2.getNom(), elsMeusEquipaments.get(1).getNom());
//		Assert.assertEquals(equipament3.getId(), elsMeusEquipaments.get(2).getId());
//		Assert.assertEquals(equipament3.getNom(), elsMeusEquipaments.get(2).getNom());
//		
//		//Test no exception launched
//		repository.saveAll(new ArrayList<Equipament>());
//	}
	
}
