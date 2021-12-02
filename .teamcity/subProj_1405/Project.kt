package subProj_1405

import subProj_1405.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1405")
    name = "subProj 1405"

    buildType(subProj_bt_1405_5)
    buildType(subProj_bt_1405_4)
    buildType(subProj_bt_1405_3)
    buildType(subProj_bt_1405_2)
    buildType(subProj_bt_1405_1)
    buildType(subProj_bt_1405_0)
})
