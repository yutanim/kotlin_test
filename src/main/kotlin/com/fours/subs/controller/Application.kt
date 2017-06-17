package com.fours.subs.controller


import com.fours.subs.controller.api.HomeResource
import com.fours.subs.domain.application.Core
import com.fours.subs.domain.application.CoreImpl
import org.glassfish.hk2.utilities.ServiceLocatorUtilities.bind
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import javax.ws.rs.ApplicationPath
import  org.glassfish.jersey.server.ResourceConfig
import javax.ws.rs.core.Application;

@ApplicationPath("subs")
class  Application : ResourceConfig() {
    init {
        packages("com.fours.subs.controller.api")
        registerInstances(Bindings())
    }

    class Bindings : AbstractBinder() {

        override fun configure() {
            bind(Core::class.java).to(CoreImpl::class.java)
        }
    }


}