package subProj_547

import subProj_547.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_547")
    name = "subProj 547"

    buildType(subProj_bt_547_0)
    buildType(subProj_bt_547_1)
    buildType(subProj_bt_547_2)
    buildType(subProj_bt_547_3)
    buildType(subProj_bt_547_4)
    buildType(subProj_bt_547_5)
})
