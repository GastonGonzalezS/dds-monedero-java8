package dds.monedero.exceptions;

public class SaldoException extends RuntimeException {
  public SaldoException(String message) {
    super(message);
  }
}

// las 4 clases de excepcion tiene el mismo codigo
// Code Smell: Duplicated Code
// Refactor: se deja solo una clase SaldoException y se elimina las otras