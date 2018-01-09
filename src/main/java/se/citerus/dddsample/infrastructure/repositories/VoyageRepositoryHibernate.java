package se.citerus.dddsample.infrastructure.repositories;

import org.springframework.stereotype.Repository;
import se.citerus.dddsample.domain.model.voyage.Voyage;
import se.citerus.dddsample.domain.model.voyage.VoyageNumber;
import se.citerus.dddsample.domain.repositories.VoyageRepository;

/**
 * Hibernate implementation of CarrierMovementRepository.
 */
@Repository
public class VoyageRepositoryHibernate extends HibernateRepository implements VoyageRepository {

  public Voyage find(final VoyageNumber voyageNumber) {
    return (Voyage) getSession().
      createQuery("from Voyage where voyageNumber = :vn").
      setParameter("vn", voyageNumber).
      uniqueResult();
  }

}
