package ua.lviv.iot.manager;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.models.Chainsaw;

import javax.transaction.Transactional;

@Transactional
public interface ChainsawRepository extends CrudRepository<Chainsaw, Integer> {
}
