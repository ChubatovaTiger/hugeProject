package subProj_0

import subProj_0.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_0")
    name = "subProj 0"

    buildType(subProj_bt_0_2)
    buildType(subProj_bt_0_3)
    buildType(subProj_bt_0_0)
    buildType(subProj_bt_0_1)
    buildType(subProj_bt_0_4)
    buildType(subProj_bt_0_5)
})
