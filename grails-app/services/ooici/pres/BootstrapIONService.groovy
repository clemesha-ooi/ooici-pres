package ooici.pres

import ion.core.BaseProcess
import com.rabbitmq.client.AMQP
import ion.core.messaging.MsgBrokerClient
import ion.integration.ais.AppIntegrationService
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class BootstrapIONService  {

	static transactional = false
	public static BaseProcess baseProcess
	public static MsgBrokerClient ionClient
	public static AppIntegrationService appIntegrationService

	def bootstrap() {

		def config = ConfigurationHolder.config
		String hostName = config.ioncore.host
		int portNumber = Integer.parseInt(config.ioncore.amqpport)
		String exchange = config.ioncore.exchange
		String sysName = config.ioncore.sysname
		
		System.out.println("Starting msg broker client.  Connecting to " + hostName + ":" + portNumber + ":" + exchange + ":" + sysName)

		// Messaging environment
		ionClient = new MsgBrokerClient(hostName, portNumber, exchange)
		ionClient.attach()

		baseProcess = new BaseProcess(ionClient)
		baseProcess.spawn()

		appIntegrationService = new AppIntegrationService(sysName, baseProcess)
	}
	
	def destroy() {
		appIntegrationService.dispose()
	}

}
