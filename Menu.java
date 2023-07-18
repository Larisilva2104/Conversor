

import javax.swing.JOptionPane;

public class Menu extends ConversorDeMoedas {

	public void escolherMoeda(){
		Object[] opcoesdeconversor = { "Conversor de Moedas", "Conversor de Tempo"};

		Object escolherPrograma = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.INFORMATION_MESSAGE, null, opcoesdeconversor, opcoesdeconversor [0]);

		if(escolherPrograma == "Conversor de Moedas") {
			Object[] opcoesMoedas = { "De Reais a Dolares","De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", 
					"De Reais a Peso Chileno", "De Dolares a Reais","De Euros a Reais","De Libras a Reais", 
					"De Peso Argentino a Reais", "De Peso Chileno a Reais"};

			Object moedaAplicada = JOptionPane.showInputDialog(null, "escolha uma opção", null, JOptionPane.INFORMATION_MESSAGE, null, opcoesMoedas, opcoesMoedas[0]);

			String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);

			double valor = Double.parseDouble(insiraValor);

			if(moedaAplicada == "De Reais a Dolares"){
				double realDolar = valor/super.getDolar();
				Object str = String.format("%.2f", realDolar);
				JOptionPane.showMessageDialog(null, "O valor em dolares é: "+ str, "Conversao", 1);
			}
			else if (moedaAplicada == "De Reais a Euros"){
				double realeuro= valor/super.getEuro();
				Object str = String.format("%.2f", realeuro);
				JOptionPane.showMessageDialog(null, "O valor em Euro é: "+ str, "Conversao", 1);}
			else   if  (moedaAplicada == "De Reais a Libras"){
				double realLibrasEterlina = valor/super.getLibrasEterlina();
				Object str = String.format("%.2f", realLibrasEterlina);
				JOptionPane.showMessageDialog(null, "O valor em Libras é"+ str, "Conversao", 1);

			}
			else  if  (moedaAplicada == "De Reais a Peso Argentino"){
				double realPesosArgentino = valor/super.getPesoArgentino();
				Object str = String.format("%.2f", realPesosArgentino);
				JOptionPane.showMessageDialog(null, "O valor em Pesos Argentino é: "+ str, "Conversao", 1);
			}
			else  if  (moedaAplicada == "De Reais a Peso Chileno"){
				double realPesoChileno = valor/super.getPesoChileno();
				Object str = String.format("%.2f", realPesoChileno);
				JOptionPane.showMessageDialog(null, "O valor em Peso Chileno é: "+ str, "Conversao", 1);
			} 
			else   if  (moedaAplicada == "De DÃ³lares a Reais"){
				double dolarReal = valor*super.getDolar();
				Object str = String.format("%.2f", dolarReal);
				JOptionPane.showMessageDialog(null, "O valor em Reais é: "+ str, "Conversao", 1); 
			}
			else   if  (moedaAplicada == "De Libras a Reais"){
				double libraseterlinaReal = valor*super.getLibrasEterlina();
				Object str = String.format("%.2f", libraseterlinaReal);
				JOptionPane.showMessageDialog(null, "O valor em Reais é: "+ str, "ConversÃ£o", 1); 
			}
			else  if  (moedaAplicada == "De Pesos Argentino a Reais"){
				double pesosargentino = valor*super.getPesoArgentino();
				Object str = String.format("%.2f", pesosargentino);
				JOptionPane.showMessageDialog(null, "O valor em Reais é: "+ str, "Conversao", 1); 
			}

			else  if  (moedaAplicada == "De Pesos Chileno a Reais"){
				double pesoschilenoReal = valor*super.getPesoChileno();
				Object str = String.format("%.2f", pesoschilenoReal);
				JOptionPane.showMessageDialog(null, "O valor em Reais é: "+ str, "Conversao", 1); 
			
				
			}
			
			
		}else if (escolherPrograma == "Conversor de Tempo") {

			Object[] opcoesHoras = { "De Hora para Minuto","De Hora para Segundo", "De Hora para Milisegundo", "De Hora para Microsegundos", "De Hora para Nanosegundos"};

			Object horaAplicada = JOptionPane.showInputDialog(null, "escolha uma opção", null, JOptionPane.INFORMATION_MESSAGE, null, opcoesHoras, opcoesHoras[0]);

			String insiraHora = JOptionPane.showInputDialog(null, "Insira uma Hora", "Valor", 3);

			double valor = Double.parseDouble(insiraHora);

			if(horaAplicada == "De Hora para Minuto"){
				double horaMinuto = valor*getMinuto();
				Object str = String.format("%.2f",horaMinuto );
				JOptionPane.showMessageDialog(null, "As horas em minutos são: "+ str, "Conversao", 1);
			}else if (horaAplicada == "De Hora para Segundo"){
				double horaSegundo = valor*getSegundo();
				Object str = String.format("%.2f",horaSegundo );
				JOptionPane.showMessageDialog(null, "As horas em segundos são: "+ str, "Conversao", 1);
			}else if (horaAplicada == "De Hora para Milisegundo"){
				double horaMilisegundo = valor*getMilisegundo();
				Object str = String.format("%.2f",horaMilisegundo );
				JOptionPane.showMessageDialog(null, "As horas em milisegundos são: "+ str, "Conversao", 1);
			}else if (horaAplicada == "De Hora para Microsegundos"){
				double horaMicrosegundos = valor*getMicrosegundos();
				Object str = String.format("%.2f",horaMicrosegundos);
				JOptionPane.showMessageDialog(null, "As horas em Microsegundos são: "+ str, "Conversao", 1);
			}else if (horaAplicada == "De Hora para Nanosegundos"){
				double horaNanosegundos = valor*getNanosegundos();
				Object str = String.format("%.2f",horaNanosegundos);
				JOptionPane.showMessageDialog(null, "As horas em Nanosegundos são: "+ str, "Conversao", 1);
			}





		}
	}

}





















