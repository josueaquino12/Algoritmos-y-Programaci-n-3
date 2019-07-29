import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import unpaz.ayp3.bitmapDisplay.BitmapDisplay;
import unpaz.ayp3.bitmapDisplay.ImagesOperationsListener;
import unpaz.ayp3.bitmapDisplay.Pixel;

public class mMenú implements ImagesOperationsListener {

	private Pixel[][] original;
	private int ancho_original;
	private int alto_original;
	private Pixel[][] resultado;
	private int ancho_resultado;
	private int alto_resultado;

	private static BitmapDisplay bd;

	public static void main(String[] args) {

		mMenú mi_test = new mMenú();
		bd = new BitmapDisplay(mi_test);

//		mi_test.loadImage("lena.bmp");

	}

	public void anotherFilter() {
		// TODO Auto-generated method stub

	}

	public void calculateHistogram() {
		// TODO Auto-generated method stub

	}

	public void crop(String arg0) {

		String entrada = this.validarString(arg0);

		if (entrada == "")
			bd.showErrorMessage("Debe ingresar valores de corte");

		String[] coordenadas = entrada.split(";");

		String[] superiorIzq = coordenadas[0].split(",");
		String[] inferiorDer = coordenadas[1].split(",");

		if (!this.esNumerico(coordenadas[0]) || !this.esNumerico(coordenadas[1])) {
			if (!this.esNumerico(superiorIzq[0]) || !this.esNumerico(superiorIzq[1]) || !this.esNumerico(inferiorDer[0])
					|| !this.esNumerico(inferiorDer[1]))
				bd.showErrorMessage("Debe ingresar valores numéricos");
		}

		int x1 = Integer.parseInt(superiorIzq[0]);
		int y1 = Integer.parseInt(superiorIzq[1]);
		int x2 = Integer.parseInt(inferiorDer[0]);
		int y2 = Integer.parseInt(inferiorDer[1]);

		int alto_recorte = y2 - y1;
		int ancho_recorte = x2 - x1;

		if (x1 < 0 || x1 >= this.ancho_original)
			bd.showErrorMessage("Coordenada x1 = " + x1 + " fuera de las dimensiones del ancho de la imagen");
		if (x2 < 0 || x2 >= this.ancho_original)
			bd.showErrorMessage("Coordenada x2 = " + x2 + " fuera de las dimensiones del ancho de la imagen");

		if (y1 < 0 || y1 >= this.alto_original)
			bd.showErrorMessage("Coordenada y1 = " + y1 + " fuera de las dimensiones delancho de la imagen");
		if (y2 < 0 || y2 >= this.alto_original)
			bd.showErrorMessage("Coordenada x1 = " + y2 + " fuera de las dimensiones del ancho de la imagen");

		if (x1 >= x2)
			bd.showErrorMessage("Coordenada x2 debe ser mayor a x1");
		if (y1 >= y2)
			bd.showErrorMessage("Coordenada y2 debe ser mayor a y1");

		if (ancho_recorte > this.ancho_original || alto_recorte > this.alto_original)
			bd.showErrorMessage("Los valores de recorte exceden las dimensiones de la	imagen");

		Pixel[][] recortada = new Pixel[alto_recorte][ancho_recorte];

		for (int y = 0; y < alto_recorte; y++) {
			for (int x = 0; x < ancho_recorte; x++) {
				recortada[y][x] = this.original[y1 + y][x1 + x];
			}
		}

		bd.showResult(recortada, ancho_recorte, alto_recorte);
		bd.showInformationMessage("Recorte aplicado exitosamente");

	}

	private String validarString(String entrada) {
		int i = 0;
		String palabra = "";

		while (i < entrada.length()) {
			if (entrada.charAt(i) != '(' && entrada.charAt(i) != ')')
				palabra += entrada.charAt(i);

			i++;
		}

		return palabra;
	}

