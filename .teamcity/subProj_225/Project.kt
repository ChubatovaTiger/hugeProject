package subProj_225

import subProj_225.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_225")
    name = "subProj 225"

    buildType(subProj_bt_225_4)
    buildType(subProj_bt_225_3)
    buildType(subProj_bt_225_5)
    buildType(subProj_bt_225_0)
    buildType(subProj_bt_225_2)
    buildType(subProj_bt_225_1)
})
