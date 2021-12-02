package subProj_647

import subProj_647.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_647")
    name = "subProj 647"

    buildType(subProj_bt_647_5)
    buildType(subProj_bt_647_3)
    buildType(subProj_bt_647_4)
    buildType(subProj_bt_647_1)
    buildType(subProj_bt_647_2)
    buildType(subProj_bt_647_0)
})
