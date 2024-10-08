/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2015 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.samlraider.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SignatureHelpWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPane;

    public SignatureHelpWindow() {
        setTitle("SAML Signature Help");
        setMinimumSize(new Dimension(496, 415));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 496, 415);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] {224, 0, 0};
        gbl_contentPane.rowHeights = new int[] {0, 0, 62, 0, 0, 0, 0};
        gbl_contentPane.columnWeights = new double[] {0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel lblSamlSignaturesHelp = new JLabel("SAML Signatures Help");
        lblSamlSignaturesHelp.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_lblSamlSignaturesHelp = new GridBagConstraints();
        gbc_lblSamlSignaturesHelp.anchor = GridBagConstraints.WEST;
        gbc_lblSamlSignaturesHelp.insets = new Insets(0, 0, 5, 5);
        gbc_lblSamlSignaturesHelp.gridx = 0;
        gbc_lblSamlSignaturesHelp.gridy = 0;
        contentPane.add(lblSamlSignaturesHelp, gbc_lblSamlSignaturesHelp);

        JLabel lblNewLabel = new JLabel("Certificate Combo Box");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 2;
        contentPane.add(lblNewLabel, gbc_lblNewLabel);

        JLabel lblChooseACertificate =
                new JLabel(
                        "<html>Choose  a certificate of this list to sign the message or the assertion. You can "
                                + "manage the SAML Certificates in the SAML Certificates Tab.</html>");
        GridBagConstraints gbc_lblChooseACertificate = new GridBagConstraints();
        gbc_lblChooseACertificate.anchor = GridBagConstraints.NORTH;
        gbc_lblChooseACertificate.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblChooseACertificate.insets = new Insets(0, 0, 5, 0);
        gbc_lblChooseACertificate.gridx = 1;
        gbc_lblChooseACertificate.gridy = 2;
        contentPane.add(lblChooseACertificate, gbc_lblChooseACertificate);

        JLabel lblResignMessage = new JLabel("Resign Message / Assertion");
        GridBagConstraints gbc_lblResignMessage = new GridBagConstraints();
        gbc_lblResignMessage.anchor = GridBagConstraints.NORTHWEST;
        gbc_lblResignMessage.insets = new Insets(0, 0, 5, 5);
        gbc_lblResignMessage.gridx = 0;
        gbc_lblResignMessage.gridy = 4;
        contentPane.add(lblResignMessage, gbc_lblResignMessage);

        JLabel lblWithTheChosen =
                new JLabel(
                        "<html> With the chosen certificate the message or "
                                + "the assertion is signed. If the message or assertion was signed, the signature is replaced. <br/> "
                                + "If you choose to sign the assertion, the message signature is removed, because the signature gets invalid.</html>");
        GridBagConstraints gbc_lblWithTheChosen = new GridBagConstraints();
        gbc_lblWithTheChosen.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblWithTheChosen.insets = new Insets(0, 0, 5, 0);
        gbc_lblWithTheChosen.gridx = 1;
        gbc_lblWithTheChosen.gridy = 4;
        contentPane.add(lblWithTheChosen, gbc_lblWithTheChosen);
    }
}
