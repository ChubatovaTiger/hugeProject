package subProj_960

import subProj_960.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_960")
    name = "subProj 960"

    buildType(subProj_bt_960_0)
    buildType(subProj_bt_960_2)
    buildType(subProj_bt_960_1)
    buildType(subProj_bt_960_4)
    buildType(subProj_bt_960_3)
    buildType(subProj_bt_960_5)
})
