package se.citerus.dddsample.infrastructure.repositories;

import org.springframework.stereotype.Repository;
import se.citerus.dddsample.domain.model.location.Location;
import se.citerus.dddsample.domain.repositories.LocationRepository;
import se.citerus.dddsample.domain.model.location.UnLocode;

import java.util.List;

@Repository
public class LocationRepositoryHibernate extends HibernateRepository implements LocationRepository {

  public Location find(final UnLocode unLocode) {
    return (Location) getSession().
      createQuery("from Location where unLocode = ?").
      setParameter(0, unLocode).
      uniqueResult();
  }

  public List<Location> findAll() {
    return getSession().createQuery("from Location").list();
  }

}
