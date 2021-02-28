package org.synchronize.utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Check {

	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final Object NULL = null;

	private Check() {
		throw new IllegalArgumentException();
	}

	public static boolean isNull(final Object object) {
		return object == NULL;
	}

	public static boolean isNotNull(final Object object) {
		return !isNull(object);
	}

	public static boolean isZero(final int integer) {
		return integer == ZERO;
	}

	public static boolean isZero(final long integer) {
		return integer == ZERO;
	}

	public static boolean isZero(final BigDecimal integer) {
		return integer.equals(BigDecimal.ZERO);
	}

	public static boolean isZero(final Number number) {
		if (number instanceof BigDecimal) {
			return isZero((BigDecimal) number);
		} else {
			final Class<?> klass = number.getClass();
			if (klass == Long.class || klass == Long.TYPE) {
				return isZero(number.longValue());
			} else {
				if (klass == Integer.class || klass == Integer.TYPE) {
					return isZero(number.intValue());
				} else {
					throw new IllegalArgumentException(klass.toString());
				}
			}
		}
	}

	public static boolean isOne(final int integer) {
		return integer == ONE;
	}

	public static boolean isOne(final long integer) {
		return integer == ONE;
	}

	public static boolean isOne(final BigDecimal integer) {
		return integer.equals(BigDecimal.ONE);
	}

	public static boolean isGreaterThanZero(final int integer) {
		return integer > ZERO;
	}

	public static boolean isGreaterThanZero(final long integer) {
		return integer > ZERO;
	}

	public static boolean isGreaterThanZero(final Long valor) {
		return valor != null && valor > ZERO;
	}

	public static boolean isGreaterThanZero(final BigDecimal number) {
		return BigDecimal.ZERO.compareTo(number) < 0;
	}

	public static boolean isGreaterThanZero(final Number number) {
		if (number instanceof BigDecimal) {
			return isGreaterThanZero((BigDecimal) number);
		} else {
			final Class<?> klass = number.getClass();
			if (klass == Long.class || klass == Long.TYPE) {
				return isGreaterThanZero(number.longValue());
			} else {
				if (klass == Integer.class || klass == Integer.TYPE) {
					return isGreaterThanZero(number.intValue());
				} else {
					throw new IllegalArgumentException(klass.toString());
				}
			}
		}
	}

	public static boolean cadenaVacia(final String cadena) {
		boolean cadenaVacia = false;
		if (cadena == null || cadena.trim().isEmpty()) {
			cadenaVacia = true;
		}
		return cadenaVacia;
	}

	/**
	 * Valida si una lista de tipo T est&aacute; o no vac&iacute;a
	 *
	 * @param lista
	 * @return
	 */
	public static <T> boolean listaVacia(final List<T> lista) {
		return null == lista || lista.isEmpty();
	}

	public static <T> boolean listaVacia(final Set<T> lista) {
		return null == lista || lista.isEmpty();
	}

	public static <T, U> boolean listaVacia(final Map<T, U> lista) {
		return null == lista || lista.isEmpty();
	}

	public static <T> boolean arrayVacio(final T[] lista) {
		return null == lista || lista.length <= 0;
	}

	public static boolean arregloVacio(final Object... params) {
		return null == params || params.length < 1;
	}

	/**
	 * Valida si un arreglo es nulo, o no tiene elementos, o todos sus elementos
	 * son nulos
	 *
	 * @param params
	 * @return true: si el arreglo es nulo, no tiene elementos o todos sus
	 *         elementos son nulos
	 */
	public static boolean arregloTodoNulos(final Object... params) {
		if (!arregloVacio(params)) {
			for (Object obj : params) {
				if (null != obj) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isGreaterOrEqualsThanZero(final int integer) {
		return integer >= ZERO;
	}

	public static boolean isGreaterOrEqualsThanZero(final long integer) {
		return integer >= ZERO;
	}

	public static boolean isLessThanZero(final int integer) {
		return integer < ZERO;
	}

	public static boolean isLessThanZero(final long integer) {
		return integer < ZERO;
	}

	public static boolean isLessOrEqualsThanZero(final int integer) {
		return integer <= ZERO;
	}

	public static boolean isLessOrEqualsThanZero(final long integer) {
		return integer <= ZERO;
	}

	public static boolean isNotOne(final int integer) {
		return integer != ONE;
	}

	public static boolean isLessThanOne(final long integer) {
		return integer < ONE;
	}

	public static boolean isTrue(final Boolean valor) {
		return valor != null && valor;
	}

	public static boolean isFalse(final Boolean valor) {
		return valor != null && !valor;
	}
}
