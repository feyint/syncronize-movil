package org.synchronize.repositories;

import java.util.List;

public interface CRUDRepository<T> {

	void save(final T entidad);

	void update(final T entidad);

	List<T> getAll(final Class<T> entidad);

	List<T> getActivos(final Class<T> entidad);

	T getById(final Class<T> entidad, final Long id);

	void delete(final Class<T> entidad, final Long id);

	void activar(final Class<T> entidad, final Long id);

	void inactivar(final Class<T> entidad, final Long id);

}
