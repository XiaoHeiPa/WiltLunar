package op.wawa.wilt.module

import net.weavemc.loader.api.event.EventBus
import op.wawa.wilt.module.modules.Germ
import op.wawa.wilt.module.modules.VexView

class ModuleManager {
    val modules = listOf(
        Germ(),
        VexView()
    )
    fun loadModules(){
        modules.forEach { EventBus.subscribe(it) }
    }
}