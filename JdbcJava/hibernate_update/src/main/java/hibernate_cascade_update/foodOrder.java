package hibernate_cascade_update;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class foodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item;
	@CreationTimestamp
	private LocalDateTime order_time;
	@UpdateTimestamp
	private LocalDateTime delivery_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public LocalDateTime getOrder_time() {
		return order_time;
	}
	public void setOrder_time(LocalDateTime order_time) {
		this.order_time = order_time;
	}
	public LocalDateTime getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(LocalDateTime delivery_time) {
		this.delivery_time = delivery_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;

}
