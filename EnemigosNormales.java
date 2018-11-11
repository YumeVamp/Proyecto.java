package PP;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class EnemigosNormales {
	private int x, y, vida, velocidad,tam;
	private Color color;
	private BufferedImage imagen;
	
	public EnemigosNormales() {
		x=0;
		y=0;
		vida=10;
		velocidad=0;
		tam=0;
		color=Color.BLUE;
		imagen=;
	}
	
	public EnemigosNormales(int x, int y, int v, int vel,int t,Color c, BufferedImage img) {
		this.x=x;
		this.y=y;
		vida=v;
		velocidad=vel;
		tam=t;
		color=color.GREEN;
		imagen=img;
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
		while(vida != 0) {
			
			   }
			}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, tam, tam);
	}
	

}
