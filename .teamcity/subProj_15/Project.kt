package subProj_15

import subProj_15.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_15")
    name = "subProj 15"

    buildType(subProj_bt_15_5)
    buildType(subProj_bt_15_4)
    buildType(subProj_bt_15_3)
    buildType(subProj_bt_15_2)
    buildType(subProj_bt_15_1)
    buildType(subProj_bt_15_0)
})
