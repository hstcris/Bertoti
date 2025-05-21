package tech.liax;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
    private Subject model;
    private ControllerInterface controller;
    private String temperature = "0";
    private String humidity = "0";
    private String pressure = "0";
    private DisplayStrategy displayStrategy; // Estratégia de exibição

    private JFrame frame;
    private JButton assinar;
    private JButton cancelar;

    public View(Subject model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        this.displayStrategy = new TextDisplayStrategy(); // Estratégia padrão (Texto)
    }

    public void createView() {
        frame = new JFrame("Estação Meteorológica");
        assinar = new JButton("Assinar");
        cancelar = new JButton("Cancelar");

        assinar.addActionListener(this);
        cancelar.addActionListener(this);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Layout para exibição dos dados e botões
        JPanel panel = new JPanel();
        panel.add(assinar);
        panel.add(cancelar);
        frame.add(panel);
    }

    @Override
    public void update(WeatherData weatherData) {
        // Atualiza os dados e exibe de acordo com a estratégia
        weatherData.display();
        displayStrategy.display(temperature, humidity, pressure);
    }

    public void setDisplayStrategy(DisplayStrategy strategy) {
        this.displayStrategy = strategy;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == assinar) {
            controller.assinar();
        }
        if (e.getSource() == cancelar) {
            controller.cancelar();
        }
    }
}
