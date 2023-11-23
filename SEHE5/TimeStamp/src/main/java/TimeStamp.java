import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
public class TimeStamp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double cost;
	private String food_item;
	@CreationTimestamp
	private LocalTime ordered_time;
	@UpdateTimestamp
	private LocalTime delivered_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getFood_item() {
		return food_item;
	}
	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}
	public LocalTime getOrdered_time() {
		return ordered_time;
	}
	public void setOrdered_time(LocalTime ordered_time) {
		this.ordered_time = ordered_time;
	}
	public LocalTime getDelivered_time() {
		return delivered_time;
	}
	public void setDelivered_time(LocalTime delivered_time) {
		this.delivered_time = delivered_time;
	}
	
	


}
