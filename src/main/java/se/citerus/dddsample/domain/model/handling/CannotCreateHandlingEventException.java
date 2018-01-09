package se.citerus.dddsample.domain.model.handling;

import se.citerus.dddsample.domain.event.HandlingEvent;

/**
 * If a {@link HandlingEvent} can't be
 * created from a given set of parameters.
 *
 * It is a checked exception because it's not a programming error, but rather a
 * special case that the application is built to handle. It can occur during normal
 * program execution.
 */
public class CannotCreateHandlingEventException extends Exception {
  public CannotCreateHandlingEventException(Exception e) {
    super(e);
  }

  public CannotCreateHandlingEventException() {
    super();
  }
}
