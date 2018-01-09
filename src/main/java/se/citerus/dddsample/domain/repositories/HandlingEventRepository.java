package se.citerus.dddsample.domain.repositories;

import se.citerus.dddsample.domain.event.HandlingEvent;
import se.citerus.dddsample.domain.model.cargo.TrackingId;
import se.citerus.dddsample.domain.model.handling.HandlingHistory;

/**
 * Handling event repository.
 */
public interface HandlingEventRepository {

  /**
   * Stores a (new) handling event.
   *
   * @param event handling event to save
   */
  void store(HandlingEvent event);


  /**
   * @param trackingId cargo tracking id
   * @return The handling history of this cargo
   */
  HandlingHistory lookupHandlingHistoryOfCargo(TrackingId trackingId);

}
