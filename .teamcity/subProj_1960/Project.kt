package subProj_1960

import subProj_1960.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1960")
    name = "subProj 1960"

    buildType(subProj_bt_1960_4)
    buildType(subProj_bt_1960_5)
    buildType(subProj_bt_1960_0)
    buildType(subProj_bt_1960_1)
    buildType(subProj_bt_1960_2)
    buildType(subProj_bt_1960_3)
})
