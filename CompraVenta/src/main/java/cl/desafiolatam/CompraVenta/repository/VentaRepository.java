package cl.desafiolatam.CompraVenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.CompraVenta.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

}
