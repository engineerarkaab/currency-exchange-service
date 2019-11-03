package com.company.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "currency")
public class ExchangeValue implements Serializable {
	private static final long serialVersionUID = -4468515565436996277L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "currency_from", nullable = false, columnDefinition = "varchar")
	private String from;
	@Column(name = "currency_to", nullable = false, columnDefinition = "varchar")
	private String to;
	@Column(name = "currency_multiple", nullable = false)
	private BigDecimal conversionMulitple;
	private transient Integer port;
}