	private boolean esNumerico(String n) {
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2' && n.charAt(i) != '3'
					&& n.charAt(i) != '4' && n.charAt(i) != '5' && n.charAt(i) != '6' && n.charAt(i) != '7'
					&& n.charAt(i) != '8' && n.charAt(i) != '9' && n.charAt(i) != '+' && n.charAt(i) != '‐'
					&& n.charAt(i) != '.') {
				return false;
			}
		}

		return true;
	}

	public void filter() {
		// TODO Auto-generated method stub

	}

	public void flipHorizontal() {
		 this.alto_resultado = this.alto_original;
		 this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];

		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];
				resultado[i][this.ancho_original - j - 1] = new Pixel(p.getR(), p.getG(), p.getB());

			}
		}

		bd.showResult(resultado, this.ancho_original, this.alto_resultado);
	}

	public void flipVertical() {

		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];
		
		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];
				resultado[this.alto_original - i - 1][j] = new Pixel(p.getR(), p.getG(), p.getB());
			}
		}
		bd.showResult(resultado, this.ancho_resultado, this.alto_resultado);

	}

	public void grayscale() {

		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];

		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];
				int gris = (int) (0.299 * p.getR() + 0.587 * p.getG() + 0.114 * p.getB());
				resultado[i][j] = new Pixel(gris, gris, gris);
			}
		}
		bd.showResult(resultado, this.ancho_resultado, this.alto_resultado);

	}

	public void loadImage(String arg0) {

		BufferedImage image = null;
		try {
			image = ImageIO.read(new File(arg0));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}


		this.alto_original = image.getHeight();
		this.ancho_original = image.getWidth();

		this.original = new Pixel[this.alto_original][this.ancho_original];
		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				int argb = image.getRGB(j, i);
				int red = (argb >> 16) & 0xff;
				int green = (argb >> 8) & 0xff;
				int blue = (argb) & 0xff;
				original[i][j] = new Pixel(red, green, blue);

			}
		}

		bd.showOriginal(original, this.alto_original, this.ancho_original);

	}

	public void modifyBrightness(String arg0) {

		int br = Integer.parseInt(arg0);

		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];

		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];
				int br_rojo = p.getR() + br;
				int br_verde = p.getG() + br;
				int br_azul = p.getB() + br;

				if (br_rojo > 255) {
					br_rojo = 255;
				} else if (br_rojo < 0) {
					br_rojo = 0;
				}

				if (br_verde > 255) {
					br_verde = 255;
				} else if (br_verde < 0) {
					br_verde = 0;
				}

				if (br_azul > 255) {
					br_azul = 255;
				} else if (br_azul < 0) {
					br_azul = 0;
				}
				resultado[i][j] = new Pixel(br_rojo, br_verde, br_azul);
			}
		}
		bd.showResult(resultado, this.ancho_resultado, this.alto_resultado);

	}

	public void modifyContrast(String arg0) {
		double contrast = Double.parseDouble(arg0);
		
		

		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];

		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];
				double br_rojo = 128 + (p.getR() - 128) * contrast;
				double br_verde = 128 + (p.getG() - 128) * contrast;
				double br_azul = 128 + (p.getB() - 128) * contrast;
				if (br_rojo > 255) {
					br_rojo = 255.0;
				} else if (br_rojo < 0) {
					br_rojo = 0.0;
				}

				if (br_verde > 255) {
					br_verde = 255.0;
				} else if (br_verde < 0) {
					br_verde = 0.0;
				}

				if (br_azul > 255) {
					br_azul = 255.0;
				} else if (br_azul < 0) {
					br_azul = 0.0;
				}
				resultado[i][j] = new Pixel((int) br_rojo, (int) br_verde,
						(int) br_azul);
			}
		}
		bd.showResult(resultado, this.ancho_resultado, this.alto_resultado);

	}

	public void negative() {
		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];

		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][j];

				int r = 255 - p.getR();
				int g = 255 - p.getG();
				int b = 255 - p.getB();

				resultado[i][j] = new Pixel(r, g, b);

			}
		}

		bd.showResult(resultado, this.ancho_resultado, this.alto_resultado);

	}

	public void quantization(String arg0) {
		// TODO Auto-generated method stub

	}

	public void reduce(String arg0) {

		String entrada = this.validarString(arg0);
		
		 if(entrada == "")
		 bd.showErrorMessage("Ingrese valores de reducción");
		
		 String[] factores = entrada.split(",");
		
		 if(!this.esNumerico(factores[0]) || !this.esNumerico(factores[1]))
		 bd.showErrorMessage("Debe ingresar valores numéricos");
	
		 int sx = Integer.parseInt(factores[0]);
		 int sy = Integer.parseInt(factores[1]);
		
		 if(sx >= this.ancho_original)
		 bd.showErrorMessage("sx no debe exceder el ancho de la imagen original");
		 if(sy >= this.ancho_original)
		 bd.showErrorMessage("sy no debe exceder el alto de la imagen original");
		 if(sx <= 0)
		 bd.showErrorMessage("sx debe ser un entero positivo");
		 if(sy <= 0)
		 bd.showErrorMessage("sy debe ser un entero positivo");
		 
		 
		

		 
		 this.alto_resultado = this.alto_original / sy;
		 this.ancho_resultado = this.ancho_original / sx;

		 this.resultado = new Pixel[this.alto_resultado][this.ancho_resultado];
		 
		 Pixel aux = new Pixel(0, 0, 0);
		
		 for (int y = 0; y < this.alto_resultado; y++)
		 {
		 for (int x = 0; x < this.ancho_resultado; x++)
		
		 {
		 for (int i = (y * sy); i < (y * sy) + sy ; i++)
		 {
		 for (int j = (x * sx); j < (x * sx) + sx; j++)
		 {
		 aux.setR(aux.getR() + ((this.original[i][j].getR() / sx) / sy));
		 aux.setG(aux.getG() + ((this.original[i][j].getG() / sx) / sy));
		 aux.setB(aux.getB() + ((this.original[i][j].getB() / sx) / sy));
		 }
		 }
		
		 this.resultado[y][x] = new Pixel(aux.getR(), aux.getG(), aux.getB());
		 aux.setR(0);
		 aux.setG(0);
		 aux.setB(0);
		 }
		 }
		
		 bd.showResult(this.resultado, this.alto_resultado, this.ancho_resultado);
		 bd.showInformationMessage("Reducción aplicada exitosamente");

		

	}

	public void rotate180() {
		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];
		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[this.alto_original - i - 1][this.ancho_original - j - 1];
				resultado[i][j] = new Pixel(p.getR(), p.getG(), p.getB());
			}
		}
		bd.showResult(resultado, this.ancho_resultado,
				this.alto_resultado);
		

	}

	public void rotate270() {
		
		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];
		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[this.alto_original - i - 1][j];
				resultado[j][i] = new Pixel(p.getR(), p.getG(), p.getB());
			}
		}
		bd.showResult(resultado, this.ancho_resultado,
				this.alto_resultado);
		
		
		

	}

	public void rotate90() {
		this.alto_resultado = this.alto_original;
		this.ancho_resultado = this.ancho_original;

		Pixel[][] resultado = new Pixel[this.alto_resultado][this.ancho_resultado];
		for (int i = 0; i < this.alto_original; i++) {
			for (int j = 0; j < this.ancho_original; j++) {
				Pixel p = this.original[i][this.ancho_original - j - 1];
				resultado[j][i] = new Pixel(p.getR(), p.getG(), p.getB());
			}
		}
		bd.showResult(resultado, this.ancho_resultado,
				this.alto_resultado);

	}

	public void saveResult(String arg0) {

		try {

			BufferedImage image = new BufferedImage(this.ancho_resultado,
					this.alto_resultado, BufferedImage.TYPE_INT_RGB);
			for (int i = 0; i < this.alto_resultado; i++) {
				for (int j = 0; j < this.ancho_resultado; j++) {
					int pixel = (this.resultado[i][j].getR() << 16)
							| this.resultado[i][j].getG() << 8
							| (this.resultado[i][j].getB());
					image.setRGB(j, i, pixel);
				}
			}
			File file = new File(arg0 + ".bmp");
			ImageIO.write(image, "bmp", file);
			bd.showInformationMessage("Se ha guardado la imagen correctamente");
			
		} catch (IOException e) {

	          bd.showErrorMessage("Error, no se guardo la imagen");

		}

	}

}
