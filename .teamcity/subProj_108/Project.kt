package subProj_108

import subProj_108.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_108")
    name = "subProj 108"

    buildType(subProj_bt_108_1)
    buildType(subProj_bt_108_2)
    buildType(subProj_bt_108_0)
    buildType(subProj_bt_108_5)
    buildType(subProj_bt_108_3)
    buildType(subProj_bt_108_4)
})
