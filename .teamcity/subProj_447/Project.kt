package subProj_447

import subProj_447.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_447")
    name = "subProj 447"

    buildType(subProj_bt_447_0)
    buildType(subProj_bt_447_3)
    buildType(subProj_bt_447_4)
    buildType(subProj_bt_447_1)
    buildType(subProj_bt_447_2)
    buildType(subProj_bt_447_5)
})
