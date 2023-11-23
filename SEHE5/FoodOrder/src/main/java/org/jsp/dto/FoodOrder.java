package org.jsp.dto;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	@UpdateTimestamp
	private LocalTime del_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalTime getDel_time() {
		return del_time;
	}
	public void setDel_time(LocalTime del_time) {
		this.del_time = del_time;
	}
	public LocalTime getOrdered_time() {
		return ordered_time;
	}
	public void setOrdered_time(LocalTime ordered_time) {
		this.ordered_time = ordered_time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	@Column
	@CreationTimestamp
	private LocalTime ordered_time;
	@Column
	private int price;
	@Column
	private String address;
	@Column
	private String item_name;
	@JoinColumn
	@ManyToOne
	private User u;
	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", del_time=" + del_time + ", ordered_time=" + ordered_time + ", price=" + price
				+ ", address=" + address + ", item_name=" + item_name + "]";
	}

	

}
