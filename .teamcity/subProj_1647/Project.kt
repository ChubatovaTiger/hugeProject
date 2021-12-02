package subProj_1647

import subProj_1647.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1647")
    name = "subProj 1647"

    buildType(subProj_bt_1647_3)
    buildType(subProj_bt_1647_2)
    buildType(subProj_bt_1647_5)
    buildType(subProj_bt_1647_4)
    buildType(subProj_bt_1647_1)
    buildType(subProj_bt_1647_0)
})
