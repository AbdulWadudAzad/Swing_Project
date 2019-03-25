/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import com.coderbd.view.DashBoard;
import com.coderbd.view.LogIn;
import com.coderbd.view.PuroducctionReportView;
import com.coderbd.view.ProductionView;
import com.coderbd.view.SalesReportView;
import com.coderbd.view.SalesView;

/**
 *
 * @author User
 */
public class MenuForm {
    public static JMenuBar commonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem dashboard = new JMenuItem("Dashboard");
        dashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });
        JMenuItem purchase = new JMenuItem("Production");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductionView().setVisible(true);
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesView().setVisible(true);
            }
        });
        JMenuItem signOut = new JMenuItem("Sign Out");
        signOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LogIn().setVisible(true);
            }
        });
        file.add(dashboard);
        file.addSeparator();
        file.add(purchase);
        file.addSeparator();
        file.add(sales);
        file.addSeparator();
        file.add(signOut);
        
        JMenu report = new JMenu("Reports");
        JMenuItem purchaseReport = new JMenuItem("Production");
        purchaseReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PuroducctionReportView().setVisible(true);
            }
        });
        JMenuItem saleReport = new JMenuItem("Sales");
        saleReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesReportView().setVisible(true);
            }
        });
        report.add(purchaseReport);
        report.add(saleReport);
        
        menuBar.add(file);
        menuBar.add(report);
        
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        return menuBar;
    }
}
