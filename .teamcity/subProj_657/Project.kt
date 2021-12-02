package subProj_657

import subProj_657.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_657")
    name = "subProj 657"

    buildType(subProj_bt_657_4)
    buildType(subProj_bt_657_5)
    buildType(subProj_bt_657_2)
    buildType(subProj_bt_657_3)
    buildType(subProj_bt_657_0)
    buildType(subProj_bt_657_1)
})
