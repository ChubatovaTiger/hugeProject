package subProj_557

import subProj_557.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_557")
    name = "subProj 557"

    buildType(subProj_bt_557_0)
    buildType(subProj_bt_557_1)
    buildType(subProj_bt_557_2)
    buildType(subProj_bt_557_3)
    buildType(subProj_bt_557_4)
    buildType(subProj_bt_557_5)
})
