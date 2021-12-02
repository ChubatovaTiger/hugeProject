package subProj_1322

import subProj_1322.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1322")
    name = "subProj 1322"

    buildType(subProj_bt_1322_4)
    buildType(subProj_bt_1322_5)
    buildType(subProj_bt_1322_2)
    buildType(subProj_bt_1322_3)
    buildType(subProj_bt_1322_0)
    buildType(subProj_bt_1322_1)
})
