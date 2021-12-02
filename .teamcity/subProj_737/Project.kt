package subProj_737

import subProj_737.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_737")
    name = "subProj 737"

    buildType(subProj_bt_737_5)
    buildType(subProj_bt_737_1)
    buildType(subProj_bt_737_2)
    buildType(subProj_bt_737_3)
    buildType(subProj_bt_737_4)
    buildType(subProj_bt_737_0)
})
