package br.com.maddytec.marte.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class PlanaltoDTO implements Serializable {

	private static final long serialVersionUID = 1820296452459654704L;

	@NotNull
	@Min(value = 0, message = "Coordenada X não pode ser menor que 0")
	@Max(value = 9999, message = "Coordenada X não pode ser maior 9999")
	private Long coordenadaX;
	
	@NotNull
	@Min(value = 0, message = "Coordenada Y não pode ser menor que 0")
	@Max(value = 9999, message = "Coordenada Y não pode ser maior 9999")
	private Long coordenadaY;
	
}
