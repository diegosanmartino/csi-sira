<?xml version="1.0" encoding="utf-8"?>
<soapenv:Envelope
    xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
    xmlns:pep="http://pep.base.nmsf.csi.it/"
    xmlns:urn="urn:PolicyEnforcerBase.policy.entity">
    <soapenv:Header />
    <soapenv:Body>
        <pep:isPersonaInRuolo>
            <pep:in0>
                <urn:codFiscale>${irideIdentity.codFiscale}</urn:codFiscale>
                <urn:nome>${irideIdentity.nome}</urn:nome>
                <urn:cognome>${irideIdentity.cognome}</urn:cognome>
                <urn:idProvider>${irideIdentity.idProvider}</urn:idProvider>
                <urn:timestamp>${irideIdentity.timestamp}</urn:timestamp>
                <urn:livelloAutenticazione>${irideIdentity.livelloAutenticazione}</urn:livelloAutenticazione>
                <urn:mac>${irideIdentity.mac}</urn:mac>
                <urn:rappresentazioneInterna>${irideIdentity.toInternalRepresentation()}</urn:rappresentazioneInterna>
            </pep:in0>
            <pep:in1>
                <urn:codiceRuolo>${role.code}</urn:codiceRuolo>
                <urn:mnemonico>${role.toMnemonicRepresentation()}</urn:mnemonico>
                <urn:codiceDominio>${role.domain}</urn:codiceDominio>
            </pep:in1>
        </pep:isPersonaInRuolo>
    </soapenv:Body>
</soapenv:Envelope>