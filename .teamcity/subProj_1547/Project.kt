package subProj_1547

import subProj_1547.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1547")
    name = "subProj 1547"

    buildType(subProj_bt_1547_5)
    buildType(subProj_bt_1547_4)
    buildType(subProj_bt_1547_3)
    buildType(subProj_bt_1547_2)
    buildType(subProj_bt_1547_1)
    buildType(subProj_bt_1547_0)
})
