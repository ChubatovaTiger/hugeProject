package subProj_1108

import subProj_1108.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1108")
    name = "subProj 1108"

    buildType(subProj_bt_1108_1)
    buildType(subProj_bt_1108_0)
    buildType(subProj_bt_1108_3)
    buildType(subProj_bt_1108_2)
    buildType(subProj_bt_1108_5)
    buildType(subProj_bt_1108_4)
})
