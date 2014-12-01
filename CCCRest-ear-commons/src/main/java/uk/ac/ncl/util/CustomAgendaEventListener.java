
package uk.ac.ncl.util;

import java.util.logging.Logger;


import org.drools.core.WorkingMemory;
import org.drools.core.event.ActivationCancelledEvent;
import org.drools.core.event.ActivationCreatedEvent;
import org.drools.core.event.AfterActivationFiredEvent;
import org.drools.core.event.BeforeActivationFiredEvent;
import org.kie.api.event.rule.*;
import uk.ac.ncl.util.CustomWorkingMemoryEventListener;

public class CustomAgendaEventListener implements AgendaEventListener {
	private final static Logger logger = Logger.getLogger(CustomAgendaEventListener.class.toString());

	public void activationCancelled(ActivationCancelledEvent event) {
		logger.info("Activation Cancelled: " + event.getActivation());
	}

	public void activationCreated(ActivationCreatedEvent event) {
		logger.info("Activation Created: " + event.getActivation());
	}

	public void beforeActivationFired(BeforeActivationFiredEvent event) {
		logger.info("Before Activation Fired: " + event.getActivation());
	}

	public void afterActivationFired(AfterActivationFiredEvent event) {
		logger.info("After Activation Fired: " + event.getActivation());
	}

	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {

		logger.info("Agenda Group Popped: " + event.getAgendaGroup());
	}

	public void agendaGroupPushed(AgendaGroupPushedEvent event) {
		logger.info("Agenda Group Pushed: " + event.getAgendaGroup());
	}

	@Override
	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {

	}

	@Override
	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {

	}

	@Override
	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {

	}

	@Override
	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {

	}

	public void matchCreated(MatchCreatedEvent event) {
		logger.info("matchCreated: " + event.getMatch());
	}

	public void matchCancelled(MatchCancelledEvent event) {
		logger.info("matchCancelled: " + event.getMatch());
	}

	@Override
	public void beforeMatchFired(BeforeMatchFiredEvent event) {

	}

	@Override
	public void afterMatchFired(AfterMatchFiredEvent event) {

	}

}
