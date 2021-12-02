package subProj_429

import subProj_429.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_429")
    name = "subProj 429"

    buildType(subProj_bt_429_0)
    buildType(subProj_bt_429_2)
    buildType(subProj_bt_429_1)
    buildType(subProj_bt_429_4)
    buildType(subProj_bt_429_3)
    buildType(subProj_bt_429_5)
})
