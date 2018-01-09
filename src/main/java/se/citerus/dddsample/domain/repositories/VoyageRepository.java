package se.citerus.dddsample.domain.repositories;

import se.citerus.dddsample.domain.model.voyage.Voyage;
import se.citerus.dddsample.domain.model.voyage.VoyageNumber;

public interface VoyageRepository {

  /**
   * Finds a voyage using voyage number.
   *
   * @param voyageNumber voyage number
   * @return The voyage, or null if not found.
   */
  Voyage find(VoyageNumber voyageNumber);

}
