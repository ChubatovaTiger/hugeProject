package subProj_405

import subProj_405.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_405")
    name = "subProj 405"

    buildType(subProj_bt_405_0)
    buildType(subProj_bt_405_1)
    buildType(subProj_bt_405_2)
    buildType(subProj_bt_405_3)
    buildType(subProj_bt_405_4)
    buildType(subProj_bt_405_5)
})
