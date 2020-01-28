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
    @Column(name="date_to")
    private LocalDate dateTo;
    @Column(name="total_charge")
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
    @ManyToOne
    @JoinColumn(name = "id_model")
    private CarModel carModel;

    public CarRental() {
    }

    public Long getIdRental() {
        return idRental;
    }

    public void setIdRental(Long idRental) {
        this.idRental = idRental;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Location fromLocation) {
        this.fromLocation = fromLocation;
    }

    public Location getToLocation() {
        return toLocation;
    }

    public void setToLocation(Location toLocation) {
        this.toLocation = toLocation;
    }
}
