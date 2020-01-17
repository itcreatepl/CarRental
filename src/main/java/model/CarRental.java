package model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="cars_rentals")
public class CarRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rental")
    private Long idRental;
    @Column(name="rental_date")
    private LocalDate rentalDate;
    @Column(name="date_from")
    private LocalDate dateFrom;
    @Column(name="dateTo")
    private LocalDate dateTo;
    private BigDecimal totalCharge;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_car")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "id_from_location")
    private Location fromLocation;
    @ManyToOne
    @JoinColumn(name = "id_to_location")
    private Location toLocation;

}
