package com.example.demo;

import jakarta.persistence.*;

@Entity
public class People {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		private Integer id;
		private String name;
		
		@OneToOne(cascade=CascadeType.ALL)
		private Bank bank;

		public People(Integer id, String name, Bank bank) {
			super();
			this.id = id;
			this.name = name;
			this.bank = bank;
		}

		public People() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Bank getBank() {
			return bank;
		}

		public void setBank(Bank bank) {
			this.bank = bank;
		}
		
		
}
