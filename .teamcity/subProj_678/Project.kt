package subProj_678

import subProj_678.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_678")
    name = "subProj 678"

    buildType(subProj_bt_678_5)
    buildType(subProj_bt_678_4)
    buildType(subProj_bt_678_3)
    buildType(subProj_bt_678_2)
    buildType(subProj_bt_678_1)
    buildType(subProj_bt_678_0)
})
