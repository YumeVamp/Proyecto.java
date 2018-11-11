package PP;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Jugador {
	private int x, y, vida, velocidad,tam, energia;
	private Color color;
	private BufferedImage imagen;

	public Jugador() {
		x=0;
		y=0;
		vida=0;
		velocidad=0;
		tam=0;
		energia=0;
		color=Color.BLUE;
		imagen=;
	}
	
	public Jugador(int x, int y, int v, int vel,int t, int e, Color c, BufferedImage img) {
		this.x=x;
		this.y=y;
		vida=v;
		velocidad=vel;
		tam=t;
		energia=e;
		color=c;
		imagen=img;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void movimiento(int tecla,int anchoW,int altoW) {
			// izq	
			   if (tecla==37){
				   if (x-velocidad > 0)
				     x-=velocidad;  
			   }
			   //der
			   if (tecla == 39){
				   if (x + velocidad + tam < anchoW)
					   x+=velocidad;
			   }
			   //arriba
			   if (tecla == 38){
				   if (y - velocidad > 0)
					   y-=velocidad;
			   }
			   //abajo
			   if (tecla == 40){
				   if (y +tam+  velocidad < altoW)
					   y+=velocidad;
			   }
			}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, tam, tam);
	}
	

}
