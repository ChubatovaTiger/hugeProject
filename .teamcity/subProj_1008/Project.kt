package subProj_1008

import subProj_1008.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1008")
    name = "subProj 1008"

    buildType(subProj_bt_1008_1)
    buildType(subProj_bt_1008_2)
    buildType(subProj_bt_1008_0)
    buildType(subProj_bt_1008_5)
    buildType(subProj_bt_1008_3)
    buildType(subProj_bt_1008_4)
})
