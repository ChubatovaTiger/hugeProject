package subProj_621

import subProj_621.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_621")
    name = "subProj 621"

    buildType(subProj_bt_621_4)
    buildType(subProj_bt_621_3)
    buildType(subProj_bt_621_5)
    buildType(subProj_bt_621_0)
    buildType(subProj_bt_621_2)
    buildType(subProj_bt_621_1)
})
