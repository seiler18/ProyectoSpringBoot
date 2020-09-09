package cl.desafiolatam.CompraVenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.CompraVenta.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
