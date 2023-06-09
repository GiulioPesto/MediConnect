# MediConnect


Obiettivi:
L’obbiettivo dell’app MediConnect è quello di facilitare la gestione di studi medici implementando funzioni  come per esempio quella che permette di effettuare prenotazioni presso uno o più studi medici. Utilizzando il linguaggio Java e il framework Spring Boot, verranno gestite chiamate API per consentire la booking di visite mediche e salvare le informazioni delle prenotazioni in un database con la possibilità di poter fare diversi tipi di operazioni che verranno spiegate in modo più approfondito nell’analisi del sistema.

Attori coinvolti:
Medico - il doctor può visualizzare le prenotazioni, ma non ha il permesso di cancellarle.
Paziente - il patient può prenotare visite, visualizzare solo le sue prenotazioni e disdire una booking. 
Segretario - il segretario può inserire prenotazioni, visualizzarle, eliminarle e modificarle, ovvero può svolgere tutte le operazioni CRUD.


Idee per soluzioni:

Interfaccia utente intuitiva - Creare un interfaccia utente intuitiva e facile da usare per consentire ai pazienti di prenotare visite mediche in modo rapido e semplice. Utilizza un design responsive per garantire la fruizione su diversi dispositivi.
Autenticazione e registrazione: Implementa un sistema di autenticazione per i medici, i secretary e i pazienti. Consentire la registrazione di nuovi utenti, la gestione delle credenziali e la possibilità di reimpostare la password.
 Prenotazione di una visita: Permetti ai pazienti di prenotare una visita scegliendo un doctor, selezionando una data e un orario disponibile e fornendo le informazioni necessarie come nome, cognome, contatti e motivo della visita.
Gestione delle prenotazioni - Implementa funzionalità che consente ai secretary di gestire le prenotazioni, compresa la visualizzazione, la modifica e l’eliminazione delle prenotazioni esistenti, ad esempio in caso di cambiamenti di orario o cancellazioni da parte dei pazienti.
Storico delle visite - Mantiene un registro delle visite mediche passate per ciascun patient e consente loro di accedere al proprio storico per riferimenti futuri o per la consultazione di informazioni mediche precedenti come i dettagli sulle visite, data, doctor visitante e motivo della visita.
Visualizzazione delle prenotazioni: Consente ai medici di visualizzare le prenotazioni future e passate, con i dettagli come nome del patient, data, orario e motivo della visita.
Ricerca e filtro - Aggiunge funzionalità di ricerca e filtro per consentire ai pazienti di cercare studi medici in base a criteri specifici, come posizione geografica, specializzazione medica o nome di un determinato doctor.
Gestione degli studi medici: Implementa la possibilità di aggiungere, modificare e visualizzare gli studi medici, inclusi i dettagli come nome, indirizzo, contatti e orari di lavoro.
Documentazione: Ci assicuriamo di documentare il codice sorgente e le funzionalità implementate, fornendo spiegazioni chiare e commenti adeguati per facilitare la manutenzione e il supporto futuro.

Analisi del sistema:

Come vengono registrati medici e secretary?
I medici e i secretary possono essere registrati nel sistema tramite un’apposita interfaccia di amministrazione. Si possono creare form per l’inserimento dei dati personali, come nome, cognome, email, specializzazione (per i medici), contatto ufficio e sede di lavoro. I medici possono essere associati a uno o più studi medici, mentre i secretary possono essere associati a uno studio doctor specifico.


Requisiti funzionali: 
Tecnologie utilizzate: Spring Rest, Spring Boot, Java, JPA, SQL

Analisi dei requisiti:
Le seguenti macro classi saranno esposte tramite i Controller:

Medico:
	Costruttore con i seguenti parametri:
			codiceFiscale (codice fiscale del doctor)
			nome
			cognome
			telefonoPersonale
			specializzazione
			iscrizioneOrdine
	Metodi:
			creaNuovoMedico(MedicoDTO doctor): permette di creare un nuovo doctor utilizzando le variabili contenute nel suo DTO.
			listaMedici(): restituisce la lista di tutti i medici presenti nel database.

Segretario:
		Costruttore con i seguenti parametri:
			codiceFiscale (codice fiscale del segretario)
			nome
			cognome
			telefonoPersonale
			telefonoSegreteria
		Metodi:
			creaNuovoSegretario(SegretarioDTO segretario): permette di creare un nuovo segretario utilizzando le variabili contenute nel suo DTO.
			listaSegretari(): restituisce la lista di tutti i secretary presenti nel database.

Prenotazione:
	Costruttore con i seguenti parametri:
		idPrenotazione (identificatore univoco della booking)
		timestamp
		ambulatorio
		motivo
		segretario
		doctor
		patient
	Metodi:
		prenotaVisita(PrenotazioneDTO booking): permette di effettuare una booking utilizzando le variabili contenute nel suo DTO.
		listaPrenotazioni(): restituisce la lista di tutte le prenotazioni presenti nel database.
		cancellaPrenotazione(int idPrenotazione): permette di cancellare una booking specificata dall'ID. 	


Diagrama ER:

![er](https://github.com/GiulioPesto/TeamProject/assets/124497376/30ae1f2c-446c-4321-8d40-615015d6859b)
