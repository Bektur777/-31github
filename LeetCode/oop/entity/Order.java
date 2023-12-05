package oop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order implements Serializable {

    private Long id;

    private Long clientId;

    private Long employeeId;

    private Long vehicleId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private BigDecimal price;

    public Order() {
    }

    public Order(Long id, Long clientId, Long employeeId, Long vehicleId,
                 LocalDateTime startTime, LocalDateTime endTime, BigDecimal price) {
        this.id = id;
        this.clientId = clientId;
        this.employeeId = employeeId;
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(clientId, order.clientId) && Objects.equals(employeeId, order.employeeId) && Objects.equals(vehicleId, order.vehicleId) && Objects.equals(startTime, order.startTime) && Objects.equals(endTime, order.endTime) && Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, employeeId, vehicleId, startTime, endTime, price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", employeeId=" + employeeId +
                ", vehicleId=" + vehicleId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", price=" + price +
                '}';
    }
}
