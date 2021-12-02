package subProj_604

import subProj_604.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_604")
    name = "subProj 604"

    buildType(subProj_bt_604_2)
    buildType(subProj_bt_604_3)
    buildType(subProj_bt_604_4)
    buildType(subProj_bt_604_5)
    buildType(subProj_bt_604_0)
    buildType(subProj_bt_604_1)
})
