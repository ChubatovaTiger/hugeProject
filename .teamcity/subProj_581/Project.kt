package subProj_581

import subProj_581.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_581")
    name = "subProj 581"

    buildType(subProj_bt_581_0)
    buildType(subProj_bt_581_1)
    buildType(subProj_bt_581_4)
    buildType(subProj_bt_581_5)
    buildType(subProj_bt_581_2)
    buildType(subProj_bt_581_3)
})
