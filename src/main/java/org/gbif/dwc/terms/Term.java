package org.gbif.dwc.terms;

public interface Term {

  /**
   * The simple term name without any namespace or paths.
   * For example scientificName.
   */
  String simpleName();

  /**
   * The full qualified term uri including the namespace.
   * For example http://rs.tdwg.org/dwc/terms/scientificName.
   */
  String qualifiedName();

  /**
   * Lists known alternative names for the same term. These names are frequently found typos or term names that
   * have been used in past versions of Darwin Core and are still found in data.
   *
   * @return known alternative simple names for this term, often null
   */
  String[] alternativeNames();
}
