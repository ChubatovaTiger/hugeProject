package subProj_534

import subProj_534.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_534")
    name = "subProj 534"

    buildType(subProj_bt_534_5)
    buildType(subProj_bt_534_4)
    buildType(subProj_bt_534_3)
    buildType(subProj_bt_534_2)
    buildType(subProj_bt_534_1)
    buildType(subProj_bt_534_0)
})
